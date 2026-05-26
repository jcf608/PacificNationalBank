package com.pnb.channel.mobile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * MobilePaymentV007 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "MOBILEPAYMENTV007")
public class MobilePaymentV007 {

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

    @Column(name = "FLD_007_00")
    private Boolean field007_00;

    @Column(name = "FLD_007_01")
    private String field007_01;

    @Column(name = "FLD_007_02")
    private LocalDate field007_02;

    @Column(name = "FLD_007_03")
    private Boolean field007_03;

    @Column(name = "FLD_007_04")
    private Boolean field007_04;

    @Column(name = "FLD_007_05")
    private Boolean field007_05;

    @Column(name = "FLD_007_06")
    private Integer field007_06;

    @Column(name = "FLD_007_07")
    private Integer field007_07;

    @Column(name = "FLD_007_08")
    private BigDecimal field007_08;

    @Column(name = "FLD_007_09")
    private Integer field007_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public MobilePaymentV007() {}

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

    public Boolean getField007_00() { return field007_00; }
    public void setField007_00(Boolean field007_00) { this.field007_00 = field007_00; }

    public String getField007_01() { return field007_01; }
    public void setField007_01(String field007_01) { this.field007_01 = field007_01; }

    public LocalDate getField007_02() { return field007_02; }
    public void setField007_02(LocalDate field007_02) { this.field007_02 = field007_02; }

    public Boolean getField007_03() { return field007_03; }
    public void setField007_03(Boolean field007_03) { this.field007_03 = field007_03; }

    public Boolean getField007_04() { return field007_04; }
    public void setField007_04(Boolean field007_04) { this.field007_04 = field007_04; }

    public Boolean getField007_05() { return field007_05; }
    public void setField007_05(Boolean field007_05) { this.field007_05 = field007_05; }

    public Integer getField007_06() { return field007_06; }
    public void setField007_06(Integer field007_06) { this.field007_06 = field007_06; }

    public Integer getField007_07() { return field007_07; }
    public void setField007_07(Integer field007_07) { this.field007_07 = field007_07; }

    public BigDecimal getField007_08() { return field007_08; }
    public void setField007_08(BigDecimal field007_08) { this.field007_08 = field007_08; }

    public Integer getField007_09() { return field007_09; }
    public void setField007_09(Integer field007_09) { this.field007_09 = field007_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MobilePaymentV007)) return false;
        MobilePaymentV007 that = (MobilePaymentV007) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "MobilePaymentV007{" +
            "id=" + id +
            ", paymentId=" + paymentId +
            ", senderAccount=" + senderAccount +
            ", recipientAccount=" + recipientAccount +
            ", amount=" + amount +
            ", memo=" + memo +
            '}';
    }
}
