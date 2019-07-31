package com.example.LabTest.Controller;

import com.example.LabTest.DTO.UnitsDTO;
import com.example.LabTest.Model.Units;
import com.example.LabTest.Service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/unit")
public class UnitController {

    @Autowired
    UnitService unitService;

    @PostMapping("/")
    public String addUnits(@RequestBody UnitsDTO unitsDTO){
        return unitService.saveUnits(unitsDTO);
    }
    @GetMapping("/")
    public List<Units> getAllUnit(){
        return unitService.getUnits();
    }

    @PutMapping("update/{id}")
    public String updateUnit(@PathVariable("id") Long id, @RequestBody UnitsDTO unitsDTO){
        return unitService.updateUnitByID(id,unitsDTO);
    }

    @DeleteMapping("/{id}")
    public List<Units> deleteUnitByID(@PathVariable("id") Long id){
        return unitService.deleteUnitByID(id);
    }


}
