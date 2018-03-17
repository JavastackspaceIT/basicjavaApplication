package com.pc.bean;

import java.lang.reflect.Method;

import org.aspectj.weaver.StaticJoinPointFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class LogginPointCut extends StaticMethodMatcherPointcut {
	@Override
	public boolean matches(Method method, Class<?> className) {
		if (className.isAssignableFrom(Calculator.class) && method.getName().equals("add")) {
			System.out.println(method.getName()+"  is  called ");
		//	return true;
		}
		if(className.isAssignableFrom(Calculator.class)  &&  method.getName().equals("multiply"))
		{
			System.out.println(method.getName()+" is called ");
		//	return true;
		}
		return false;
	}

}
