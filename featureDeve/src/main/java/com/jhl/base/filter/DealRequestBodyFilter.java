package com.jhl.base.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashSet;

@Configuration
public class DealRequestBodyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FeatureHttpServletRequestWrapper requestWrapper = new FeatureHttpServletRequestWrapper((HttpServletRequest)request);
        chain.doFilter(requestWrapper, response);
    }

    @Override
    public void destroy() {
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new DealRequestBodyFilter());
        filterRegistrationBean.setName("dealRequestBodyFilter");
        HashSet<String> strings = new HashSet<String>() ;
        strings.add("/*");
        filterRegistrationBean.setUrlPatterns(strings);
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
