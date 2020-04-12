package com.amos.base.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * DESCRIPTION: LazyService
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/6
 */
@Lazy
@Service
public class LazyService {

	public LazyService() {
		System.out.println("init " + this.getClass().getName());
	}

}
