package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV017 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV017")
public class RegulatoryReportV017 {

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

    @Column(name = "INT_FLD_017_00")
    private String intField017_00;

    @Column(name = "INT_FLD_017_01")
    private String intField017_01;

    @Column(name = "INT_FLD_017_02")
    private BigDecimal intField017_02;

    @Column(name = "INT_FLD_017_03")
    private LocalDate intField017_03;

    @Column(name = "INT_FLD_017_04")
    private LocalDate intField017_04;

    @Column(name = "INT_FLD_017_05")
    private BigDecimal intField017_05;

    @Column(name = "INT_FLD_017_06")
    private BigDecimal intField017_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV017() {}

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

    public String getIntField017_00() { return intField017_00; }
    public void setIntField017_00(String intField017_00) { this.intField017_00 = intField017_00; }

    public String getIntField017_01() { return intField017_01; }
    public void setIntField017_01(String intField017_01) { this.intField017_01 = intField017_01; }

    public BigDecimal getIntField017_02() { return intField017_02; }
    public void setIntField017_02(BigDecimal intField017_02) { this.intField017_02 = intField017_02; }

    public LocalDate getIntField017_03() { return intField017_03; }
    public void setIntField017_03(LocalDate intField017_03) { this.intField017_03 = intField017_03; }

    public LocalDate getIntField017_04() { return intField017_04; }
    public void setIntField017_04(LocalDate intField017_04) { this.intField017_04 = intField017_04; }

    public BigDecimal getIntField017_05() { return intField017_05; }
    public void setIntField017_05(BigDecimal intField017_05) { this.intField017_05 = intField017_05; }

    public BigDecimal getIntField017_06() { return intField017_06; }
    public void setIntField017_06(BigDecimal intField017_06) { this.intField017_06 = intField017_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV017)) return false;
        RegulatoryReportV017 that = (RegulatoryReportV017) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV017{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
