package com.wenjifeng.springbootmycat.service;

import com.wenjifeng.springbootmycat.entity.UserMyCat;

/**
 * @Description TODO
 * @className UserMyCatService
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:31
 * @Version 1.0
 **/
public interface UserMyCatService {

    public Integer addUserMyCat(UserMyCat userMyCat);

    public UserMyCat queryUserMyCatById(Integer id);


}
