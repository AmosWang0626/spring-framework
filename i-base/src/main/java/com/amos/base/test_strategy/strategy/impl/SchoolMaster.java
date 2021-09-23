package com.amos.base.test_strategy.strategy.impl;

import com.amos.base.test_strategy.strategy.SchoolStrategy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 模块名称: spring
 * 模块描述: 校长
 *
 * @author amos.wang
 * @date 2020/8/25 18:27
 */
@Component
public class SchoolMaster implements SchoolStrategy {

	public SchoolMaster() {
		System.out.println(this.getClass());
	}

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "校长!";
	}

	@PostConstruct
	public void post() {
		System.out.println("PostConstruct " + this.getClass());
	}
}
