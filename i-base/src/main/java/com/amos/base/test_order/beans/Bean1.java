package com.amos.base.test_order.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Bean
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2022/3/22
 */
@Component
public class Bean1 {

	@Autowired
	public Bean1(List<BaseOrder> beanOrderList) {
		System.out.println(this.getClass());
		beanOrderList.forEach(b -> System.out.println(">>> " + b.getClass()));
	}

	@PostConstruct
	public void post() {
		System.out.println("finish: " + this.getClass());
	}
}
