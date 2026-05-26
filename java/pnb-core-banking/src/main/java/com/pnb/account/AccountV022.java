package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AccountV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ACCOUNTV022")
public class AccountV022 {

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

    @Column(name = "FLD_022_00")
    private LocalDate field022_00;

    @Column(name = "FLD_022_01")
    private String field022_01;

    @Column(name = "FLD_022_02")
    private Integer field022_02;

    @Column(name = "FLD_022_03")
    private Boolean field022_03;

    @Column(name = "FLD_022_04")
    private BigDecimal field022_04;

    @Column(name = "FLD_022_05")
    private Boolean field022_05;

    @Column(name = "FLD_022_06")
    private String field022_06;

    @Column(name = "FLD_022_07")
    private Integer field022_07;

    @Column(name = "FLD_022_08")
    private Boolean field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AccountV022() {}

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

    public LocalDate getField022_00() { return field022_00; }
    public void setField022_00(LocalDate field022_00) { this.field022_00 = field022_00; }

    public String getField022_01() { return field022_01; }
    public void setField022_01(String field022_01) { this.field022_01 = field022_01; }

    public Integer getField022_02() { return field022_02; }
    public void setField022_02(Integer field022_02) { this.field022_02 = field022_02; }

    public Boolean getField022_03() { return field022_03; }
    public void setField022_03(Boolean field022_03) { this.field022_03 = field022_03; }

    public BigDecimal getField022_04() { return field022_04; }
    public void setField022_04(BigDecimal field022_04) { this.field022_04 = field022_04; }

    public Boolean getField022_05() { return field022_05; }
    public void setField022_05(Boolean field022_05) { this.field022_05 = field022_05; }

    public String getField022_06() { return field022_06; }
    public void setField022_06(String field022_06) { this.field022_06 = field022_06; }

    public Integer getField022_07() { return field022_07; }
    public void setField022_07(Integer field022_07) { this.field022_07 = field022_07; }

    public Boolean getField022_08() { return field022_08; }
    public void setField022_08(Boolean field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountV022)) return false;
        AccountV022 that = (AccountV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AccountV022{" +
            "id=" + id +
            ", accountNumber=" + accountNumber +
            ", accountType=" + accountType +
            ", status=" + status +
            ", currentBalance=" + currentBalance +
            ", availableBalance=" + availableBalance +
            '}';
    }
}
