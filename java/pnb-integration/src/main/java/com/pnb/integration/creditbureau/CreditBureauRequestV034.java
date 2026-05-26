package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV034 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV034")
public class CreditBureauRequestV034 {

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

    @Column(name = "INT_FLD_034_00")
    private LocalDate intField034_00;

    @Column(name = "INT_FLD_034_01")
    private String intField034_01;

    @Column(name = "INT_FLD_034_02")
    private Integer intField034_02;

    @Column(name = "INT_FLD_034_03")
    private Integer intField034_03;

    @Column(name = "INT_FLD_034_04")
    private String intField034_04;

    @Column(name = "INT_FLD_034_05")
    private Integer intField034_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV034() {}

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

    public LocalDate getIntField034_00() { return intField034_00; }
    public void setIntField034_00(LocalDate intField034_00) { this.intField034_00 = intField034_00; }

    public String getIntField034_01() { return intField034_01; }
    public void setIntField034_01(String intField034_01) { this.intField034_01 = intField034_01; }

    public Integer getIntField034_02() { return intField034_02; }
    public void setIntField034_02(Integer intField034_02) { this.intField034_02 = intField034_02; }

    public Integer getIntField034_03() { return intField034_03; }
    public void setIntField034_03(Integer intField034_03) { this.intField034_03 = intField034_03; }

    public String getIntField034_04() { return intField034_04; }
    public void setIntField034_04(String intField034_04) { this.intField034_04 = intField034_04; }

    public Integer getIntField034_05() { return intField034_05; }
    public void setIntField034_05(Integer intField034_05) { this.intField034_05 = intField034_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV034)) return false;
        CreditBureauRequestV034 that = (CreditBureauRequestV034) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV034{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
