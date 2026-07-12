package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV023 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV023")
public class AccountV023 {

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

    @Column(name = "FLD_023_00")
    private String field023_00;

    @Column(name = "FLD_023_01")
    private String field023_01;

    @Column(name = "FLD_023_02")
    private Boolean field023_02;

    @Column(name = "FLD_023_03")
    private String field023_03;

    @Column(name = "FLD_023_04")
    private String field023_04;

    @Column(name = "FLD_023_05")
    private Integer field023_05;

    @Column(name = "FLD_023_06")
    private BigDecimal field023_06;

    @Column(name = "FLD_023_07")
    private BigDecimal field023_07;

    @Column(name = "FLD_023_08")
    private LocalDate field023_08;

    @Column(name = "FLD_023_09")
    private Integer field023_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV023() {}

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

    public String getField023_00() { return field023_00; }
    public void setField023_00(String field023_00) { this.field023_00 = field023_00; }

    public String getField023_01() { return field023_01; }
    public void setField023_01(String field023_01) { this.field023_01 = field023_01; }

    public Boolean getField023_02() { return field023_02; }
    public void setField023_02(Boolean field023_02) { this.field023_02 = field023_02; }

    public String getField023_03() { return field023_03; }
    public void setField023_03(String field023_03) { this.field023_03 = field023_03; }

    public String getField023_04() { return field023_04; }
    public void setField023_04(String field023_04) { this.field023_04 = field023_04; }

    public Integer getField023_05() { return field023_05; }
    public void setField023_05(Integer field023_05) { this.field023_05 = field023_05; }

    public BigDecimal getField023_06() { return field023_06; }
    public void setField023_06(BigDecimal field023_06) { this.field023_06 = field023_06; }

    public BigDecimal getField023_07() { return field023_07; }
    public void setField023_07(BigDecimal field023_07) { this.field023_07 = field023_07; }

    public LocalDate getField023_08() { return field023_08; }
    public void setField023_08(LocalDate field023_08) { this.field023_08 = field023_08; }

    public Integer getField023_09() { return field023_09; }
    public void setField023_09(Integer field023_09) { this.field023_09 = field023_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV023)) return false;
        AccountV023 that = (AccountV023) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV023{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
