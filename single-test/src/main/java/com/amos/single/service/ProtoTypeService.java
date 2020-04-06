package com.amos.single.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * DESCRIPTION: ProtoTypeService
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/6
 */
@Scope("prototype")
@Service
public class ProtoTypeService {

	public ProtoTypeService() {
		System.out.println("init " + this.getClass().getName());
	}

}
