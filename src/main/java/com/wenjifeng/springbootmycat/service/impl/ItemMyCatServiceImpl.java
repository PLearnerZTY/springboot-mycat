package com.wenjifeng.springbootmycat.service.impl;

import com.wenjifeng.springbootmycat.entity.ItemMyCat;
import com.wenjifeng.springbootmycat.mapper.ItemMyCatMapper;
import com.wenjifeng.springbootmycat.service.ItemMyCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @className ItemMyCatServiceImpl
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:32
 * @Version 1.0
 **/
@Service
public class ItemMyCatServiceImpl implements ItemMyCatService {

    @Autowired
    private ItemMyCatMapper itemMyCatMapper;

    @Override
    public Integer addItemMyCat(ItemMyCat itemMyCat) {
        return itemMyCatMapper.addItemMyCat(itemMyCat);
    }

    @Override
    public ItemMyCat queryItemMyCatById(Integer id) {
        return itemMyCatMapper.queryItemMyCatById(id);
    }
}
