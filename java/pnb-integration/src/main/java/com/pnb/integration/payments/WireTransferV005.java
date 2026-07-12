package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV005")
public class WireTransferV005 {

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

    @Column(name = "INT_FLD_005_00")
    private Integer intField005_00;

    @Column(name = "INT_FLD_005_01")
    private BigDecimal intField005_01;

    @Column(name = "INT_FLD_005_02")
    private Integer intField005_02;

    @Column(name = "INT_FLD_005_03")
    private Integer intField005_03;

    @Column(name = "INT_FLD_005_04")
    private BigDecimal intField005_04;

    @Column(name = "INT_FLD_005_05")
    private String intField005_05;

    @Column(name = "INT_FLD_005_06")
    private BigDecimal intField005_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV005() {}

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

    public Integer getIntField005_00() { return intField005_00; }
    public void setIntField005_00(Integer intField005_00) { this.intField005_00 = intField005_00; }

    public BigDecimal getIntField005_01() { return intField005_01; }
    public void setIntField005_01(BigDecimal intField005_01) { this.intField005_01 = intField005_01; }

    public Integer getIntField005_02() { return intField005_02; }
    public void setIntField005_02(Integer intField005_02) { this.intField005_02 = intField005_02; }

    public Integer getIntField005_03() { return intField005_03; }
    public void setIntField005_03(Integer intField005_03) { this.intField005_03 = intField005_03; }

    public BigDecimal getIntField005_04() { return intField005_04; }
    public void setIntField005_04(BigDecimal intField005_04) { this.intField005_04 = intField005_04; }

    public String getIntField005_05() { return intField005_05; }
    public void setIntField005_05(String intField005_05) { this.intField005_05 = intField005_05; }

    public BigDecimal getIntField005_06() { return intField005_06; }
    public void setIntField005_06(BigDecimal intField005_06) { this.intField005_06 = intField005_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV005)) return false;
        WireTransferV005 that = (WireTransferV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV005{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
