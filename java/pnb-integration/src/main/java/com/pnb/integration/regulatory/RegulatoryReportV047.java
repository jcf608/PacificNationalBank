package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV047 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV047")
public class RegulatoryReportV047 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REPORT_ID", unique = true)
    private String reportId;

    @Column(name = "REPORT_TYPE")
    private String reportType;

    @Column(name = "PERIOD_START")
    private LocalDate periodStart;

    @Column(name = "PERIOD_END")
    private LocalDate periodEnd;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "SUBMITTED_DATE")
    private LocalDate submittedDate;

    @Column(name = "INT_FLD_047_00")
    private BigDecimal intField047_00;

    @Column(name = "INT_FLD_047_01")
    private LocalDate intField047_01;

    @Column(name = "INT_FLD_047_02")
    private String intField047_02;

    @Column(name = "INT_FLD_047_03")
    private BigDecimal intField047_03;

    @Column(name = "INT_FLD_047_04")
    private LocalDate intField047_04;

    @Column(name = "INT_FLD_047_05")
    private String intField047_05;

    @Column(name = "INT_FLD_047_06")
    private BigDecimal intField047_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV047() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReportId() { return reportId; }
    public void setReportId(String reportId) { this.reportId = reportId; }

    public String getReportType() { return reportType; }
    public void setReportType(String reportType) { this.reportType = reportType; }

    public LocalDate getPeriodStart() { return periodStart; }
    public void setPeriodStart(LocalDate periodStart) { this.periodStart = periodStart; }

    public LocalDate getPeriodEnd() { return periodEnd; }
    public void setPeriodEnd(LocalDate periodEnd) { this.periodEnd = periodEnd; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getSubmittedDate() { return submittedDate; }
    public void setSubmittedDate(LocalDate submittedDate) { this.submittedDate = submittedDate; }

    public BigDecimal getIntField047_00() { return intField047_00; }
    public void setIntField047_00(BigDecimal intField047_00) { this.intField047_00 = intField047_00; }

    public LocalDate getIntField047_01() { return intField047_01; }
    public void setIntField047_01(LocalDate intField047_01) { this.intField047_01 = intField047_01; }

    public String getIntField047_02() { return intField047_02; }
    public void setIntField047_02(String intField047_02) { this.intField047_02 = intField047_02; }

    public BigDecimal getIntField047_03() { return intField047_03; }
    public void setIntField047_03(BigDecimal intField047_03) { this.intField047_03 = intField047_03; }

    public LocalDate getIntField047_04() { return intField047_04; }
    public void setIntField047_04(LocalDate intField047_04) { this.intField047_04 = intField047_04; }

    public String getIntField047_05() { return intField047_05; }
    public void setIntField047_05(String intField047_05) { this.intField047_05 = intField047_05; }

    public BigDecimal getIntField047_06() { return intField047_06; }
    public void setIntField047_06(BigDecimal intField047_06) { this.intField047_06 = intField047_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV047)) return false;
        RegulatoryReportV047 that = (RegulatoryReportV047) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV047{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
