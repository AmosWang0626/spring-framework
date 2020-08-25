package com.amos.base.strategy.impl;

import com.amos.base.strategy.SchoolStrategy;
import org.springframework.stereotype.Component;

/**
 * 模块名称: spring
 * 模块描述: 老师
 *
 * @author amos.wang
 * @date 2020/8/25 18:27
 */
@Component
public class Teacher implements SchoolStrategy {
	public Teacher() {
		System.out.println(this.getClass());
	}


	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "老师!";
	}
}
