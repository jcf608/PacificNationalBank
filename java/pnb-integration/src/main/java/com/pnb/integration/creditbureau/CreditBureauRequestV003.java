package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV003")
public class CreditBureauRequestV003 {

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

    @Column(name = "INT_FLD_003_00")
    private LocalDate intField003_00;

    @Column(name = "INT_FLD_003_01")
    private BigDecimal intField003_01;

    @Column(name = "INT_FLD_003_02")
    private LocalDate intField003_02;

    @Column(name = "INT_FLD_003_03")
    private String intField003_03;

    @Column(name = "INT_FLD_003_04")
    private String intField003_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV003() {}

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

    public LocalDate getIntField003_00() { return intField003_00; }
    public void setIntField003_00(LocalDate intField003_00) { this.intField003_00 = intField003_00; }

    public BigDecimal getIntField003_01() { return intField003_01; }
    public void setIntField003_01(BigDecimal intField003_01) { this.intField003_01 = intField003_01; }

    public LocalDate getIntField003_02() { return intField003_02; }
    public void setIntField003_02(LocalDate intField003_02) { this.intField003_02 = intField003_02; }

    public String getIntField003_03() { return intField003_03; }
    public void setIntField003_03(String intField003_03) { this.intField003_03 = intField003_03; }

    public String getIntField003_04() { return intField003_04; }
    public void setIntField003_04(String intField003_04) { this.intField003_04 = intField003_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV003)) return false;
        CreditBureauRequestV003 that = (CreditBureauRequestV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV003{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
