package com.xxf.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("compute-service")
public interface DcClient {
    @GetMapping("/add")
    String consumer();
}
