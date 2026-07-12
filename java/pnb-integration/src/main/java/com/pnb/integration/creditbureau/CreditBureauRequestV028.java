package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV028")
public class CreditBureauRequestV028 {

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

    @Column(name = "INT_FLD_028_00")
    private BigDecimal intField028_00;

    @Column(name = "INT_FLD_028_01")
    private Integer intField028_01;

    @Column(name = "INT_FLD_028_02")
    private BigDecimal intField028_02;

    @Column(name = "INT_FLD_028_03")
    private String intField028_03;

    @Column(name = "INT_FLD_028_04")
    private BigDecimal intField028_04;

    @Column(name = "INT_FLD_028_05")
    private String intField028_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV028() {}

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

    public BigDecimal getIntField028_00() { return intField028_00; }
    public void setIntField028_00(BigDecimal intField028_00) { this.intField028_00 = intField028_00; }

    public Integer getIntField028_01() { return intField028_01; }
    public void setIntField028_01(Integer intField028_01) { this.intField028_01 = intField028_01; }

    public BigDecimal getIntField028_02() { return intField028_02; }
    public void setIntField028_02(BigDecimal intField028_02) { this.intField028_02 = intField028_02; }

    public String getIntField028_03() { return intField028_03; }
    public void setIntField028_03(String intField028_03) { this.intField028_03 = intField028_03; }

    public BigDecimal getIntField028_04() { return intField028_04; }
    public void setIntField028_04(BigDecimal intField028_04) { this.intField028_04 = intField028_04; }

    public String getIntField028_05() { return intField028_05; }
    public void setIntField028_05(String intField028_05) { this.intField028_05 = intField028_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV028)) return false;
        CreditBureauRequestV028 that = (CreditBureauRequestV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV028{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
