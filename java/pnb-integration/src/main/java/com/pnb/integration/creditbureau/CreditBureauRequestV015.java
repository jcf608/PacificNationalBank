package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV015")
public class CreditBureauRequestV015 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REQ_ID", unique = true)
    private String requestId;

    @Column(name = "BUREAU_NAME")
    private String bureauName;

    @Column(name = "SSN")
    private String ssn;

    @Column(name = "SCORE")
    private Integer score;

    @Column(name = "REPORT_DATE")
    private LocalDate reportDate;

    @Column(name = "INT_FLD_015_00")
    private LocalDate intField015_00;

    @Column(name = "INT_FLD_015_01")
    private Integer intField015_01;

    @Column(name = "INT_FLD_015_02")
    private String intField015_02;

    @Column(name = "INT_FLD_015_03")
    private String intField015_03;

    @Column(name = "INT_FLD_015_04")
    private LocalDate intField015_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV015() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public String getBureauName() { return bureauName; }
    public void setBureauName(String bureauName) { this.bureauName = bureauName; }

    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }

    public LocalDate getReportDate() { return reportDate; }
    public void setReportDate(LocalDate reportDate) { this.reportDate = reportDate; }

    public LocalDate getIntField015_00() { return intField015_00; }
    public void setIntField015_00(LocalDate intField015_00) { this.intField015_00 = intField015_00; }

    public Integer getIntField015_01() { return intField015_01; }
    public void setIntField015_01(Integer intField015_01) { this.intField015_01 = intField015_01; }

    public String getIntField015_02() { return intField015_02; }
    public void setIntField015_02(String intField015_02) { this.intField015_02 = intField015_02; }

    public String getIntField015_03() { return intField015_03; }
    public void setIntField015_03(String intField015_03) { this.intField015_03 = intField015_03; }

    public LocalDate getIntField015_04() { return intField015_04; }
    public void setIntField015_04(LocalDate intField015_04) { this.intField015_04 = intField015_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV015)) return false;
        CreditBureauRequestV015 that = (CreditBureauRequestV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV015{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
