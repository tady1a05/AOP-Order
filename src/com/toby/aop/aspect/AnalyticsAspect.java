package com.toby.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AnalyticsAspect {
	/*@Before("execution(public * com.toby.aop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		System.out.println("add ur mother");
	}*/
	@Before("com.toby.aop.aspect.CommonAspect.test()")
	private void test() {
		System.out.println(">>>>>>>>>>>AnalyticsAspect");
	}
}
