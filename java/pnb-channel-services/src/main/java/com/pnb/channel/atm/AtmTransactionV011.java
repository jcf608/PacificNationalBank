package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV011 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV011")
public class AtmTransactionV011 {

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

    @Column(name = "FLD_011_00")
    private BigDecimal field011_00;

    @Column(name = "FLD_011_01")
    private LocalDate field011_01;

    @Column(name = "FLD_011_02")
    private LocalDate field011_02;

    @Column(name = "FLD_011_03")
    private Boolean field011_03;

    @Column(name = "FLD_011_04")
    private String field011_04;

    @Column(name = "FLD_011_05")
    private Boolean field011_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV011() {}

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

    public BigDecimal getField011_00() { return field011_00; }
    public void setField011_00(BigDecimal field011_00) { this.field011_00 = field011_00; }

    public LocalDate getField011_01() { return field011_01; }
    public void setField011_01(LocalDate field011_01) { this.field011_01 = field011_01; }

    public LocalDate getField011_02() { return field011_02; }
    public void setField011_02(LocalDate field011_02) { this.field011_02 = field011_02; }

    public Boolean getField011_03() { return field011_03; }
    public void setField011_03(Boolean field011_03) { this.field011_03 = field011_03; }

    public String getField011_04() { return field011_04; }
    public void setField011_04(String field011_04) { this.field011_04 = field011_04; }

    public Boolean getField011_05() { return field011_05; }
    public void setField011_05(Boolean field011_05) { this.field011_05 = field011_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV011)) return false;
        AtmTransactionV011 that = (AtmTransactionV011) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV011{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
