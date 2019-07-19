package com.example.LabTest.DTOS;

public class NormalValues {
    private Long Id;
    private  String NormalValueName;

    public NormalValues() {
    }

    public NormalValues(Long id, String normalValueName) {
        Id = id;
        NormalValueName = normalValueName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNormalValueName() {
        return NormalValueName;
    }

    public void setNormalValueName(String normalValueName) {
        NormalValueName = normalValueName;
    }
}
