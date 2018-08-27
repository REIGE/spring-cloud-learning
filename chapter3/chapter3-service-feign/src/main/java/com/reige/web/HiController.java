package com.reige.web;

import com.reige.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenrui 2018/8/8.
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return hiService.hi(name);
    }
}