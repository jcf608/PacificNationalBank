package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV039")
public class AccountV039 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ACCT_NUM", unique = true)
    @NotBlank
    private String accountNumber;

    @Column(name = "ACCT_TYPE")
    private String accountType;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CURR_BAL", precision = 15, scale = 2)
    private BigDecimal currentBalance;

    @Column(name = "AVAIL_BAL", precision = 15, scale = 2)
    private BigDecimal availableBalance;

    @Column(name = "INT_RATE", precision = 9, scale = 6)
    private BigDecimal interestRate;

    @Column(name = "OPEN_DATE")
    private LocalDate openDate;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "CURRENCY")
    private String currencyCode;

    @Column(name = "FLD_039_00")
    private Boolean field039_00;

    @Column(name = "FLD_039_01")
    private String field039_01;

    @Column(name = "FLD_039_02")
    private String field039_02;

    @Column(name = "FLD_039_03")
    private BigDecimal field039_03;

    @Column(name = "FLD_039_04")
    private BigDecimal field039_04;

    @Column(name = "FLD_039_05")
    private LocalDate field039_05;

    @Column(name = "FLD_039_06")
    private LocalDate field039_06;

    @Column(name = "FLD_039_07")
    private LocalDate field039_07;

    @Column(name = "FLD_039_08")
    private BigDecimal field039_08;

    @Column(name = "FLD_039_09")
    private LocalDate field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV039() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BigDecimal getCurrentBalance() { return currentBalance; }
    public void setCurrentBalance(BigDecimal currentBalance) { this.currentBalance = currentBalance; }

    public BigDecimal getAvailableBalance() { return availableBalance; }
    public void setAvailableBalance(BigDecimal availableBalance) { this.availableBalance = availableBalance; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDate getOpenDate() { return openDate; }
    public void setOpenDate(LocalDate openDate) { this.openDate = openDate; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getCurrencyCode() { return currencyCode; }
    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }

    public Boolean getField039_00() { return field039_00; }
    public void setField039_00(Boolean field039_00) { this.field039_00 = field039_00; }

    public String getField039_01() { return field039_01; }
    public void setField039_01(String field039_01) { this.field039_01 = field039_01; }

    public String getField039_02() { return field039_02; }
    public void setField039_02(String field039_02) { this.field039_02 = field039_02; }

    public BigDecimal getField039_03() { return field039_03; }
    public void setField039_03(BigDecimal field039_03) { this.field039_03 = field039_03; }

    public BigDecimal getField039_04() { return field039_04; }
    public void setField039_04(BigDecimal field039_04) { this.field039_04 = field039_04; }

    public LocalDate getField039_05() { return field039_05; }
    public void setField039_05(LocalDate field039_05) { this.field039_05 = field039_05; }

    public LocalDate getField039_06() { return field039_06; }
    public void setField039_06(LocalDate field039_06) { this.field039_06 = field039_06; }

    public LocalDate getField039_07() { return field039_07; }
    public void setField039_07(LocalDate field039_07) { this.field039_07 = field039_07; }

    public BigDecimal getField039_08() { return field039_08; }
    public void setField039_08(BigDecimal field039_08) { this.field039_08 = field039_08; }

    public LocalDate getField039_09() { return field039_09; }
    public void setField039_09(LocalDate field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV039)) return false;
        AccountV039 that = (AccountV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV039{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
