package com.example.LabTest.Service;

import com.example.LabTest.DTO.PatientReportDTO;
import com.example.LabTest.DTO.RestTemplateResponseDTO;
import com.example.LabTest.Model.PatientReport;
import com.example.LabTest.Repository.PatientReportDetailsRepository;
import com.example.LabTest.Repository.PatientReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.ServiceMode;
import java.util.List;
import java.util.Optional;

@Service
public class PatientReportService {
    @Autowired
    PatientReportRepository patientReportRepository;
    @Autowired
    PatientReportDetailsRepository patientReportDetailsRepository;
    @Autowired
    RestTemplate restTemplate;


    //Save Patient Report and return it!!

    public PatientReport savePatientReportnReturn(PatientReport patientReport){
        patientReportRepository.save(patientReport);
        return patientReport;
    }

    public String savePatientReport(PatientReportDTO patientReportDTO){
        PatientReport patientReport = new PatientReport();
        patientReport.setPatientId(patientReportDTO.getPatientId());
        patientReport.setRemarks(patientReportDTO.getRemarks());
        patientReport.setReportId(patientReportDTO.getReportId());
        PatientReport patientReport2 = savePatientReportnReturn(patientReport);
        patientReportDTO.getPatientReportDetails().forEach(childPatientReport->{
            childPatientReport.setPatientReport(patientReport2);
        });
        patientReportDetailsRepository.saveAll(patientReportDTO.getPatientReportDetails());
        return "{\"ADDED SUCCESFULLY\":1}";
    }

    public List<PatientReport> getAllPatientReport(){
       return patientReportRepository.findAll();
    }
    public PatientReport getPatientReportById(Long id){
        Optional<PatientReport> patientReport = patientReportRepository.findById(id);
        if(patientReport.isPresent()){
            PatientReport patientReport1 = patientReport.get();
            return patientReport1;
        }
        return null;
    }
    public String changeLabtestDetailsStatus(Long id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiLmNvbSIsInNjb3BlcyI6W3siYXV0aG9yaXR5IjoiUk9MRV9BRE1JTiJ9XSwiaXNzIjoiaHR0cDovL2RldmdsYW4uY29tIiwiaWF0IjoxNTY3ODc4MzIxLCJleHAiOjE1Njc4OTYzMjF9.SenIskJhEH0YXSR5cRNCsTZJpRNj8FkfkNnd-_HapvU");
//        RestTemplateResponseDTO restTemplateResponseDTO = new RestTemplateResponseDTO("200", "Updated Successfully",id);
//        HttpEntity<RestTemplateResponseDTO> entity = new HttpEntity<>(restTemplateResponseDTO,headers);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<RestTemplateResponseDTO> response = restTemplate.exchange("http://localhost:8080/api/opdlabtest/"+id, HttpMethod.PUT,entity,RestTemplateResponseDTO.class);
        if((response.getBody().getCode()).equalsIgnoreCase("200")){
            return "{\"Updated Successfully\":1}";
        }
        else{
            return "{\"Something went wrong\":1}";
        }
    }
}
