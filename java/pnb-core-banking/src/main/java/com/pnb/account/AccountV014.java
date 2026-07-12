package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV014")
public class AccountV014 {

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

    @Column(name = "FLD_014_00")
    private BigDecimal field014_00;

    @Column(name = "FLD_014_01")
    private BigDecimal field014_01;

    @Column(name = "FLD_014_02")
    private Boolean field014_02;

    @Column(name = "FLD_014_03")
    private String field014_03;

    @Column(name = "FLD_014_04")
    private BigDecimal field014_04;

    @Column(name = "FLD_014_05")
    private Integer field014_05;

    @Column(name = "FLD_014_06")
    private Boolean field014_06;

    @Column(name = "FLD_014_07")
    private Boolean field014_07;

    @Column(name = "FLD_014_08")
    private Integer field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV014() {}

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

    public BigDecimal getField014_00() { return field014_00; }
    public void setField014_00(BigDecimal field014_00) { this.field014_00 = field014_00; }

    public BigDecimal getField014_01() { return field014_01; }
    public void setField014_01(BigDecimal field014_01) { this.field014_01 = field014_01; }

    public Boolean getField014_02() { return field014_02; }
    public void setField014_02(Boolean field014_02) { this.field014_02 = field014_02; }

    public String getField014_03() { return field014_03; }
    public void setField014_03(String field014_03) { this.field014_03 = field014_03; }

    public BigDecimal getField014_04() { return field014_04; }
    public void setField014_04(BigDecimal field014_04) { this.field014_04 = field014_04; }

    public Integer getField014_05() { return field014_05; }
    public void setField014_05(Integer field014_05) { this.field014_05 = field014_05; }

    public Boolean getField014_06() { return field014_06; }
    public void setField014_06(Boolean field014_06) { this.field014_06 = field014_06; }

    public Boolean getField014_07() { return field014_07; }
    public void setField014_07(Boolean field014_07) { this.field014_07 = field014_07; }

    public Integer getField014_08() { return field014_08; }
    public void setField014_08(Integer field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV014)) return false;
        AccountV014 that = (AccountV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV014{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
