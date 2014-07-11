package com.furkanbayraktar.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: Furkan Bayraktar
 * Date: 7/11/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping("/")
    public String welcome() {

        return "index";
    }

}
