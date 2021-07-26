package com.amos.base;

import com.amos.base.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 基础
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
public class BaseApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");
	}

}
