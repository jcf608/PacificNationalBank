package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV020")
public class CreditBureauRequestV020 {

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

    @Column(name = "INT_FLD_020_00")
    private String intField020_00;

    @Column(name = "INT_FLD_020_01")
    private Integer intField020_01;

    @Column(name = "INT_FLD_020_02")
    private Integer intField020_02;

    @Column(name = "INT_FLD_020_03")
    private String intField020_03;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV020() {}

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

    public String getIntField020_00() { return intField020_00; }
    public void setIntField020_00(String intField020_00) { this.intField020_00 = intField020_00; }

    public Integer getIntField020_01() { return intField020_01; }
    public void setIntField020_01(Integer intField020_01) { this.intField020_01 = intField020_01; }

    public Integer getIntField020_02() { return intField020_02; }
    public void setIntField020_02(Integer intField020_02) { this.intField020_02 = intField020_02; }

    public String getIntField020_03() { return intField020_03; }
    public void setIntField020_03(String intField020_03) { this.intField020_03 = intField020_03; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV020)) return false;
        CreditBureauRequestV020 that = (CreditBureauRequestV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV020{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
