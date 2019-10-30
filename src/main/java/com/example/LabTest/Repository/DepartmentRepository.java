package com.example.LabTest.Repository;

import com.example.LabTest.Model.Department;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("departmentRepository")
public interface DepartmentRepository  extends JpaRepository<Department,Long> {
    public String findByDepartmentName(String departmentName);

}
