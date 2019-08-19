package com.example.LabTest.Repository;

import com.example.LabTest.Model.Report;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("reportRepository")
public interface ReportRepository extends JpaRepository<Report,Long> {


}
