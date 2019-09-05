package com.example.LabTest.Service;

import com.example.LabTest.Commons.PatientLabtestDetails;
import com.example.LabTest.DTO.GenerateReportDTO;
import com.example.LabTest.DTO.ReportDTO;
import com.example.LabTest.DTO.RestTemplateResponseDTO;
import com.example.LabTest.Model.Report;
import com.example.LabTest.Model.ReportDetails;
import com.example.LabTest.Repository.ReportRepository;
import com.example.LabTest.Repository.ReportDetailsRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;
    @Autowired
    ReportDetailsRepository reportDetailsRepository;
    @Autowired
    RestTemplate restTemplate;
public String saveGenerateReport(GenerateReportDTO generateReportDTO){
    Report report = new Report();
    report.setReportName(generateReportDTO.getLabtestName());
    report.setDepartmentName(generateReportDTO.getDepartmentName());
    report.setCreatedDate(new Date());
    Report report2 = saveReport(report);
    generateReportDTO.getReportDetails().forEach(
            childReport -> {
                childReport.setReport(report2);
            }
    );
    reportDetailsRepository.saveAll(generateReportDTO.getReportDetails());
    return "{\"ADDED SUCCESFULLY\":1}";
}
public Report saveReport(Report report){
    reportRepository.save(report);
    return report;
}
public Report getReportById(Long id){
    Optional<Report> report = reportRepository.findById(id);
    if(report.isPresent()){
        Report report1 = report.get();
        return report1;
    }
    return null;
}

public List<Report> getAllReport(){
    List<Report> reports = reportRepository.findAll();
    return reports;
}
public List<PatientLabtestDetails> getProcessReport(){
//    HttpHeaders headers = new HttpHeaders();
//    headers.set("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhLmNvbSIsInNjb3BlcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9BRE1JTiJ9XSwiaXNzIjoiaHR0cDovL2RldmdsYW4uY29tIiwiaWF0IjoxNTY3MzQzNDIxLCJleHAiOjE1NjczNjE0MjF9.sD-cLC5Gqk3PvW9OZCEVJ6dKDZdJKBeS2ko1gLeZDCw");
//    HttpEntity<String> entity = new HttpEntity<String>(headers);
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.set("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjLmNvbSIsInNjb3BlcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9BRE1JTiJ9XSwiaXNzIjoiaHR0cDovL2RldmdsYW4uY29tIiwiaWF0IjoxNTY3NjcxNzY0LCJleHAiOjE1Njc2ODk3NjR9.0C1ZPPT6b9hx26dvcPxkGlZCH4EKLFY2itYqbSw04Tw");
    HttpEntity<String> entity = new HttpEntity<String>(headers);
    ResponseEntity<RestTemplateResponseDTO> response = restTemplate.exchange("http://localhost:8080/api/opdlabtest/", HttpMethod.GET, entity, RestTemplateResponseDTO.class);
   // RestTemplateResponseDTO restTemplateResponseDTO = restTemplate.getForObject("http://localhost:8080/api/opdlabtest/", RestTemplateResponseDTO.class,entity);

//List<PatientLabtestDetails> patientLabtestDetails = response.getBody().getBodyList();
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    List<PatientLabtestDetails> patientLabtestDet = mapper.convertValue(
            response.getBody().getBodyList(),
            new TypeReference<List<PatientLabtestDetails>>() {
            }
    );
//List<PatientLabtestDetails> patientLabtestDetailsViaStatus = new ArrayList<>();
//    patientLabtestDet.forEach(
//        inProgressTest->{
//            if(inProgressTest.getStatus().equalsIgnoreCase("In Progress")){
//                patientLabtestDetailsViaStatus.add(inProgressTest);
//            }
//        });

            return patientLabtestDet;
}
//    public Long saveReport(ReportDTO reportDTO){
//        Report report = new Report();
//        report.setReportName(reportDTO.getReportName());
//        report.setPatientId(reportDTO.getPatientId());
//        report.setCreatedDate(new Date());
////        report.setLabTest(reportDTO.getLabTest());
//        reportRepository.save(report);
//        return report.getId();
//    }
////
////
////    public GenerateReportDTO getReport(Long id){
////       Optional<Report> report =  reportRepository.findById(id);
////
////       if(report!=null){
////           List<ReportDetails> reportSubtests = reportSubtestRepository.getAllByReportid(id);
////           GenerateReportDTO generateReportDTO = new GenerateReportDTO();
////           generateReportDTO.setReportid(report.get().getId());
////           generateReportDTO.setReportName(report.get().getReportName());
////           generateReportDTO.setPatientid(report.get().getPatientId());
////           generateReportDTO.setReportDetails(reportSubtests);
////           return generateReportDTO;
////       }else{
////           return  null;
////       }
////
////    }

}
