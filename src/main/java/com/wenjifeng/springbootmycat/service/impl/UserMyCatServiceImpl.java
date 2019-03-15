package com.wenjifeng.springbootmycat.service.impl;

import com.wenjifeng.springbootmycat.entity.UserMyCat;
import com.wenjifeng.springbootmycat.mapper.UserMyCatMapper;
import com.wenjifeng.springbootmycat.service.UserMyCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @className UserMyCatServiceImpl
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:33
 * @Version 1.0
 **/
@Service
public class UserMyCatServiceImpl implements UserMyCatService {

    @Autowired
    private UserMyCatMapper userMyCatMapper;

    @Override
    public Integer addUserMyCat(UserMyCat userMyCat) {
        return userMyCatMapper.addUserMyCat(userMyCat);
    }

    @Override
    public UserMyCat queryUserMyCatById(Integer id) {
        return userMyCatMapper.queryUserMyCatById(id);
    }
}
