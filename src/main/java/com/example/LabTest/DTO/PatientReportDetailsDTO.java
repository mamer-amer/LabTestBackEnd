package com.example.LabTest.DTO;

import com.example.LabTest.Model.PatientReport;

public class PatientReportDetailsDTO {
    private Long id;
    private String subtest;
    private String unit;
    private String normal;
    private String result;
    private PatientReport patientReport;

    public PatientReportDetailsDTO() {
    }

    public PatientReportDetailsDTO(Long id, String subtest, String unit, String normal, String result, PatientReport patientReport) {
        this.id = id;
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
