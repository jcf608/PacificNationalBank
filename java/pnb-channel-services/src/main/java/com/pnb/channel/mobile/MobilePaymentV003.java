package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV003 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV003")
public class MobilePaymentV003 {

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

    @Column(name = "FLD_003_00")
    private BigDecimal field003_00;

    @Column(name = "FLD_003_01")
    private Integer field003_01;

    @Column(name = "FLD_003_02")
    private BigDecimal field003_02;

    @Column(name = "FLD_003_03")
    private String field003_03;

    @Column(name = "FLD_003_04")
    private Boolean field003_04;

    @Column(name = "FLD_003_05")
    private Boolean field003_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV003() {}

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

    public BigDecimal getField003_00() { return field003_00; }
    public void setField003_00(BigDecimal field003_00) { this.field003_00 = field003_00; }

    public Integer getField003_01() { return field003_01; }
    public void setField003_01(Integer field003_01) { this.field003_01 = field003_01; }

    public BigDecimal getField003_02() { return field003_02; }
    public void setField003_02(BigDecimal field003_02) { this.field003_02 = field003_02; }

    public String getField003_03() { return field003_03; }
    public void setField003_03(String field003_03) { this.field003_03 = field003_03; }

    public Boolean getField003_04() { return field003_04; }
    public void setField003_04(Boolean field003_04) { this.field003_04 = field003_04; }

    public Boolean getField003_05() { return field003_05; }
    public void setField003_05(Boolean field003_05) { this.field003_05 = field003_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV003)) return false;
        MobilePaymentV003 that = (MobilePaymentV003) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV003{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
