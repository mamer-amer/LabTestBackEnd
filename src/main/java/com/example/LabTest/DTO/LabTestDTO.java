package com.example.LabTest.DTO;

import com.example.LabTest.Model.Department;
import com.example.LabTest.Model.Report;

public class LabTestDTO {
    private Long id;
    private  String labtestName;

    public LabTestDTO() {
    }

    public LabTestDTO(Long id, String labtestName) {
        this.id = id;
        this.labtestName = labtestName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabtestName() {
        return labtestName;
    }

    public void setLabtestName(String labtestName) {
        this.labtestName = labtestName;
    }

    //    private Department department;

//    public Report report;
//
//    public Report getReport() {
//        return report;
//    }
//
//    public void setReport(Report report) {
//        this.report = report;
//    }
//
//    public LabTestDTO() {
//    }
//
//    public LabTestDTO(Long id, String labtestName) {
//        this.id = id;
//        this.labtestName = labtestName;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLabtestName() {
//        return labtestName;
//    }
//
//    public void setLabtestName(String labtestName) {
//        this.labtestName = labtestName;
//    }
//
//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }
}
