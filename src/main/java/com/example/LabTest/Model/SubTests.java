package com.example.LabTest.Model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SubTests")
public class SubTests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String subtestName;

//    @ManyToOne
//    private ReportDetails reportSubtest;

//    @ManyToOne
//    @JoinColumn(name = "reportdetails_id", nullable = false)
//    public List<ReportDetails> reportdetails;

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
