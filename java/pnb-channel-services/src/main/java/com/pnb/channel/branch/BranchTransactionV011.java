package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV011 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV011")
public class BranchTransactionV011 {

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

    @Column(name = "FLD_011_00")
    private Boolean field011_00;

    @Column(name = "FLD_011_01")
    private BigDecimal field011_01;

    @Column(name = "FLD_011_02")
    private BigDecimal field011_02;

    @Column(name = "FLD_011_03")
    private String field011_03;

    @Column(name = "FLD_011_04")
    private Integer field011_04;

    @Column(name = "FLD_011_05")
    private Integer field011_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV011() {}

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

    public Boolean getField011_00() { return field011_00; }
    public void setField011_00(Boolean field011_00) { this.field011_00 = field011_00; }

    public BigDecimal getField011_01() { return field011_01; }
    public void setField011_01(BigDecimal field011_01) { this.field011_01 = field011_01; }

    public BigDecimal getField011_02() { return field011_02; }
    public void setField011_02(BigDecimal field011_02) { this.field011_02 = field011_02; }

    public String getField011_03() { return field011_03; }
    public void setField011_03(String field011_03) { this.field011_03 = field011_03; }

    public Integer getField011_04() { return field011_04; }
    public void setField011_04(Integer field011_04) { this.field011_04 = field011_04; }

    public Integer getField011_05() { return field011_05; }
    public void setField011_05(Integer field011_05) { this.field011_05 = field011_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV011)) return false;
        BranchTransactionV011 that = (BranchTransactionV011) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV011{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
