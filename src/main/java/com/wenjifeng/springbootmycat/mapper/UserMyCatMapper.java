package com.wenjifeng.springbootmycat.mapper;

import com.wenjifeng.springbootmycat.entity.UserMyCat;

/**
 * @Description TODO
 * @className UserMyCatMapper
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:30
 * @Version 1.0
 **/
public interface UserMyCatMapper {

    public Integer addUserMyCat(UserMyCat userMyCat);

    public UserMyCat queryUserMyCatById(Integer id);
}
