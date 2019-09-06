package com.example.LabTest.Repository;

import com.example.LabTest.Model.PatientReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientReportRepository extends JpaRepository<PatientReport,Long> {
    public List<PatientReport> findByPatientId(Long patientId);
}
