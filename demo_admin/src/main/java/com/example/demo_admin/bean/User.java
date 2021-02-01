package com.example.demo_admin.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author wang
 * @create 2021-01-28 22:24
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;
    private String password;

}