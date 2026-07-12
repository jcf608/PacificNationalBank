package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV039 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV039")
public class MobilePaymentV039 {

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

    @Column(name = "FLD_039_00")
    private LocalDate field039_00;

    @Column(name = "FLD_039_01")
    private LocalDate field039_01;

    @Column(name = "FLD_039_02")
    private BigDecimal field039_02;

    @Column(name = "FLD_039_03")
    private Boolean field039_03;

    @Column(name = "FLD_039_04")
    private BigDecimal field039_04;

    @Column(name = "FLD_039_05")
    private LocalDate field039_05;

    @Column(name = "FLD_039_06")
    private Integer field039_06;

    @Column(name = "FLD_039_07")
    private Boolean field039_07;

    @Column(name = "FLD_039_08")
    private String field039_08;

    @Column(name = "FLD_039_09")
    private BigDecimal field039_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV039() {}

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

    public LocalDate getField039_00() { return field039_00; }
    public void setField039_00(LocalDate field039_00) { this.field039_00 = field039_00; }

    public LocalDate getField039_01() { return field039_01; }
    public void setField039_01(LocalDate field039_01) { this.field039_01 = field039_01; }

    public BigDecimal getField039_02() { return field039_02; }
    public void setField039_02(BigDecimal field039_02) { this.field039_02 = field039_02; }

    public Boolean getField039_03() { return field039_03; }
    public void setField039_03(Boolean field039_03) { this.field039_03 = field039_03; }

    public BigDecimal getField039_04() { return field039_04; }
    public void setField039_04(BigDecimal field039_04) { this.field039_04 = field039_04; }

    public LocalDate getField039_05() { return field039_05; }
    public void setField039_05(LocalDate field039_05) { this.field039_05 = field039_05; }

    public Integer getField039_06() { return field039_06; }
    public void setField039_06(Integer field039_06) { this.field039_06 = field039_06; }

    public Boolean getField039_07() { return field039_07; }
    public void setField039_07(Boolean field039_07) { this.field039_07 = field039_07; }

    public String getField039_08() { return field039_08; }
    public void setField039_08(String field039_08) { this.field039_08 = field039_08; }

    public BigDecimal getField039_09() { return field039_09; }
    public void setField039_09(BigDecimal field039_09) { this.field039_09 = field039_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV039)) return false;
        MobilePaymentV039 that = (MobilePaymentV039) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV039{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
