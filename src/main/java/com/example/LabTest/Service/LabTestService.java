package com.example.LabTest.Service;

import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.LabTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.LabTestRepository;

import java.util.List;
import java.util.Optional;

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

    public String updateLabTestByID(Long id,LabTestDTO labTestDTO){

        Optional<LabTest> labTest = labTestRepository.findById(id);
        if(labTest != null){
            LabTest updatedLabTest = labTest.get();
            updatedLabTest.setLabtestName(labTestDTO.getLabtestName());
            labTestRepository.save(updatedLabTest);
            return "{\" UPDATED SUCCESFULLY\":1}";
        }else{
            return "{\" not found \":1}";
        }

    }
    public LabTest getlabtestbyid(Long id){
        Optional<LabTest> labTest = labTestRepository.findById(id);
        if(labTest.isPresent()){
            return labTest.get();
        }
        return null;
    }

    public List<LabTest> deleteLabTestByID(Long id){
        Optional<LabTest> lab = labTestRepository.findById(id);
        if(lab.isPresent()){
            labTestRepository.deleteById(id);
        }

        return this.getLabTest();
    }
}
