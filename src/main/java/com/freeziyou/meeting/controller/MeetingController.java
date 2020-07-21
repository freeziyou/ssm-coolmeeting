package com.freeziyou.meeting.controller;

import com.freeziyou.meeting.model.Department;
import com.freeziyou.meeting.model.Employee;
import com.freeziyou.meeting.service.DepartmentService;
import com.freeziyou.meeting.service.EmployeeService;
import com.freeziyou.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/21/2020 16:27
 * @description TODO
 */
@Controller
public class MeetingController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    MeetingRoomService meetingRoomService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/bookmeeting")
    public String bookmeeting(Model model) {
        model.addAttribute("mrs", meetingRoomService.getAllMr());
        return "bookmeeting";
    }

    @RequestMapping("/alldeps")
    @ResponseBody
    public List<Department> getAllDeps() {
        return departmentService.getAllDeps();
    }

    @RequestMapping("/getempbydepid")
    @ResponseBody
    public List<Employee> getEmpByDepId(Integer depId) {
        return employeeService.getEmpByDepId(depId);
    }

}
