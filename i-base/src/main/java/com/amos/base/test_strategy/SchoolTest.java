package com.amos.base.test_strategy;

import com.amos.base.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 模块名称: spring
 * 模块描述: SchoolTest
 *
 * @author amos.wang
 * @date 2020/8/25 18:29
 */
public class SchoolTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");
	}

}
