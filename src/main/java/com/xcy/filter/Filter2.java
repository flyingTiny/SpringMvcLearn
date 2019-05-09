package com.xcy.filter;

import javax.servlet.*;
import java.io.IOException;

//@Component
//@Order(1)
//@WebFilter(urlPatterns = "/*", filterName = "authFilter")
public class Filter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("before Filter2");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("after Filter2");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
