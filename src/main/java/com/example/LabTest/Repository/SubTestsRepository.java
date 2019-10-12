package com.example.LabTest.Repository;

import com.example.LabTest.Model.SubTests;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("subTestsRepository")
public interface SubTestsRepository  extends JpaRepository<SubTests,Long> {
    public String findBySubtestName(String subtestName);
}
