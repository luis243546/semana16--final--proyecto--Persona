package com.personamicro2.personamicro2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.personamicro2.personamicro2.entity.Item;
import com.personamicro2.personamicro2.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/lista5")
    public List<Item>findAll(){
        return itemService.finAll();
    }

    @GetMapping("/lista5/{id}")
    public Item findById(@PathVariable Long id){
        return itemService.findById(id);
    }
}
