package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV010 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV010")
public class CreditBureauRequestV010 {

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

    @Column(name = "INT_FLD_010_00")
    private Integer intField010_00;

    @Column(name = "INT_FLD_010_01")
    private String intField010_01;

    @Column(name = "INT_FLD_010_02")
    private BigDecimal intField010_02;

    @Column(name = "INT_FLD_010_03")
    private Integer intField010_03;

    @Column(name = "INT_FLD_010_04")
    private Integer intField010_04;

    @Column(name = "INT_FLD_010_05")
    private BigDecimal intField010_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV010() {}

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

    public Integer getIntField010_00() { return intField010_00; }
    public void setIntField010_00(Integer intField010_00) { this.intField010_00 = intField010_00; }

    public String getIntField010_01() { return intField010_01; }
    public void setIntField010_01(String intField010_01) { this.intField010_01 = intField010_01; }

    public BigDecimal getIntField010_02() { return intField010_02; }
    public void setIntField010_02(BigDecimal intField010_02) { this.intField010_02 = intField010_02; }

    public Integer getIntField010_03() { return intField010_03; }
    public void setIntField010_03(Integer intField010_03) { this.intField010_03 = intField010_03; }

    public Integer getIntField010_04() { return intField010_04; }
    public void setIntField010_04(Integer intField010_04) { this.intField010_04 = intField010_04; }

    public BigDecimal getIntField010_05() { return intField010_05; }
    public void setIntField010_05(BigDecimal intField010_05) { this.intField010_05 = intField010_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV010)) return false;
        CreditBureauRequestV010 that = (CreditBureauRequestV010) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV010{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
