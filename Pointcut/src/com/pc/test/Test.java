package com.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.pc.bean.Calculator;
import com.pc.bean.LogginAspect;
import com.pc.bean.LogginPointCut;

public class Test {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		proxyFactory.addAdvisor(new DefaultPointcutAdvisor(new LogginPointCut(), new LogginAspect()));
		Calculator proxy = (Calculator) proxyFactory.getProxy();
		proxy.add(10, 30);
		proxy.add(3, 2);
		// here we are call multiply method using proxy object 
		proxy.multiply(10, 5);
	}
}
