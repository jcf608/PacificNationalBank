package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV029")
public class BranchTransactionV029 {

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

    @Column(name = "FLD_029_00")
    private BigDecimal field029_00;

    @Column(name = "FLD_029_01")
    private Boolean field029_01;

    @Column(name = "FLD_029_02")
    private Boolean field029_02;

    @Column(name = "FLD_029_03")
    private String field029_03;

    @Column(name = "FLD_029_04")
    private LocalDate field029_04;

    @Column(name = "FLD_029_05")
    private LocalDate field029_05;

    @Column(name = "FLD_029_06")
    private String field029_06;

    @Column(name = "FLD_029_07")
    private Integer field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV029() {}

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

    public BigDecimal getField029_00() { return field029_00; }
    public void setField029_00(BigDecimal field029_00) { this.field029_00 = field029_00; }

    public Boolean getField029_01() { return field029_01; }
    public void setField029_01(Boolean field029_01) { this.field029_01 = field029_01; }

    public Boolean getField029_02() { return field029_02; }
    public void setField029_02(Boolean field029_02) { this.field029_02 = field029_02; }

    public String getField029_03() { return field029_03; }
    public void setField029_03(String field029_03) { this.field029_03 = field029_03; }

    public LocalDate getField029_04() { return field029_04; }
    public void setField029_04(LocalDate field029_04) { this.field029_04 = field029_04; }

    public LocalDate getField029_05() { return field029_05; }
    public void setField029_05(LocalDate field029_05) { this.field029_05 = field029_05; }

    public String getField029_06() { return field029_06; }
    public void setField029_06(String field029_06) { this.field029_06 = field029_06; }

    public Integer getField029_07() { return field029_07; }
    public void setField029_07(Integer field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV029)) return false;
        BranchTransactionV029 that = (BranchTransactionV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV029{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
