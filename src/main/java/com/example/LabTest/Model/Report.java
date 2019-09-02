package com.example.LabTest.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
    private String reportName;
    private String departmentName;
    private Date createdDate;

    /*One to Many Relation with Report Details Entity*/
    @OneToMany(mappedBy = "report")
    public List<ReportDetails> reportDetailsList;


    public Report() {
    }

    public Report(String reportName, String departmentName, Date createdDate, List<ReportDetails> reportDetailsList) {
        this.reportName = reportName;
        this.departmentName = departmentName;
        this.createdDate = createdDate;
        this.reportDetailsList = reportDetailsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<ReportDetails> getReportDetailsList() {
        return reportDetailsList;
    }

    public void setReportDetailsList(List<ReportDetails> reportDetailsList) {
        this.reportDetailsList = reportDetailsList;
    }
}
