package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV016 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV016")
public class CreditBureauRequestV016 {

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

    @Column(name = "INT_FLD_016_00")
    private BigDecimal intField016_00;

    @Column(name = "INT_FLD_016_01")
    private BigDecimal intField016_01;

    @Column(name = "INT_FLD_016_02")
    private LocalDate intField016_02;

    @Column(name = "INT_FLD_016_03")
    private String intField016_03;

    @Column(name = "INT_FLD_016_04")
    private LocalDate intField016_04;

    @Column(name = "INT_FLD_016_05")
    private BigDecimal intField016_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV016() {}

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

    public BigDecimal getIntField016_00() { return intField016_00; }
    public void setIntField016_00(BigDecimal intField016_00) { this.intField016_00 = intField016_00; }

    public BigDecimal getIntField016_01() { return intField016_01; }
    public void setIntField016_01(BigDecimal intField016_01) { this.intField016_01 = intField016_01; }

    public LocalDate getIntField016_02() { return intField016_02; }
    public void setIntField016_02(LocalDate intField016_02) { this.intField016_02 = intField016_02; }

    public String getIntField016_03() { return intField016_03; }
    public void setIntField016_03(String intField016_03) { this.intField016_03 = intField016_03; }

    public LocalDate getIntField016_04() { return intField016_04; }
    public void setIntField016_04(LocalDate intField016_04) { this.intField016_04 = intField016_04; }

    public BigDecimal getIntField016_05() { return intField016_05; }
    public void setIntField016_05(BigDecimal intField016_05) { this.intField016_05 = intField016_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV016)) return false;
        CreditBureauRequestV016 that = (CreditBureauRequestV016) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV016{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
