package com.reige.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenrui
 * @date 2018/8/8.
 */
@FeignClient(value = "service-hi")
public interface HiService {

    /**
     * 调用server-hi rest 服务 /hi
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
