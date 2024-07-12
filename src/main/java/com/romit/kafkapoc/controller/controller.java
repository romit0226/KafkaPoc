package com.romit.kafkapoc.controller;

import com.romit.kafkapoc.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
//    @RequestMapping("api/v1/demo")

     @Autowired
     KafkaService kafkaService;


    @GetMapping("/")
    public String Test(){
        kafkaService.createCustomer("Romit","Choudhary");
        return "Test";

    }
}
