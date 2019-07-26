package com.example.LabTest.Controller;


import com.example.LabTest.DTO.SubTestsDTO;
import com.example.LabTest.Model.SubTests;
import com.example.LabTest.Service.SubtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.LabTest.Repository.SubTestsRepository;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/subtest")
public class SubTestController {

    @Autowired
    SubtestService subtestService;



    @PostMapping("/")
    public String addSubTest(@RequestBody SubTestsDTO subTestsDTO){
        return  subtestService.saveSubTest(subTestsDTO);
    }

    @GetMapping("/")
    public List<SubTests> getSubtest(){
        return  subtestService.getSubtests();
    }
}
