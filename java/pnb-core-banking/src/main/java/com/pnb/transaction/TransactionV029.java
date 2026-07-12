package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV029")
public class TransactionV029 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TXN_ID", unique = true)
    private String transactionId;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "ACCT_NUM")
    private String accountNumber;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CHANNEL")
    private String channel;

    @Column(name = "REF_NUM")
    private String referenceNumber;

    @Column(name = "FLD_029_00")
    private Integer field029_00;

    @Column(name = "FLD_029_01")
    private BigDecimal field029_01;

    @Column(name = "FLD_029_02")
    private LocalDate field029_02;

    @Column(name = "FLD_029_03")
    private LocalDate field029_03;

    @Column(name = "FLD_029_04")
    private String field029_04;

    @Column(name = "FLD_029_05")
    private String field029_05;

    @Column(name = "FLD_029_06")
    private LocalDate field029_06;

    @Column(name = "FLD_029_07")
    private BigDecimal field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV029() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getReferenceNumber() { return referenceNumber; }
    public void setReferenceNumber(String referenceNumber) { this.referenceNumber = referenceNumber; }

    public Integer getField029_00() { return field029_00; }
    public void setField029_00(Integer field029_00) { this.field029_00 = field029_00; }

    public BigDecimal getField029_01() { return field029_01; }
    public void setField029_01(BigDecimal field029_01) { this.field029_01 = field029_01; }

    public LocalDate getField029_02() { return field029_02; }
    public void setField029_02(LocalDate field029_02) { this.field029_02 = field029_02; }

    public LocalDate getField029_03() { return field029_03; }
    public void setField029_03(LocalDate field029_03) { this.field029_03 = field029_03; }

    public String getField029_04() { return field029_04; }
    public void setField029_04(String field029_04) { this.field029_04 = field029_04; }

    public String getField029_05() { return field029_05; }
    public void setField029_05(String field029_05) { this.field029_05 = field029_05; }

    public LocalDate getField029_06() { return field029_06; }
    public void setField029_06(LocalDate field029_06) { this.field029_06 = field029_06; }

    public BigDecimal getField029_07() { return field029_07; }
    public void setField029_07(BigDecimal field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV029)) return false;
        TransactionV029 that = (TransactionV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV029{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
