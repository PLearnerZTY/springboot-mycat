package com.wenjifeng.springbootmycat.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description TODO
 * @className ItemMyCat
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:28
 * @Version 1.0
 **/
@Data
public class ItemMyCat implements Serializable {
    private Integer id;
    private Integer value;
    private Date indate;
}
