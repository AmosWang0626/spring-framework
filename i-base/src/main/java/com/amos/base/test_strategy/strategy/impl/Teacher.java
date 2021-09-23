package com.amos.base.test_strategy.strategy.impl;

import com.amos.base.test_strategy.strategy.SchoolStrategy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

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

	@PostConstruct
	public void post() {
		System.out.println("PostConstruct " + this.getClass());
	}
}
