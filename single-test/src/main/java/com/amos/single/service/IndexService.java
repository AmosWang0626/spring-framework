package com.amos.single.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * DESCRIPTION: IndexService
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
		return relyService;
	}

	@PostConstruct
	public void cycleInitCallback() {
		System.out.println(this.getClass().getName() + "生命周期初始化回调方法");
	}

}
