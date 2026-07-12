package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV047 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV047")
public class WireTransferV047 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WIRE_ID", unique = true)
    private String wireId;

    @Column(name = "ORIG_NAME")
    private String originatorName;

    @Column(name = "ORIG_ACCT")
    private String originatorAccount;

    @Column(name = "BENE_NAME")
    private String beneficiaryName;

    @Column(name = "BENE_ACCT")
    private String beneficiaryAccount;

    @Column(name = "BENE_BANK")
    private String beneficiaryBank;

    @Column(name = "ROUTING_NUM")
    private String routingNumber;

    @Column(name = "AMOUNT", precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "INT_FLD_047_00")
    private BigDecimal intField047_00;

    @Column(name = "INT_FLD_047_01")
    private BigDecimal intField047_01;

    @Column(name = "INT_FLD_047_02")
    private LocalDate intField047_02;

    @Column(name = "INT_FLD_047_03")
    private BigDecimal intField047_03;

    @Column(name = "INT_FLD_047_04")
    private LocalDate intField047_04;

    @Column(name = "INT_FLD_047_05")
    private Integer intField047_05;

    @Column(name = "INT_FLD_047_06")
    private BigDecimal intField047_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV047() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWireId() { return wireId; }
    public void setWireId(String wireId) { this.wireId = wireId; }

    public String getOriginatorName() { return originatorName; }
    public void setOriginatorName(String originatorName) { this.originatorName = originatorName; }

    public String getOriginatorAccount() { return originatorAccount; }
    public void setOriginatorAccount(String originatorAccount) { this.originatorAccount = originatorAccount; }

    public String getBeneficiaryName() { return beneficiaryName; }
    public void setBeneficiaryName(String beneficiaryName) { this.beneficiaryName = beneficiaryName; }

    public String getBeneficiaryAccount() { return beneficiaryAccount; }
    public void setBeneficiaryAccount(String beneficiaryAccount) { this.beneficiaryAccount = beneficiaryAccount; }

    public String getBeneficiaryBank() { return beneficiaryBank; }
    public void setBeneficiaryBank(String beneficiaryBank) { this.beneficiaryBank = beneficiaryBank; }

    public String getRoutingNumber() { return routingNumber; }
    public void setRoutingNumber(String routingNumber) { this.routingNumber = routingNumber; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BigDecimal getIntField047_00() { return intField047_00; }
    public void setIntField047_00(BigDecimal intField047_00) { this.intField047_00 = intField047_00; }

    public BigDecimal getIntField047_01() { return intField047_01; }
    public void setIntField047_01(BigDecimal intField047_01) { this.intField047_01 = intField047_01; }

    public LocalDate getIntField047_02() { return intField047_02; }
    public void setIntField047_02(LocalDate intField047_02) { this.intField047_02 = intField047_02; }

    public BigDecimal getIntField047_03() { return intField047_03; }
    public void setIntField047_03(BigDecimal intField047_03) { this.intField047_03 = intField047_03; }

    public LocalDate getIntField047_04() { return intField047_04; }
    public void setIntField047_04(LocalDate intField047_04) { this.intField047_04 = intField047_04; }

    public Integer getIntField047_05() { return intField047_05; }
    public void setIntField047_05(Integer intField047_05) { this.intField047_05 = intField047_05; }

    public BigDecimal getIntField047_06() { return intField047_06; }
    public void setIntField047_06(BigDecimal intField047_06) { this.intField047_06 = intField047_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV047)) return false;
        WireTransferV047 that = (WireTransferV047) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV047{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
