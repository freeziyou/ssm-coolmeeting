package com.freeziyou.meeting.service;

import com.freeziyou.meeting.mapper.DepartmentMapper;
import com.freeziyou.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:11
 * @description TODO
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }

    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }
}
