package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV036 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV036")
public class AtmTransactionV036 {

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

    @Column(name = "FLD_036_00")
    private BigDecimal field036_00;

    @Column(name = "FLD_036_01")
    private Boolean field036_01;

    @Column(name = "FLD_036_02")
    private LocalDate field036_02;

    @Column(name = "FLD_036_03")
    private Boolean field036_03;

    @Column(name = "FLD_036_04")
    private LocalDate field036_04;

    @Column(name = "FLD_036_05")
    private String field036_05;

    @Column(name = "FLD_036_06")
    private Boolean field036_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV036() {}

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

    public BigDecimal getField036_00() { return field036_00; }
    public void setField036_00(BigDecimal field036_00) { this.field036_00 = field036_00; }

    public Boolean getField036_01() { return field036_01; }
    public void setField036_01(Boolean field036_01) { this.field036_01 = field036_01; }

    public LocalDate getField036_02() { return field036_02; }
    public void setField036_02(LocalDate field036_02) { this.field036_02 = field036_02; }

    public Boolean getField036_03() { return field036_03; }
    public void setField036_03(Boolean field036_03) { this.field036_03 = field036_03; }

    public LocalDate getField036_04() { return field036_04; }
    public void setField036_04(LocalDate field036_04) { this.field036_04 = field036_04; }

    public String getField036_05() { return field036_05; }
    public void setField036_05(String field036_05) { this.field036_05 = field036_05; }

    public Boolean getField036_06() { return field036_06; }
    public void setField036_06(Boolean field036_06) { this.field036_06 = field036_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV036)) return false;
        AtmTransactionV036 that = (AtmTransactionV036) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV036{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
