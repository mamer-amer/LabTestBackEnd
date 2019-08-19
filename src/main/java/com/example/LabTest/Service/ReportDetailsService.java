package com.example.LabTest.Service;

import com.example.LabTest.Model.ReportDetails;
import com.example.LabTest.Repository.ReportDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportDetailsService {

    @Autowired
    ReportDetailsRepository reportDetailsRepository;

    public Boolean saveReportSubTests(ReportDetails reportDetails) {
       ReportDetails addedReportSubTest = reportDetailsRepository.save(reportDetails);

       if (addedReportSubTest != null){
           return  true;
       }

       return  false;

    }
}