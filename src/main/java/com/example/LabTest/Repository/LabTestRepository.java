package com.example.LabTest.Repository;

import com.example.LabTest.Model.LabTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
//import java.util.Optional;

@Repository
@Qualifier("labTestRepository")
public interface LabTestRepository  extends JpaRepository<LabTest,Long> {
    public List<LabTest> getLabTestByDepartment_Id(Long id);
}
