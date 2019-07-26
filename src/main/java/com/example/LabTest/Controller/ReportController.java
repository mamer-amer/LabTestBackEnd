package com.example.LabTest.Controller;

import com.example.LabTest.DTO.ReportDTO;
import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Service.ReportService;
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

    @PostMapping("/")
    public String saveReportWithlabtest(@RequestBody ReportDTO reportDTO){
        return reportService.saveReport(reportDTO);
    }
}
