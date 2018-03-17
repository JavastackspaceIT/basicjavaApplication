package com.pc.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import ognl.MethodAccessor;

public class LogginAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Object[] args = methodInvocation.getArguments();
		System.out.print(methodInvocation.getMethod().getName() + "(");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(")");
		Object ret = methodInvocation.proceed();
		System.out.println("after the target class method " + ret);
		return ret;
	}

}
