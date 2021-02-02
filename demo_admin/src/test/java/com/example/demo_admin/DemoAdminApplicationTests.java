package com.example.demo_admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoAdminApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from account",);
        Long o = jdbcTemplate.queryForObject("select count(*) from account", long.class);
        System.out.println(o);

    }

}
