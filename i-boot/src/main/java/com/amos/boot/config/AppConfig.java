package com.amos.boot.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * AppConfig
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/7/4
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.amos.boot")
public class AppConfig implements WebMvcConfigurer {

	/**
	 * 只有加上 @EnableWebMvc，configureMessageConverters才会生效
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		System.out.println("========== Add JsonbHttpMessageConverter ==========");
		converters.add(new FastJsonHttpMessageConverter());
	}

}
