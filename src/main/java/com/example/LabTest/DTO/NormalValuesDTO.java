package com.example.LabTest.DTO;

public class NormalValuesDTO {
    private Long id;
    private  String normalvalueName;

    public NormalValuesDTO() {
    }

    public NormalValuesDTO(Long id, String normalvalueName) {
        this.id = id;
        this.normalvalueName = normalvalueName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNormalvalueName() {
        return normalvalueName;
    }

    public void setNormalvalueName(String normalvalueName) {
        this.normalvalueName = normalvalueName;
    }
}
