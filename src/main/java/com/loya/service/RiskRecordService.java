package com.loya.service;

import com.loya.model.RiskRecord;
import com.loya.repository.RiskRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RiskRecordService {

    @Autowired
    RiskRecordRepository riskRecordRepository;


    public Collection<RiskRecord> retrieveAllRiskRecords() {
        return riskRecordRepository.findAll();
    }

    public RiskRecord saveRiskRecord(RiskRecord riskRecord) {
        return this.riskRecordRepository.save(riskRecord);
    }

    public Optional<RiskRecord> retrieveRecordById(long issueId) {
        return this.riskRecordRepository.findById(issueId);
    }

    public void removeRecordById(long issueId) {
        this.riskRecordRepository.deleteById(issueId);
    }

    public RiskRecord updateRiskRecord(RiskRecord riskRecord) {
//        RiskRecord recordToUpdate = riskRecordRepository.getOne(riskRecord.getIssueId());
//        recordToUpdate.setIssueName(riskRecord.getIssueName());
//        recordToUpdate.setImpactRating(riskRecord.getImpactRating());
//        recordToUpdate.setReporterName(riskRecord.getReporterName());
//        recordToUpdate.setDateAdded(riskRecord.getDateAdded());
        riskRecordRepository.save(riskRecord);

        return riskRecord;
    }

}