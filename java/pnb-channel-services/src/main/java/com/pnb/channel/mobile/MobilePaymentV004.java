package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV004 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV004")
public class MobilePaymentV004 {

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

    @Column(name = "FLD_004_00")
    private String field004_00;

    @Column(name = "FLD_004_01")
    private Integer field004_01;

    @Column(name = "FLD_004_02")
    private String field004_02;

    @Column(name = "FLD_004_03")
    private String field004_03;

    @Column(name = "FLD_004_04")
    private Boolean field004_04;

    @Column(name = "FLD_004_05")
    private LocalDate field004_05;

    @Column(name = "FLD_004_06")
    private Boolean field004_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV004() {}

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

    public String getField004_00() { return field004_00; }
    public void setField004_00(String field004_00) { this.field004_00 = field004_00; }

    public Integer getField004_01() { return field004_01; }
    public void setField004_01(Integer field004_01) { this.field004_01 = field004_01; }

    public String getField004_02() { return field004_02; }
    public void setField004_02(String field004_02) { this.field004_02 = field004_02; }

    public String getField004_03() { return field004_03; }
    public void setField004_03(String field004_03) { this.field004_03 = field004_03; }

    public Boolean getField004_04() { return field004_04; }
    public void setField004_04(Boolean field004_04) { this.field004_04 = field004_04; }

    public LocalDate getField004_05() { return field004_05; }
    public void setField004_05(LocalDate field004_05) { this.field004_05 = field004_05; }

    public Boolean getField004_06() { return field004_06; }
    public void setField004_06(Boolean field004_06) { this.field004_06 = field004_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV004)) return false;
        MobilePaymentV004 that = (MobilePaymentV004) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV004{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
