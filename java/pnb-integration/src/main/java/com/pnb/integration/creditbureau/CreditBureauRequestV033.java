package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV033 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV033")
public class CreditBureauRequestV033 {

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

    @Column(name = "INT_FLD_033_00")
    private String intField033_00;

    @Column(name = "INT_FLD_033_01")
    private LocalDate intField033_01;

    @Column(name = "INT_FLD_033_02")
    private String intField033_02;

    @Column(name = "INT_FLD_033_03")
    private BigDecimal intField033_03;

    @Column(name = "INT_FLD_033_04")
    private Integer intField033_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV033() {}

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

    public String getIntField033_00() { return intField033_00; }
    public void setIntField033_00(String intField033_00) { this.intField033_00 = intField033_00; }

    public LocalDate getIntField033_01() { return intField033_01; }
    public void setIntField033_01(LocalDate intField033_01) { this.intField033_01 = intField033_01; }

    public String getIntField033_02() { return intField033_02; }
    public void setIntField033_02(String intField033_02) { this.intField033_02 = intField033_02; }

    public BigDecimal getIntField033_03() { return intField033_03; }
    public void setIntField033_03(BigDecimal intField033_03) { this.intField033_03 = intField033_03; }

    public Integer getIntField033_04() { return intField033_04; }
    public void setIntField033_04(Integer intField033_04) { this.intField033_04 = intField033_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV033)) return false;
        CreditBureauRequestV033 that = (CreditBureauRequestV033) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV033{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
