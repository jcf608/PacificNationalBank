package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV005")
public class TransactionV005 {

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

    @Column(name = "FLD_005_00")
    private LocalDate field005_00;

    @Column(name = "FLD_005_01")
    private Boolean field005_01;

    @Column(name = "FLD_005_02")
    private Boolean field005_02;

    @Column(name = "FLD_005_03")
    private LocalDate field005_03;

    @Column(name = "FLD_005_04")
    private Boolean field005_04;

    @Column(name = "FLD_005_05")
    private LocalDate field005_05;

    @Column(name = "FLD_005_06")
    private BigDecimal field005_06;

    @Column(name = "FLD_005_07")
    private LocalDate field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV005() {}

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

    public LocalDate getField005_00() { return field005_00; }
    public void setField005_00(LocalDate field005_00) { this.field005_00 = field005_00; }

    public Boolean getField005_01() { return field005_01; }
    public void setField005_01(Boolean field005_01) { this.field005_01 = field005_01; }

    public Boolean getField005_02() { return field005_02; }
    public void setField005_02(Boolean field005_02) { this.field005_02 = field005_02; }

    public LocalDate getField005_03() { return field005_03; }
    public void setField005_03(LocalDate field005_03) { this.field005_03 = field005_03; }

    public Boolean getField005_04() { return field005_04; }
    public void setField005_04(Boolean field005_04) { this.field005_04 = field005_04; }

    public LocalDate getField005_05() { return field005_05; }
    public void setField005_05(LocalDate field005_05) { this.field005_05 = field005_05; }

    public BigDecimal getField005_06() { return field005_06; }
    public void setField005_06(BigDecimal field005_06) { this.field005_06 = field005_06; }

    public LocalDate getField005_07() { return field005_07; }
    public void setField005_07(LocalDate field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV005)) return false;
        TransactionV005 that = (TransactionV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV005{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
