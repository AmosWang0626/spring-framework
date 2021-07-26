package com.amos.aop.service;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * IndexService
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class IndexService {

	@Resource
	private RelyService relyService;

	public IndexService() {
		System.out.println("init " + this.getClass().getName());
	}

	public RelyService getRelyService() {
		String name = this.getClass().getSimpleName() + "#"
				+ Thread.currentThread().getStackTrace()[1].getMethodName();

		System.out.println("\t" + name);
		return relyService;
	}

}
