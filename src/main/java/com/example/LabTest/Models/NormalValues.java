package com.example.LabTest.Models;


import javax.persistence.*;

@Entity
@Table(name = "NormalValues")
public class NormalValues {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private  String NormalValueName;

    public NormalValues() {
    }

    public NormalValues(String normalValueName) {
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
