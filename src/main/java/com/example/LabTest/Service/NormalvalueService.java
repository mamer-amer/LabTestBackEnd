package com.example.LabTest.Service;

import com.example.LabTest.DTO.NormalValuesDTO;
import com.example.LabTest.Model.NormalValues;
import com.example.LabTest.Model.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.NormalValuesRepository;
import java.util.List;
@Service
public class NormalvalueService {

    @Autowired
    NormalValuesRepository normalValuesRepository;

    public String saveNormalvalues(NormalValuesDTO normalValuesDTO){
         NormalValues normalValues = new NormalValues();
         normalValues.setNormalvalueName(normalValuesDTO.getNormalvalueName());
         normalValuesRepository.save(normalValues);

        return "{\"normal values added successfully:1\"}";
    }
    public List<NormalValues> getNormalvalues(){
        List<NormalValues> normalValuesList =  normalValuesRepository.findAll();
        return  normalValuesList;
    }
}
