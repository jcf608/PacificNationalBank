package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV046 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV046")
public class RegulatoryReportV046 {

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

    @Column(name = "INT_FLD_046_00")
    private BigDecimal intField046_00;

    @Column(name = "INT_FLD_046_01")
    private Integer intField046_01;

    @Column(name = "INT_FLD_046_02")
    private LocalDate intField046_02;

    @Column(name = "INT_FLD_046_03")
    private Integer intField046_03;

    @Column(name = "INT_FLD_046_04")
    private Integer intField046_04;

    @Column(name = "INT_FLD_046_05")
    private String intField046_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV046() {}

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

    public BigDecimal getIntField046_00() { return intField046_00; }
    public void setIntField046_00(BigDecimal intField046_00) { this.intField046_00 = intField046_00; }

    public Integer getIntField046_01() { return intField046_01; }
    public void setIntField046_01(Integer intField046_01) { this.intField046_01 = intField046_01; }

    public LocalDate getIntField046_02() { return intField046_02; }
    public void setIntField046_02(LocalDate intField046_02) { this.intField046_02 = intField046_02; }

    public Integer getIntField046_03() { return intField046_03; }
    public void setIntField046_03(Integer intField046_03) { this.intField046_03 = intField046_03; }

    public Integer getIntField046_04() { return intField046_04; }
    public void setIntField046_04(Integer intField046_04) { this.intField046_04 = intField046_04; }

    public String getIntField046_05() { return intField046_05; }
    public void setIntField046_05(String intField046_05) { this.intField046_05 = intField046_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV046)) return false;
        RegulatoryReportV046 that = (RegulatoryReportV046) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV046{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
