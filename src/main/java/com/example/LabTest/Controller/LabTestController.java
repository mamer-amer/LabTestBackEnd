package com.example.LabTest.Controller;

import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//    
//    @GetMapping("/{id}")
//    public

}
