package com.example.demo_admin.controller;

import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传测试
 * @author wang
 * @create 2021-02-01 10:35
 */
@Controller
public class formTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "/form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImage") MultipartFile headerImage,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {

        if (!headerImage.isEmpty()){
            //存储到服务器上
            String originalFilename = headerImage.getOriginalFilename();
            headerImage.transferTo(new File("F:\\"+originalFilename));
        }
        if (photos.length>0){
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("F:\\"+originalFilename));
                }
            }
        }



        return "main";
    }

}
