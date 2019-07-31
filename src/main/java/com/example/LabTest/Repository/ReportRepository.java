package com.example.LabTest.Repository;

import com.example.LabTest.Model.Report;
import com.example.LabTest.Model.ReportSubtest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Qualifier("reportRepository")
public interface ReportRepository extends JpaRepository<Report,Long> {


}
