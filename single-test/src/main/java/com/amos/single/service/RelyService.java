package com.amos.single.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * DESCRIPTION: RelyService
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class RelyService {

	@Resource
	private IndexService indexService;

	public RelyService() {
		System.out.println("init " + this.getClass().getName());
	}

	public IndexService getIndexService() {
		System.out.println(this.getClass().getSimpleName() + "#" + Thread.currentThread().getStackTrace()[1].getMethodName());
		return indexService;
	}


	@PostConstruct
	public void cycleInitCallback() {
		System.out.println(this.getClass().getName() + "生命周期初始化回调方法");
	}

}
