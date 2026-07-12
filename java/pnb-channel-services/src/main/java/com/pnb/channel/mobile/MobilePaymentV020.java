package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV020")
public class MobilePaymentV020 {

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

    @Column(name = "FLD_020_00")
    private BigDecimal field020_00;

    @Column(name = "FLD_020_01")
    private Integer field020_01;

    @Column(name = "FLD_020_02")
    private Integer field020_02;

    @Column(name = "FLD_020_03")
    private Integer field020_03;

    @Column(name = "FLD_020_04")
    private BigDecimal field020_04;

    @Column(name = "FLD_020_05")
    private Boolean field020_05;

    @Column(name = "FLD_020_06")
    private Boolean field020_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV020() {}

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

    public BigDecimal getField020_00() { return field020_00; }
    public void setField020_00(BigDecimal field020_00) { this.field020_00 = field020_00; }

    public Integer getField020_01() { return field020_01; }
    public void setField020_01(Integer field020_01) { this.field020_01 = field020_01; }

    public Integer getField020_02() { return field020_02; }
    public void setField020_02(Integer field020_02) { this.field020_02 = field020_02; }

    public Integer getField020_03() { return field020_03; }
    public void setField020_03(Integer field020_03) { this.field020_03 = field020_03; }

    public BigDecimal getField020_04() { return field020_04; }
    public void setField020_04(BigDecimal field020_04) { this.field020_04 = field020_04; }

    public Boolean getField020_05() { return field020_05; }
    public void setField020_05(Boolean field020_05) { this.field020_05 = field020_05; }

    public Boolean getField020_06() { return field020_06; }
    public void setField020_06(Boolean field020_06) { this.field020_06 = field020_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV020)) return false;
        MobilePaymentV020 that = (MobilePaymentV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV020{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
