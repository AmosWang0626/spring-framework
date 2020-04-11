package com.amos.single;

import com.amos.single.config.AppConfig;
import com.amos.single.service.IndexService;
import com.amos.single.service.RelyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块名称: 源码测试
 * 模块描述: 源码测试
 *
 * @author amos.wang
 * @date 2020/3/24 13:18
 */
public class SingleApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		// 未开启AOP RelyService@1532; 开启AOP  RelyService$$EnhancerBySpringCGLIB$$d24a4bfe@1940
		System.out.println(context.getBean(RelyService.class));
		System.out.println(context.getBean(IndexService.class));
	}

}
