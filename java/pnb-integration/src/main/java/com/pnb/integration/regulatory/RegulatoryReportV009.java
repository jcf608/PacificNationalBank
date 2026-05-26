package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV009 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV009")
public class RegulatoryReportV009 {

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

    @Column(name = "INT_FLD_009_00")
    private LocalDate intField009_00;

    @Column(name = "INT_FLD_009_01")
    private BigDecimal intField009_01;

    @Column(name = "INT_FLD_009_02")
    private LocalDate intField009_02;

    @Column(name = "INT_FLD_009_03")
    private BigDecimal intField009_03;

    @Column(name = "INT_FLD_009_04")
    private Integer intField009_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV009() {}

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

    public LocalDate getIntField009_00() { return intField009_00; }
    public void setIntField009_00(LocalDate intField009_00) { this.intField009_00 = intField009_00; }

    public BigDecimal getIntField009_01() { return intField009_01; }
    public void setIntField009_01(BigDecimal intField009_01) { this.intField009_01 = intField009_01; }

    public LocalDate getIntField009_02() { return intField009_02; }
    public void setIntField009_02(LocalDate intField009_02) { this.intField009_02 = intField009_02; }

    public BigDecimal getIntField009_03() { return intField009_03; }
    public void setIntField009_03(BigDecimal intField009_03) { this.intField009_03 = intField009_03; }

    public Integer getIntField009_04() { return intField009_04; }
    public void setIntField009_04(Integer intField009_04) { this.intField009_04 = intField009_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV009)) return false;
        RegulatoryReportV009 that = (RegulatoryReportV009) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV009{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
