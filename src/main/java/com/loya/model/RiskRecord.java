package com.loya.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Risk_Record")
public class RiskRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long issueId;
    private String issueName;

    private int impactRating;

    private String reporterName;

    private Date dateAdded;


//    protected RiskRecord() {
//    }
//
//    public RiskRecord(String issue, int impactRating, String reporterName, Date date) {
//        this.issue = issue;
//        this.impactRating = impactRating;
//        this.reporterName = reporterName;
//        this.date = date;
//    }



    public RiskRecord(Long issueId, String issueName, int impactRating, String reporterName, Date dateAdded) {
        this.issueId = issueId;
        this.issueName = issueName;
        this.impactRating = impactRating;
        this.reporterName = reporterName;
        this.dateAdded = dateAdded;
    }

    private RiskRecord(){}

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public int getImpactRating() {
        return impactRating;
    }

    public void setImpactRating(int impactRating) {
        this.impactRating = impactRating;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}

