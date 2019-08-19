package com.example.LabTest.Controller;

import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/labtest")
public class LabTestController {
    @Autowired
    LabTestService labTestService;

    @PostMapping("/")
    public String addNewLabTest(@RequestBody LabTestDTO labTestDTO){
        return  this.labTestService.addLabTest(labTestDTO);
    }

    @GetMapping("/")
    public List<LabTest> getLabTest(){
        return  this.labTestService.getLabTest();
    }

    @GetMapping("/{id}")
    public LabTest labTest(@PathVariable("id") Long id){
        return  this.labTestService.getlabtestbyid(id);
    }

    @PutMapping("/{id}")
    public String updateLabTest(@PathVariable("id") Long id, @RequestBody LabTestDTO labTestDTO){
        return labTestService.updateLabTestByID(id,labTestDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public List<LabTest> deleteLabTestByID(@PathVariable("id") Long id){
        return labTestService.deleteLabTestByID(id);
    }

}
