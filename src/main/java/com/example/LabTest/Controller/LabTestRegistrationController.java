package com.example.LabTest.Controller;


import com.example.LabTest.DTO.LabTestRegistrationDTO;
import com.example.LabTest.Model.LabTestRegistration;
import com.example.LabTest.Service.LabTestRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/labtestregistration")
public class LabTestRegistrationController {

    @Autowired
    LabTestRegistrationService labTestRegistrationService;

    @PostMapping("/")
    public String postLabtest(@RequestBody LabTestRegistrationDTO labtestDTO){
        return labTestRegistrationService.postLabTest(labtestDTO);
    }

    @GetMapping("/")
    public List<LabTestRegistration> getlabtest(){
        return labTestRegistrationService.getLabTest();
    }

    @DeleteMapping("/{id}")
    public List<LabTestRegistration> delLabtest(@PathVariable("id") Long id){
        return labTestRegistrationService.delLabTest(id);
    }

}
