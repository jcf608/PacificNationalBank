package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV039")
public class TransactionV039 {

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

    @Column(name = "FLD_039_00")
    private Integer field039_00;

    @Column(name = "FLD_039_01")
    private String field039_01;

    @Column(name = "FLD_039_02")
    private Boolean field039_02;

    @Column(name = "FLD_039_03")
    private BigDecimal field039_03;

    @Column(name = "FLD_039_04")
    private BigDecimal field039_04;

    @Column(name = "FLD_039_05")
    private BigDecimal field039_05;

    @Column(name = "FLD_039_06")
    private LocalDate field039_06;

    @Column(name = "FLD_039_07")
    private Integer field039_07;

    @Column(name = "FLD_039_08")
    private Boolean field039_08;

    @Column(name = "FLD_039_09")
    private Boolean field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV039() {}

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

    public Integer getField039_00() { return field039_00; }
    public void setField039_00(Integer field039_00) { this.field039_00 = field039_00; }

    public String getField039_01() { return field039_01; }
    public void setField039_01(String field039_01) { this.field039_01 = field039_01; }

    public Boolean getField039_02() { return field039_02; }
    public void setField039_02(Boolean field039_02) { this.field039_02 = field039_02; }

    public BigDecimal getField039_03() { return field039_03; }
    public void setField039_03(BigDecimal field039_03) { this.field039_03 = field039_03; }

    public BigDecimal getField039_04() { return field039_04; }
    public void setField039_04(BigDecimal field039_04) { this.field039_04 = field039_04; }

    public BigDecimal getField039_05() { return field039_05; }
    public void setField039_05(BigDecimal field039_05) { this.field039_05 = field039_05; }

    public LocalDate getField039_06() { return field039_06; }
    public void setField039_06(LocalDate field039_06) { this.field039_06 = field039_06; }

    public Integer getField039_07() { return field039_07; }
    public void setField039_07(Integer field039_07) { this.field039_07 = field039_07; }

    public Boolean getField039_08() { return field039_08; }
    public void setField039_08(Boolean field039_08) { this.field039_08 = field039_08; }

    public Boolean getField039_09() { return field039_09; }
    public void setField039_09(Boolean field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV039)) return false;
        TransactionV039 that = (TransactionV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV039{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
