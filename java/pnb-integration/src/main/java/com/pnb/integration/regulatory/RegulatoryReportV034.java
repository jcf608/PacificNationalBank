package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV034 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV034")
public class RegulatoryReportV034 {

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

    @Column(name = "INT_FLD_034_00")
    private String intField034_00;

    @Column(name = "INT_FLD_034_01")
    private BigDecimal intField034_01;

    @Column(name = "INT_FLD_034_02")
    private LocalDate intField034_02;

    @Column(name = "INT_FLD_034_03")
    private LocalDate intField034_03;

    @Column(name = "INT_FLD_034_04")
    private BigDecimal intField034_04;

    @Column(name = "INT_FLD_034_05")
    private LocalDate intField034_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV034() {}

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

    public String getIntField034_00() { return intField034_00; }
    public void setIntField034_00(String intField034_00) { this.intField034_00 = intField034_00; }

    public BigDecimal getIntField034_01() { return intField034_01; }
    public void setIntField034_01(BigDecimal intField034_01) { this.intField034_01 = intField034_01; }

    public LocalDate getIntField034_02() { return intField034_02; }
    public void setIntField034_02(LocalDate intField034_02) { this.intField034_02 = intField034_02; }

    public LocalDate getIntField034_03() { return intField034_03; }
    public void setIntField034_03(LocalDate intField034_03) { this.intField034_03 = intField034_03; }

    public BigDecimal getIntField034_04() { return intField034_04; }
    public void setIntField034_04(BigDecimal intField034_04) { this.intField034_04 = intField034_04; }

    public LocalDate getIntField034_05() { return intField034_05; }
    public void setIntField034_05(LocalDate intField034_05) { this.intField034_05 = intField034_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV034)) return false;
        RegulatoryReportV034 that = (RegulatoryReportV034) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV034{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
