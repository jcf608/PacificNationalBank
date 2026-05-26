package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV014")
public class BranchTransactionV014 {

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

    @Column(name = "FLD_014_00")
    private LocalDate field014_00;

    @Column(name = "FLD_014_01")
    private String field014_01;

    @Column(name = "FLD_014_02")
    private LocalDate field014_02;

    @Column(name = "FLD_014_03")
    private Integer field014_03;

    @Column(name = "FLD_014_04")
    private LocalDate field014_04;

    @Column(name = "FLD_014_05")
    private BigDecimal field014_05;

    @Column(name = "FLD_014_06")
    private LocalDate field014_06;

    @Column(name = "FLD_014_07")
    private BigDecimal field014_07;

    @Column(name = "FLD_014_08")
    private Boolean field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV014() {}

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

    public LocalDate getField014_00() { return field014_00; }
    public void setField014_00(LocalDate field014_00) { this.field014_00 = field014_00; }

    public String getField014_01() { return field014_01; }
    public void setField014_01(String field014_01) { this.field014_01 = field014_01; }

    public LocalDate getField014_02() { return field014_02; }
    public void setField014_02(LocalDate field014_02) { this.field014_02 = field014_02; }

    public Integer getField014_03() { return field014_03; }
    public void setField014_03(Integer field014_03) { this.field014_03 = field014_03; }

    public LocalDate getField014_04() { return field014_04; }
    public void setField014_04(LocalDate field014_04) { this.field014_04 = field014_04; }

    public BigDecimal getField014_05() { return field014_05; }
    public void setField014_05(BigDecimal field014_05) { this.field014_05 = field014_05; }

    public LocalDate getField014_06() { return field014_06; }
    public void setField014_06(LocalDate field014_06) { this.field014_06 = field014_06; }

    public BigDecimal getField014_07() { return field014_07; }
    public void setField014_07(BigDecimal field014_07) { this.field014_07 = field014_07; }

    public Boolean getField014_08() { return field014_08; }
    public void setField014_08(Boolean field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV014)) return false;
        BranchTransactionV014 that = (BranchTransactionV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV014{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
