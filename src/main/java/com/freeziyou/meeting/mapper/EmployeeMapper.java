package com.freeziyou.meeting.mapper;

import com.freeziyou.meeting.model.Employee;

/**
 * @author Dylan Guo
 * @date 7/19/2020 21:14
 * @description TODO
 */
public interface EmployeeMapper {

    Employee loadEmpByUsername(String username);

    Integer doReg(Employee employee);
}
