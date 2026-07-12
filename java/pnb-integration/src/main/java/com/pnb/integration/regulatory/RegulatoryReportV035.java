package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV035 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV035")
public class RegulatoryReportV035 {

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

    @Column(name = "INT_FLD_035_00")
    private LocalDate intField035_00;

    @Column(name = "INT_FLD_035_01")
    private LocalDate intField035_01;

    @Column(name = "INT_FLD_035_02")
    private String intField035_02;

    @Column(name = "INT_FLD_035_03")
    private BigDecimal intField035_03;

    @Column(name = "INT_FLD_035_04")
    private Integer intField035_04;

    @Column(name = "INT_FLD_035_05")
    private Integer intField035_05;

    @Column(name = "INT_FLD_035_06")
    private Integer intField035_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV035() {}

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

    public LocalDate getIntField035_00() { return intField035_00; }
    public void setIntField035_00(LocalDate intField035_00) { this.intField035_00 = intField035_00; }

    public LocalDate getIntField035_01() { return intField035_01; }
    public void setIntField035_01(LocalDate intField035_01) { this.intField035_01 = intField035_01; }

    public String getIntField035_02() { return intField035_02; }
    public void setIntField035_02(String intField035_02) { this.intField035_02 = intField035_02; }

    public BigDecimal getIntField035_03() { return intField035_03; }
    public void setIntField035_03(BigDecimal intField035_03) { this.intField035_03 = intField035_03; }

    public Integer getIntField035_04() { return intField035_04; }
    public void setIntField035_04(Integer intField035_04) { this.intField035_04 = intField035_04; }

    public Integer getIntField035_05() { return intField035_05; }
    public void setIntField035_05(Integer intField035_05) { this.intField035_05 = intField035_05; }

    public Integer getIntField035_06() { return intField035_06; }
    public void setIntField035_06(Integer intField035_06) { this.intField035_06 = intField035_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV035)) return false;
        RegulatoryReportV035 that = (RegulatoryReportV035) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV035{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
