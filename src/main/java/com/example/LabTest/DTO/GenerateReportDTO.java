package com.example.LabTest.DTO;

import com.example.LabTest.Model.ReportDetails;

import java.util.List;

public class GenerateReportDTO {
    private Long reportid;
    private String labtestName;
    private String departmentName;
    private List<ReportDetails> reportDetails;

    public GenerateReportDTO() {

    }

    public GenerateReportDTO(Long reportid, String labtestName, String departmentName, List<ReportDetails> reportDetails) {
        this.reportid = reportid;
        this.labtestName = labtestName;
        this.departmentName = departmentName;
        this.reportDetails = reportDetails;
    }

    public Long getReportid() {
        return reportid;
    }

    public void setReportid(Long reportid) {
        this.reportid = reportid;
    }

    public String getLabtestName() {
        return labtestName;
    }

    public void setLabtestName(String labtestName) {
        this.labtestName = labtestName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<ReportDetails> getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(List<ReportDetails> reportDetails) {
        this.reportDetails = reportDetails;
    }
}
