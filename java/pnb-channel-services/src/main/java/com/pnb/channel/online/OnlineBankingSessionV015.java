package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV015 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV015")
public class OnlineBankingSessionV015 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "SESSION_ID", unique = true)
    private String sessionId;

    @Column(name = "CUST_ID")
    private String customerId;

    @Column(name = "IP_ADDR")
    private String ipAddress;

    @Column(name = "USER_AGENT")
    private String userAgent;

    @Column(name = "LOGIN_TIME")
    private LocalDateTime loginTime;

    @Column(name = "LOGOUT_TIME")
    private LocalDateTime logoutTime;

    @Column(name = "MFA_VERIFIED")
    private Boolean mfaVerified;

    @Column(name = "FLD_015_00")
    private LocalDate field015_00;

    @Column(name = "FLD_015_01")
    private LocalDate field015_01;

    @Column(name = "FLD_015_02")
    private LocalDate field015_02;

    @Column(name = "FLD_015_03")
    private BigDecimal field015_03;

    @Column(name = "FLD_015_04")
    private Integer field015_04;

    @Column(name = "FLD_015_05")
    private BigDecimal field015_05;

    @Column(name = "FLD_015_06")
    private BigDecimal field015_06;

    @Column(name = "FLD_015_07")
    private Boolean field015_07;

    @Column(name = "FLD_015_08")
    private Boolean field015_08;

    @Column(name = "FLD_015_09")
    private Integer field015_09;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV015() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getIpAddress() { return ipAddress; }
    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }

    public String getUserAgent() { return userAgent; }
    public void setUserAgent(String userAgent) { this.userAgent = userAgent; }

    public LocalDateTime getLoginTime() { return loginTime; }
    public void setLoginTime(LocalDateTime loginTime) { this.loginTime = loginTime; }

    public LocalDateTime getLogoutTime() { return logoutTime; }
    public void setLogoutTime(LocalDateTime logoutTime) { this.logoutTime = logoutTime; }

    public Boolean getMfaVerified() { return mfaVerified; }
    public void setMfaVerified(Boolean mfaVerified) { this.mfaVerified = mfaVerified; }

    public LocalDate getField015_00() { return field015_00; }
    public void setField015_00(LocalDate field015_00) { this.field015_00 = field015_00; }

    public LocalDate getField015_01() { return field015_01; }
    public void setField015_01(LocalDate field015_01) { this.field015_01 = field015_01; }

    public LocalDate getField015_02() { return field015_02; }
    public void setField015_02(LocalDate field015_02) { this.field015_02 = field015_02; }

    public BigDecimal getField015_03() { return field015_03; }
    public void setField015_03(BigDecimal field015_03) { this.field015_03 = field015_03; }

    public Integer getField015_04() { return field015_04; }
    public void setField015_04(Integer field015_04) { this.field015_04 = field015_04; }

    public BigDecimal getField015_05() { return field015_05; }
    public void setField015_05(BigDecimal field015_05) { this.field015_05 = field015_05; }

    public BigDecimal getField015_06() { return field015_06; }
    public void setField015_06(BigDecimal field015_06) { this.field015_06 = field015_06; }

    public Boolean getField015_07() { return field015_07; }
    public void setField015_07(Boolean field015_07) { this.field015_07 = field015_07; }

    public Boolean getField015_08() { return field015_08; }
    public void setField015_08(Boolean field015_08) { this.field015_08 = field015_08; }

    public Integer getField015_09() { return field015_09; }
    public void setField015_09(Integer field015_09) { this.field015_09 = field015_09; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV015)) return false;
        OnlineBankingSessionV015 that = (OnlineBankingSessionV015) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV015{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
