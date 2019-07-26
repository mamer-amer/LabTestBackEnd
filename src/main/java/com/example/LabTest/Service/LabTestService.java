package com.example.LabTest.Service;

import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.LabTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.LabTestRepository;

import java.util.List;

@Service
public class LabTestService {
    @Autowired
    LabTestRepository labTestRepository;

    public String addLabTest(LabTestDTO labTestDTO){
        LabTest labTest = new LabTest();
        labTest.setLabtestName(labTestDTO.getLabtestName());
        labTest.setDepartment(labTestDTO.getDepartment());
        labTestRepository.save(labTest);

        return "{\"LabTest Added SuccessFully\":1}";
    }
    public List<LabTest> getLabTest(){
        List<LabTest> labTests =  labTestRepository.findAll();
        return  labTests;
    }

}
