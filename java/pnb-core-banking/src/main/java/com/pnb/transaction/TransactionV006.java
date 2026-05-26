package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV006")
public class TransactionV006 {

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

    public TransactionV006() {}

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
        if (!(o instanceof TransactionV006)) return false;
        TransactionV006 that = (TransactionV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV006{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
