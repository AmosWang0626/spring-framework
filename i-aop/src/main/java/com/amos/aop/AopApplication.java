package com.amos.aop;

import com.amos.aop.config.AppConfig;
import com.amos.aop.service.IndexService;
import com.amos.aop.service.RelyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AOP
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
public class AopApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		// 未开启AOP RelyService@xxxx;
		// 开启AOP  RelyService$$EnhancerBySpringCGLIB$$d24a4bfe@xxxx
		System.out.println("\t" + context.getBean(RelyService.class));

		// 调用方法测试AOP功能
		IndexService indexService = context.getBean(IndexService.class);
		System.out.println("\t" + indexService);
		indexService.getRelyService().relyHello();
	}

}
