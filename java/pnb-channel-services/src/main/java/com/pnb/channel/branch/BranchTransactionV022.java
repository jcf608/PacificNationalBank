package com.pnb.channel.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * BranchTransactionV022 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "BRANCHTRANSACTIONV022")
public class BranchTransactionV022 {

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

    @Column(name = "FLD_022_00")
    private String field022_00;

    @Column(name = "FLD_022_01")
    private BigDecimal field022_01;

    @Column(name = "FLD_022_02")
    private LocalDate field022_02;

    @Column(name = "FLD_022_03")
    private BigDecimal field022_03;

    @Column(name = "FLD_022_04")
    private LocalDate field022_04;

    @Column(name = "FLD_022_05")
    private Integer field022_05;

    @Column(name = "FLD_022_06")
    private Boolean field022_06;

    @Column(name = "FLD_022_07")
    private LocalDate field022_07;

    @Column(name = "FLD_022_08")
    private BigDecimal field022_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public BranchTransactionV022() {}

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

    public String getField022_00() { return field022_00; }
    public void setField022_00(String field022_00) { this.field022_00 = field022_00; }

    public BigDecimal getField022_01() { return field022_01; }
    public void setField022_01(BigDecimal field022_01) { this.field022_01 = field022_01; }

    public LocalDate getField022_02() { return field022_02; }
    public void setField022_02(LocalDate field022_02) { this.field022_02 = field022_02; }

    public BigDecimal getField022_03() { return field022_03; }
    public void setField022_03(BigDecimal field022_03) { this.field022_03 = field022_03; }

    public LocalDate getField022_04() { return field022_04; }
    public void setField022_04(LocalDate field022_04) { this.field022_04 = field022_04; }

    public Integer getField022_05() { return field022_05; }
    public void setField022_05(Integer field022_05) { this.field022_05 = field022_05; }

    public Boolean getField022_06() { return field022_06; }
    public void setField022_06(Boolean field022_06) { this.field022_06 = field022_06; }

    public LocalDate getField022_07() { return field022_07; }
    public void setField022_07(LocalDate field022_07) { this.field022_07 = field022_07; }

    public BigDecimal getField022_08() { return field022_08; }
    public void setField022_08(BigDecimal field022_08) { this.field022_08 = field022_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BranchTransactionV022)) return false;
        BranchTransactionV022 that = (BranchTransactionV022) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "BranchTransactionV022{" +
            "id=" + id +
            ", branchCode=" + branchCode +
            ", tellerId=" + tellerId +
            ", accountNumber=" + accountNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            '}';
    }
}
