package com.example.demo.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
/**
 * 
 * @author 刘彦军
 *服务网关还有个作用就是接口的安全性校验，这个时候我们就需要通过 zuul 进行统一拦截，
 *zuul 通过继承过滤器 ZuulFilter 进行处理
 */
@Component
public class ApiFilter extends ZuulFilter{

	@Override
	public Object run() throws ZuulException {
//这里写校验代码run 为过滤器执行的具体逻辑，在这里可以做很多事情，比如：权限判断、合法性校验等。
		   RequestContext context = RequestContext.getCurrentContext();
	        HttpServletRequest request = context.getRequest();
	        String token = request.getParameter("token");
	        //http://localhost:8766/api/feignTest1?token=12345
	        if(!"12345".equals(token)){
	            context.setSendZuulResponse(false);
	            context.setResponseStatusCode(401);
	            try {//如果token不是12345，走这里
	                context.getResponse().getWriter().write("token 不对拦截，不让走");
	            }catch (Exception e){}
	        }
	        return null;
	}
//shouldFilter 表示是否过滤，这里可以做逻辑判断，true 为过滤，false 不过滤
	@Override
	public boolean shouldFilter() {
		
		return true;
	}
//filterOrdery 为过滤的顺序，如果有多个过滤器，则数字越小越先执行
	@Override
	public int filterOrder() {
		
		return 0;
	}
//filterType 为过滤类型，可选值有 pre（路由之前）、routing（路由之时）、post（路由之后）、error（发生错误时调用）。
	@Override
	public String filterType() {
	
		return "pre";
	}

}
