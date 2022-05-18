package com.jsp.eachnet.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Java小胡
 */
public class EnCodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        request.setCharacterEncoding("utf-8");//设置请求的编码格式
        response.setContentType("text/html;charset=utf-8");//设置请求的编码格式
        filterChain.doFilter(request,response);//过滤
    }

    @Override
    public void destroy() {

    }
}
