package com.example.myFramework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.myFramework.controller.myFrameworkController;
import com.example.myFramework.entity.Item;
import com.example.myFramework.repository.itemRepository;

import jakarta.annotation.Resource;

@Service
public class myFrameworkService {
    private static final Logger log = LoggerFactory.getLogger(myFrameworkController.class);
    @Resource
    private itemRepository itemRepository;

    public void addItem(String item_name, String item_description) {  
        // Init
        Item item = new Item();
        item.setName(item_name);
        item.setDescription(item_description);
       
        itemRepository.saveAndFlush(item);
    }
}
