package com.amos.base.test_strategy.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * 模块名称: spring
 * 模块描述: SchoolHello
 *
 * @author amos.wang
 * @date 2020/8/25 18:29
 */
@Component
public class SchoolContext {

	@Autowired
	private Map<String, SchoolStrategy> schoolStrategyMap;
	@Autowired
	private SimpleBean simpleBean;

	public SchoolContext() {
		System.out.println(this.getClass());
	}

	@PostConstruct
	public void post() {
		System.out.println(this.getClass() + " >>>>>>> post >>>>>>> " + schoolStrategyMap.size());
		System.out.println(this.getClass() + " >>>>>>> post >>>>>>> " + simpleBean.getClass());
	}

}
