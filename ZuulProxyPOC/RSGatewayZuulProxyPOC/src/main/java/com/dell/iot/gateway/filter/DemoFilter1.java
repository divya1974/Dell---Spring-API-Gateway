/*
 * package com.dell.iot.gateway.filter;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import com.netflix.zuul.ZuulFilter; import
 * com.netflix.zuul.context.RequestContext; import
 * com.netflix.zuul.exception.ZuulException;
 * 
 * public class DemoFilter1 extends ZuulFilter {
 * 
 * @Override public boolean shouldFilter() {
 * 
 * 
 * RequestContext ctx = RequestContext.getCurrentContext(); String
 * context=ctx.getRequest().getHeader("x-forwarded-prefix");
 * if(context.equals("project2")) return true; else return false;
 * 
 * return true; }
 * 
 * @Override public Object run() throws ZuulException { RequestContext ctx =
 * RequestContext.getCurrentContext(); HttpServletRequest request =
 * ctx.getRequest();
 * 
 * 
 * //System.out.println("######@@"+ctx.getRouteHost()+"\n"+request.
 * getContentType()+"\n"+request.getLocalAddr()+"\n"+request.getLocalName()+"\n"
 * +request.getLocalPort()+"\n"+request.getPathInfo()+"\n"+request.
 * getPathTranslated()+"\n"+request.getProtocol()+"\n"+request.getQueryString()+
 * "\n"+request.getRemoteAddr()+"\n"+request.getRemoteHost()+"\n"+request.
 * getRemotePort()+"\n"+request.getRemoteUser()+"\n"+request.getRequestURI()+
 * "\n"+request.getRequestURL()+"\n"+request.getScheme()+"\n"+request.
 * getServerName()+"\n"+request.getServerPort()+"\n"+request.getServletPath()+
 * "\n"+request.getServletContext()); ctx.addZuulRequestHeader("zuulHeader",
 * "abc"); return null; }
 * 
 * @Override public String filterType() { return "pre"; }
 * 
 * @Override public int filterOrder() { return 1; }
 * 
 * }
 */