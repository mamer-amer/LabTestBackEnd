package com.example.LabTest.Controller;

import com.example.LabTest.DTO.PatientReportDTO;
import com.example.LabTest.DTO.RestTemplateResponseDTO;
import com.example.LabTest.Model.PatientReport;
import com.example.LabTest.Repository.PatientReportDetailsRepository;
import com.example.LabTest.Repository.PatientReportRepository;
import com.example.LabTest.Service.PatientReportDetailsService;
import com.example.LabTest.Service.PatientReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/patientReport")
public class PatientReportController {
    @Autowired
    PatientReportRepository patientReportRepository;
    @Autowired
    PatientReportService patientReportService;
    @Autowired
    PatientReportDetailsService patientReportDetailsService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postPatientReport(@RequestBody PatientReportDTO patientReportDTO){
        return patientReportService.savePatientReport(patientReportDTO);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PatientReport> getAllPatientReport(){
        return patientReportService.getAllPatientReport();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PatientReport getPatientReportById(@PathVariable("id") Long id){
        return patientReportService.getPatientReportById(id);
    }
    @RequestMapping(value = "/patient/{patientId}", method = RequestMethod.GET)
    public RestTemplateResponseDTO getPatientReportByPatientId(@PathVariable("patientId") Long patientId){
        return patientReportService.getPatientReportByPatientId(patientId);
    }
}
