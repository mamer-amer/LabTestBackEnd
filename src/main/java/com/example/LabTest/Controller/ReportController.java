package com.example.LabTest.Controller;

import com.example.LabTest.DTO.GenerateReportDTO;
import com.example.LabTest.DTO.ReportDTO;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Model.ReportSubtest;
import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Service.ReportService;
import com.example.LabTest.Service.ReportSubtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/api/report")
public class ReportController {
    @Autowired
    ReportRepository reportRepository;
    @Autowired
    ReportService reportService;

    @Autowired
    ReportSubtestService reportSubtestService;

    @PostMapping("/")
    public Boolean saveReportWithlabtest(@RequestBody GenerateReportDTO generateReportDTO){
        ReportDTO reportDTO = new ReportDTO();
        reportDTO.setReportName(generateReportDTO.getReportName());
        reportDTO.setCreatedDate(new Date());
        reportDTO.setPatientId(generateReportDTO.getPatientid());
        LabTest labTest = new LabTest();
        labTest.setId(generateReportDTO.getLabtestid());
        reportDTO.setLabTest(labTest);
        Long reportId = reportService.saveReport(reportDTO);
        Boolean response = false;

        if (reportId != 0){
            for (ReportSubtest reportSubTest: generateReportDTO.getReportSubtests()) {
                reportSubTest.setReportid(reportId);
                reportSubtestService.saveReportSubTests(reportSubTest);
            }
            response = true;
        }
        return response;
    }

    @GetMapping("/{id}")
    public GenerateReportDTO getReport(@PathVariable("id") Long id){
        return this.reportService.getReport(id);
    }



}
