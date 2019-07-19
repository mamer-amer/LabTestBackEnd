package com.example.LabTest.DTOS;

public class LabTest {
    private Long Id;
    private  String LabTestName;

    public LabTest() {
    }

    public LabTest(Long id, String labTestName) {
        Id = id;
        LabTestName = labTestName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLabTestName() {
        return LabTestName;
    }

    public void setLabTestName(String labTestName) {
        LabTestName = labTestName;
    }
}
