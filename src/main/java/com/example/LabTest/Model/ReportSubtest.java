package com.example.LabTest.Model;

import javax.persistence.*;

@Entity
@Table(name = "ReportSubtest")
public class ReportSubtest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long reportid;
    private Long subtestid;
    private Long unitid;
    private Long normalid;


    public ReportSubtest() {

    }

    public ReportSubtest(Long reportid, Long subtestid, Long unitid, Long normalid) {
        this.reportid = reportid;
        this.subtestid = subtestid;
        this.unitid = unitid;
        this.normalid = normalid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReportid() {
        return reportid;
    }

    public void setReportid(Long reportid) {
        this.reportid = reportid;
    }

    public Long getSubtestid() {
        return subtestid;
    }

    public void setSubtestid(Long subtestid) {
        this.subtestid = subtestid;
    }

    public Long getUnitid() {
        return unitid;
    }

    public void setUnitid(Long unitid) {
        this.unitid = unitid;
    }

    public Long getNormalid() {
        return normalid;
    }

    public void setNormalid(Long normalid) {
        this.normalid = normalid;
    }
}
