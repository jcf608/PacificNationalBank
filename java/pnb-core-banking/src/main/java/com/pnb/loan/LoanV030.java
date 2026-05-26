package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV030")
public class LoanV030 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LOAN_NUM", unique = true)
    private String loanNumber;

    @Column(name = "LOAN_TYPE")
    private String loanType;

    @Column(name = "ORIG_AMT", precision = 15, scale = 2)
    private BigDecimal originalAmount;

    @Column(name = "CURR_BAL", precision = 15, scale = 2)
    private BigDecimal currentBalance;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "MONTHLY_PMT", precision = 13, scale = 2)
    private BigDecimal monthlyPayment;

    @Column(name = "MATURITY_DATE")
    private LocalDate maturityDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DPD")
    private Integer daysDelinquent;

    @Column(name = "FLD_030_00")
    private BigDecimal field030_00;

    @Column(name = "FLD_030_01")
    private BigDecimal field030_01;

    @Column(name = "FLD_030_02")
    private String field030_02;

    @Column(name = "FLD_030_03")
    private Integer field030_03;

    @Column(name = "FLD_030_04")
    private String field030_04;

    @Column(name = "FLD_030_05")
    private Boolean field030_05;

    @Column(name = "FLD_030_06")
    private Boolean field030_06;

    @Column(name = "FLD_030_07")
    private BigDecimal field030_07;

    @Column(name = "FLD_030_08")
    private Boolean field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV030() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLoanNumber() { return loanNumber; }
    public void setLoanNumber(String loanNumber) { this.loanNumber = loanNumber; }

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public BigDecimal getOriginalAmount() { return originalAmount; }
    public void setOriginalAmount(BigDecimal originalAmount) { this.originalAmount = originalAmount; }

    public BigDecimal getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(BigDecimal currentBalance) { this.currentBalance = currentBalance; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public BigDecimal getMonthlyPayment() { return monthlyPayment; }
    public void setMonthlyPayment(BigDecimal monthlyPayment) { this.monthlyPayment = monthlyPayment; }

    public LocalDate getMaturityDate() { return maturityDate; }
    public void setMaturityDate(LocalDate maturityDate) { this.maturityDate = maturityDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getDaysDelinquent() { return daysDelinquent; }
    public void setDaysDelinquent(Integer daysDelinquent) { this.daysDelinquent = daysDelinquent; }

    public BigDecimal getField030_00() { return field030_00; }
    public void setField030_00(BigDecimal field030_00) { this.field030_00 = field030_00; }

    public BigDecimal getField030_01() { return field030_01; }
    public void setField030_01(BigDecimal field030_01) { this.field030_01 = field030_01; }

    public String getField030_02() { return field030_02; }
    public void setField030_02(String field030_02) { this.field030_02 = field030_02; }

    public Integer getField030_03() { return field030_03; }
    public void setField030_03(Integer field030_03) { this.field030_03 = field030_03; }

    public String getField030_04() { return field030_04; }
    public void setField030_04(String field030_04) { this.field030_04 = field030_04; }

    public Boolean getField030_05() { return field030_05; }
    public void setField030_05(Boolean field030_05) { this.field030_05 = field030_05; }

    public Boolean getField030_06() { return field030_06; }
    public void setField030_06(Boolean field030_06) { this.field030_06 = field030_06; }

    public BigDecimal getField030_07() { return field030_07; }
    public void setField030_07(BigDecimal field030_07) { this.field030_07 = field030_07; }

    public Boolean getField030_08() { return field030_08; }
    public void setField030_08(Boolean field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV030)) return false;
        LoanV030 that = (LoanV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV030{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
