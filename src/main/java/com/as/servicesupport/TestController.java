package com.as.servicesupport;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: songyang  Date: 2018/10/11 Time: 10:10
 */
@RestController()
@RequestMapping("server")
public class TestController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("support")
    public String testSupport(String name){

        return "support has responsed by"+name+",current port is "+port;
    }
}