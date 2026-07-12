package com.pnb.channel.atm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * AtmTransactionV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ATMTRANSACTIONV030")
public class AtmTransactionV030 {

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

    @Column(name = "FLD_030_00")
    private Boolean field030_00;

    @Column(name = "FLD_030_01")
    private Integer field030_01;

    @Column(name = "FLD_030_02")
    private LocalDate field030_02;

    @Column(name = "FLD_030_03")
    private BigDecimal field030_03;

    @Column(name = "FLD_030_04")
    private Boolean field030_04;

    @Column(name = "FLD_030_05")
    private String field030_05;

    @Column(name = "FLD_030_06")
    private String field030_06;

    @Column(name = "FLD_030_07")
    private String field030_07;

    @Column(name = "FLD_030_08")
    private String field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public AtmTransactionV030() {}

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

    public Boolean getField030_00() { return field030_00; }
    public void setField030_00(Boolean field030_00) { this.field030_00 = field030_00; }

    public Integer getField030_01() { return field030_01; }
    public void setField030_01(Integer field030_01) { this.field030_01 = field030_01; }

    public LocalDate getField030_02() { return field030_02; }
    public void setField030_02(LocalDate field030_02) { this.field030_02 = field030_02; }

    public BigDecimal getField030_03() { return field030_03; }
    public void setField030_03(BigDecimal field030_03) { this.field030_03 = field030_03; }

    public Boolean getField030_04() { return field030_04; }
    public void setField030_04(Boolean field030_04) { this.field030_04 = field030_04; }

    public String getField030_05() { return field030_05; }
    public void setField030_05(String field030_05) { this.field030_05 = field030_05; }

    public String getField030_06() { return field030_06; }
    public void setField030_06(String field030_06) { this.field030_06 = field030_06; }

    public String getField030_07() { return field030_07; }
    public void setField030_07(String field030_07) { this.field030_07 = field030_07; }

    public String getField030_08() { return field030_08; }
    public void setField030_08(String field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtmTransactionV030)) return false;
        AtmTransactionV030 that = (AtmTransactionV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "AtmTransactionV030{" +
            "id=" + id +
            ", terminalId=" + terminalId +
            ", cardNumber=" + cardNumber +
            ", transactionType=" + transactionType +
            ", amount=" + amount +
            ", surcharge=" + surcharge +
            '}';
    }
}
