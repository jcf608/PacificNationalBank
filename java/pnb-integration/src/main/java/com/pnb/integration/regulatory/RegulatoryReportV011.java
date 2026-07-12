package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV011 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV011")
public class RegulatoryReportV011 {

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

    @Column(name = "INT_FLD_011_00")
    private String intField011_00;

    @Column(name = "INT_FLD_011_01")
    private BigDecimal intField011_01;

    @Column(name = "INT_FLD_011_02")
    private LocalDate intField011_02;

    @Column(name = "INT_FLD_011_03")
    private Integer intField011_03;

    @Column(name = "INT_FLD_011_04")
    private Integer intField011_04;

    @Column(name = "INT_FLD_011_05")
    private BigDecimal intField011_05;

    @Column(name = "INT_FLD_011_06")
    private BigDecimal intField011_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV011() {}

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

    public String getIntField011_00() { return intField011_00; }
    public void setIntField011_00(String intField011_00) { this.intField011_00 = intField011_00; }

    public BigDecimal getIntField011_01() { return intField011_01; }
    public void setIntField011_01(BigDecimal intField011_01) { this.intField011_01 = intField011_01; }

    public LocalDate getIntField011_02() { return intField011_02; }
    public void setIntField011_02(LocalDate intField011_02) { this.intField011_02 = intField011_02; }

    public Integer getIntField011_03() { return intField011_03; }
    public void setIntField011_03(Integer intField011_03) { this.intField011_03 = intField011_03; }

    public Integer getIntField011_04() { return intField011_04; }
    public void setIntField011_04(Integer intField011_04) { this.intField011_04 = intField011_04; }

    public BigDecimal getIntField011_05() { return intField011_05; }
    public void setIntField011_05(BigDecimal intField011_05) { this.intField011_05 = intField011_05; }

    public BigDecimal getIntField011_06() { return intField011_06; }
    public void setIntField011_06(BigDecimal intField011_06) { this.intField011_06 = intField011_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV011)) return false;
        RegulatoryReportV011 that = (RegulatoryReportV011) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV011{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
