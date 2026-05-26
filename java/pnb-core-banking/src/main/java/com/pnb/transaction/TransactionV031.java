package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TransactionV031 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "TRANSACTIONV031")
public class TransactionV031 {

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

    @Column(name = "FLD_031_00")
    private Boolean field031_00;

    @Column(name = "FLD_031_01")
    private LocalDate field031_01;

    @Column(name = "FLD_031_02")
    private Integer field031_02;

    @Column(name = "FLD_031_03")
    private String field031_03;

    @Column(name = "FLD_031_04")
    private LocalDate field031_04;

    @Column(name = "FLD_031_05")
    private Integer field031_05;

    @Column(name = "FLD_031_06")
    private BigDecimal field031_06;

    @Column(name = "FLD_031_07")
    private LocalDate field031_07;

    @Column(name = "FLD_031_08")
    private BigDecimal field031_08;

    @Column(name = "FLD_031_09")
    private Integer field031_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public TransactionV031() {}

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

    public Boolean getField031_00() { return field031_00; }
    public void setField031_00(Boolean field031_00) { this.field031_00 = field031_00; }

    public LocalDate getField031_01() { return field031_01; }
    public void setField031_01(LocalDate field031_01) { this.field031_01 = field031_01; }

    public Integer getField031_02() { return field031_02; }
    public void setField031_02(Integer field031_02) { this.field031_02 = field031_02; }

    public String getField031_03() { return field031_03; }
    public void setField031_03(String field031_03) { this.field031_03 = field031_03; }

    public LocalDate getField031_04() { return field031_04; }
    public void setField031_04(LocalDate field031_04) { this.field031_04 = field031_04; }

    public Integer getField031_05() { return field031_05; }
    public void setField031_05(Integer field031_05) { this.field031_05 = field031_05; }

    public BigDecimal getField031_06() { return field031_06; }
    public void setField031_06(BigDecimal field031_06) { this.field031_06 = field031_06; }

    public LocalDate getField031_07() { return field031_07; }
    public void setField031_07(LocalDate field031_07) { this.field031_07 = field031_07; }

    public BigDecimal getField031_08() { return field031_08; }
    public void setField031_08(BigDecimal field031_08) { this.field031_08 = field031_08; }

    public Integer getField031_09() { return field031_09; }
    public void setField031_09(Integer field031_09) { this.field031_09 = field031_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionV031)) return false;
        TransactionV031 that = (TransactionV031) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "TransactionV031{" +
            "id=" + id +
            ", transactionId=" + transactionId +
            ", transactionType=" + transactionType +
            ", accountNumber=" + accountNumber +
            ", amount=" + amount +
            ", currency=" + currency +
            '}';
    }
}
