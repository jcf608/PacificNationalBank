package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV029")
public class AtmTransactionV029 {

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

    @Column(name = "FLD_029_00")
    private String field029_00;

    @Column(name = "FLD_029_01")
    private BigDecimal field029_01;

    @Column(name = "FLD_029_02")
    private Boolean field029_02;

    @Column(name = "FLD_029_03")
    private Integer field029_03;

    @Column(name = "FLD_029_04")
    private Integer field029_04;

    @Column(name = "FLD_029_05")
    private String field029_05;

    @Column(name = "FLD_029_06")
    private String field029_06;

    @Column(name = "FLD_029_07")
    private BigDecimal field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV029() {}

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

    public String getField029_00() { return field029_00; }
    public void setField029_00(String field029_00) { this.field029_00 = field029_00; }

    public BigDecimal getField029_01() { return field029_01; }
    public void setField029_01(BigDecimal field029_01) { this.field029_01 = field029_01; }

    public Boolean getField029_02() { return field029_02; }
    public void setField029_02(Boolean field029_02) { this.field029_02 = field029_02; }

    public Integer getField029_03() { return field029_03; }
    public void setField029_03(Integer field029_03) { this.field029_03 = field029_03; }

    public Integer getField029_04() { return field029_04; }
    public void setField029_04(Integer field029_04) { this.field029_04 = field029_04; }

    public String getField029_05() { return field029_05; }
    public void setField029_05(String field029_05) { this.field029_05 = field029_05; }

    public String getField029_06() { return field029_06; }
    public void setField029_06(String field029_06) { this.field029_06 = field029_06; }

    public BigDecimal getField029_07() { return field029_07; }
    public void setField029_07(BigDecimal field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV029)) return false;
        AtmTransactionV029 that = (AtmTransactionV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV029{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
