package com.example.LabTest.Repository;

import com.example.LabTest.Model.Report;
import com.example.LabTest.Model.ReportSubtest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Qualifier("reportSubtestRepository")
public interface ReportSubtestRepository extends JpaRepository<ReportSubtest,Long> {
    public List<ReportSubtest> getAllByReportid(Long id);

}
