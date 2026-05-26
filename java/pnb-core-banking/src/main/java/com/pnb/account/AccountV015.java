package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV015")
public class AccountV015 {

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

    @Column(name = "FLD_015_00")
    private LocalDate field015_00;

    @Column(name = "FLD_015_01")
    private LocalDate field015_01;

    @Column(name = "FLD_015_02")
    private LocalDate field015_02;

    @Column(name = "FLD_015_03")
    private BigDecimal field015_03;

    @Column(name = "FLD_015_04")
    private Integer field015_04;

    @Column(name = "FLD_015_05")
    private BigDecimal field015_05;

    @Column(name = "FLD_015_06")
    private BigDecimal field015_06;

    @Column(name = "FLD_015_07")
    private Boolean field015_07;

    @Column(name = "FLD_015_08")
    private Boolean field015_08;

    @Column(name = "FLD_015_09")
    private Integer field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV015() {}

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

    public LocalDate getField015_00() { return field015_00; }
    public void setField015_00(LocalDate field015_00) { this.field015_00 = field015_00; }

    public LocalDate getField015_01() { return field015_01; }
    public void setField015_01(LocalDate field015_01) { this.field015_01 = field015_01; }

    public LocalDate getField015_02() { return field015_02; }
    public void setField015_02(LocalDate field015_02) { this.field015_02 = field015_02; }

    public BigDecimal getField015_03() { return field015_03; }
    public void setField015_03(BigDecimal field015_03) { this.field015_03 = field015_03; }

    public Integer getField015_04() { return field015_04; }
    public void setField015_04(Integer field015_04) { this.field015_04 = field015_04; }

    public BigDecimal getField015_05() { return field015_05; }
    public void setField015_05(BigDecimal field015_05) { this.field015_05 = field015_05; }

    public BigDecimal getField015_06() { return field015_06; }
    public void setField015_06(BigDecimal field015_06) { this.field015_06 = field015_06; }

    public Boolean getField015_07() { return field015_07; }
    public void setField015_07(Boolean field015_07) { this.field015_07 = field015_07; }

    public Boolean getField015_08() { return field015_08; }
    public void setField015_08(Boolean field015_08) { this.field015_08 = field015_08; }

    public Integer getField015_09() { return field015_09; }
    public void setField015_09(Integer field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV015)) return false;
        AccountV015 that = (AccountV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV015{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
