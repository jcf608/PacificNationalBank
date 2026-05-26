package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV005")
public class CreditBureauRequestV005 {

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

    @Column(name = "INT_FLD_005_00")
    private String intField005_00;

    @Column(name = "INT_FLD_005_01")
    private LocalDate intField005_01;

    @Column(name = "INT_FLD_005_02")
    private Integer intField005_02;

    @Column(name = "INT_FLD_005_03")
    private Integer intField005_03;

    @Column(name = "INT_FLD_005_04")
    private BigDecimal intField005_04;

    @Column(name = "INT_FLD_005_05")
    private Integer intField005_05;

    @Column(name = "INT_FLD_005_06")
    private BigDecimal intField005_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV005() {}

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

    public String getIntField005_00() { return intField005_00; }
    public void setIntField005_00(String intField005_00) { this.intField005_00 = intField005_00; }

    public LocalDate getIntField005_01() { return intField005_01; }
    public void setIntField005_01(LocalDate intField005_01) { this.intField005_01 = intField005_01; }

    public Integer getIntField005_02() { return intField005_02; }
    public void setIntField005_02(Integer intField005_02) { this.intField005_02 = intField005_02; }

    public Integer getIntField005_03() { return intField005_03; }
    public void setIntField005_03(Integer intField005_03) { this.intField005_03 = intField005_03; }

    public BigDecimal getIntField005_04() { return intField005_04; }
    public void setIntField005_04(BigDecimal intField005_04) { this.intField005_04 = intField005_04; }

    public Integer getIntField005_05() { return intField005_05; }
    public void setIntField005_05(Integer intField005_05) { this.intField005_05 = intField005_05; }

    public BigDecimal getIntField005_06() { return intField005_06; }
    public void setIntField005_06(BigDecimal intField005_06) { this.intField005_06 = intField005_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV005)) return false;
        CreditBureauRequestV005 that = (CreditBureauRequestV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV005{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
