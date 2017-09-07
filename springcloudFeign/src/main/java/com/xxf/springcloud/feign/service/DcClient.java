package com.xxf.springcloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("COMPUTE-SERVICE")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
