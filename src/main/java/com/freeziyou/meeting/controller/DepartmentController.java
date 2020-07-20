package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.mapper.DepartmentMapper;
import com.freeziyou.meeting.model.Department;
import com.freeziyou.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getDepById(Integer id) {
        return "departments";
    }
}
