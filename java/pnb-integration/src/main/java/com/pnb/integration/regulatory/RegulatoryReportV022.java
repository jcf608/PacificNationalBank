package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV022")
public class RegulatoryReportV022 {

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

    @Column(name = "INT_FLD_022_00")
    private String intField022_00;

    @Column(name = "INT_FLD_022_01")
    private String intField022_01;

    @Column(name = "INT_FLD_022_02")
    private Integer intField022_02;

    @Column(name = "INT_FLD_022_03")
    private LocalDate intField022_03;

    @Column(name = "INT_FLD_022_04")
    private LocalDate intField022_04;

    @Column(name = "INT_FLD_022_05")
    private BigDecimal intField022_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV022() {}

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

    public String getIntField022_00() { return intField022_00; }
    public void setIntField022_00(String intField022_00) { this.intField022_00 = intField022_00; }

    public String getIntField022_01() { return intField022_01; }
    public void setIntField022_01(String intField022_01) { this.intField022_01 = intField022_01; }

    public Integer getIntField022_02() { return intField022_02; }
    public void setIntField022_02(Integer intField022_02) { this.intField022_02 = intField022_02; }

    public LocalDate getIntField022_03() { return intField022_03; }
    public void setIntField022_03(LocalDate intField022_03) { this.intField022_03 = intField022_03; }

    public LocalDate getIntField022_04() { return intField022_04; }
    public void setIntField022_04(LocalDate intField022_04) { this.intField022_04 = intField022_04; }

    public BigDecimal getIntField022_05() { return intField022_05; }
    public void setIntField022_05(BigDecimal intField022_05) { this.intField022_05 = intField022_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV022)) return false;
        RegulatoryReportV022 that = (RegulatoryReportV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV022{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
