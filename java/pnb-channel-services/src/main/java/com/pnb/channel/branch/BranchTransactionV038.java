package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV038")
public class BranchTransactionV038 {

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

    @Column(name = "FLD_038_00")
    private LocalDate field038_00;

    @Column(name = "FLD_038_01")
    private LocalDate field038_01;

    @Column(name = "FLD_038_02")
    private BigDecimal field038_02;

    @Column(name = "FLD_038_03")
    private String field038_03;

    @Column(name = "FLD_038_04")
    private Boolean field038_04;

    @Column(name = "FLD_038_05")
    private LocalDate field038_05;

    @Column(name = "FLD_038_06")
    private String field038_06;

    @Column(name = "FLD_038_07")
    private String field038_07;

    @Column(name = "FLD_038_08")
    private BigDecimal field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV038() {}

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

    public LocalDate getField038_00() { return field038_00; }
    public void setField038_00(LocalDate field038_00) { this.field038_00 = field038_00; }

    public LocalDate getField038_01() { return field038_01; }
    public void setField038_01(LocalDate field038_01) { this.field038_01 = field038_01; }

    public BigDecimal getField038_02() { return field038_02; }
    public void setField038_02(BigDecimal field038_02) { this.field038_02 = field038_02; }

    public String getField038_03() { return field038_03; }
    public void setField038_03(String field038_03) { this.field038_03 = field038_03; }

    public Boolean getField038_04() { return field038_04; }
    public void setField038_04(Boolean field038_04) { this.field038_04 = field038_04; }

    public LocalDate getField038_05() { return field038_05; }
    public void setField038_05(LocalDate field038_05) { this.field038_05 = field038_05; }

    public String getField038_06() { return field038_06; }
    public void setField038_06(String field038_06) { this.field038_06 = field038_06; }

    public String getField038_07() { return field038_07; }
    public void setField038_07(String field038_07) { this.field038_07 = field038_07; }

    public BigDecimal getField038_08() { return field038_08; }
    public void setField038_08(BigDecimal field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV038)) return false;
        BranchTransactionV038 that = (BranchTransactionV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV038{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
