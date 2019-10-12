package com.example.LabTest.Controller;

import com.example.LabTest.Commons.PatientLabtestDetails;
import com.example.LabTest.DTO.GenerateReportDTO;
import com.example.LabTest.Model.Report;
import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Service.ReportService;
import com.example.LabTest.Service.ReportDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postReport(@RequestBody GenerateReportDTO generateReportDTO){
        return reportService.saveGenerateReport(generateReportDTO);
    }
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Report getReport(@PathVariable("id") Long id){
        return reportService.getReportById(id);
}

@RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Report> getAllReport(){return reportService.getAllReport();}

    @RequestMapping(value = "/process", method = RequestMethod.GET)
    public List<PatientLabtestDetails> getProcessReport(){
    return reportService.getProcessReport();
    }



}
