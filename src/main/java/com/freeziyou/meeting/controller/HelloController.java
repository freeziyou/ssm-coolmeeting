package com.freeziyou.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Dylan Guo
 * @date 7/18/2020 19:41
 * @description TODO
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello", "hello didi");
        return "hello";
    }
}
