package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.mapper.DepartmentMapper;
import com.freeziyou.meeting.model.Department;
import com.freeziyou.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:12
 * @description TODO
 */
@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/departments")
    public String departments(Model model) {
        model.addAttribute("deps", departmentService.getAllDeps());
        return "departments";
    }

    @RequestMapping("/newdepartments")
    public String addNewDepartment(String departmentname) {
        Integer department = departmentService.addNewDepartment(departmentname);
        return "redirect:/admin/departments";
    }

    @RequestMapping("/deletedepartment")
    public String deletedepartment(Integer departmentid) {
        Integer department = departmentService.deletedepartment(departmentid);
        return "redirect:/admin/departments";
    }

    @RequestMapping("/updatedep")
    @ResponseBody
    public String updatedep(Integer id, String name) {
        Integer result = departmentService.updatedep(id, name);
        if (result == 1) {
            return "success";
        }
        return "error";
    }
}
