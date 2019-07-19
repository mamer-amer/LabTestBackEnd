package com.example.LabTest.DTOS;

public class Units {
    private Long Id;
    private  String UnitName;

    public Units() {
    }

    public Units(Long id, String unitName) {
        Id = id;
        UnitName = unitName;
    }

    public Long getId() {
        return Id;
    }

    public String getUnitName() {
        return UnitName;
    }
}
