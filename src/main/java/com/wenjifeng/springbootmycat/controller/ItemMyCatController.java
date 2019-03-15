package com.wenjifeng.springbootmycat.controller;

import com.wenjifeng.springbootmycat.entity.ItemMyCat;
import com.wenjifeng.springbootmycat.service.ItemMyCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @className ItemMyCatController
 * @Author wen_jf@suixingpay
 * @Date 2019/3/13 17:40
 * @Version 1.0
 **/
@RestController
public class ItemMyCatController {

    @Autowired
    private ItemMyCatService itemMyCatService;

    @GetMapping("/queryItem/{id}")
    public ItemMyCat query(@PathVariable Integer id) {
        return this.itemMyCatService.queryItemMyCatById(id);
    }

    @GetMapping("/addItem/{id}/{value}")
    public String add(@PathVariable Integer id,@PathVariable Integer value) {
        ItemMyCat itemMyCat = new ItemMyCat();
        itemMyCat.setValue(value);
        itemMyCat.setId(id);
//        itemMyCat.setIndate(new Date());
        this.itemMyCatService.addItemMyCat(itemMyCat);
        return "success";
    }

}
