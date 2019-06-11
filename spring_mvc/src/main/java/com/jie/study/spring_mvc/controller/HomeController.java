package com.jie.study.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: HomeController
 * @author: HackerLou
 * @date: 2019/6/11
 * @Description:
 */

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/jie", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
