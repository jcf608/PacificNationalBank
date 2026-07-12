package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV027 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV027")
public class CreditBureauRequestV027 {

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

    @Column(name = "INT_FLD_027_00")
    private String intField027_00;

    @Column(name = "INT_FLD_027_01")
    private String intField027_01;

    @Column(name = "INT_FLD_027_02")
    private Integer intField027_02;

    @Column(name = "INT_FLD_027_03")
    private Integer intField027_03;

    @Column(name = "INT_FLD_027_04")
    private BigDecimal intField027_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV027() {}

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

    public String getIntField027_00() { return intField027_00; }
    public void setIntField027_00(String intField027_00) { this.intField027_00 = intField027_00; }

    public String getIntField027_01() { return intField027_01; }
    public void setIntField027_01(String intField027_01) { this.intField027_01 = intField027_01; }

    public Integer getIntField027_02() { return intField027_02; }
    public void setIntField027_02(Integer intField027_02) { this.intField027_02 = intField027_02; }

    public Integer getIntField027_03() { return intField027_03; }
    public void setIntField027_03(Integer intField027_03) { this.intField027_03 = intField027_03; }

    public BigDecimal getIntField027_04() { return intField027_04; }
    public void setIntField027_04(BigDecimal intField027_04) { this.intField027_04 = intField027_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV027)) return false;
        CreditBureauRequestV027 that = (CreditBureauRequestV027) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV027{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
