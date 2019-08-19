package com.example.LabTest.Model;


import javax.persistence.*;

@Entity
@Table(name = "NormalValues")
public class NormalValues {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private  String normalvalueName;

//    @ManyToOne
//    @JoinColumn(name = "reportdetails_id",nullable = false)
//    public ReportDetails reportdetails;


    public NormalValues() {
    }

    public NormalValues(String normalvalueName) {
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
