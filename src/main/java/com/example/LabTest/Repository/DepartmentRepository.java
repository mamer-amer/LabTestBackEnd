package com.example.LabTest.Repository;

import com.example.LabTest.DTOS.Department;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("departmentRepository")
public interface DepartmentRepository  extends JpaRepository<Department,Long> {
}
