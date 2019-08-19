package com.example.LabTest.Controller;

import com.example.LabTest.DTO.NormalValuesDTO;
import com.example.LabTest.Model.NormalValues;
import com.example.LabTest.Service.NormalvalueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.LabTest.Repository.NormalValuesRepository;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/normalvalue")
public class NormalvalueController {
    @Autowired
    NormalvalueService normalvalueService;

    @Autowired
    NormalValuesRepository normalValuesRepository;

    @PostMapping("/")
    public String addNormalvalue(@RequestBody NormalValuesDTO normalValuesDTO){
        return normalvalueService.saveNormalvalues(normalValuesDTO);
    }
    @GetMapping("/")
    public List<NormalValues> getNormalvalue(){
       return normalvalueService.getNormalvalues();
    }

    @PutMapping("/{id}")
    public String updateNormallValue(@PathVariable("id") Long id, @RequestBody NormalValuesDTO normalValuesDTO){
        return normalvalueService.updateNormallValueByID(id,normalValuesDTO);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public List<NormalValues> deleteNormalValuesByID(@PathVariable("id") Long id){
        return normalvalueService.deleteNormalValuesByID(id);
    }
}
