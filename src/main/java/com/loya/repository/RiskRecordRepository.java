package com.loya.repository;

import com.loya.model.RiskRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRecordRepository extends JpaRepository<RiskRecord, Long> {
}
