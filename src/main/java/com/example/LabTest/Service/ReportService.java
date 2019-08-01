package com.example.LabTest.Service;

import com.example.LabTest.DTO.GenerateReportDTO;
import com.example.LabTest.DTO.ReportDTO;
import com.example.LabTest.Model.Report;
import com.example.LabTest.Model.ReportSubtest;
import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Repository.ReportSubtestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;
    @Autowired
    ReportSubtestRepository reportSubtestRepository;

    public Long saveReport(ReportDTO reportDTO){
        Report report = new Report();
        report.setReportName(reportDTO.getReportName());
        report.setPatientId(reportDTO.getPatientId());
        report.setCreatedDate(new Date());
//        report.setLabTest(reportDTO.getLabTest());
        reportRepository.save(report);
        return report.getId();
    }


    public GenerateReportDTO getReport(Long id){
       Optional<Report> report =  reportRepository.findById(id);

       if(report!=null){
           List<ReportSubtest> reportSubtests = reportSubtestRepository.getAllByReportid(id);
           GenerateReportDTO generateReportDTO = new GenerateReportDTO();
           generateReportDTO.setReportid(report.get().getId());
           generateReportDTO.setReportName(report.get().getReportName());
           generateReportDTO.setPatientid(report.get().getPatientId());
           generateReportDTO.setReportSubtests(reportSubtests);
           return generateReportDTO;
       }else{
           return  null;
       }

    }

}
