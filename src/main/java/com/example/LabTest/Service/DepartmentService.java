package com.example.LabTest.Service;

import com.example.LabTest.DTO.DepartmentDTO;
import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.Department;
import com.example.LabTest.Model.LabTest;
import com.example.LabTest.Model.SubTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.LabTest.Repository.DepartmentRepository;
import com.example.LabTest.Repository.LabTestRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    LabTestRepository labTestRepository;
    @Autowired
    DepartmentService departmentService;


    public ResponseEntity<String> addDepartment(DepartmentDTO DeptDTO){

        String departmentName = "";
        Department department = new Department();
        try{
            departmentName = departmentRepository.findByDepartmentName(DeptDTO.getDepartmentName().toLowerCase());
        }catch (Exception e){
            System.out.println(e);
        }
        if(departmentName!=null) {
            return new ResponseEntity<String>("\"DUPLICATE\"", HttpStatus.ALREADY_REPORTED);
        }
        else{
            department.setDepartmentName(DeptDTO.getDepartmentName());
            departmentRepository.save(department);
            return new ResponseEntity<String>("\"SUCCESSFULL\"",HttpStatus.OK);
        }


    }

    public List<Department> getDepartment(){
        List<Department> departmentList = departmentRepository.findAll();
        return  departmentList;
    }


    public String updateDeparmentByID(Long id,DepartmentDTO departmentDTO){
        Optional<Department> department = departmentRepository.findById(id);
        Department updatedDepartment = department.get();
        updatedDepartment.setDepartmentName(departmentDTO.getDepartmentName());
        departmentRepository.save(updatedDepartment);

        return "{\" UPDATED SUCCESFULLY\":1}";
    }


    public List<Department> deleteDeptByID(Long id){
        Optional<Department> dept = departmentRepository.findById(id);

        if(dept.isPresent()){
            departmentRepository.deleteById(id);
        }

        return this.getDepartment();
    }



}
