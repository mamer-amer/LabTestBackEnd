package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String reportName;
    private  Long patientId;
    private Date createdDate;

    @OneToOne
    @JoinColumn(name = "labtest_id",nullable = false)
    public LabTest labTest;

    public Report() {
    }

    public Report(String reportName, Long patientId, Date createdDate, LabTest labTest) {
        this.reportName = reportName;
        this.patientId = patientId;
        this.createdDate = createdDate;
        this.labTest = labTest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }
}
