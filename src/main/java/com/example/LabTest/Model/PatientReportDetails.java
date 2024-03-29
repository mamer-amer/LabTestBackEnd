package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "PatientReportDetails")
public class PatientReportDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subtest;
    private String unit;
    private String normal;
    private String result;
    @ManyToOne
    @JoinColumn(name = "patient_report_id", nullable = false)
    @JsonBackReference
    private PatientReport patientReport;

    public PatientReportDetails() {
    }

    public PatientReportDetails(String subtest, String unit, String normal, String result, PatientReport patientReport) {
        this.subtest = subtest;
        this.unit = unit;
        this.normal = normal;
        this.result = result;
        this.patientReport = patientReport;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public PatientReport getPatientReport() {
        return patientReport;
    }

    public void setPatientReport(PatientReport patientReport) {
        this.patientReport = patientReport;
    }
}
