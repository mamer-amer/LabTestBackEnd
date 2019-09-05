package com.example.LabTest.Repository;

import com.example.LabTest.Model.PatientReportDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReportDetailsRepository extends JpaRepository<PatientReportDetails, Long> {
}
