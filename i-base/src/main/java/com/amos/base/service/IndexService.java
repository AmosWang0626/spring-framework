package com.amos.base.service;

import org.springframework.stereotype.Component;

/**
 * DESCRIPTION: IndexService
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class IndexService {

	public IndexService() {
		System.out.println("init " + this.getClass().getName());
	}

}
