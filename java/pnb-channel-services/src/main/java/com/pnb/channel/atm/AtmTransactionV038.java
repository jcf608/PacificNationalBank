package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV038")
public class AtmTransactionV038 {

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

    @Column(name = "FLD_038_00")
    private Integer field038_00;

    @Column(name = "FLD_038_01")
    private Integer field038_01;

    @Column(name = "FLD_038_02")
    private LocalDate field038_02;

    @Column(name = "FLD_038_03")
    private Integer field038_03;

    @Column(name = "FLD_038_04")
    private Integer field038_04;

    @Column(name = "FLD_038_05")
    private Integer field038_05;

    @Column(name = "FLD_038_06")
    private BigDecimal field038_06;

    @Column(name = "FLD_038_07")
    private String field038_07;

    @Column(name = "FLD_038_08")
    private BigDecimal field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV038() {}

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

    public Integer getField038_00() { return field038_00; }
    public void setField038_00(Integer field038_00) { this.field038_00 = field038_00; }

    public Integer getField038_01() { return field038_01; }
    public void setField038_01(Integer field038_01) { this.field038_01 = field038_01; }

    public LocalDate getField038_02() { return field038_02; }
    public void setField038_02(LocalDate field038_02) { this.field038_02 = field038_02; }

    public Integer getField038_03() { return field038_03; }
    public void setField038_03(Integer field038_03) { this.field038_03 = field038_03; }

    public Integer getField038_04() { return field038_04; }
    public void setField038_04(Integer field038_04) { this.field038_04 = field038_04; }

    public Integer getField038_05() { return field038_05; }
    public void setField038_05(Integer field038_05) { this.field038_05 = field038_05; }

    public BigDecimal getField038_06() { return field038_06; }
    public void setField038_06(BigDecimal field038_06) { this.field038_06 = field038_06; }

    public String getField038_07() { return field038_07; }
    public void setField038_07(String field038_07) { this.field038_07 = field038_07; }

    public BigDecimal getField038_08() { return field038_08; }
    public void setField038_08(BigDecimal field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV038)) return false;
        AtmTransactionV038 that = (AtmTransactionV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV038{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
