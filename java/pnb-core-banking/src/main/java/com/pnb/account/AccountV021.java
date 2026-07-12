package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV021 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV021")
public class AccountV021 {

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

    @Column(name = "FLD_021_00")
    private String field021_00;

    @Column(name = "FLD_021_01")
    private BigDecimal field021_01;

    @Column(name = "FLD_021_02")
    private Boolean field021_02;

    @Column(name = "FLD_021_03")
    private LocalDate field021_03;

    @Column(name = "FLD_021_04")
    private String field021_04;

    @Column(name = "FLD_021_05")
    private LocalDate field021_05;

    @Column(name = "FLD_021_06")
    private BigDecimal field021_06;

    @Column(name = "FLD_021_07")
    private Boolean field021_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV021() {}

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

    public String getField021_00() { return field021_00; }
    public void setField021_00(String field021_00) { this.field021_00 = field021_00; }

    public BigDecimal getField021_01() { return field021_01; }
    public void setField021_01(BigDecimal field021_01) { this.field021_01 = field021_01; }

    public Boolean getField021_02() { return field021_02; }
    public void setField021_02(Boolean field021_02) { this.field021_02 = field021_02; }

    public LocalDate getField021_03() { return field021_03; }
    public void setField021_03(LocalDate field021_03) { this.field021_03 = field021_03; }

    public String getField021_04() { return field021_04; }
    public void setField021_04(String field021_04) { this.field021_04 = field021_04; }

    public LocalDate getField021_05() { return field021_05; }
    public void setField021_05(LocalDate field021_05) { this.field021_05 = field021_05; }

    public BigDecimal getField021_06() { return field021_06; }
    public void setField021_06(BigDecimal field021_06) { this.field021_06 = field021_06; }

    public Boolean getField021_07() { return field021_07; }
    public void setField021_07(Boolean field021_07) { this.field021_07 = field021_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV021)) return false;
        AccountV021 that = (AccountV021) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV021{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
