package com.amos.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * IndexController
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/7/4
 */
@RestController
public class IndexController {

	@GetMapping
	public String index() {
		return "Hello World!";
	}

	@GetMapping("hello")
	public String hello() {
		return "Welcome to IBoot!";
	}

	@GetMapping("map")
	public Map<String, Object> map() {
		HashMap<String, Object> map = new HashMap<>(4);
		map.put("name", "amos");
		map.put("age", 18);
		map.put("addr", "World Expo Museum, Huangpu District, Shanghai");

		return map;
	}

}
