package com.dell.iot.gateway.filter;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties.ZuulRoute;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class DemoFilter extends ZuulFilter{
	 
	@Autowired
	    private ZuulProperties zuulProperties;

	private Logger logger = LoggerFactory.getLogger(this.getClass()) ;

	public boolean shouldFilter() {
		
		return true;
	}

	
	public Object run() throws ZuulException {
		
		RequestContext ctx =RequestContext.getCurrentContext();
	    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
	   logger.info("request" + request);
	   logger.info("request URL " + request.getRequestURL());
	   logger.info("request URI " + request.getRequestURI());
	  
	/*  String URI= request.getRequestURI();
	  String rmtscript = URI.split("/")[1];
	  String product = URI.split("/")[2];
	  String version = URI.split("/")[3];
	  String model = URI.split("/")[4];
	  String serialnumber= URI.split("/")[5];
	  String context = URI.split("/")[6];
	  String contextID = URI.split("/")[7];
	  	  
	  logger.info("rmtscript" + rmtscript);
	  logger.info("product" + product);
	  logger.info("version" + version);
	  logger.info("model" + model);
	  */
      
       ZuulRoute zuulRoute = this.zuulProperties.getRoutes().get("service_1");
       logger.info("ZuulRoute" +zuulRoute);
  
	   logger.info("Header Host" + request.getHeader("Host"));
	   logger.info("Header Connection" + request.getHeader("Connection"));
	   logger.info("Servelet path " +request.getServletPath());
	   logger.info("SupportAssist-API-Key " +request.getHeader("SupportAssist-API-Key"));
	   
	   //ctx.addZuulRequestHeader("SupportAssist-API-Key", "69C61EF9E6604E09AEC89F3976782264");
	   //ctx.addZuulRequestHeader("Content-Type","application/json");
	   logger.info("Zuul Headers " +ctx.getZuulRequestHeaders());
	   logger.info("Zuul Request URL" + ctx.getRequest().getRequestURL());
	   logger.info("Zuul Request URI"+ ctx.getRequest().getRequestURI());
	   logger.info("Query Param" +ctx.getRequestQueryParams());
	   logger.info("Context Path" + ctx.getRequest().getContextPath());
	   logger.info("Parameter name" + ctx.getRequest().getParameterNames());
	   	 
	    return null;
	}


	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}
	

}
