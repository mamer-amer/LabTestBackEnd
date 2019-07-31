package com.example.LabTest.DTO;

import com.example.LabTest.Model.ReportSubtest;
import com.example.LabTest.Model.SubTests;
import java.util.List;

public class GenerateReportDTO {
    private Long reportid;
    private String reportName;
    private Long labtestid;
    private Long patientid;
    private List<ReportSubtest> reportSubtests;

    public GenerateReportDTO() {

    }

    public GenerateReportDTO(Long reportid, String reportName, Long labtestid, Long patientid, List<ReportSubtest> reportSubtests) {
        this.reportid = reportid;
        this.reportName = reportName;
        this.labtestid = labtestid;
        this.patientid = patientid;
        this.reportSubtests = reportSubtests;
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

    public List<ReportSubtest> getReportSubtests() {
        return reportSubtests;
    }

    public void setReportSubtests(List<ReportSubtest> reportSubtests) {
        this.reportSubtests = reportSubtests;
    }
}
