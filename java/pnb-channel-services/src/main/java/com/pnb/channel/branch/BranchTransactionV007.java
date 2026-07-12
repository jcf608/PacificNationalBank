package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV007")
public class BranchTransactionV007 {

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

    @Column(name = "FLD_007_00")
    private BigDecimal field007_00;

    @Column(name = "FLD_007_01")
    private Boolean field007_01;

    @Column(name = "FLD_007_02")
    private BigDecimal field007_02;

    @Column(name = "FLD_007_03")
    private String field007_03;

    @Column(name = "FLD_007_04")
    private BigDecimal field007_04;

    @Column(name = "FLD_007_05")
    private Boolean field007_05;

    @Column(name = "FLD_007_06")
    private BigDecimal field007_06;

    @Column(name = "FLD_007_07")
    private String field007_07;

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

    public BranchTransactionV007() {}

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

    public BigDecimal getField007_00() { return field007_00; }
    public void setField007_00(BigDecimal field007_00) { this.field007_00 = field007_00; }

    public Boolean getField007_01() { return field007_01; }
    public void setField007_01(Boolean field007_01) { this.field007_01 = field007_01; }

    public BigDecimal getField007_02() { return field007_02; }
    public void setField007_02(BigDecimal field007_02) { this.field007_02 = field007_02; }

    public String getField007_03() { return field007_03; }
    public void setField007_03(String field007_03) { this.field007_03 = field007_03; }

    public BigDecimal getField007_04() { return field007_04; }
    public void setField007_04(BigDecimal field007_04) { this.field007_04 = field007_04; }

    public Boolean getField007_05() { return field007_05; }
    public void setField007_05(Boolean field007_05) { this.field007_05 = field007_05; }

    public BigDecimal getField007_06() { return field007_06; }
    public void setField007_06(BigDecimal field007_06) { this.field007_06 = field007_06; }

    public String getField007_07() { return field007_07; }
    public void setField007_07(String field007_07) { this.field007_07 = field007_07; }

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
        if (!(o instanceof BranchTransactionV007)) return false;
        BranchTransactionV007 that = (BranchTransactionV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV007{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
