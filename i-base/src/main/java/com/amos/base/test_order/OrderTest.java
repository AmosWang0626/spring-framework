package com.amos.base.test_order;

import com.amos.base.test_order.beans.Bean1;
import com.amos.base.test_order.config.TestOrderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * OrderTest
 *
 * @author amos.wang
 * @date 2020/8/25 18:29
 */
public class OrderTest {

	/**
	 * 验证如果bean不加order，那默认的order是多少？
	 * 经验证：默认值还真是 Integer.MAX_VALUE
	 *
	 * @see Bean1 如果注入Bean一个List，那默认的顺序是啥
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(TestOrderConfig.class);
		System.out.println("Spring Bean 默认初始化完成");
	}

	/*
	 * class com.amos.base.test_order.beans.Bean4
	 * finish: class com.amos.base.test_order.beans.Bean4
	 * class com.amos.base.test_order.beans.Bean5
	 * finish: class com.amos.base.test_order.beans.Bean5
	 * class com.amos.base.test_order.beans.Bean6
	 * finish: class com.amos.base.test_order.beans.Bean6
	 * class com.amos.base.test_order.beans.BeanA
	 * finish: class com.amos.base.test_order.beans.BeanA
	 * class com.amos.base.test_order.beans.BeanB
	 * finish: class com.amos.base.test_order.beans.BeanB
	 * class com.amos.base.test_order.beans.Bean1
	 * >>> class com.amos.base.test_order.beans.BeanA
	 * >>> class com.amos.base.test_order.beans.BeanB
	 * >>> class com.amos.base.test_order.beans.Bean6
	 * >>> class com.amos.base.test_order.beans.Bean4
	 * >>> class com.amos.base.test_order.beans.Bean5
	 * finish: class com.amos.base.test_order.beans.Bean1
	 *
	 * 结论:
	 * 1. bean初始化顺序与order无关
	 * 2. 通过 List<BaseOrder> beanOrderList 注入这一些列bean，order生效
	 * 3. 如果没有配置order，order的默认值为 Ordered.LOWEST_PRECEDENCE
	 */

}
