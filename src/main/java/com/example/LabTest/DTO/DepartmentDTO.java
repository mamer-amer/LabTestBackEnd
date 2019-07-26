package com.example.LabTest.DTO;

import com.example.LabTest.Model.LabTest;

import java.util.List;

public class DepartmentDTO {
    private Long id;
    private String departmentName;
    private List<LabTest> labTest;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<LabTest> getLabTest() {
        return labTest;
    }

    public void setLabTest(List<LabTest> labTest) {
        this.labTest = labTest;
    }
}
