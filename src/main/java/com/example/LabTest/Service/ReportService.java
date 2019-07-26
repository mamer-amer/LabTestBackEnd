package com.example.LabTest.Service;

import com.example.LabTest.DTO.ReportDTO;
import com.example.LabTest.Model.Report;
import com.example.LabTest.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;

    public String saveReport(ReportDTO reportDTO){
        Report report = new Report();
        report.setReportName(reportDTO.getReportName());
        report.setPatientId(reportDTO.getPatientId());
        report.setCreatedDate(new Date());
        report.setLabTest(reportDTO.getLabTest());
        reportRepository.save(report);
        return "{\"report added successfully with labtest \":1}";
    }

}
