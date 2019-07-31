package com.example.LabTest.Service;

import com.example.LabTest.DTO.GenerateReportDTO;
import com.example.LabTest.Model.ReportSubtest;
import com.example.LabTest.Repository.ReportSubtestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportSubtestService {

    @Autowired
    ReportSubtestRepository reportSubtestRepository;

    public Boolean saveReportSubTests(ReportSubtest reportSubtest) {
       ReportSubtest addedReportSubTest = reportSubtestRepository.save(reportSubtest);

       if (addedReportSubTest != null){
           return  true;
       }

       return  false;

    }
}