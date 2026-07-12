package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV007")
public class AtmTransactionV007 {

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

    @Column(name = "FLD_007_00")
    private BigDecimal field007_00;

    @Column(name = "FLD_007_01")
    private BigDecimal field007_01;

    @Column(name = "FLD_007_02")
    private Boolean field007_02;

    @Column(name = "FLD_007_03")
    private LocalDate field007_03;

    @Column(name = "FLD_007_04")
    private Boolean field007_04;

    @Column(name = "FLD_007_05")
    private String field007_05;

    @Column(name = "FLD_007_06")
    private Integer field007_06;

    @Column(name = "FLD_007_07")
    private BigDecimal field007_07;

    @Column(name = "FLD_007_08")
    private Boolean field007_08;

    @Column(name = "FLD_007_09")
    private Boolean field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV007() {}

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

    public BigDecimal getField007_00() { return field007_00; }
    public void setField007_00(BigDecimal field007_00) { this.field007_00 = field007_00; }

    public BigDecimal getField007_01() { return field007_01; }
    public void setField007_01(BigDecimal field007_01) { this.field007_01 = field007_01; }

    public Boolean getField007_02() { return field007_02; }
    public void setField007_02(Boolean field007_02) { this.field007_02 = field007_02; }

    public LocalDate getField007_03() { return field007_03; }
    public void setField007_03(LocalDate field007_03) { this.field007_03 = field007_03; }

    public Boolean getField007_04() { return field007_04; }
    public void setField007_04(Boolean field007_04) { this.field007_04 = field007_04; }

    public String getField007_05() { return field007_05; }
    public void setField007_05(String field007_05) { this.field007_05 = field007_05; }

    public Integer getField007_06() { return field007_06; }
    public void setField007_06(Integer field007_06) { this.field007_06 = field007_06; }

    public BigDecimal getField007_07() { return field007_07; }
    public void setField007_07(BigDecimal field007_07) { this.field007_07 = field007_07; }

    public Boolean getField007_08() { return field007_08; }
    public void setField007_08(Boolean field007_08) { this.field007_08 = field007_08; }

    public Boolean getField007_09() { return field007_09; }
    public void setField007_09(Boolean field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV007)) return false;
        AtmTransactionV007 that = (AtmTransactionV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV007{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
