package com.freeziyou.meeting.mapper;

import com.freeziyou.meeting.model.Department;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:11
 * @description TODO
 */
public interface DepartmentMapper {
    Department getDepById(Integer id);

    List<Department> getAllDeps();
}
