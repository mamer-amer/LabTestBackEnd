package com.example.LabTest.Model;

import javax.persistence.*;

@Entity
@Table(name = "Units")
public class Units {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private  String unitName;

    public Units() {
    }

    public Units(String unitName) {
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

