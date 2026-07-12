package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV028")
public class RegulatoryReportV028 {

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

    @Column(name = "INT_FLD_028_00")
    private Integer intField028_00;

    @Column(name = "INT_FLD_028_01")
    private Integer intField028_01;

    @Column(name = "INT_FLD_028_02")
    private LocalDate intField028_02;

    @Column(name = "INT_FLD_028_03")
    private Integer intField028_03;

    @Column(name = "INT_FLD_028_04")
    private LocalDate intField028_04;

    @Column(name = "INT_FLD_028_05")
    private BigDecimal intField028_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV028() {}

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

    public Integer getIntField028_00() { return intField028_00; }
    public void setIntField028_00(Integer intField028_00) { this.intField028_00 = intField028_00; }

    public Integer getIntField028_01() { return intField028_01; }
    public void setIntField028_01(Integer intField028_01) { this.intField028_01 = intField028_01; }

    public LocalDate getIntField028_02() { return intField028_02; }
    public void setIntField028_02(LocalDate intField028_02) { this.intField028_02 = intField028_02; }

    public Integer getIntField028_03() { return intField028_03; }
    public void setIntField028_03(Integer intField028_03) { this.intField028_03 = intField028_03; }

    public LocalDate getIntField028_04() { return intField028_04; }
    public void setIntField028_04(LocalDate intField028_04) { this.intField028_04 = intField028_04; }

    public BigDecimal getIntField028_05() { return intField028_05; }
    public void setIntField028_05(BigDecimal intField028_05) { this.intField028_05 = intField028_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV028)) return false;
        RegulatoryReportV028 that = (RegulatoryReportV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV028{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
