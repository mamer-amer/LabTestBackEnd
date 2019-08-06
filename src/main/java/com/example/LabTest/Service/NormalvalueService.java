package com.example.LabTest.Service;

import com.example.LabTest.DTO.NormalValuesDTO;
import com.example.LabTest.Model.NormalValues;
import com.example.LabTest.Model.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.NormalValuesRepository;
import java.util.List;
import java.util.Optional;

@Service
public class NormalvalueService {

    @Autowired
    NormalValuesRepository normalValuesRepository;

    public String saveNormalvalues(NormalValuesDTO normalValuesDTO){
         NormalValues normalValues = new NormalValues();
         normalValues.setNormalvalueName(normalValuesDTO.getNormalvalueName());
         normalValuesRepository.save(normalValues);

        return "{\"successful\":1}";
    }
    public List<NormalValues> getNormalvalues(){
        List<NormalValues> normalValuesList =  normalValuesRepository.findAll();
        return  normalValuesList;
    }

    public String updateNormallValueByID(Long id,NormalValuesDTO normalValuesDTO){
        Optional<NormalValues> normalValues = normalValuesRepository.findById(id);

        NormalValues updatedNormalValues = normalValues.get();
        updatedNormalValues.setNormalvalueName(normalValuesDTO.getNormalvalueName());

        normalValuesRepository.save(updatedNormalValues);

        return "{\" UPDATED SUCCESFULLY\":1}";
    }

    public List<NormalValues> deleteNormalValuesByID(Long id){
        Optional<NormalValues> normVal = normalValuesRepository.findById(id);

        if(normVal.isPresent()){
            normalValuesRepository.deleteById(id);
        }

        return this.getNormalvalues();
    }
}
