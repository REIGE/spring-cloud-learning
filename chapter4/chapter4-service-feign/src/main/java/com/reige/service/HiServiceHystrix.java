package com.reige.service;

import org.springframework.stereotype.Component;

/**
 * @author chenrui reige3@gmail.com
 * @date 2018/8/27.
 */
@Component
public class HiServiceHystrix implements HiService {

    @Override
    public String hi(String name) {
        return String.format("error : %s", name);
    }
}
