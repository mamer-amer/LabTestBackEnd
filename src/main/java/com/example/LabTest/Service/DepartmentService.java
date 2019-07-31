package com.example.LabTest.Service;

import com.example.LabTest.DTO.DepartmentDTO;
import com.example.LabTest.DTO.LabTestDTO;
import com.example.LabTest.Model.Department;
import com.example.LabTest.Model.LabTest;
import org.springframework.beans.factory.annotation.Autowired;
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


    public String addDepartment(DepartmentDTO DeptDTO){

    Department departmentModel = new Department();
        departmentModel.setDepartmentName(DeptDTO.getDepartmentName());
        departmentRepository.save(departmentModel);

        return "{\"department added succuessfully\":1}";
    }

    public List<Department> getDepartment(){
        List<Department> departmentList = departmentRepository.findAll();
        return  departmentList;
    }
    public List<LabTest> get_labtest_based_on_department(Long id){
        List<LabTest> labTest = labTestRepository.getLabTestByDepartment_Id(id);
        if(labTest!=null){
            return labTest;
        }
        else{
            return null;
        }

    }

    public String updatePatientByID(Long id,DepartmentDTO departmentDTO){
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
