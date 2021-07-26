package com.amos.cr.second.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * C
 *
 * @author amos.wang
 * @date 2020/4/14 23:00
 */
@Component
public class C {

	@Resource
	private A a;
	@Resource
	private B b;

	public C() {
		System.out.println("init " + getClass().getName());
	}

	@PostConstruct
	public void callback() {
		System.out.println("\t" + getClass().getSimpleName() + " Init Finish!");
	}

}
