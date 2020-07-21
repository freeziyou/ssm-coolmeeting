package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dylan Guo
 * @date 7/20/2020 15:59
 * @description TODO
 */
@Controller
@RequestMapping("/admin")
public class ApproveAccountController {

    public static final Integer PENDING_APPROVE = 0;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/approveaccount")
    public String approveAccount(Model model) {
        model.addAttribute("emps", employeeService.getAllEmpsByStatus(PENDING_APPROVE));
        return "approveaccount";
    }

    @RequestMapping("/updatestatus")
    public String updatestatus(Integer employeeid, Integer status) {
        Integer result = employeeService.updatestatus(employeeid, status);
        return "redirect:/admin/approveaccount";
    }
}
