package com.example.LabTest.Service;


//import com.example.LabTest.DTO.SubTestsDTO;
import com.example.LabTest.DTO.UnitsDTO;
import com.example.LabTest.Model.SubTests;
import com.example.LabTest.Model.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.UnitsRepository;

import java.util.List;

@Service
public class UnitService {
    @Autowired
    UnitsRepository unitsRepository;
    public String saveUnits(UnitsDTO unitsDTO){
        Units units = new Units();
        units.setUnitName(unitsDTO.getUnitName());
        unitsRepository.save(units);
        return "{\"Units added successfully:1\"}";
    }
    public List<Units> getUnits(){
        List<Units> unitsList = unitsRepository.findAll();
        return  unitsList;
    }
}
