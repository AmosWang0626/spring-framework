package com.amos.cr.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 循环依赖
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/14 23:00
 */
@ComponentScan("com.amos.cr.second")
public class SecondApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SecondApplication.class);
		System.out.println("Spring Bean 默认初始化完成");
	}

}
