package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV030")
public class BranchTransactionV030 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @Column(name = "TELLER_ID")
    private String tellerId;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CASH_AMT", precision = 13, scale = 2)
    private BigDecimal cashAmount;

    @Column(name = "CHECK_AMT", precision = 13, scale = 2)
    private BigDecimal checkAmount;

    @Column(name = "FLD_030_00")
    private String field030_00;

    @Column(name = "FLD_030_01")
    private String field030_01;

    @Column(name = "FLD_030_02")
    private String field030_02;

    @Column(name = "FLD_030_03")
    private String field030_03;

    @Column(name = "FLD_030_04")
    private String field030_04;

    @Column(name = "FLD_030_05")
    private BigDecimal field030_05;

    @Column(name = "FLD_030_06")
    private Boolean field030_06;

    @Column(name = "FLD_030_07")
    private String field030_07;

    @Column(name = "FLD_030_08")
    private Integer field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV030() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getTellerId() { return tellerId; }
    public void setTellerId(String tellerId) { this.tellerId = tellerId; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public BigDecimal getCashAmount() { return cashAmount; }
    public void setCashAmount(BigDecimal cashAmount) { this.cashAmount = cashAmount; }

    public BigDecimal getCheckAmount() { return checkAmount; }
    public void setCheckAmount(BigDecimal checkAmount) { this.checkAmount = checkAmount; }

    public String getField030_00() { return field030_00; }
    public void setField030_00(String field030_00) { this.field030_00 = field030_00; }

    public String getField030_01() { return field030_01; }
    public void setField030_01(String field030_01) { this.field030_01 = field030_01; }

    public String getField030_02() { return field030_02; }
    public void setField030_02(String field030_02) { this.field030_02 = field030_02; }

    public String getField030_03() { return field030_03; }
    public void setField030_03(String field030_03) { this.field030_03 = field030_03; }

    public String getField030_04() { return field030_04; }
    public void setField030_04(String field030_04) { this.field030_04 = field030_04; }

    public BigDecimal getField030_05() { return field030_05; }
    public void setField030_05(BigDecimal field030_05) { this.field030_05 = field030_05; }

    public Boolean getField030_06() { return field030_06; }
    public void setField030_06(Boolean field030_06) { this.field030_06 = field030_06; }

    public String getField030_07() { return field030_07; }
    public void setField030_07(String field030_07) { this.field030_07 = field030_07; }

    public Integer getField030_08() { return field030_08; }
    public void setField030_08(Integer field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV030)) return false;
        BranchTransactionV030 that = (BranchTransactionV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV030{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
