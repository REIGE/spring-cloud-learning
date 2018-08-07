package com.reige.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenrui
 * @date 2018/8/8.
 */
@Service
public class HelloService {
    @Autowired
    public RestTemplate restTemplate;

    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }
}
