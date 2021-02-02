package com.example.demo_admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.ws.WebEndpoint;

/**
 * @author wang
 * @create 2021-02-02 10:22
 */

//@Configuration
//@ConfigurationProperties(prefix = "spring.datasource")
public class myDataConfig {
    @Bean
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setUrl("jdbc:mysql://localhost:3306/db");
//        druidDataSource.setDriver("com.mysql.jdbc.Driver");

        return druidDataSource;
    }

    /**
     * 配置druid的监控功能
     */
    @Bean
    public ServletRegistrationBean StatViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean =
                new ServletRegistrationBean<>(statViewServlet, "/druid/*");

        registrationBean.addInitParameter("loginUsername","admin");
        registrationBean.addInitParameter("loginPassword","123456");
        return registrationBean;
    }
}
