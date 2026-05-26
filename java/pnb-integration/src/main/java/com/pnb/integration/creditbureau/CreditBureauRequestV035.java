package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV035 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV035")
public class CreditBureauRequestV035 {

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

    @Column(name = "INT_FLD_035_00")
    private Integer intField035_00;

    @Column(name = "INT_FLD_035_01")
    private LocalDate intField035_01;

    @Column(name = "INT_FLD_035_02")
    private Integer intField035_02;

    @Column(name = "INT_FLD_035_03")
    private LocalDate intField035_03;

    @Column(name = "INT_FLD_035_04")
    private Integer intField035_04;

    @Column(name = "INT_FLD_035_05")
    private BigDecimal intField035_05;

    @Column(name = "INT_FLD_035_06")
    private BigDecimal intField035_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV035() {}

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

    public Integer getIntField035_00() { return intField035_00; }
    public void setIntField035_00(Integer intField035_00) { this.intField035_00 = intField035_00; }

    public LocalDate getIntField035_01() { return intField035_01; }
    public void setIntField035_01(LocalDate intField035_01) { this.intField035_01 = intField035_01; }

    public Integer getIntField035_02() { return intField035_02; }
    public void setIntField035_02(Integer intField035_02) { this.intField035_02 = intField035_02; }

    public LocalDate getIntField035_03() { return intField035_03; }
    public void setIntField035_03(LocalDate intField035_03) { this.intField035_03 = intField035_03; }

    public Integer getIntField035_04() { return intField035_04; }
    public void setIntField035_04(Integer intField035_04) { this.intField035_04 = intField035_04; }

    public BigDecimal getIntField035_05() { return intField035_05; }
    public void setIntField035_05(BigDecimal intField035_05) { this.intField035_05 = intField035_05; }

    public BigDecimal getIntField035_06() { return intField035_06; }
    public void setIntField035_06(BigDecimal intField035_06) { this.intField035_06 = intField035_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV035)) return false;
        CreditBureauRequestV035 that = (CreditBureauRequestV035) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV035{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
