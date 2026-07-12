package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV007")
public class AccountV007 {

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

    @Column(name = "FLD_007_00")
    private String field007_00;

    @Column(name = "FLD_007_01")
    private BigDecimal field007_01;

    @Column(name = "FLD_007_02")
    private Integer field007_02;

    @Column(name = "FLD_007_03")
    private Integer field007_03;

    @Column(name = "FLD_007_04")
    private Integer field007_04;

    @Column(name = "FLD_007_05")
    private Integer field007_05;

    @Column(name = "FLD_007_06")
    private LocalDate field007_06;

    @Column(name = "FLD_007_07")
    private Boolean field007_07;

    @Column(name = "FLD_007_08")
    private Boolean field007_08;

    @Column(name = "FLD_007_09")
    private BigDecimal field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV007() {}

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

    public String getField007_00() { return field007_00; }
    public void setField007_00(String field007_00) { this.field007_00 = field007_00; }

    public BigDecimal getField007_01() { return field007_01; }
    public void setField007_01(BigDecimal field007_01) { this.field007_01 = field007_01; }

    public Integer getField007_02() { return field007_02; }
    public void setField007_02(Integer field007_02) { this.field007_02 = field007_02; }

    public Integer getField007_03() { return field007_03; }
    public void setField007_03(Integer field007_03) { this.field007_03 = field007_03; }

    public Integer getField007_04() { return field007_04; }
    public void setField007_04(Integer field007_04) { this.field007_04 = field007_04; }

    public Integer getField007_05() { return field007_05; }
    public void setField007_05(Integer field007_05) { this.field007_05 = field007_05; }

    public LocalDate getField007_06() { return field007_06; }
    public void setField007_06(LocalDate field007_06) { this.field007_06 = field007_06; }

    public Boolean getField007_07() { return field007_07; }
    public void setField007_07(Boolean field007_07) { this.field007_07 = field007_07; }

    public Boolean getField007_08() { return field007_08; }
    public void setField007_08(Boolean field007_08) { this.field007_08 = field007_08; }

    public BigDecimal getField007_09() { return field007_09; }
    public void setField007_09(BigDecimal field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV007)) return false;
        AccountV007 that = (AccountV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV007{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
