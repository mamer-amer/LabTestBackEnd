package com.example.LabTest.Model;

import javax.persistence.*;

@Entity
@Table(name = "SubTests")
public class SubTests {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private  String subtestName;

    public SubTests() {
    }

    public SubTests(String subtestName) {
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
