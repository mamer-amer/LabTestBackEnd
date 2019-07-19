package com.example.LabTest.Repository;

import com.example.LabTest.DTOS.LabTest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("labTestRepository")
public interface LabTestRepository  extends JpaRepository<LabTest,Long> {
}
