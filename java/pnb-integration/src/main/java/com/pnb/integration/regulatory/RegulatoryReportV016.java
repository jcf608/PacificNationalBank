package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV016 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV016")
public class RegulatoryReportV016 {

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

    @Column(name = "INT_FLD_016_00")
    private LocalDate intField016_00;

    @Column(name = "INT_FLD_016_01")
    private Integer intField016_01;

    @Column(name = "INT_FLD_016_02")
    private String intField016_02;

    @Column(name = "INT_FLD_016_03")
    private LocalDate intField016_03;

    @Column(name = "INT_FLD_016_04")
    private String intField016_04;

    @Column(name = "INT_FLD_016_05")
    private String intField016_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV016() {}

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

    public LocalDate getIntField016_00() { return intField016_00; }
    public void setIntField016_00(LocalDate intField016_00) { this.intField016_00 = intField016_00; }

    public Integer getIntField016_01() { return intField016_01; }
    public void setIntField016_01(Integer intField016_01) { this.intField016_01 = intField016_01; }

    public String getIntField016_02() { return intField016_02; }
    public void setIntField016_02(String intField016_02) { this.intField016_02 = intField016_02; }

    public LocalDate getIntField016_03() { return intField016_03; }
    public void setIntField016_03(LocalDate intField016_03) { this.intField016_03 = intField016_03; }

    public String getIntField016_04() { return intField016_04; }
    public void setIntField016_04(String intField016_04) { this.intField016_04 = intField016_04; }

    public String getIntField016_05() { return intField016_05; }
    public void setIntField016_05(String intField016_05) { this.intField016_05 = intField016_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV016)) return false;
        RegulatoryReportV016 that = (RegulatoryReportV016) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV016{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
