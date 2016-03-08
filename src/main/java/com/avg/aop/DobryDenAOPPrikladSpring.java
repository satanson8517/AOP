package com.avg.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 *
 * @author Michal Nedbálek <michal.nedbalek@avg.com> on 08/03/2016
 */
public class DobryDenAOPPrikladSpring {

	public static void main(String[] args) {
		PisatelZpravy cil = new PisatelZpravy();

		// vytvoříme proxy
		ProxyFactory pf = new ProxyFactory();

		pf.addAdvice(new VylepsovacZpravy());
		pf.setTarget(cil);

		PisatelZpravy proxy = (PisatelZpravy) pf.getProxy();

		// vypíšeme zprávu
		proxy.napisZpravu();
	}

}
