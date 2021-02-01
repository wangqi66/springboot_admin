package com.example.demo_admin.config;

import com.example.demo_admin.interceptor.loginInterceptor;
import org.springframework.cglib.transform.impl.AddInitTransformer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author wang
 * @create 2021-01-29 11:17
 */
@Configuration
public class adminWebConfig implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new loginInterceptor())
                .addPathPatterns("/**")//所有请求都被拦截包括静态资源
                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**",
                        "/js/**", "/aa/**"); //放行的请求
    }
}
