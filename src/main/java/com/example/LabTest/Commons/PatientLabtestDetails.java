package com.example.LabTest.Commons;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

public class PatientLabtestDetails {

    private Long id;
    private String labtestName;
    private String status;
    private Date createdDate;


    private Patient patientLab;

    public PatientLabtestDetails() {
    }
    public String getLabtestName() {
        return labtestName;
    }

    public void setLabtestName(String labtestName) {
        this.labtestName = labtestName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatientLab() {
        return patientLab;
    }

    public void setPatientLab(Patient patientLab) {
        this.patientLab = patientLab;
    }
}
