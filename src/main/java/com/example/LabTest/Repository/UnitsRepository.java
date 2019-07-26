package com.example.LabTest.Repository;

import com.example.LabTest.Model.Units;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("unitsRepository")
public interface UnitsRepository extends JpaRepository<Units,Long> {
}
