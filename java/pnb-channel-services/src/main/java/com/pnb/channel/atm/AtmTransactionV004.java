package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV004")
public class AtmTransactionV004 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TERMINAL_ID")
    private String terminalId;

    @Column(name = "CARD_NUM")
    private String cardNumber;

    @Column(name = "TXN_TYPE")
    private String transactionType;

    @Column(name = "AMOUNT", precision = 13, scale = 2)
    private BigDecimal amount;

    @Column(name = "SURCHARGE", precision = 7, scale = 2)
    private BigDecimal surcharge;

    @Column(name = "APPROVED")
    private Boolean approved;

    @Column(name = "FLD_004_00")
    private String field004_00;

    @Column(name = "FLD_004_01")
    private Boolean field004_01;

    @Column(name = "FLD_004_02")
    private String field004_02;

    @Column(name = "FLD_004_03")
    private Boolean field004_03;

    @Column(name = "FLD_004_04")
    private BigDecimal field004_04;

    @Column(name = "FLD_004_05")
    private LocalDate field004_05;

    @Column(name = "FLD_004_06")
    private String field004_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV004() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTerminalId() { return terminalId; }
    public void setTerminalId(String terminalId) { this.terminalId = terminalId; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public BigDecimal getSurcharge() { return surcharge; }
    public void setSurcharge(BigDecimal surcharge) { this.surcharge = surcharge; }

    public Boolean getApproved() { return approved; }
    public void setApproved(Boolean approved) { this.approved = approved; }

    public String getField004_00() { return field004_00; }
    public void setField004_00(String field004_00) { this.field004_00 = field004_00; }

    public Boolean getField004_01() { return field004_01; }
    public void setField004_01(Boolean field004_01) { this.field004_01 = field004_01; }

    public String getField004_02() { return field004_02; }
    public void setField004_02(String field004_02) { this.field004_02 = field004_02; }

    public Boolean getField004_03() { return field004_03; }
    public void setField004_03(Boolean field004_03) { this.field004_03 = field004_03; }

    public BigDecimal getField004_04() { return field004_04; }
    public void setField004_04(BigDecimal field004_04) { this.field004_04 = field004_04; }

    public LocalDate getField004_05() { return field004_05; }
    public void setField004_05(LocalDate field004_05) { this.field004_05 = field004_05; }

    public String getField004_06() { return field004_06; }
    public void setField004_06(String field004_06) { this.field004_06 = field004_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV004)) return false;
        AtmTransactionV004 that = (AtmTransactionV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV004{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
