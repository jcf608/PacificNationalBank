package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV011 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV011")
public class WireTransferV011 {

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

    @Column(name = "INT_FLD_011_00")
    private Integer intField011_00;

    @Column(name = "INT_FLD_011_01")
    private BigDecimal intField011_01;

    @Column(name = "INT_FLD_011_02")
    private String intField011_02;

    @Column(name = "INT_FLD_011_03")
    private LocalDate intField011_03;

    @Column(name = "INT_FLD_011_04")
    private BigDecimal intField011_04;

    @Column(name = "INT_FLD_011_05")
    private BigDecimal intField011_05;

    @Column(name = "INT_FLD_011_06")
    private BigDecimal intField011_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV011() {}

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

    public Integer getIntField011_00() { return intField011_00; }
    public void setIntField011_00(Integer intField011_00) { this.intField011_00 = intField011_00; }

    public BigDecimal getIntField011_01() { return intField011_01; }
    public void setIntField011_01(BigDecimal intField011_01) { this.intField011_01 = intField011_01; }

    public String getIntField011_02() { return intField011_02; }
    public void setIntField011_02(String intField011_02) { this.intField011_02 = intField011_02; }

    public LocalDate getIntField011_03() { return intField011_03; }
    public void setIntField011_03(LocalDate intField011_03) { this.intField011_03 = intField011_03; }

    public BigDecimal getIntField011_04() { return intField011_04; }
    public void setIntField011_04(BigDecimal intField011_04) { this.intField011_04 = intField011_04; }

    public BigDecimal getIntField011_05() { return intField011_05; }
    public void setIntField011_05(BigDecimal intField011_05) { this.intField011_05 = intField011_05; }

    public BigDecimal getIntField011_06() { return intField011_06; }
    public void setIntField011_06(BigDecimal intField011_06) { this.intField011_06 = intField011_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV011)) return false;
        WireTransferV011 that = (WireTransferV011) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV011{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
