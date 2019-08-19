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
    private Long subtestid;
    private Long unitid;
    private Long normalid;


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

    public ReportDetails(Long subtestid, Long unitid, Long normalid, Report report) {
        this.subtestid = subtestid;
        this.unitid = unitid;
        this.normalid = normalid;
        this.report = report;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubtestid() {
        return subtestid;
    }

    public void setSubtestid(Long subtestid) {
        this.subtestid = subtestid;
    }

    public Long getUnitid() {
        return unitid;
    }

    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    public Long getNormalid() {
        return normalid;
    }

    public void setNormalid(Long normalid) {
        this.normalid = normalid;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
