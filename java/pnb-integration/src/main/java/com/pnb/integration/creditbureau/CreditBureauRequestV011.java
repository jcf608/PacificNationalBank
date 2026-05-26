package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV011 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV011")
public class CreditBureauRequestV011 {

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

    @Column(name = "INT_FLD_011_00")
    private LocalDate intField011_00;

    @Column(name = "INT_FLD_011_01")
    private Integer intField011_01;

    @Column(name = "INT_FLD_011_02")
    private String intField011_02;

    @Column(name = "INT_FLD_011_03")
    private Integer intField011_03;

    @Column(name = "INT_FLD_011_04")
    private String intField011_04;

    @Column(name = "INT_FLD_011_05")
    private BigDecimal intField011_05;

    @Column(name = "INT_FLD_011_06")
    private Integer intField011_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV011() {}

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

    public LocalDate getIntField011_00() { return intField011_00; }
    public void setIntField011_00(LocalDate intField011_00) { this.intField011_00 = intField011_00; }

    public Integer getIntField011_01() { return intField011_01; }
    public void setIntField011_01(Integer intField011_01) { this.intField011_01 = intField011_01; }

    public String getIntField011_02() { return intField011_02; }
    public void setIntField011_02(String intField011_02) { this.intField011_02 = intField011_02; }

    public Integer getIntField011_03() { return intField011_03; }
    public void setIntField011_03(Integer intField011_03) { this.intField011_03 = intField011_03; }

    public String getIntField011_04() { return intField011_04; }
    public void setIntField011_04(String intField011_04) { this.intField011_04 = intField011_04; }

    public BigDecimal getIntField011_05() { return intField011_05; }
    public void setIntField011_05(BigDecimal intField011_05) { this.intField011_05 = intField011_05; }

    public Integer getIntField011_06() { return intField011_06; }
    public void setIntField011_06(Integer intField011_06) { this.intField011_06 = intField011_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV011)) return false;
        CreditBureauRequestV011 that = (CreditBureauRequestV011) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV011{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
