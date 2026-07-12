package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV041 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV041")
public class CreditBureauRequestV041 {

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

    @Column(name = "INT_FLD_041_00")
    private BigDecimal intField041_00;

    @Column(name = "INT_FLD_041_01")
    private Integer intField041_01;

    @Column(name = "INT_FLD_041_02")
    private LocalDate intField041_02;

    @Column(name = "INT_FLD_041_03")
    private String intField041_03;

    @Column(name = "INT_FLD_041_04")
    private String intField041_04;

    @Column(name = "INT_FLD_041_05")
    private Integer intField041_05;

    @Column(name = "INT_FLD_041_06")
    private LocalDate intField041_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV041() {}

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

    public BigDecimal getIntField041_00() { return intField041_00; }
    public void setIntField041_00(BigDecimal intField041_00) { this.intField041_00 = intField041_00; }

    public Integer getIntField041_01() { return intField041_01; }
    public void setIntField041_01(Integer intField041_01) { this.intField041_01 = intField041_01; }

    public LocalDate getIntField041_02() { return intField041_02; }
    public void setIntField041_02(LocalDate intField041_02) { this.intField041_02 = intField041_02; }

    public String getIntField041_03() { return intField041_03; }
    public void setIntField041_03(String intField041_03) { this.intField041_03 = intField041_03; }

    public String getIntField041_04() { return intField041_04; }
    public void setIntField041_04(String intField041_04) { this.intField041_04 = intField041_04; }

    public Integer getIntField041_05() { return intField041_05; }
    public void setIntField041_05(Integer intField041_05) { this.intField041_05 = intField041_05; }

    public LocalDate getIntField041_06() { return intField041_06; }
    public void setIntField041_06(LocalDate intField041_06) { this.intField041_06 = intField041_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV041)) return false;
        CreditBureauRequestV041 that = (CreditBureauRequestV041) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV041{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
