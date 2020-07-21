package com.freeziyou.meeting.mapper;

import com.freeziyou.meeting.model.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/19/2020 21:14
 * @description TODO
 */
public interface EmployeeMapper {

    Employee loadEmpByUsername(String username);

    Integer doReg(Employee employee);

    List<Employee> getAllEmpsByStatus(Integer status);

    Integer updatestatus(@Param("employeeid") Integer employeeid, @Param("status") Integer status);
}
