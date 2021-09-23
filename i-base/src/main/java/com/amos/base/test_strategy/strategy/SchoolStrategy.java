package com.amos.base.test_strategy.strategy;

/**
 * 模块名称: spring
 * 模块描述: 策略模式测试
 *
 * @author amos.wang
 * @date 2020/8/25 18:25
 */
public interface SchoolStrategy {

	/**
	 * sayHello
	 *
	 * @param name 姓
	 * @return 问候语
	 */
	String sayHello(String name);
}
