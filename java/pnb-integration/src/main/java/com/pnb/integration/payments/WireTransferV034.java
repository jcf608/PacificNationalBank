package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV034 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV034")
public class WireTransferV034 {

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

    @Column(name = "INT_FLD_034_00")
    private BigDecimal intField034_00;

    @Column(name = "INT_FLD_034_01")
    private BigDecimal intField034_01;

    @Column(name = "INT_FLD_034_02")
    private String intField034_02;

    @Column(name = "INT_FLD_034_03")
    private Integer intField034_03;

    @Column(name = "INT_FLD_034_04")
    private String intField034_04;

    @Column(name = "INT_FLD_034_05")
    private BigDecimal intField034_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV034() {}

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

    public BigDecimal getIntField034_00() { return intField034_00; }
    public void setIntField034_00(BigDecimal intField034_00) { this.intField034_00 = intField034_00; }

    public BigDecimal getIntField034_01() { return intField034_01; }
    public void setIntField034_01(BigDecimal intField034_01) { this.intField034_01 = intField034_01; }

    public String getIntField034_02() { return intField034_02; }
    public void setIntField034_02(String intField034_02) { this.intField034_02 = intField034_02; }

    public Integer getIntField034_03() { return intField034_03; }
    public void setIntField034_03(Integer intField034_03) { this.intField034_03 = intField034_03; }

    public String getIntField034_04() { return intField034_04; }
    public void setIntField034_04(String intField034_04) { this.intField034_04 = intField034_04; }

    public BigDecimal getIntField034_05() { return intField034_05; }
    public void setIntField034_05(BigDecimal intField034_05) { this.intField034_05 = intField034_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV034)) return false;
        WireTransferV034 that = (WireTransferV034) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV034{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
