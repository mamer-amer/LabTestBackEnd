package com.example.LabTest.Service;

import com.example.LabTest.Commons.TokenContainer;
import com.example.LabTest.DTO.PatientReportDTO;
import com.example.LabTest.DTO.RestTemplateResponseDTO;
import com.example.LabTest.Model.PatientReport;
import com.example.LabTest.Repository.PatientReportDetailsRepository;
import com.example.LabTest.Repository.PatientReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import javax.xml.ws.ServiceMode;
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
        patientReport.setLabTestName(patientReportDTO.getLabTestName());
        PatientReport patientReport2 = savePatientReportnReturn(patientReport);
        patientReportDTO.getPatientReportDetails().forEach(childPatientReport->{
            childPatientReport.setPatientReport(patientReport2);
        });
        patientReportDetailsRepository.saveAll(patientReportDTO.getPatientReportDetails());
        return "{\"ADDED SUCCESFULLY\":1}";
    }

    public List<PatientReport> getAllPatientReport()
    {

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
    public RestTemplateResponseDTO getPatientReportByPatientId(Long patientId){
        List<PatientReport> patientReports = patientReportRepository.findByPatientId(patientId);
        RestTemplateResponseDTO response = new RestTemplateResponseDTO("200", "Get Successfully", patientReports);
        return response;
    }
    public String changeLabtestDetailsStatus(Long id){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", TokenContainer.getInstance().getAuthToken());
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        ResponseEntity<RestTemplateResponseDTO> response = restTemplate.exchange("http://localhost:8080/api/opdlabtest/"+id, HttpMethod.PUT,entity,RestTemplateResponseDTO.class);
        if((response.getBody().getCode()).equalsIgnoreCase("200")){
            return "{\"Updated Successfully\":1}";
        }
        else{
            return "{\"Something went wrong\":1}";
        }
    }

    public ResponseEntity<String> updatePatientReport(Long id,PatientReportDTO patientReportDTO){
            Optional<PatientReport> patientReportExist = patientReportRepository.findById(id);
        if(patientReportExist.isPresent()){
            PatientReport patientReport = patientReportExist.get();
            patientReport.setPatientId(patientReportDTO.getPatientId());
            patientReport.setRemarks(patientReportDTO.getRemarks());
            patientReport.setReportId(patientReportDTO.getReportId());
            patientReport.setLabTestName(patientReportDTO.getLabTestName());
            PatientReport patientReport2 = savePatientReportnReturn(patientReport);
            patientReportDTO.getPatientReportDetails().forEach(childPatientReport->{
                childPatientReport.setPatientReport(patientReport2);
            });
            patientReportDetailsRepository.saveAll(patientReportDTO.getPatientReportDetails());
            return new ResponseEntity<String>("{\"UPDATED\":1}",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("{\"NOTFOUND\":1}",HttpStatus.ALREADY_REPORTED);
        }


    }
}