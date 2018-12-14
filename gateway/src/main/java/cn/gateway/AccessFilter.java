package cn.gateway;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessFilter extends ZuulFilter {
	private Logger logger = Logger.getLogger(AccessFilter.class);

	@Override
	public Object run() {
		 RequestContext ctx = RequestContext.getCurrentContext();
	        HttpServletRequest request = ctx.getRequest();

	        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

	        Object accessToken = request.getParameter("accessToken");
	        if(accessToken == null) {
	        	logger.warn("access token is empty");
	            ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
	            return null;
	        }
	        logger.info("access token ok");
	        return null;
	    }

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
