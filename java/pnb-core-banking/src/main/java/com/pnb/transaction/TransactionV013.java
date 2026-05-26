package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV013")
public class TransactionV013 {

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

    @Column(name = "FLD_013_00")
    private Boolean field013_00;

    @Column(name = "FLD_013_01")
    private Boolean field013_01;

    @Column(name = "FLD_013_02")
    private Boolean field013_02;

    @Column(name = "FLD_013_03")
    private BigDecimal field013_03;

    @Column(name = "FLD_013_04")
    private LocalDate field013_04;

    @Column(name = "FLD_013_05")
    private BigDecimal field013_05;

    @Column(name = "FLD_013_06")
    private Integer field013_06;

    @Column(name = "FLD_013_07")
    private LocalDate field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV013() {}

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

    public Boolean getField013_00() { return field013_00; }
    public void setField013_00(Boolean field013_00) { this.field013_00 = field013_00; }

    public Boolean getField013_01() { return field013_01; }
    public void setField013_01(Boolean field013_01) { this.field013_01 = field013_01; }

    public Boolean getField013_02() { return field013_02; }
    public void setField013_02(Boolean field013_02) { this.field013_02 = field013_02; }

    public BigDecimal getField013_03() { return field013_03; }
    public void setField013_03(BigDecimal field013_03) { this.field013_03 = field013_03; }

    public LocalDate getField013_04() { return field013_04; }
    public void setField013_04(LocalDate field013_04) { this.field013_04 = field013_04; }

    public BigDecimal getField013_05() { return field013_05; }
    public void setField013_05(BigDecimal field013_05) { this.field013_05 = field013_05; }

    public Integer getField013_06() { return field013_06; }
    public void setField013_06(Integer field013_06) { this.field013_06 = field013_06; }

    public LocalDate getField013_07() { return field013_07; }
    public void setField013_07(LocalDate field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV013)) return false;
        TransactionV013 that = (TransactionV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV013{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
