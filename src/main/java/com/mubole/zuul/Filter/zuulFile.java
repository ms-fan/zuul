package com.mubole.zuul.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description: 自定义拦截器
 * @Author: fanmanfu
 * @CreateDate: 2019/6/24 0024 14:21
 * @UpdateUser: fanmanfu
 * @UpdateDate: 2019/6/24 0024 14:21
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

@Component
public class zuulFile extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public String filterType() {
        return "pre"; //请求路由前调用
    }
    @Override
    public int filterOrder() {
        return 1; //int值来定义过滤器的执行顺序，数值越小优先级越高
    }
    @Override
    public boolean shouldFilter() {
        return true; //该过滤器是否执行，true执行，false不执行
    }
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();//获取请求参数token的值
        //String token = request.getParameter("token");
       /* if (token == null) {
            logger.warn("此操作需要先登录系统...");
            context.setSendZuulResponse(true);// 拒绝访问
            context.setResponseStatusCode(200);// 设置响应状态码
            try {//响应结果
                context.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }*/
        logger.info("ok");
        return null;
    }
}