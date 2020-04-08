# Spring 源码学习
begin: 2020-04-06

## 基础概念
```
Spring Bean
- 经过了完整的 Spring Bean 生命周期的对象

Java Object
- new Object() 仅仅是一个对象
```

## 1、Spring Bean的生命周期





## 2、Spring 如何处理依赖注入

@Resource CommonAnnotationBeanPostProcessor
@Autowired AutowiredAnnotationBeanPostProcessor

## 3、循环依赖注入
```
class IndexService {
    @Resource
    private RelyService relyService;
}

class RelyService {
    @Resource
    private IndexService indexService;
}
```
1. IndexService 初始化完成，创建 IndexService 对应 Object 完成
2. 准备往 IndexService 里注入 RelyService，CommonAnnotationBeanPostProcessor#postProcessProperties
3. 执行注入逻辑 Injection，开始 getSingleton(RelyService)，很明显找不到
4. 接着 DefaultSingletonBeanRegistry#getSingleton() >>> isSingletonCurrentlyInCreation(RelyService)，
   判断是否正在创建，同样未正在创建，此时还在 doGetBean(RelyService)，并没有正在创建
5. 去执行同 IndexService 的初始化逻辑，创建 RelyService 对应 Object 完成
6. RelyService 依赖 IndexService，接着开始执行注入逻辑 Injection，再次回到 getSingleton(IndexService)，
   IndexService 仍然只是一个 Object，所以下一步 isSingletonCurrentlyInCreation(IndexService)，正在创建
7. 接下来就将这个正在创建的、还不是真正 Bean 的 IndexService Object 返回给了 RelyService，完成了 RelyService 的依赖注入
8. 这一系列操作像递归一样，操作了很多层，接下来，将 RelyService 这个 Bean 注入 IndexService，完成了 IndexService 的依赖注入
9. 综上，完成了 IndexService 依赖注入的同时，RelyService 也完成了依赖注入
10. 别忘了，最开始，Spring 初始化单例对象的方法 DefaultListableBeanFactory#preInstantiateSingletons()，
    Spring自己的5个类，AppConfig、IndexService、RelyService 等等类都在同一个for循环里边，
    每次循环都会去 AbstractBeanFactory#doGetBean()，也就是那句，明知为空还 getSingleton 的地方
        Object sharedInstance = getSingleton(beanName);
    上述完成了 IndexService 的 Bean 初始化之后，在后边的循环中也要完成 RelyService 的 Bean 的初始化，
    那么重点来了，RelyService 已经初始化过了，所以这句咋一看肯定为空的地方，此时 getSingleton(beanName) 
    是可以拿到 RelyService 的。

