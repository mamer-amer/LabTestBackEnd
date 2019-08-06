package com.example.LabTest.Service;


//import com.example.LabTest.DTO.SubTestsDTO;
import com.example.LabTest.DTO.UnitsDTO;
import com.example.LabTest.Model.SubTests;
import com.example.LabTest.Model.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.UnitsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UnitService {
    @Autowired
    UnitsRepository unitsRepository;
    public String saveUnits(UnitsDTO unitsDTO){
        Units units = new Units();
        units.setUnitName(unitsDTO.getUnitName());
        unitsRepository.save(units);
      return "{\"successful\":1}";
    }
    public List<Units> getUnits(){
        List<Units> unitsList = unitsRepository.findAll();
        return  unitsList;
    }

    public String updateUnitByID(Long id,UnitsDTO unitsDTO){
        Optional<Units> units = unitsRepository.findById(id);
        Units updatedUnits = units.get();
        updatedUnits.setUnitName(unitsDTO.getUnitName());
        unitsRepository.save(updatedUnits);

        return "{\" UPDATED SUCCESFULLY\":1}";
    }
    public Units getlabtestbyid(Long id){
        Optional<Units> Units = unitsRepository.findById(id);
        if(Units.isPresent()){
            return Units.get();
        }
        return null;
    }

    public List<Units> deleteUnitByID(Long id){
        Optional<Units> unit = unitsRepository.findById(id);

        if(unit.isPresent()){
            unitsRepository.deleteById(id);
        }

        return this.getUnits();
    }
}
