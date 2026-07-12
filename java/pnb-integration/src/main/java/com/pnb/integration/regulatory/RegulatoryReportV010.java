package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV010 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV010")
public class RegulatoryReportV010 {

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

    @Column(name = "INT_FLD_010_00")
    private Integer intField010_00;

    @Column(name = "INT_FLD_010_01")
    private BigDecimal intField010_01;

    @Column(name = "INT_FLD_010_02")
    private Integer intField010_02;

    @Column(name = "INT_FLD_010_03")
    private Integer intField010_03;

    @Column(name = "INT_FLD_010_04")
    private BigDecimal intField010_04;

    @Column(name = "INT_FLD_010_05")
    private LocalDate intField010_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV010() {}

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

    public Integer getIntField010_00() { return intField010_00; }
    public void setIntField010_00(Integer intField010_00) { this.intField010_00 = intField010_00; }

    public BigDecimal getIntField010_01() { return intField010_01; }
    public void setIntField010_01(BigDecimal intField010_01) { this.intField010_01 = intField010_01; }

    public Integer getIntField010_02() { return intField010_02; }
    public void setIntField010_02(Integer intField010_02) { this.intField010_02 = intField010_02; }

    public Integer getIntField010_03() { return intField010_03; }
    public void setIntField010_03(Integer intField010_03) { this.intField010_03 = intField010_03; }

    public BigDecimal getIntField010_04() { return intField010_04; }
    public void setIntField010_04(BigDecimal intField010_04) { this.intField010_04 = intField010_04; }

    public LocalDate getIntField010_05() { return intField010_05; }
    public void setIntField010_05(LocalDate intField010_05) { this.intField010_05 = intField010_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV010)) return false;
        RegulatoryReportV010 that = (RegulatoryReportV010) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV010{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
