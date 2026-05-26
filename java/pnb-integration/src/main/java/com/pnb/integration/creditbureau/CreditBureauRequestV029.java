package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV029")
public class CreditBureauRequestV029 {

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

    @Column(name = "INT_FLD_029_00")
    private Integer intField029_00;

    @Column(name = "INT_FLD_029_01")
    private String intField029_01;

    @Column(name = "INT_FLD_029_02")
    private String intField029_02;

    @Column(name = "INT_FLD_029_03")
    private Integer intField029_03;

    @Column(name = "INT_FLD_029_04")
    private BigDecimal intField029_04;

    @Column(name = "INT_FLD_029_05")
    private Integer intField029_05;

    @Column(name = "INT_FLD_029_06")
    private String intField029_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV029() {}

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

    public Integer getIntField029_00() { return intField029_00; }
    public void setIntField029_00(Integer intField029_00) { this.intField029_00 = intField029_00; }

    public String getIntField029_01() { return intField029_01; }
    public void setIntField029_01(String intField029_01) { this.intField029_01 = intField029_01; }

    public String getIntField029_02() { return intField029_02; }
    public void setIntField029_02(String intField029_02) { this.intField029_02 = intField029_02; }

    public Integer getIntField029_03() { return intField029_03; }
    public void setIntField029_03(Integer intField029_03) { this.intField029_03 = intField029_03; }

    public BigDecimal getIntField029_04() { return intField029_04; }
    public void setIntField029_04(BigDecimal intField029_04) { this.intField029_04 = intField029_04; }

    public Integer getIntField029_05() { return intField029_05; }
    public void setIntField029_05(Integer intField029_05) { this.intField029_05 = intField029_05; }

    public String getIntField029_06() { return intField029_06; }
    public void setIntField029_06(String intField029_06) { this.intField029_06 = intField029_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV029)) return false;
        CreditBureauRequestV029 that = (CreditBureauRequestV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV029{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
