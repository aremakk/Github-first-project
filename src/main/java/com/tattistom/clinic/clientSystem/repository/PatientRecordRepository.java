package com.tattistom.clinic.clientSystem.repository;

import com.tattistom.clinic.clientSystem.entity.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {
}
