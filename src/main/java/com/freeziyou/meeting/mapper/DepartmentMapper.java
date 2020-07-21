package com.freeziyou.meeting.mapper;

import com.freeziyou.meeting.model.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:11
 * @description TODO
 */
public interface DepartmentMapper {
    Department getDepById(Integer id);

    List<Department> getAllDeps();

    Integer addNewDepartment(String newDepartment);

    Department getDepByName(String departmentname);

    Integer deletedepartment(Integer departmentid);

    Integer updatedep(@Param("id") Integer id, @Param("name") String name);
}
