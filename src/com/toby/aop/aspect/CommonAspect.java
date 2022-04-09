package com.toby.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CommonAspect {
	@Pointcut("execution(public * com.toby.aop.dao.*.*(..))")
	private void allInDao() {}
	
	@Pointcut("execution(public * com.toby.aop.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(public * com.toby.aop.dao.*.set*(..))")
	private void setter() {}
	
	@Pointcut("allInDao() && !(getter() || setter())")
	public void test() {}
}
