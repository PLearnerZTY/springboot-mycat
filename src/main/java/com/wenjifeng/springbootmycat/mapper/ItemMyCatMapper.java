package com.wenjifeng.springbootmycat.mapper;

import com.wenjifeng.springbootmycat.entity.ItemMyCat;

/**
 * @Description TODO
 * @className ItemMyCatMapper
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:29
 * @Version 1.0
 **/
public interface ItemMyCatMapper {

    public Integer addItemMyCat(ItemMyCat itemMyCat);

    public ItemMyCat queryItemMyCatById(Integer id);
}
