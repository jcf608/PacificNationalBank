package com.pnb.loan;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * LoanV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "LOANV031")
public class LoanV031 {

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

    @Column(name = "FLD_031_00")
    private BigDecimal field031_00;

    @Column(name = "FLD_031_01")
    private String field031_01;

    @Column(name = "FLD_031_02")
    private String field031_02;

    @Column(name = "FLD_031_03")
    private String field031_03;

    @Column(name = "FLD_031_04")
    private BigDecimal field031_04;

    @Column(name = "FLD_031_05")
    private String field031_05;

    @Column(name = "FLD_031_06")
    private String field031_06;

    @Column(name = "FLD_031_07")
    private Integer field031_07;

    @Column(name = "FLD_031_08")
    private String field031_08;

    @Column(name = "FLD_031_09")
    private Boolean field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public LoanV031() {}

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

    public BigDecimal getField031_00() { return field031_00; }
    public void setField031_00(BigDecimal field031_00) { this.field031_00 = field031_00; }

    public String getField031_01() { return field031_01; }
    public void setField031_01(String field031_01) { this.field031_01 = field031_01; }

    public String getField031_02() { return field031_02; }
    public void setField031_02(String field031_02) { this.field031_02 = field031_02; }

    public String getField031_03() { return field031_03; }
    public void setField031_03(String field031_03) { this.field031_03 = field031_03; }

    public BigDecimal getField031_04() { return field031_04; }
    public void setField031_04(BigDecimal field031_04) { this.field031_04 = field031_04; }

    public String getField031_05() { return field031_05; }
    public void setField031_05(String field031_05) { this.field031_05 = field031_05; }

    public String getField031_06() { return field031_06; }
    public void setField031_06(String field031_06) { this.field031_06 = field031_06; }

    public Integer getField031_07() { return field031_07; }
    public void setField031_07(Integer field031_07) { this.field031_07 = field031_07; }

    public String getField031_08() { return field031_08; }
    public void setField031_08(String field031_08) { this.field031_08 = field031_08; }

    public Boolean getField031_09() { return field031_09; }
    public void setField031_09(Boolean field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoanV031)) return false;
        LoanV031 that = (LoanV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "LoanV031{" +
            "id=" + id +
            ", loanNumber=" + loanNumber +
            ", loanType=" + loanType +
            ", originalAmount=" + originalAmount +
            ", currentBalance=" + currentBalance +
            ", interestRate=" + interestRate +
            '}';
    }
}
