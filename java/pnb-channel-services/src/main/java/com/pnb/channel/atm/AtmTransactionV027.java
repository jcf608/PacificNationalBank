package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV027 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV027")
public class AtmTransactionV027 {

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

    @Column(name = "FLD_027_00")
    private String field027_00;

    @Column(name = "FLD_027_01")
    private Integer field027_01;

    @Column(name = "FLD_027_02")
    private Boolean field027_02;

    @Column(name = "FLD_027_03")
    private Boolean field027_03;

    @Column(name = "FLD_027_04")
    private BigDecimal field027_04;

    @Column(name = "FLD_027_05")
    private BigDecimal field027_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV027() {}

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

    public String getField027_00() { return field027_00; }
    public void setField027_00(String field027_00) { this.field027_00 = field027_00; }

    public Integer getField027_01() { return field027_01; }
    public void setField027_01(Integer field027_01) { this.field027_01 = field027_01; }

    public Boolean getField027_02() { return field027_02; }
    public void setField027_02(Boolean field027_02) { this.field027_02 = field027_02; }

    public Boolean getField027_03() { return field027_03; }
    public void setField027_03(Boolean field027_03) { this.field027_03 = field027_03; }

    public BigDecimal getField027_04() { return field027_04; }
    public void setField027_04(BigDecimal field027_04) { this.field027_04 = field027_04; }

    public BigDecimal getField027_05() { return field027_05; }
    public void setField027_05(BigDecimal field027_05) { this.field027_05 = field027_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV027)) return false;
        AtmTransactionV027 that = (AtmTransactionV027) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV027{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
