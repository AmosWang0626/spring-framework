package com.amos.single;

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
		System.out.println(context.getBean(SingleTest.class));
	}

}
