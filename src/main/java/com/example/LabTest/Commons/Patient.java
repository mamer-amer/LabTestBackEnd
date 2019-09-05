package com.example.LabTest.Commons;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


public class Patient {


    private Long id;
    private String name;
    private String cnic;
    private String phoneNo;
    private Integer age;
    private String gender;
    private String address;
    private String status;
    private String accountNo;
    private Boolean gynAndObsRegistration;
    private String husbandOfAndFatherOf;
    private Date registrationDate;
    private Date date;
    private String CreatedBy;
    private String UpdatedBy;
    private Date CreatedAt;
    private Date UpdateAt;



    private List<PatientLabtestDetails> patientLabtestDetails;

    public Patient() {

    }

    public Patient(String name, String cnic, String phoneNo, Integer age, String gender, String address, String status, String accountNo, Boolean gynAndObsRegistration, String husbandOfAndFatherOf, Date registrationDate, Date date, String createdBy, String updatedBy, Date createdAt, Date updateAt) {
        this.name = name;
        this.cnic = cnic;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.status = status;
        this.accountNo = accountNo;
        this.gynAndObsRegistration = gynAndObsRegistration;
        this.husbandOfAndFatherOf = husbandOfAndFatherOf;
        this.registrationDate = registrationDate;
        this.date = date;
        CreatedBy = createdBy;
        UpdatedBy = updatedBy;
        CreatedAt = createdAt;
        UpdateAt = updateAt;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Boolean getGynAndObsRegistration() {
        return gynAndObsRegistration;
    }

    public void setGynAndObsRegistration(Boolean gynAndObsRegistration) {
        this.gynAndObsRegistration = gynAndObsRegistration;
    }

    public String getHusbandOfAndFatherOf() {
        return husbandOfAndFatherOf;
    }

    public void setHusbandOfAndFatherOf(String husbandOfAndFatherOf) {
        this.husbandOfAndFatherOf = husbandOfAndFatherOf;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        UpdatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        CreatedAt = createdAt;
    }

    public Date getUpdateAt() {
        return UpdateAt;
    }

    public void setUpdateAt(Date updateAt) {
        UpdateAt = updateAt;
    }

    public List<PatientLabtestDetails> getPatientLabtestDetails() {
        return patientLabtestDetails;
    }

    public void setPatientLabtestDetails(List<PatientLabtestDetails> patientLabtestDetails) {
        this.patientLabtestDetails = patientLabtestDetails;
    }
}
