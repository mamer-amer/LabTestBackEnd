package com.example.LabTest.Controller;

import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Service.ReportService;
import com.example.LabTest.Service.ReportDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/report")
public class ReportController {
    @Autowired
    ReportRepository reportRepository;
    @Autowired
    ReportService reportService;

    @Autowired
    ReportDetailsService reportDetailsService;

//    @PostMapping("/")
//    public Boolean saveReportWithlabtest(@RequestBody GenerateReportDTO generateReportDTO){
//        ReportDTO reportDTO = new ReportDTO();
//        reportDTO.setReportName(generateReportDTO.getReportName());
//        reportDTO.setCreatedDate(new Date());
//        reportDTO.setPatientId(generateReportDTO.getPatientid());
//        LabTest labTest = new LabTest();
//        labTest.setId(generateReportDTO.getLabtestid());
//        reportDTO.setLabTest(labTest);
//        Long reportId = reportService.saveReport(reportDTO);
//        Boolean response = false;
//
//        if (reportId != 0){
//            for (ReportDetails reportSubTest: generateReportDTO.getReportDetails()) {
//                reportSubTest.setReportid(reportId);
//                reportSubtestService.saveReportSubTests(reportSubTest);
//            }
//            response = true;
//        }
//        return response;
//    }
//
//    @GetMapping("/{id}")
//    public GenerateReportDTO getReport(@PathVariable("id") Long id){
//        return this.reportService.getReport(id);
//    }



}
