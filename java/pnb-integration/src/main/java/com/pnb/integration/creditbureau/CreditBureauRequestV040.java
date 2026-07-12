package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV040 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV040")
public class CreditBureauRequestV040 {

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

    @Column(name = "INT_FLD_040_00")
    private LocalDate intField040_00;

    @Column(name = "INT_FLD_040_01")
    private BigDecimal intField040_01;

    @Column(name = "INT_FLD_040_02")
    private BigDecimal intField040_02;

    @Column(name = "INT_FLD_040_03")
    private BigDecimal intField040_03;

    @Column(name = "INT_FLD_040_04")
    private String intField040_04;

    @Column(name = "INT_FLD_040_05")
    private LocalDate intField040_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV040() {}

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

    public LocalDate getIntField040_00() { return intField040_00; }
    public void setIntField040_00(LocalDate intField040_00) { this.intField040_00 = intField040_00; }

    public BigDecimal getIntField040_01() { return intField040_01; }
    public void setIntField040_01(BigDecimal intField040_01) { this.intField040_01 = intField040_01; }

    public BigDecimal getIntField040_02() { return intField040_02; }
    public void setIntField040_02(BigDecimal intField040_02) { this.intField040_02 = intField040_02; }

    public BigDecimal getIntField040_03() { return intField040_03; }
    public void setIntField040_03(BigDecimal intField040_03) { this.intField040_03 = intField040_03; }

    public String getIntField040_04() { return intField040_04; }
    public void setIntField040_04(String intField040_04) { this.intField040_04 = intField040_04; }

    public LocalDate getIntField040_05() { return intField040_05; }
    public void setIntField040_05(LocalDate intField040_05) { this.intField040_05 = intField040_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV040)) return false;
        CreditBureauRequestV040 that = (CreditBureauRequestV040) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV040{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
