package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV045 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV045")
public class CreditBureauRequestV045 {

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

    @Column(name = "INT_FLD_045_00")
    private LocalDate intField045_00;

    @Column(name = "INT_FLD_045_01")
    private String intField045_01;

    @Column(name = "INT_FLD_045_02")
    private String intField045_02;

    @Column(name = "INT_FLD_045_03")
    private Integer intField045_03;

    @Column(name = "INT_FLD_045_04")
    private String intField045_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV045() {}

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

    public LocalDate getIntField045_00() { return intField045_00; }
    public void setIntField045_00(LocalDate intField045_00) { this.intField045_00 = intField045_00; }

    public String getIntField045_01() { return intField045_01; }
    public void setIntField045_01(String intField045_01) { this.intField045_01 = intField045_01; }

    public String getIntField045_02() { return intField045_02; }
    public void setIntField045_02(String intField045_02) { this.intField045_02 = intField045_02; }

    public Integer getIntField045_03() { return intField045_03; }
    public void setIntField045_03(Integer intField045_03) { this.intField045_03 = intField045_03; }

    public String getIntField045_04() { return intField045_04; }
    public void setIntField045_04(String intField045_04) { this.intField045_04 = intField045_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV045)) return false;
        CreditBureauRequestV045 that = (CreditBureauRequestV045) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV045{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
