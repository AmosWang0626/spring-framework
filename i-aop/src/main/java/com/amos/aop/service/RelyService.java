package com.amos.aop.service;

import org.springframework.stereotype.Component;

/**
 * RelyService
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class RelyService {

	public RelyService() {
		System.out.println("init " + this.getClass().getName());
	}

	public void relyHello() {
		String name = this.getClass().getSimpleName() + "#"
				+ Thread.currentThread().getStackTrace()[1].getMethodName();

		System.out.println("\t" + name + " Hello~~~");
	}

}
