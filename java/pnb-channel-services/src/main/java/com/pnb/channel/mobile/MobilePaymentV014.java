package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV014 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV014")
public class MobilePaymentV014 {

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

    @Column(name = "FLD_014_00")
    private BigDecimal field014_00;

    @Column(name = "FLD_014_01")
    private Integer field014_01;

    @Column(name = "FLD_014_02")
    private Integer field014_02;

    @Column(name = "FLD_014_03")
    private Boolean field014_03;

    @Column(name = "FLD_014_04")
    private LocalDate field014_04;

    @Column(name = "FLD_014_05")
    private LocalDate field014_05;

    @Column(name = "FLD_014_06")
    private Integer field014_06;

    @Column(name = "FLD_014_07")
    private Integer field014_07;

    @Column(name = "FLD_014_08")
    private BigDecimal field014_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV014() {}

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

    public BigDecimal getField014_00() { return field014_00; }
    public void setField014_00(BigDecimal field014_00) { this.field014_00 = field014_00; }

    public Integer getField014_01() { return field014_01; }
    public void setField014_01(Integer field014_01) { this.field014_01 = field014_01; }

    public Integer getField014_02() { return field014_02; }
    public void setField014_02(Integer field014_02) { this.field014_02 = field014_02; }

    public Boolean getField014_03() { return field014_03; }
    public void setField014_03(Boolean field014_03) { this.field014_03 = field014_03; }

    public LocalDate getField014_04() { return field014_04; }
    public void setField014_04(LocalDate field014_04) { this.field014_04 = field014_04; }

    public LocalDate getField014_05() { return field014_05; }
    public void setField014_05(LocalDate field014_05) { this.field014_05 = field014_05; }

    public Integer getField014_06() { return field014_06; }
    public void setField014_06(Integer field014_06) { this.field014_06 = field014_06; }

    public Integer getField014_07() { return field014_07; }
    public void setField014_07(Integer field014_07) { this.field014_07 = field014_07; }

    public BigDecimal getField014_08() { return field014_08; }
    public void setField014_08(BigDecimal field014_08) { this.field014_08 = field014_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV014)) return false;
        MobilePaymentV014 that = (MobilePaymentV014) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV014{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
