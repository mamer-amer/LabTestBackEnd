package com.example.LabTest.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String departmentName;

    @OneToMany(mappedBy = "department")
    private List<LabTest> labTest;

    public Department() {
    }

    public Department(String departmentName) {
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

    public List<LabTest> getLabTestList() {
        return labTest;
    }

    public void setLabTestList(List<LabTest> labTest) {
        this.labTest = labTest;
    }
}
