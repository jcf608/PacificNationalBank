package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV030")
public class AccountV030 {

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

    public AccountV030() {}

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
        if (!(o instanceof AccountV030)) return false;
        AccountV030 that = (AccountV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV030{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
