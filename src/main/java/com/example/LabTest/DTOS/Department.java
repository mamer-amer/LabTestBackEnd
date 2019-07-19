package com.example.LabTest.DTOS;

public class Department {
    private Long Id;
    private  String DepartmentName ;

    public Department() {
    }

    public Department(Long id, String departmentName) {
        Id = id;
        DepartmentName = departmentName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }
}
