package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "LabTest")
public class LabTest {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private  String labtestName;

    @ManyToOne
    @JoinColumn(name = "department_id",nullable = false)
    @JsonBackReference
    private Department department;

    @OneToOne(mappedBy = "labTest")
    public Report report;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public LabTest() {
    }

    public LabTest(String labtestName) {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
