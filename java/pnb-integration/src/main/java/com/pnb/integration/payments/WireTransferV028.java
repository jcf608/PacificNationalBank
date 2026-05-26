package com.pnb.integration.payments;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * WireTransferV028 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "WIRETRANSFERV028")
public class WireTransferV028 {

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

    @Column(name = "INT_FLD_028_00")
    private Integer intField028_00;

    @Column(name = "INT_FLD_028_01")
    private LocalDate intField028_01;

    @Column(name = "INT_FLD_028_02")
    private String intField028_02;

    @Column(name = "INT_FLD_028_03")
    private String intField028_03;

    @Column(name = "INT_FLD_028_04")
    private Integer intField028_04;

    @Column(name = "INT_FLD_028_05")
    private Integer intField028_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public WireTransferV028() {}

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

    public Integer getIntField028_00() { return intField028_00; }
    public void setIntField028_00(Integer intField028_00) { this.intField028_00 = intField028_00; }

    public LocalDate getIntField028_01() { return intField028_01; }
    public void setIntField028_01(LocalDate intField028_01) { this.intField028_01 = intField028_01; }

    public String getIntField028_02() { return intField028_02; }
    public void setIntField028_02(String intField028_02) { this.intField028_02 = intField028_02; }

    public String getIntField028_03() { return intField028_03; }
    public void setIntField028_03(String intField028_03) { this.intField028_03 = intField028_03; }

    public Integer getIntField028_04() { return intField028_04; }
    public void setIntField028_04(Integer intField028_04) { this.intField028_04 = intField028_04; }

    public Integer getIntField028_05() { return intField028_05; }
    public void setIntField028_05(Integer intField028_05) { this.intField028_05 = intField028_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTransferV028)) return false;
        WireTransferV028 that = (WireTransferV028) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "WireTransferV028{" +
            "id=" + id +
            ", wireId=" + wireId +
            ", originatorName=" + originatorName +
            ", originatorAccount=" + originatorAccount +
            ", beneficiaryName=" + beneficiaryName +
            ", beneficiaryAccount=" + beneficiaryAccount +
            '}';
    }
}
