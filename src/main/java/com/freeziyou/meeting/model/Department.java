package com.freeziyou.meeting.model;

/**
 * @author Dylan Guo
 * @date 7/18/2020 20:10
 * @description TODO
 */
public class Department {
    private Integer departmentid;
    private String departmentname;

    @Override
    public String toString() {
        return "Department{" +
                "departmentid=" + departmentid +
                ", departmentname='" + departmentname + '\'' +
                '}';
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }
}
