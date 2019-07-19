package com.example.LabTest.DTOS;

public class SubTests {
    private Long Id;
    private  String SubTestName;

    public SubTests() {
    }

    public SubTests(Long id, String subTestName) {
        Id = id;
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
