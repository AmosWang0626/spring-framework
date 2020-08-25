package com.amos.base.strategy.impl;

import com.amos.base.strategy.SchoolStrategy;
import org.springframework.stereotype.Component;

/**
 * 模块名称: spring
 * 模块描述: 学生
 *
 * @author amos.wang
 * @date 2020/8/25 18:27
 */
@Component
public class Student implements SchoolStrategy {
	public Student() {
		System.out.println(this.getClass());
	}

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "同学!";
	}
}
