package com.example.LabTest.Service;

import com.example.LabTest.DTO.SubTestsDTO;
import com.example.LabTest.Model.SubTests;
import com.example.LabTest.Repository.SubTestsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubtestService {
    @Autowired
    SubTestsRepository subTestsRepository;

    public ResponseEntity<String> saveSubTest(SubTestsDTO subTestsDTO){
        String subtestName = "";
        SubTests subTests = new SubTests();
        try{
            subtestName = subTestsRepository.findBySubtestName(subTestsDTO.getSubtestName().toLowerCase());
        }catch (Exception e){
            System.out.println(e);
        }
        if(subtestName!=null) {
            return new ResponseEntity<String>("\"DUPLICATE\"",HttpStatus.ALREADY_REPORTED);
        }
        else{
            subTests.setSubtestName(subTestsDTO.getSubtestName());
            subTestsRepository.save(subTests);
            return new ResponseEntity<String>("\"SUCCESSFULL\"",HttpStatus.OK);
        }





    }

    public List<SubTests> getSubtests(){
        List<SubTests> subTestsList = subTestsRepository.findAll();
        return subTestsList;
    }


     public String updateSubTestByID(Long id,SubTestsDTO subTestsDTO){
         Optional<SubTests> subTests = subTestsRepository.findById(id);
         SubTests updateSubTest = subTests.get();
         updateSubTest.setSubtestName(subTestsDTO.getSubtestName());
         subTestsRepository.save(updateSubTest);
         return "{\" UPDATED SUCCESFULLY\":1}";
     }

     public List<SubTests> deleteSubTestsByID(Long id){
        Optional<SubTests> subtest = subTestsRepository.findById(id);

        if(subtest.isPresent()){
            subTestsRepository.deleteById(id);
        }
        return  this.getSubtests();
     }
}
