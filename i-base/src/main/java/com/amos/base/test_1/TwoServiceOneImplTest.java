package com.amos.base.test_1;

import com.amos.base.test_1.service.DocReadService;
import com.amos.base.test_1.service.DocWriteService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 两个Service一个共用一个实现类，注入两个bean测试
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/9/5
 */
public class TwoServiceOneImplTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Test1Config.class);
		System.out.println("Spring Bean 默认初始化完成");
		System.out.println(context.getBean(DocReadService.class));
		System.out.println(context.getBean(DocWriteService.class));
	}

}
