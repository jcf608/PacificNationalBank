package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV046 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV046")
public class CreditBureauRequestV046 {

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

    @Column(name = "INT_FLD_046_00")
    private BigDecimal intField046_00;

    @Column(name = "INT_FLD_046_01")
    private String intField046_01;

    @Column(name = "INT_FLD_046_02")
    private Integer intField046_02;

    @Column(name = "INT_FLD_046_03")
    private Integer intField046_03;

    @Column(name = "INT_FLD_046_04")
    private LocalDate intField046_04;

    @Column(name = "INT_FLD_046_05")
    private String intField046_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV046() {}

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

    public BigDecimal getIntField046_00() { return intField046_00; }
    public void setIntField046_00(BigDecimal intField046_00) { this.intField046_00 = intField046_00; }

    public String getIntField046_01() { return intField046_01; }
    public void setIntField046_01(String intField046_01) { this.intField046_01 = intField046_01; }

    public Integer getIntField046_02() { return intField046_02; }
    public void setIntField046_02(Integer intField046_02) { this.intField046_02 = intField046_02; }

    public Integer getIntField046_03() { return intField046_03; }
    public void setIntField046_03(Integer intField046_03) { this.intField046_03 = intField046_03; }

    public LocalDate getIntField046_04() { return intField046_04; }
    public void setIntField046_04(LocalDate intField046_04) { this.intField046_04 = intField046_04; }

    public String getIntField046_05() { return intField046_05; }
    public void setIntField046_05(String intField046_05) { this.intField046_05 = intField046_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV046)) return false;
        CreditBureauRequestV046 that = (CreditBureauRequestV046) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV046{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
