package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV029")
public class RegulatoryReportV029 {

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

    @Column(name = "INT_FLD_029_00")
    private BigDecimal intField029_00;

    @Column(name = "INT_FLD_029_01")
    private String intField029_01;

    @Column(name = "INT_FLD_029_02")
    private String intField029_02;

    @Column(name = "INT_FLD_029_03")
    private LocalDate intField029_03;

    @Column(name = "INT_FLD_029_04")
    private String intField029_04;

    @Column(name = "INT_FLD_029_05")
    private Integer intField029_05;

    @Column(name = "INT_FLD_029_06")
    private LocalDate intField029_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV029() {}

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

    public BigDecimal getIntField029_00() { return intField029_00; }
    public void setIntField029_00(BigDecimal intField029_00) { this.intField029_00 = intField029_00; }

    public String getIntField029_01() { return intField029_01; }
    public void setIntField029_01(String intField029_01) { this.intField029_01 = intField029_01; }

    public String getIntField029_02() { return intField029_02; }
    public void setIntField029_02(String intField029_02) { this.intField029_02 = intField029_02; }

    public LocalDate getIntField029_03() { return intField029_03; }
    public void setIntField029_03(LocalDate intField029_03) { this.intField029_03 = intField029_03; }

    public String getIntField029_04() { return intField029_04; }
    public void setIntField029_04(String intField029_04) { this.intField029_04 = intField029_04; }

    public Integer getIntField029_05() { return intField029_05; }
    public void setIntField029_05(Integer intField029_05) { this.intField029_05 = intField029_05; }

    public LocalDate getIntField029_06() { return intField029_06; }
    public void setIntField029_06(LocalDate intField029_06) { this.intField029_06 = intField029_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV029)) return false;
        RegulatoryReportV029 that = (RegulatoryReportV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV029{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
