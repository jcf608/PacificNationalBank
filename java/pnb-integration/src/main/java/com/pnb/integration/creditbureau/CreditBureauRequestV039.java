package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV039")
public class CreditBureauRequestV039 {

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

    @Column(name = "INT_FLD_039_00")
    private LocalDate intField039_00;

    @Column(name = "INT_FLD_039_01")
    private Integer intField039_01;

    @Column(name = "INT_FLD_039_02")
    private BigDecimal intField039_02;

    @Column(name = "INT_FLD_039_03")
    private Integer intField039_03;

    @Column(name = "INT_FLD_039_04")
    private BigDecimal intField039_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV039() {}

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

    public LocalDate getIntField039_00() { return intField039_00; }
    public void setIntField039_00(LocalDate intField039_00) { this.intField039_00 = intField039_00; }

    public Integer getIntField039_01() { return intField039_01; }
    public void setIntField039_01(Integer intField039_01) { this.intField039_01 = intField039_01; }

    public BigDecimal getIntField039_02() { return intField039_02; }
    public void setIntField039_02(BigDecimal intField039_02) { this.intField039_02 = intField039_02; }

    public Integer getIntField039_03() { return intField039_03; }
    public void setIntField039_03(Integer intField039_03) { this.intField039_03 = intField039_03; }

    public BigDecimal getIntField039_04() { return intField039_04; }
    public void setIntField039_04(BigDecimal intField039_04) { this.intField039_04 = intField039_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV039)) return false;
        CreditBureauRequestV039 that = (CreditBureauRequestV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV039{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
