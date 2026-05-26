package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV030")
public class MobilePaymentV030 {

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

    @Column(name = "FLD_030_00")
    private Boolean field030_00;

    @Column(name = "FLD_030_01")
    private String field030_01;

    @Column(name = "FLD_030_02")
    private LocalDate field030_02;

    @Column(name = "FLD_030_03")
    private Boolean field030_03;

    @Column(name = "FLD_030_04")
    private BigDecimal field030_04;

    @Column(name = "FLD_030_05")
    private Integer field030_05;

    @Column(name = "FLD_030_06")
    private String field030_06;

    @Column(name = "FLD_030_07")
    private LocalDate field030_07;

    @Column(name = "FLD_030_08")
    private String field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV030() {}

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

    public Boolean getField030_00() { return field030_00; }
    public void setField030_00(Boolean field030_00) { this.field030_00 = field030_00; }

    public String getField030_01() { return field030_01; }
    public void setField030_01(String field030_01) { this.field030_01 = field030_01; }

    public LocalDate getField030_02() { return field030_02; }
    public void setField030_02(LocalDate field030_02) { this.field030_02 = field030_02; }

    public Boolean getField030_03() { return field030_03; }
    public void setField030_03(Boolean field030_03) { this.field030_03 = field030_03; }

    public BigDecimal getField030_04() { return field030_04; }
    public void setField030_04(BigDecimal field030_04) { this.field030_04 = field030_04; }

    public Integer getField030_05() { return field030_05; }
    public void setField030_05(Integer field030_05) { this.field030_05 = field030_05; }

    public String getField030_06() { return field030_06; }
    public void setField030_06(String field030_06) { this.field030_06 = field030_06; }

    public LocalDate getField030_07() { return field030_07; }
    public void setField030_07(LocalDate field030_07) { this.field030_07 = field030_07; }

    public String getField030_08() { return field030_08; }
    public void setField030_08(String field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV030)) return false;
        MobilePaymentV030 that = (MobilePaymentV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV030{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
