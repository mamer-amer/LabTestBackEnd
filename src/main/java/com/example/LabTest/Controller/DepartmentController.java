package com.example.LabTest.Controller;

import com.example.LabTest.DTO.DepartmentDTO;
import com.example.LabTest.Model.Department;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public String addNewDepartment(@RequestBody DepartmentDTO departmentDTO){
        return departmentService.addDepartment(departmentDTO);

    }
    @GetMapping("/")
    public List<Department> getDepartment(){
       return  this.departmentService.getDepartment();
 }

    @GetMapping("/{id}")
    public List<LabTest> get_labtest_based_on_department(@PathVariable("id") Long id){
        return  departmentService.get_labtest_based_on_department(id);
    }
}
