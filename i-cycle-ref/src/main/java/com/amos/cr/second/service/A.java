package com.amos.cr.second.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * DESCRIPTION: A
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class A {

	@Resource
	private B b;
	@Resource
	private C c;

	public A() {
		System.out.println("init " + getClass().getName());
	}

	@PostConstruct
	public void callback() {
		System.out.println("\t" + getClass().getSimpleName() + " Init Finish!");
	}

}
