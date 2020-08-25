package com.amos.base.strategy;

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

	@PostConstruct
	public void hello() {
		System.out.println(this.getClass() + " >>>>>>> " + schoolStrategyMap.size());
	}

}
