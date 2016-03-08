package com.avg.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 08/03/2016
 */
public class VylepsovacZpravy implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Dobrý den");
		Object navrat = invocation.proceed();
		System.out.println("Nashledanou");
		return navrat;
	}
}
