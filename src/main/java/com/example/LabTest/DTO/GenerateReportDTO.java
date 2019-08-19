package com.example.LabTest.DTO;

import com.example.LabTest.Model.ReportDetails;

import java.util.List;

public class GenerateReportDTO {
    private Long reportid;
    private String reportName;
    private Long labtestid;
    private Long patientid;
    private List<ReportDetails> reportDetails;

    public GenerateReportDTO() {

    }

    public GenerateReportDTO(Long reportid, String reportName, Long labtestid, Long patientid, List<ReportDetails> reportDetails) {
        this.reportid = reportid;
        this.reportName = reportName;
        this.labtestid = labtestid;
        this.patientid = patientid;
        this.reportDetails = reportDetails;
    }

    public Long getReportid() {
        return reportid;
    }

    public void setReportid(Long reportid) {
        this.reportid = reportid;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public Long getLabtestid() {
        return labtestid;
    }

    public void setLabtestid(Long labtestid) {
        this.labtestid = labtestid;
    }

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    public List<ReportDetails> getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(List<ReportDetails> reportDetails) {
        this.reportDetails = reportDetails;
    }
}
