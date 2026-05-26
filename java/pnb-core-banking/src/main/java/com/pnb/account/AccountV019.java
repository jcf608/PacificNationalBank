package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV019 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV019")
public class AccountV019 {

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

    @Column(name = "FLD_019_00")
    private BigDecimal field019_00;

    @Column(name = "FLD_019_01")
    private BigDecimal field019_01;

    @Column(name = "FLD_019_02")
    private LocalDate field019_02;

    @Column(name = "FLD_019_03")
    private Boolean field019_03;

    @Column(name = "FLD_019_04")
    private String field019_04;

    @Column(name = "FLD_019_05")
    private LocalDate field019_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV019() {}

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

    public BigDecimal getField019_00() { return field019_00; }
    public void setField019_00(BigDecimal field019_00) { this.field019_00 = field019_00; }

    public BigDecimal getField019_01() { return field019_01; }
    public void setField019_01(BigDecimal field019_01) { this.field019_01 = field019_01; }

    public LocalDate getField019_02() { return field019_02; }
    public void setField019_02(LocalDate field019_02) { this.field019_02 = field019_02; }

    public Boolean getField019_03() { return field019_03; }
    public void setField019_03(Boolean field019_03) { this.field019_03 = field019_03; }

    public String getField019_04() { return field019_04; }
    public void setField019_04(String field019_04) { this.field019_04 = field019_04; }

    public LocalDate getField019_05() { return field019_05; }
    public void setField019_05(LocalDate field019_05) { this.field019_05 = field019_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV019)) return false;
        AccountV019 that = (AccountV019) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV019{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
