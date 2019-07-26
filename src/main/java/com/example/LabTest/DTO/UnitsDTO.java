package com.example.LabTest.DTO;

public class UnitsDTO {
    private Long id;
    private  String unitName;

    public UnitsDTO() {
    }

    public UnitsDTO(Long id, String unitName) {
        this.id = id;
        this.unitName = unitName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
}
