package com.amos.cr.first;

import com.amos.cr.first.service.IndexService;
import com.amos.cr.first.service.RelyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * DESCRIPTION: 循环依赖
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
@ComponentScan("com.amos.cr.first")
public class FirstApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(FirstApplication.class);
		System.out.println("Spring Bean 默认初始化完成");

		System.out.println();
		System.out.println(context.getBean(IndexService.class));
		System.out.println(context.getBean(RelyService.class));
	}

}
