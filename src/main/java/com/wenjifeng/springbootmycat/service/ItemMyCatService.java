package com.wenjifeng.springbootmycat.service;

import com.wenjifeng.springbootmycat.entity.ItemMyCat;

/**
 * @Description TODO
 * @className ItemMyCatService
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:32
 * @Version 1.0
 **/
public interface ItemMyCatService {

    public Integer addItemMyCat(ItemMyCat itemMyCat);

    public ItemMyCat queryItemMyCatById(Integer id);
}
