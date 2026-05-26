package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV026 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV026")
public class MobilePaymentV026 {

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

    @Column(name = "FLD_026_00")
    private String field026_00;

    @Column(name = "FLD_026_01")
    private BigDecimal field026_01;

    @Column(name = "FLD_026_02")
    private LocalDate field026_02;

    @Column(name = "FLD_026_03")
    private Integer field026_03;

    @Column(name = "FLD_026_04")
    private Integer field026_04;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV026() {}

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

    public String getField026_00() { return field026_00; }
    public void setField026_00(String field026_00) { this.field026_00 = field026_00; }

    public BigDecimal getField026_01() { return field026_01; }
    public void setField026_01(BigDecimal field026_01) { this.field026_01 = field026_01; }

    public LocalDate getField026_02() { return field026_02; }
    public void setField026_02(LocalDate field026_02) { this.field026_02 = field026_02; }

    public Integer getField026_03() { return field026_03; }
    public void setField026_03(Integer field026_03) { this.field026_03 = field026_03; }

    public Integer getField026_04() { return field026_04; }
    public void setField026_04(Integer field026_04) { this.field026_04 = field026_04; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV026)) return false;
        MobilePaymentV026 that = (MobilePaymentV026) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV026{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
