package com.example.LabTest.Repository;

import com.example.LabTest.Model.ReportDetails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("reportSubtestRepository")
public interface ReportDetailsRepository extends JpaRepository<ReportDetails,Long> {
//    public List<ReportDetails> getAllByReportid(Long id);

}
