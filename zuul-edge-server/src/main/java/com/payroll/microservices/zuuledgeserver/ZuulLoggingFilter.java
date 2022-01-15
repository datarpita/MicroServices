package com.payroll.microservices.zuuledgeserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@ComponentScan
public class ZuulLoggingFilter extends ZuulFilter {

	private static final Logger log = LoggerFactory.getLogger(ZuulLoggingFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		//When to execute this filter
		return true;
	}

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		//actual logic
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		log.info(String.format("%s request to %s", req.getMethod(), req.getRequestURL()));
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		//pre, post, error, route
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
