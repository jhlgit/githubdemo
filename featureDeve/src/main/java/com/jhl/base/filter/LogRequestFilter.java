package com.jhl.base.filter;

import com.jhl.base.LogWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns="/*")
public class LogRequestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//        String body = ((FeatureHttpServletRequestWrapper) request).getBody();
        String body="";
        LogWriter.info(this.getClass(), "LogRequestFilter body:", body);
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
