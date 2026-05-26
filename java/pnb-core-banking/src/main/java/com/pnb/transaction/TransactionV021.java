package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV021 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV021")
public class TransactionV021 {

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

    @Column(name = "FLD_021_00")
    private String field021_00;

    @Column(name = "FLD_021_01")
    private Boolean field021_01;

    @Column(name = "FLD_021_02")
    private BigDecimal field021_02;

    @Column(name = "FLD_021_03")
    private BigDecimal field021_03;

    @Column(name = "FLD_021_04")
    private BigDecimal field021_04;

    @Column(name = "FLD_021_05")
    private LocalDate field021_05;

    @Column(name = "FLD_021_06")
    private String field021_06;

    @Column(name = "FLD_021_07")
    private Boolean field021_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV021() {}

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

    public String getField021_00() { return field021_00; }
    public void setField021_00(String field021_00) { this.field021_00 = field021_00; }

    public Boolean getField021_01() { return field021_01; }
    public void setField021_01(Boolean field021_01) { this.field021_01 = field021_01; }

    public BigDecimal getField021_02() { return field021_02; }
    public void setField021_02(BigDecimal field021_02) { this.field021_02 = field021_02; }

    public BigDecimal getField021_03() { return field021_03; }
    public void setField021_03(BigDecimal field021_03) { this.field021_03 = field021_03; }

    public BigDecimal getField021_04() { return field021_04; }
    public void setField021_04(BigDecimal field021_04) { this.field021_04 = field021_04; }

    public LocalDate getField021_05() { return field021_05; }
    public void setField021_05(LocalDate field021_05) { this.field021_05 = field021_05; }

    public String getField021_06() { return field021_06; }
    public void setField021_06(String field021_06) { this.field021_06 = field021_06; }

    public Boolean getField021_07() { return field021_07; }
    public void setField021_07(Boolean field021_07) { this.field021_07 = field021_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV021)) return false;
        TransactionV021 that = (TransactionV021) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV021{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
