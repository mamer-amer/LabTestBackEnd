package com.example.LabTest.Service;

import com.example.LabTest.DTO.SubTestsDTO;
import com.example.LabTest.Model.SubTests;
import com.example.LabTest.Repository.SubTestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubtestService {
    @Autowired
    SubTestsRepository subTestsRepository;

    public String saveSubTest(SubTestsDTO subTestsDTO){
        SubTests subTests = new SubTests();
        subTests.setSubtestName(subTestsDTO.getSubtestName());
        subTestsRepository.save(subTests);
        return "{\"subtest added successfully\"}";
    }

    public List<SubTests> getSubtests(){
        List<SubTests> subTestsList = subTestsRepository.findAll();
        return subTestsList;
    }


}
