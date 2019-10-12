package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PatientReport")
public class PatientReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long reportId;
    private Long patientId;
    private String remarks;
    private String labTestName;
    @OneToMany(mappedBy = "patientReport")
    private List<PatientReportDetails> patientReportDetails;

    public PatientReport() {
    }

    public PatientReport(Long reportId, Long patientId, String remarks, String labTestName, List<PatientReportDetails> patientReportDetails) {
        this.reportId = reportId;
        this.patientId = patientId;
        this.remarks = remarks;
        this.labTestName = labTestName;
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

    public String getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(String labTestName) {
        this.labTestName = labTestName;
    }

    public List<PatientReportDetails> getPatientReportDetails() {
        return patientReportDetails;
    }

    public void setPatientReportDetails(List<PatientReportDetails> patientReportDetails) {
        this.patientReportDetails = patientReportDetails;
    }
}
