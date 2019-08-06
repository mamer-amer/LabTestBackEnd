package com.example.LabTest.DTO;

public class SubTestsDTO {
    private Long id;
    private  String subtestName;

    public SubTestsDTO() {
    }

    public SubTestsDTO(Long id, String subtestName) {
        this.id = id;
        this.subtestName = subtestName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubtestName() {
        return subtestName;
    }

    public void setSubtestName(String subtestName) {
        this.subtestName = subtestName;
    }
}
