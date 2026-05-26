package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV004")
public class CreditBureauRequestV004 {

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

    @Column(name = "INT_FLD_004_00")
    private String intField004_00;

    @Column(name = "INT_FLD_004_01")
    private BigDecimal intField004_01;

    @Column(name = "INT_FLD_004_02")
    private LocalDate intField004_02;

    @Column(name = "INT_FLD_004_03")
    private String intField004_03;

    @Column(name = "INT_FLD_004_04")
    private BigDecimal intField004_04;

    @Column(name = "INT_FLD_004_05")
    private String intField004_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV004() {}

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

    public String getIntField004_00() { return intField004_00; }
    public void setIntField004_00(String intField004_00) { this.intField004_00 = intField004_00; }

    public BigDecimal getIntField004_01() { return intField004_01; }
    public void setIntField004_01(BigDecimal intField004_01) { this.intField004_01 = intField004_01; }

    public LocalDate getIntField004_02() { return intField004_02; }
    public void setIntField004_02(LocalDate intField004_02) { this.intField004_02 = intField004_02; }

    public String getIntField004_03() { return intField004_03; }
    public void setIntField004_03(String intField004_03) { this.intField004_03 = intField004_03; }

    public BigDecimal getIntField004_04() { return intField004_04; }
    public void setIntField004_04(BigDecimal intField004_04) { this.intField004_04 = intField004_04; }

    public String getIntField004_05() { return intField004_05; }
    public void setIntField004_05(String intField004_05) { this.intField004_05 = intField004_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV004)) return false;
        CreditBureauRequestV004 that = (CreditBureauRequestV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV004{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
