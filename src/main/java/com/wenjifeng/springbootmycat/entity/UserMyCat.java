package com.wenjifeng.springbootmycat.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @className UserMyCat
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:27
 * @Version 1.0
 **/
@Data
public class UserMyCat implements Serializable {
    private Integer id;
    private String name;
    private Date indate;
}
