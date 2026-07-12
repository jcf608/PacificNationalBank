package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV009 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV009")
public class CreditBureauRequestV009 {

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

    @Column(name = "INT_FLD_009_00")
    private String intField009_00;

    @Column(name = "INT_FLD_009_01")
    private String intField009_01;

    @Column(name = "INT_FLD_009_02")
    private LocalDate intField009_02;

    @Column(name = "INT_FLD_009_03")
    private Integer intField009_03;

    @Column(name = "INT_FLD_009_04")
    private BigDecimal intField009_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV009() {}

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

    public String getIntField009_00() { return intField009_00; }
    public void setIntField009_00(String intField009_00) { this.intField009_00 = intField009_00; }

    public String getIntField009_01() { return intField009_01; }
    public void setIntField009_01(String intField009_01) { this.intField009_01 = intField009_01; }

    public LocalDate getIntField009_02() { return intField009_02; }
    public void setIntField009_02(LocalDate intField009_02) { this.intField009_02 = intField009_02; }

    public Integer getIntField009_03() { return intField009_03; }
    public void setIntField009_03(Integer intField009_03) { this.intField009_03 = intField009_03; }

    public BigDecimal getIntField009_04() { return intField009_04; }
    public void setIntField009_04(BigDecimal intField009_04) { this.intField009_04 = intField009_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV009)) return false;
        CreditBureauRequestV009 that = (CreditBureauRequestV009) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV009{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
