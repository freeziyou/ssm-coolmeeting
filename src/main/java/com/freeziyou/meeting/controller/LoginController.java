package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.model.Employee;
import com.freeziyou.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Dylan Guo
 * @date 7/19/2020 21:09
 * @description TODO
 */
@Controller
public class LoginController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpSession httpSession) {
        Employee employee = employeeService.doLogin(username, password);

        System.out.println("Client 登陆中...");

        if (employee == null) {
            model.addAttribute("error", "用户名或密码输入错误, 登陆失败");
            // 跳转页面
            return "forward:/";
        } else if (employee.getStatus() == 0) {
            model.addAttribute("error", "用户待审批");
            // 跳转页面
            return "forward:/";
        } else if (employee.getStatus() == 2) {
            model.addAttribute("error", "用户审批未通过");
            // 跳转页面
            return "forward:/";
        } else {
            // 当前用户中存到 session 中
            httpSession.setAttribute("currentuser", employee);
            System.out.println(employee);
            return "redirect:/notifications";
        }
    }
}
