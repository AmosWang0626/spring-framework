package com.amos.single;

import org.springframework.stereotype.Component;

/**
 * 模块名称: 源码测试
 * 模块描述: 源码测试
 *
 * @author amos.wang
 * @date 2020/3/24 13:34
 */
@Component
public class SingleTest {

	public SingleTest() {
		System.out.println("init " + this.getClass().getName());
	}

}
