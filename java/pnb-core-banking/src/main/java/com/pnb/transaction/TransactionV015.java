package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV015")
public class TransactionV015 {

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

    @Column(name = "FLD_015_00")
    private BigDecimal field015_00;

    @Column(name = "FLD_015_01")
    private LocalDate field015_01;

    @Column(name = "FLD_015_02")
    private String field015_02;

    @Column(name = "FLD_015_03")
    private Integer field015_03;

    @Column(name = "FLD_015_04")
    private Integer field015_04;

    @Column(name = "FLD_015_05")
    private Integer field015_05;

    @Column(name = "FLD_015_06")
    private Integer field015_06;

    @Column(name = "FLD_015_07")
    private LocalDate field015_07;

    @Column(name = "FLD_015_08")
    private Integer field015_08;

    @Column(name = "FLD_015_09")
    private Integer field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV015() {}

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

    public BigDecimal getField015_00() { return field015_00; }
    public void setField015_00(BigDecimal field015_00) { this.field015_00 = field015_00; }

    public LocalDate getField015_01() { return field015_01; }
    public void setField015_01(LocalDate field015_01) { this.field015_01 = field015_01; }

    public String getField015_02() { return field015_02; }
    public void setField015_02(String field015_02) { this.field015_02 = field015_02; }

    public Integer getField015_03() { return field015_03; }
    public void setField015_03(Integer field015_03) { this.field015_03 = field015_03; }

    public Integer getField015_04() { return field015_04; }
    public void setField015_04(Integer field015_04) { this.field015_04 = field015_04; }

    public Integer getField015_05() { return field015_05; }
    public void setField015_05(Integer field015_05) { this.field015_05 = field015_05; }

    public Integer getField015_06() { return field015_06; }
    public void setField015_06(Integer field015_06) { this.field015_06 = field015_06; }

    public LocalDate getField015_07() { return field015_07; }
    public void setField015_07(LocalDate field015_07) { this.field015_07 = field015_07; }

    public Integer getField015_08() { return field015_08; }
    public void setField015_08(Integer field015_08) { this.field015_08 = field015_08; }

    public Integer getField015_09() { return field015_09; }
    public void setField015_09(Integer field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV015)) return false;
        TransactionV015 that = (TransactionV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV015{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
