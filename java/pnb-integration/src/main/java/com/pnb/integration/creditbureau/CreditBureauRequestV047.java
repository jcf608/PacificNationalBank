package com.pnb.integration.creditbureau;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * CreditBureauRequestV047 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "CREDITBUREAUREQUESTV047")
public class CreditBureauRequestV047 {

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

    @Column(name = "INT_FLD_047_00")
    private String intField047_00;

    @Column(name = "INT_FLD_047_01")
    private LocalDate intField047_01;

    @Column(name = "INT_FLD_047_02")
    private BigDecimal intField047_02;

    @Column(name = "INT_FLD_047_03")
    private LocalDate intField047_03;

    @Column(name = "INT_FLD_047_04")
    private Integer intField047_04;

    @Column(name = "INT_FLD_047_05")
    private LocalDate intField047_05;

    @Column(name = "INT_FLD_047_06")
    private LocalDate intField047_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public CreditBureauRequestV047() {}

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

    public String getIntField047_00() { return intField047_00; }
    public void setIntField047_00(String intField047_00) { this.intField047_00 = intField047_00; }

    public LocalDate getIntField047_01() { return intField047_01; }
    public void setIntField047_01(LocalDate intField047_01) { this.intField047_01 = intField047_01; }

    public BigDecimal getIntField047_02() { return intField047_02; }
    public void setIntField047_02(BigDecimal intField047_02) { this.intField047_02 = intField047_02; }

    public LocalDate getIntField047_03() { return intField047_03; }
    public void setIntField047_03(LocalDate intField047_03) { this.intField047_03 = intField047_03; }

    public Integer getIntField047_04() { return intField047_04; }
    public void setIntField047_04(Integer intField047_04) { this.intField047_04 = intField047_04; }

    public LocalDate getIntField047_05() { return intField047_05; }
    public void setIntField047_05(LocalDate intField047_05) { this.intField047_05 = intField047_05; }

    public LocalDate getIntField047_06() { return intField047_06; }
    public void setIntField047_06(LocalDate intField047_06) { this.intField047_06 = intField047_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditBureauRequestV047)) return false;
        CreditBureauRequestV047 that = (CreditBureauRequestV047) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "CreditBureauRequestV047{" +
            "id=" + id +
            ", requestId=" + requestId +
            ", bureauName=" + bureauName +
            ", ssn=" + ssn +
            ", score=" + score +
            ", reportDate=" + reportDate +
            '}';
    }
}
