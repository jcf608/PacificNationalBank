package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV006 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV006")
public class MobilePaymentV006 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PMT_ID", unique = true)
    private String paymentId;

    @Column(name = "SENDER_ACCT")
    private String senderAccount;

    @Column(name = "RECIP_ACCT")
    private String recipientAccount;

    @Column(name = "AMOUNT", precision = 13, scale = 2)
    private BigDecimal amount;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "DEVICE_FP")
    private String deviceFingerprint;

    @Column(name = "FLD_006_00")
    private BigDecimal field006_00;

    @Column(name = "FLD_006_01")
    private Boolean field006_01;

    @Column(name = "FLD_006_02")
    private Integer field006_02;

    @Column(name = "FLD_006_03")
    private Integer field006_03;

    @Column(name = "FLD_006_04")
    private BigDecimal field006_04;

    @Column(name = "FLD_006_05")
    private String field006_05;

    @Column(name = "FLD_006_06")
    private Integer field006_06;

    @Column(name = "FLD_006_07")
    private String field006_07;

    @Column(name = "FLD_006_08")
    private Integer field006_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV006() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPaymentId() { return paymentId; }
    public void setPaymentId(String paymentId) { this.paymentId = paymentId; }

    public String getSenderAccount() { return senderAccount; }
    public void setSenderAccount(String senderAccount) { this.senderAccount = senderAccount; }

    public String getRecipientAccount() { return recipientAccount; }
    public void setRecipientAccount(String recipientAccount) { this.recipientAccount = recipientAccount; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getMemo() { return memo; }
    public void setMemo(String memo) { this.memo = memo; }

    public String getDeviceFingerprint() { return deviceFingerprint; }
    public void setDeviceFingerprint(String deviceFingerprint) { this.deviceFingerprint = deviceFingerprint; }

    public BigDecimal getField006_00() { return field006_00; }
    public void setField006_00(BigDecimal field006_00) { this.field006_00 = field006_00; }

    public Boolean getField006_01() { return field006_01; }
    public void setField006_01(Boolean field006_01) { this.field006_01 = field006_01; }

    public Integer getField006_02() { return field006_02; }
    public void setField006_02(Integer field006_02) { this.field006_02 = field006_02; }

    public Integer getField006_03() { return field006_03; }
    public void setField006_03(Integer field006_03) { this.field006_03 = field006_03; }

    public BigDecimal getField006_04() { return field006_04; }
    public void setField006_04(BigDecimal field006_04) { this.field006_04 = field006_04; }

    public String getField006_05() { return field006_05; }
    public void setField006_05(String field006_05) { this.field006_05 = field006_05; }

    public Integer getField006_06() { return field006_06; }
    public void setField006_06(Integer field006_06) { this.field006_06 = field006_06; }

    public String getField006_07() { return field006_07; }
    public void setField006_07(String field006_07) { this.field006_07 = field006_07; }

    public Integer getField006_08() { return field006_08; }
    public void setField006_08(Integer field006_08) { this.field006_08 = field006_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV006)) return false;
        MobilePaymentV006 that = (MobilePaymentV006) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV006{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
