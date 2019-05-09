package com.xcy.filter;

import javax.servlet.*;
import java.io.IOException;

//@Component
//@Order(2)
//@WebFilter(urlPatterns = "/*", filterName = "authFilter")
public class Filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("before Filter1");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("after Filter1");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
