package com.example.LabTest.DTO;

import com.example.LabTest.Model.PatientReportDetails;

import java.util.List;

public class PatientReportDTO {
    private Long id;
    private Long reportId;
    private Long patientId;
    private String remarks;
    private List<PatientReportDetails> patientReportDetails;

    public PatientReportDTO() {
    }

    public PatientReportDTO(Long id, Long reportId, Long patientId, String remarks, List<PatientReportDetails> patientReportDetails) {
        this.id = id;
        this.reportId = reportId;
        this.patientId = patientId;
        this.remarks = remarks;
        this.patientReportDetails = patientReportDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<PatientReportDetails> getPatientReportDetails() {
        return patientReportDetails;
    }

    public void setPatientReportDetails(List<PatientReportDetails> patientReportDetails) {
        this.patientReportDetails = patientReportDetails;
    }
}

