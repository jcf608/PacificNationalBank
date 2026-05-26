package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV006")
public class BranchTransactionV006 {

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

    @Column(name = "FLD_006_00")
    private LocalDate field006_00;

    @Column(name = "FLD_006_01")
    private Integer field006_01;

    @Column(name = "FLD_006_02")
    private BigDecimal field006_02;

    @Column(name = "FLD_006_03")
    private Integer field006_03;

    @Column(name = "FLD_006_04")
    private Boolean field006_04;

    @Column(name = "FLD_006_05")
    private LocalDate field006_05;

    @Column(name = "FLD_006_06")
    private BigDecimal field006_06;

    @Column(name = "FLD_006_07")
    private Integer field006_07;

    @Column(name = "FLD_006_08")
    private LocalDate field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV006() {}

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

    public LocalDate getField006_00() { return field006_00; }
    public void setField006_00(LocalDate field006_00) { this.field006_00 = field006_00; }

    public Integer getField006_01() { return field006_01; }
    public void setField006_01(Integer field006_01) { this.field006_01 = field006_01; }

    public BigDecimal getField006_02() { return field006_02; }
    public void setField006_02(BigDecimal field006_02) { this.field006_02 = field006_02; }

    public Integer getField006_03() { return field006_03; }
    public void setField006_03(Integer field006_03) { this.field006_03 = field006_03; }

    public Boolean getField006_04() { return field006_04; }
    public void setField006_04(Boolean field006_04) { this.field006_04 = field006_04; }

    public LocalDate getField006_05() { return field006_05; }
    public void setField006_05(LocalDate field006_05) { this.field006_05 = field006_05; }

    public BigDecimal getField006_06() { return field006_06; }
    public void setField006_06(BigDecimal field006_06) { this.field006_06 = field006_06; }

    public Integer getField006_07() { return field006_07; }
    public void setField006_07(Integer field006_07) { this.field006_07 = field006_07; }

    public LocalDate getField006_08() { return field006_08; }
    public void setField006_08(LocalDate field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV006)) return false;
        BranchTransactionV006 that = (BranchTransactionV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV006{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
