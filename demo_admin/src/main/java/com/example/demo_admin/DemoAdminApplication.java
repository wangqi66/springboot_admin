package com.example.demo_admin;

import com.example.demo_admin.interceptor.loginInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ServletComponentScan
@SpringBootApplication
public class DemoAdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminApplication.class, args);
    }

    //extends WebMvcConfigurationSupport
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new loginInterceptor())
//                .addPathPatterns("/**")  //所有请求都被拦截包括静态资源
//                .excludePathPatterns("/", "/login", "/css/**", "/fonts/**", "/images/**",
//                        "/js/**", "/aa/**"); //放行的请求
//    }

}
