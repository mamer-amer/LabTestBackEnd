package com.example.LabTest.Models;

import org.hibernate.annotations.GeneratorType;
import sun.util.resources.Bundles;

import javax.persistence.*;

@Entity
@Table(name = "LabTest")
public class LabTest {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long Id;
    private  String LabTestName;

    public LabTest() {
    }

    public LabTest(String labTestName) {
        LabTestName = labTestName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLabTestName() {
        return LabTestName;
    }

    public void setLabTestName(String labTestName) {
        LabTestName = labTestName;
    }
}
