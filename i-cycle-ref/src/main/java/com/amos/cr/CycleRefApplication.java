package com.amos.cr;

import com.amos.cr.config.AppConfig;
import com.amos.cr.service.IndexService;
import com.amos.cr.service.RelyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * DESCRIPTION: 循环依赖
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/12
 */
public class CycleRefApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Spring Bean 默认初始化完成");

		System.out.println();
		System.out.println(context.getBean(IndexService.class));
		System.out.println(context.getBean(RelyService.class));
	}

}
