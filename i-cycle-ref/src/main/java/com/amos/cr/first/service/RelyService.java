package com.amos.cr.first.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * RelyService
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class RelyService {

	@Resource
	private IndexService indexService;

	public RelyService() {
		System.out.println("init " + getClass().getName());
	}

	@PostConstruct
	public void callback() {
		System.out.println("\t" + getClass().getSimpleName() + " 生命周期初始化回调方法 @PostConstruct");
		System.out.println("\t" + getClass().getSimpleName() + " REF >>> " + indexService);
	}

}
