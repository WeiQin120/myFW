package com.example.myFramework.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myFramework.service.myFrameworkService;

@RestController
public class myFrameworkController {
    private static final Logger log = LoggerFactory.getLogger(myFrameworkController.class);

    @Autowired
    public myFrameworkService myFrameworkService;
    
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)
    public void addItem(@RequestParam String item_name, @RequestParam String item_description) {
        log.info("add item -----> controller");
       myFrameworkService.addItem(item_name, item_description);
    }
}