package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV023")
public class CreditBureauRequestV023 {

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

    @Column(name = "INT_FLD_023_00")
    private String intField023_00;

    @Column(name = "INT_FLD_023_01")
    private BigDecimal intField023_01;

    @Column(name = "INT_FLD_023_02")
    private Integer intField023_02;

    @Column(name = "INT_FLD_023_03")
    private LocalDate intField023_03;

    @Column(name = "INT_FLD_023_04")
    private BigDecimal intField023_04;

    @Column(name = "INT_FLD_023_05")
    private Integer intField023_05;

    @Column(name = "INT_FLD_023_06")
    private BigDecimal intField023_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV023() {}

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

    public String getIntField023_00() { return intField023_00; }
    public void setIntField023_00(String intField023_00) { this.intField023_00 = intField023_00; }

    public BigDecimal getIntField023_01() { return intField023_01; }
    public void setIntField023_01(BigDecimal intField023_01) { this.intField023_01 = intField023_01; }

    public Integer getIntField023_02() { return intField023_02; }
    public void setIntField023_02(Integer intField023_02) { this.intField023_02 = intField023_02; }

    public LocalDate getIntField023_03() { return intField023_03; }
    public void setIntField023_03(LocalDate intField023_03) { this.intField023_03 = intField023_03; }

    public BigDecimal getIntField023_04() { return intField023_04; }
    public void setIntField023_04(BigDecimal intField023_04) { this.intField023_04 = intField023_04; }

    public Integer getIntField023_05() { return intField023_05; }
    public void setIntField023_05(Integer intField023_05) { this.intField023_05 = intField023_05; }

    public BigDecimal getIntField023_06() { return intField023_06; }
    public void setIntField023_06(BigDecimal intField023_06) { this.intField023_06 = intField023_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV023)) return false;
        CreditBureauRequestV023 that = (CreditBureauRequestV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV023{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
