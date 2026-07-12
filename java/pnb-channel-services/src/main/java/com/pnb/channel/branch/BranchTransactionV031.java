package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV031")
public class BranchTransactionV031 {

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

    @Column(name = "FLD_031_00")
    private Integer field031_00;

    @Column(name = "FLD_031_01")
    private Boolean field031_01;

    @Column(name = "FLD_031_02")
    private String field031_02;

    @Column(name = "FLD_031_03")
    private Integer field031_03;

    @Column(name = "FLD_031_04")
    private Integer field031_04;

    @Column(name = "FLD_031_05")
    private BigDecimal field031_05;

    @Column(name = "FLD_031_06")
    private BigDecimal field031_06;

    @Column(name = "FLD_031_07")
    private LocalDate field031_07;

    @Column(name = "FLD_031_08")
    private Integer field031_08;

    @Column(name = "FLD_031_09")
    private LocalDate field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV031() {}

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

    public Integer getField031_00() { return field031_00; }
    public void setField031_00(Integer field031_00) { this.field031_00 = field031_00; }

    public Boolean getField031_01() { return field031_01; }
    public void setField031_01(Boolean field031_01) { this.field031_01 = field031_01; }

    public String getField031_02() { return field031_02; }
    public void setField031_02(String field031_02) { this.field031_02 = field031_02; }

    public Integer getField031_03() { return field031_03; }
    public void setField031_03(Integer field031_03) { this.field031_03 = field031_03; }

    public Integer getField031_04() { return field031_04; }
    public void setField031_04(Integer field031_04) { this.field031_04 = field031_04; }

    public BigDecimal getField031_05() { return field031_05; }
    public void setField031_05(BigDecimal field031_05) { this.field031_05 = field031_05; }

    public BigDecimal getField031_06() { return field031_06; }
    public void setField031_06(BigDecimal field031_06) { this.field031_06 = field031_06; }

    public LocalDate getField031_07() { return field031_07; }
    public void setField031_07(LocalDate field031_07) { this.field031_07 = field031_07; }

    public Integer getField031_08() { return field031_08; }
    public void setField031_08(Integer field031_08) { this.field031_08 = field031_08; }

    public LocalDate getField031_09() { return field031_09; }
    public void setField031_09(LocalDate field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV031)) return false;
        BranchTransactionV031 that = (BranchTransactionV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV031{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
