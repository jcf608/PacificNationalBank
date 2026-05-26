package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV004")
public class RegulatoryReportV004 {

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

    @Column(name = "INT_FLD_004_00")
    private BigDecimal intField004_00;

    @Column(name = "INT_FLD_004_01")
    private BigDecimal intField004_01;

    @Column(name = "INT_FLD_004_02")
    private LocalDate intField004_02;

    @Column(name = "INT_FLD_004_03")
    private BigDecimal intField004_03;

    @Column(name = "INT_FLD_004_04")
    private BigDecimal intField004_04;

    @Column(name = "INT_FLD_004_05")
    private String intField004_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV004() {}

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

    public BigDecimal getIntField004_00() { return intField004_00; }
    public void setIntField004_00(BigDecimal intField004_00) { this.intField004_00 = intField004_00; }

    public BigDecimal getIntField004_01() { return intField004_01; }
    public void setIntField004_01(BigDecimal intField004_01) { this.intField004_01 = intField004_01; }

    public LocalDate getIntField004_02() { return intField004_02; }
    public void setIntField004_02(LocalDate intField004_02) { this.intField004_02 = intField004_02; }

    public BigDecimal getIntField004_03() { return intField004_03; }
    public void setIntField004_03(BigDecimal intField004_03) { this.intField004_03 = intField004_03; }

    public BigDecimal getIntField004_04() { return intField004_04; }
    public void setIntField004_04(BigDecimal intField004_04) { this.intField004_04 = intField004_04; }

    public String getIntField004_05() { return intField004_05; }
    public void setIntField004_05(String intField004_05) { this.intField004_05 = intField004_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV004)) return false;
        RegulatoryReportV004 that = (RegulatoryReportV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV004{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
