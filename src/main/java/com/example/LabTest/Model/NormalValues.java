package com.example.LabTest.Model;


import javax.persistence.*;

@Entity
@Table(name = "NormalValues")
public class NormalValues {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private  String normalvalueName;

    public NormalValues(String normalvalueName) {
        this.normalvalueName = normalvalueName;
    }

    public NormalValues() {
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
