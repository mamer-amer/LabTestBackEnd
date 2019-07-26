package com.example.LabTest.Repository;

import com.example.LabTest.Model.NormalValues;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("normalValuesRepository")
public interface NormalValuesRepository  extends JpaRepository<NormalValues,Long> {
}
