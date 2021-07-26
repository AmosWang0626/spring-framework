package com.amos.cr.second.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * B
 *
 * @author amos.wang
 * @date 2020/4/14 23:00
 */
@Component
public class B {

	@Resource
	private A a;
	@Resource
	private C c;

	public B() {
		System.out.println("init " + getClass().getName());
	}

	@PostConstruct
	public void callback() {
		System.out.println("\t" + getClass().getSimpleName() + " Init Finish!");
	}

}
