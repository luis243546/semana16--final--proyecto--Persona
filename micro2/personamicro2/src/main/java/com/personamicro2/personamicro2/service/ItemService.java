package com.personamicro2.personamicro2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personamicro2.personamicro2.entity.Item;

@Service
public interface ItemService {
    public List<Item>finAll();

    public Item findById(Long id);
}
