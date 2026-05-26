package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV005")
public class RegulatoryReportV005 {

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

    @Column(name = "INT_FLD_005_00")
    private LocalDate intField005_00;

    @Column(name = "INT_FLD_005_01")
    private LocalDate intField005_01;

    @Column(name = "INT_FLD_005_02")
    private Integer intField005_02;

    @Column(name = "INT_FLD_005_03")
    private LocalDate intField005_03;

    @Column(name = "INT_FLD_005_04")
    private LocalDate intField005_04;

    @Column(name = "INT_FLD_005_05")
    private String intField005_05;

    @Column(name = "INT_FLD_005_06")
    private BigDecimal intField005_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV005() {}

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

    public LocalDate getIntField005_00() { return intField005_00; }
    public void setIntField005_00(LocalDate intField005_00) { this.intField005_00 = intField005_00; }

    public LocalDate getIntField005_01() { return intField005_01; }
    public void setIntField005_01(LocalDate intField005_01) { this.intField005_01 = intField005_01; }

    public Integer getIntField005_02() { return intField005_02; }
    public void setIntField005_02(Integer intField005_02) { this.intField005_02 = intField005_02; }

    public LocalDate getIntField005_03() { return intField005_03; }
    public void setIntField005_03(LocalDate intField005_03) { this.intField005_03 = intField005_03; }

    public LocalDate getIntField005_04() { return intField005_04; }
    public void setIntField005_04(LocalDate intField005_04) { this.intField005_04 = intField005_04; }

    public String getIntField005_05() { return intField005_05; }
    public void setIntField005_05(String intField005_05) { this.intField005_05 = intField005_05; }

    public BigDecimal getIntField005_06() { return intField005_06; }
    public void setIntField005_06(BigDecimal intField005_06) { this.intField005_06 = intField005_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV005)) return false;
        RegulatoryReportV005 that = (RegulatoryReportV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV005{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
