package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV015")
public class AtmTransactionV015 {

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

    @Column(name = "FLD_015_00")
    private Boolean field015_00;

    @Column(name = "FLD_015_01")
    private LocalDate field015_01;

    @Column(name = "FLD_015_02")
    private Integer field015_02;

    @Column(name = "FLD_015_03")
    private LocalDate field015_03;

    @Column(name = "FLD_015_04")
    private Boolean field015_04;

    @Column(name = "FLD_015_05")
    private BigDecimal field015_05;

    @Column(name = "FLD_015_06")
    private Integer field015_06;

    @Column(name = "FLD_015_07")
    private BigDecimal field015_07;

    @Column(name = "FLD_015_08")
    private Integer field015_08;

    @Column(name = "FLD_015_09")
    private BigDecimal field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV015() {}

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

    public Boolean getField015_00() { return field015_00; }
    public void setField015_00(Boolean field015_00) { this.field015_00 = field015_00; }

    public LocalDate getField015_01() { return field015_01; }
    public void setField015_01(LocalDate field015_01) { this.field015_01 = field015_01; }

    public Integer getField015_02() { return field015_02; }
    public void setField015_02(Integer field015_02) { this.field015_02 = field015_02; }

    public LocalDate getField015_03() { return field015_03; }
    public void setField015_03(LocalDate field015_03) { this.field015_03 = field015_03; }

    public Boolean getField015_04() { return field015_04; }
    public void setField015_04(Boolean field015_04) { this.field015_04 = field015_04; }

    public BigDecimal getField015_05() { return field015_05; }
    public void setField015_05(BigDecimal field015_05) { this.field015_05 = field015_05; }

    public Integer getField015_06() { return field015_06; }
    public void setField015_06(Integer field015_06) { this.field015_06 = field015_06; }

    public BigDecimal getField015_07() { return field015_07; }
    public void setField015_07(BigDecimal field015_07) { this.field015_07 = field015_07; }

    public Integer getField015_08() { return field015_08; }
    public void setField015_08(Integer field015_08) { this.field015_08 = field015_08; }

    public BigDecimal getField015_09() { return field015_09; }
    public void setField015_09(BigDecimal field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV015)) return false;
        AtmTransactionV015 that = (AtmTransactionV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV015{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
