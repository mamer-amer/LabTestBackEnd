package com.example.LabTest.Models;

import javax.persistence.*;

@Entity
@Table(name = "SubTests")
public class SubTests {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private  String SubTestName;

    public SubTests() {

    }

    public SubTests(String subTestName) {
        SubTestName = subTestName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSubTestName() {
        return SubTestName;
    }

    public void setSubTestName(String subTestName) {
        SubTestName = subTestName;
    }

}
