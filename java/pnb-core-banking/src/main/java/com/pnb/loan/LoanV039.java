package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV039")
public class LoanV039 {

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

    @Column(name = "FLD_039_00")
    private Integer field039_00;

    @Column(name = "FLD_039_01")
    private Boolean field039_01;

    @Column(name = "FLD_039_02")
    private BigDecimal field039_02;

    @Column(name = "FLD_039_03")
    private LocalDate field039_03;

    @Column(name = "FLD_039_04")
    private Boolean field039_04;

    @Column(name = "FLD_039_05")
    private Boolean field039_05;

    @Column(name = "FLD_039_06")
    private String field039_06;

    @Column(name = "FLD_039_07")
    private String field039_07;

    @Column(name = "FLD_039_08")
    private Integer field039_08;

    @Column(name = "FLD_039_09")
    private BigDecimal field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV039() {}

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

    public Integer getField039_00() { return field039_00; }
    public void setField039_00(Integer field039_00) { this.field039_00 = field039_00; }

    public Boolean getField039_01() { return field039_01; }
    public void setField039_01(Boolean field039_01) { this.field039_01 = field039_01; }

    public BigDecimal getField039_02() { return field039_02; }
    public void setField039_02(BigDecimal field039_02) { this.field039_02 = field039_02; }

    public LocalDate getField039_03() { return field039_03; }
    public void setField039_03(LocalDate field039_03) { this.field039_03 = field039_03; }

    public Boolean getField039_04() { return field039_04; }
    public void setField039_04(Boolean field039_04) { this.field039_04 = field039_04; }

    public Boolean getField039_05() { return field039_05; }
    public void setField039_05(Boolean field039_05) { this.field039_05 = field039_05; }

    public String getField039_06() { return field039_06; }
    public void setField039_06(String field039_06) { this.field039_06 = field039_06; }

    public String getField039_07() { return field039_07; }
    public void setField039_07(String field039_07) { this.field039_07 = field039_07; }

    public Integer getField039_08() { return field039_08; }
    public void setField039_08(Integer field039_08) { this.field039_08 = field039_08; }

    public BigDecimal getField039_09() { return field039_09; }
    public void setField039_09(BigDecimal field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV039)) return false;
        LoanV039 that = (LoanV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV039{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
