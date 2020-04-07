package com.amos.single;

import com.amos.single.config.AppConfig;
import com.amos.single.service.IndexService;
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

		System.out.println("IndexService: " + context.getBean(IndexService.class));
	}

}
