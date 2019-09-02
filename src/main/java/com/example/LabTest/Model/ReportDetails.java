package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ReportDetails")
public class ReportDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subtest;
    private String unit;
    private String normal;


    @ManyToOne
    @JoinColumn(name = "report_id",nullable = false)
    @JsonBackReference
    public Report report;
//    @OneToMany(mappedBy = "reportdetails")
//    private List<SubTests> subTestsList;
//
//    @OneToMany(mappedBy = "reportdetails")
//    private List<Units> unitsList;
//
//    @OneToMany(mappedBy = "reportdetails")
//    private  List<NormalValues> normalValuesList;


    public ReportDetails() {
    }

    public ReportDetails(String subtest, String unit, String normal, Report report) {
        this.subtest = subtest;
        this.unit = unit;
        this.normal = normal;
        this.report = report;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubtest() {
        return subtest;
    }

    public void setSubtest(String subtest) {
        this.subtest = subtest;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
