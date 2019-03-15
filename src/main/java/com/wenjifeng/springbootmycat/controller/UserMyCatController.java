package com.wenjifeng.springbootmycat.controller;

import com.wenjifeng.springbootmycat.entity.UserMyCat;
import com.wenjifeng.springbootmycat.service.UserMyCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description TODO
 * @className UserMyCatController
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:35
 * @Version 1.0
 **/
@RestController
public class UserMyCatController {

    @Autowired
    private UserMyCatService userMyCatService;

    @GetMapping("/queryUser/{id}")
    public UserMyCat queryUserMyCatById(@PathVariable Integer id) {
        return userMyCatService.queryUserMyCatById(id);
    }

    @GetMapping("/addUser/{value}")
    public String add(@PathVariable String value) {
        UserMyCat userMyCat = new UserMyCat();
        userMyCat.setName(value);
//        userMyCat.setIndate(new Date());
        this.userMyCatService.addUserMyCat(userMyCat);
        return "success";
    }

}
