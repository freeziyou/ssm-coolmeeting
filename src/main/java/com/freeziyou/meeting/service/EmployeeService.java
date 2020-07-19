package com.freeziyou.meeting.service;

import com.freeziyou.meeting.mapper.EmployeeMapper;
import com.freeziyou.meeting.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dylan Guo
 * @date 7/19/2020 21:18
 * @description TODO
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee doLogin(String username, String password) {
        Employee employee = employeeMapper.loadEmpByUsername(username);
        if (employee == null || !employee.getPassword().equals(password)) {
            return null;
        }
        return employee;
    }
}
