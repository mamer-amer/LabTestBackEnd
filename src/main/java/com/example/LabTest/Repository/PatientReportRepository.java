package com.example.LabTest.Repository;

import com.example.LabTest.Model.PatientReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReportRepository extends JpaRepository<PatientReport,Long> {
}
