package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV023")
public class RegulatoryReportV023 {

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

    @Column(name = "INT_FLD_023_00")
    private String intField023_00;

    @Column(name = "INT_FLD_023_01")
    private BigDecimal intField023_01;

    @Column(name = "INT_FLD_023_02")
    private String intField023_02;

    @Column(name = "INT_FLD_023_03")
    private Integer intField023_03;

    @Column(name = "INT_FLD_023_04")
    private String intField023_04;

    @Column(name = "INT_FLD_023_05")
    private String intField023_05;

    @Column(name = "INT_FLD_023_06")
    private Integer intField023_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV023() {}

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

    public String getIntField023_00() { return intField023_00; }
    public void setIntField023_00(String intField023_00) { this.intField023_00 = intField023_00; }

    public BigDecimal getIntField023_01() { return intField023_01; }
    public void setIntField023_01(BigDecimal intField023_01) { this.intField023_01 = intField023_01; }

    public String getIntField023_02() { return intField023_02; }
    public void setIntField023_02(String intField023_02) { this.intField023_02 = intField023_02; }

    public Integer getIntField023_03() { return intField023_03; }
    public void setIntField023_03(Integer intField023_03) { this.intField023_03 = intField023_03; }

    public String getIntField023_04() { return intField023_04; }
    public void setIntField023_04(String intField023_04) { this.intField023_04 = intField023_04; }

    public String getIntField023_05() { return intField023_05; }
    public void setIntField023_05(String intField023_05) { this.intField023_05 = intField023_05; }

    public Integer getIntField023_06() { return intField023_06; }
    public void setIntField023_06(Integer intField023_06) { this.intField023_06 = intField023_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV023)) return false;
        RegulatoryReportV023 that = (RegulatoryReportV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV023{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
