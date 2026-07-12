package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV017 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV017")
public class CreditBureauRequestV017 {

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

    @Column(name = "INT_FLD_017_00")
    private Integer intField017_00;

    @Column(name = "INT_FLD_017_01")
    private LocalDate intField017_01;

    @Column(name = "INT_FLD_017_02")
    private String intField017_02;

    @Column(name = "INT_FLD_017_03")
    private LocalDate intField017_03;

    @Column(name = "INT_FLD_017_04")
    private BigDecimal intField017_04;

    @Column(name = "INT_FLD_017_05")
    private LocalDate intField017_05;

    @Column(name = "INT_FLD_017_06")
    private BigDecimal intField017_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV017() {}

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

    public Integer getIntField017_00() { return intField017_00; }
    public void setIntField017_00(Integer intField017_00) { this.intField017_00 = intField017_00; }

    public LocalDate getIntField017_01() { return intField017_01; }
    public void setIntField017_01(LocalDate intField017_01) { this.intField017_01 = intField017_01; }

    public String getIntField017_02() { return intField017_02; }
    public void setIntField017_02(String intField017_02) { this.intField017_02 = intField017_02; }

    public LocalDate getIntField017_03() { return intField017_03; }
    public void setIntField017_03(LocalDate intField017_03) { this.intField017_03 = intField017_03; }

    public BigDecimal getIntField017_04() { return intField017_04; }
    public void setIntField017_04(BigDecimal intField017_04) { this.intField017_04 = intField017_04; }

    public LocalDate getIntField017_05() { return intField017_05; }
    public void setIntField017_05(LocalDate intField017_05) { this.intField017_05 = intField017_05; }

    public BigDecimal getIntField017_06() { return intField017_06; }
    public void setIntField017_06(BigDecimal intField017_06) { this.intField017_06 = intField017_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV017)) return false;
        CreditBureauRequestV017 that = (CreditBureauRequestV017) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV017{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
