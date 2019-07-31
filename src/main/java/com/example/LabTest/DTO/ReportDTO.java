package com.example.LabTest.DTO;

import com.example.LabTest.Model.*;

import java.util.Date;

public class ReportDTO {
    private  Long id;
    private String reportName;
    private  Long patientId;
    private Date createdDate;
    private LabTest labTest;



    public ReportDTO() {
    }

    public ReportDTO(Long id, String reportName, Long patientId, Date createdDate, LabTest labTest) {
        this.id = id;
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
