package com.boot.config;

import com.boot.filter.MyFilter;
import com.boot.interceptor.LoginInterceptor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

//配置类
@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor handlerInterceptor = new LoginInterceptor();
        String path[] = {"/user/**"};
        String excludePath[] = {"/user/login"};
        registry.addInterceptor(handlerInterceptor).addPathPatterns(path).excludePathPatterns(excludePath);
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        Filter filter = new MyFilter();
        FilterRegistrationBean bean = new FilterRegistrationBean(filter);
        bean.addUrlPatterns("/user/*");
        return bean;
    }

    //注册字符过滤器
    @Bean
    public FilterRegistrationBean characterEncodingFilterRegistrationBean() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(characterEncodingFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
