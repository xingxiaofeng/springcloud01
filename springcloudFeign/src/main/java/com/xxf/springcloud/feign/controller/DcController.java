package com.xxf.springcloud.feign.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxf.springcloud.feign.service.DcClient;

@RestController
public class DcController {
	Logger logger=Logger.getLogger(DcController.class);
    @Autowired
    DcClient dcClient;
    @GetMapping("/consumer")
    public String dc() {
    	String num=dcClient.consumer();
    	logger.info("计算结果："+num);
        return dcClient.consumer();
    }
}