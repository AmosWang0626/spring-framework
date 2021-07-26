package com.amos.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * AOP
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/4/11
 */
@Aspect
@Component
public class NotVeryUsefulAspect {

	@Pointcut("execution(* com.amos.aop.service..*(..))")
	public void anyPublicMethod() {
	}

	@Before("anyPublicMethod()")
	public void before() {
		System.out.println("AOP 来喽~~~");
	}

}
