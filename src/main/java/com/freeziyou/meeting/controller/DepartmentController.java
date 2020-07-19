package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.mapper.DepartmentMapper;
import com.freeziyou.meeting.model.Department;
import com.freeziyou.meeting.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:12
 * @description TODO
 */
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/dep")
    public String getDepById(Integer id) {
        Department dep = departmentService.getDepById(id);
        System.out.println("dep = " + dep);
        return "dep = " + dep;
    }
}
