package com.example.LabTest.Controller;

import com.example.LabTest.DTO.DepartmentDTO;
import com.example.LabTest.Model.Department;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<String> addNewDepartment(@RequestBody DepartmentDTO departmentDTO){
        return departmentService.addDepartment(departmentDTO);

    }
    @GetMapping("/")
    public List<Department> getDepartment(){
       return  this.departmentService.getDepartment();
 }

//    @GetMapping("/{id}")
//    public List<LabTest> getReport(@PathVariable("id") Long id){
//        return  departmentService.get_labtest_based_on_department(id);
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public List<Department> deleteDepartmentByID(@PathVariable("id") Long id){
        return departmentService.deleteDeptByID(id);
        }


    @PutMapping("/{id}")
    public String updateDepartment(@PathVariable("id") Long id,@RequestBody DepartmentDTO departmentDTO){
        return departmentService.updateDeparmentByID(id,departmentDTO);
    }

}

