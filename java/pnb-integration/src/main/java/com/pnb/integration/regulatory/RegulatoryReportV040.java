package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV040 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV040")
public class RegulatoryReportV040 {

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

    @Column(name = "INT_FLD_040_00")
    private BigDecimal intField040_00;

    @Column(name = "INT_FLD_040_01")
    private Integer intField040_01;

    @Column(name = "INT_FLD_040_02")
    private String intField040_02;

    @Column(name = "INT_FLD_040_03")
    private BigDecimal intField040_03;

    @Column(name = "INT_FLD_040_04")
    private BigDecimal intField040_04;

    @Column(name = "INT_FLD_040_05")
    private BigDecimal intField040_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV040() {}

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

    public BigDecimal getIntField040_00() { return intField040_00; }
    public void setIntField040_00(BigDecimal intField040_00) { this.intField040_00 = intField040_00; }

    public Integer getIntField040_01() { return intField040_01; }
    public void setIntField040_01(Integer intField040_01) { this.intField040_01 = intField040_01; }

    public String getIntField040_02() { return intField040_02; }
    public void setIntField040_02(String intField040_02) { this.intField040_02 = intField040_02; }

    public BigDecimal getIntField040_03() { return intField040_03; }
    public void setIntField040_03(BigDecimal intField040_03) { this.intField040_03 = intField040_03; }

    public BigDecimal getIntField040_04() { return intField040_04; }
    public void setIntField040_04(BigDecimal intField040_04) { this.intField040_04 = intField040_04; }

    public BigDecimal getIntField040_05() { return intField040_05; }
    public void setIntField040_05(BigDecimal intField040_05) { this.intField040_05 = intField040_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV040)) return false;
        RegulatoryReportV040 that = (RegulatoryReportV040) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV040{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
