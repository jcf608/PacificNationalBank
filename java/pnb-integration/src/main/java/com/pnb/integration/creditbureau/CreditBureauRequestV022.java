package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV022")
public class CreditBureauRequestV022 {

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

    @Column(name = "INT_FLD_022_00")
    private BigDecimal intField022_00;

    @Column(name = "INT_FLD_022_01")
    private String intField022_01;

    @Column(name = "INT_FLD_022_02")
    private BigDecimal intField022_02;

    @Column(name = "INT_FLD_022_03")
    private Integer intField022_03;

    @Column(name = "INT_FLD_022_04")
    private String intField022_04;

    @Column(name = "INT_FLD_022_05")
    private String intField022_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV022() {}

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

    public BigDecimal getIntField022_00() { return intField022_00; }
    public void setIntField022_00(BigDecimal intField022_00) { this.intField022_00 = intField022_00; }

    public String getIntField022_01() { return intField022_01; }
    public void setIntField022_01(String intField022_01) { this.intField022_01 = intField022_01; }

    public BigDecimal getIntField022_02() { return intField022_02; }
    public void setIntField022_02(BigDecimal intField022_02) { this.intField022_02 = intField022_02; }

    public Integer getIntField022_03() { return intField022_03; }
    public void setIntField022_03(Integer intField022_03) { this.intField022_03 = intField022_03; }

    public String getIntField022_04() { return intField022_04; }
    public void setIntField022_04(String intField022_04) { this.intField022_04 = intField022_04; }

    public String getIntField022_05() { return intField022_05; }
    public void setIntField022_05(String intField022_05) { this.intField022_05 = intField022_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV022)) return false;
        CreditBureauRequestV022 that = (CreditBureauRequestV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV022{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
