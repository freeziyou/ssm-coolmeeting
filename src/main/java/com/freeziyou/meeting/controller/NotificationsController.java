package com.freeziyou.meeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dylan Guo
 * @date 7/19/2020 22:01
 * @description TODO
 */
@Controller
public class NotificationsController {

    @GetMapping("notifications")
    public String notifications() {
        return "notifications";
    }
}
