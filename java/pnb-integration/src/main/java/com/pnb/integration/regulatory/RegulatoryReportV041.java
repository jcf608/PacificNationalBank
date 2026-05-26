package com.pnb.integration.regulatory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * RegulatoryReportV041 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "REGULATORYREPORTV041")
public class RegulatoryReportV041 {

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

    @Column(name = "INT_FLD_041_00")
    private LocalDate intField041_00;

    @Column(name = "INT_FLD_041_01")
    private Integer intField041_01;

    @Column(name = "INT_FLD_041_02")
    private Integer intField041_02;

    @Column(name = "INT_FLD_041_03")
    private String intField041_03;

    @Column(name = "INT_FLD_041_04")
    private BigDecimal intField041_04;

    @Column(name = "INT_FLD_041_05")
    private Integer intField041_05;

    @Column(name = "INT_FLD_041_06")
    private BigDecimal intField041_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public RegulatoryReportV041() {}

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

    public LocalDate getIntField041_00() { return intField041_00; }
    public void setIntField041_00(LocalDate intField041_00) { this.intField041_00 = intField041_00; }

    public Integer getIntField041_01() { return intField041_01; }
    public void setIntField041_01(Integer intField041_01) { this.intField041_01 = intField041_01; }

    public Integer getIntField041_02() { return intField041_02; }
    public void setIntField041_02(Integer intField041_02) { this.intField041_02 = intField041_02; }

    public String getIntField041_03() { return intField041_03; }
    public void setIntField041_03(String intField041_03) { this.intField041_03 = intField041_03; }

    public BigDecimal getIntField041_04() { return intField041_04; }
    public void setIntField041_04(BigDecimal intField041_04) { this.intField041_04 = intField041_04; }

    public Integer getIntField041_05() { return intField041_05; }
    public void setIntField041_05(Integer intField041_05) { this.intField041_05 = intField041_05; }

    public BigDecimal getIntField041_06() { return intField041_06; }
    public void setIntField041_06(BigDecimal intField041_06) { this.intField041_06 = intField041_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegulatoryReportV041)) return false;
        RegulatoryReportV041 that = (RegulatoryReportV041) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "RegulatoryReportV041{" +
            "id=" + id +
            ", reportId=" + reportId +
            ", reportType=" + reportType +
            ", periodStart=" + periodStart +
            ", periodEnd=" + periodEnd +
            ", status=" + status +
            '}';
    }
}
