package com.example.LabTest.Models;

import javax.persistence.*;

@Entity
@Table(name = "Units")
public class Units {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private  String UnitName;

    public Units() {
    }

    public Units(String unitName) {
        UnitName = unitName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }
}

