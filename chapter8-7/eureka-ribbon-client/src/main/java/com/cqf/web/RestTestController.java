package com.cqf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by cqf on 2019/8/19
 */
@RestController
public class RestTestController {

    @GetMapping("/testRest")
    public String testRest(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("https://www.baidu.com/",String.class);
    }
}
