package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV038")
public class MobilePaymentV038 {

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

    @Column(name = "FLD_038_00")
    private String field038_00;

    @Column(name = "FLD_038_01")
    private Integer field038_01;

    @Column(name = "FLD_038_02")
    private Boolean field038_02;

    @Column(name = "FLD_038_03")
    private Boolean field038_03;

    @Column(name = "FLD_038_04")
    private Integer field038_04;

    @Column(name = "FLD_038_05")
    private String field038_05;

    @Column(name = "FLD_038_06")
    private BigDecimal field038_06;

    @Column(name = "FLD_038_07")
    private Integer field038_07;

    @Column(name = "FLD_038_08")
    private BigDecimal field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV038() {}

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

    public String getField038_00() { return field038_00; }
    public void setField038_00(String field038_00) { this.field038_00 = field038_00; }

    public Integer getField038_01() { return field038_01; }
    public void setField038_01(Integer field038_01) { this.field038_01 = field038_01; }

    public Boolean getField038_02() { return field038_02; }
    public void setField038_02(Boolean field038_02) { this.field038_02 = field038_02; }

    public Boolean getField038_03() { return field038_03; }
    public void setField038_03(Boolean field038_03) { this.field038_03 = field038_03; }

    public Integer getField038_04() { return field038_04; }
    public void setField038_04(Integer field038_04) { this.field038_04 = field038_04; }

    public String getField038_05() { return field038_05; }
    public void setField038_05(String field038_05) { this.field038_05 = field038_05; }

    public BigDecimal getField038_06() { return field038_06; }
    public void setField038_06(BigDecimal field038_06) { this.field038_06 = field038_06; }

    public Integer getField038_07() { return field038_07; }
    public void setField038_07(Integer field038_07) { this.field038_07 = field038_07; }

    public BigDecimal getField038_08() { return field038_08; }
    public void setField038_08(BigDecimal field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV038)) return false;
        MobilePaymentV038 that = (MobilePaymentV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV038{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
