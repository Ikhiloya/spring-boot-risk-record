package com.loya.controller;


import com.loya.model.RiskRecord;
import com.loya.service.RiskRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/risk-records")
public class RiskRecordController {

    @Autowired
    RiskRecordService riskRecordService;

    //GET all risk records
    @RequestMapping(method = RequestMethod.GET)
    public Collection<RiskRecord> retrieveAllRiskRecords() {
        return this.riskRecordService.retrieveAllRiskRecords();
    }

    //GET a single risk record
    @RequestMapping(value = "/{issueId}", method = RequestMethod.GET)
    public Optional<RiskRecord> retrieveRecordById(@PathVariable long issueId) {
        return this.riskRecordService.retrieveRecordById(issueId);
    }

    //POST a risk record
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public RiskRecord saveRiskRecord(@RequestBody RiskRecord riskRecord) {

        return this.riskRecordService.saveRiskRecord(riskRecord);
    }

    //DELETE a single risk record
    @RequestMapping(value = "/{issueId}", method = RequestMethod.DELETE)
    public void removeRecordById(@PathVariable long issueId) {
        this.riskRecordService.removeRecordById(issueId);
    }

        //PUT/UPDATE a risk record
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public RiskRecord updateRiskRecord(@RequestBody RiskRecord riskRecord) {
        return this.riskRecordService.updateRiskRecord(riskRecord);
    }

}

