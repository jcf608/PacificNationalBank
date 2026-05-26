package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV027 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV027")
public class OnlineBankingSessionV027 {

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

    @Column(name = "FLD_027_00")
    private String field027_00;

    @Column(name = "FLD_027_01")
    private Boolean field027_01;

    @Column(name = "FLD_027_02")
    private BigDecimal field027_02;

    @Column(name = "FLD_027_03")
    private BigDecimal field027_03;

    @Column(name = "FLD_027_04")
    private LocalDate field027_04;

    @Column(name = "FLD_027_05")
    private Boolean field027_05;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV027() {}

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

    public String getField027_00() { return field027_00; }
    public void setField027_00(String field027_00) { this.field027_00 = field027_00; }

    public Boolean getField027_01() { return field027_01; }
    public void setField027_01(Boolean field027_01) { this.field027_01 = field027_01; }

    public BigDecimal getField027_02() { return field027_02; }
    public void setField027_02(BigDecimal field027_02) { this.field027_02 = field027_02; }

    public BigDecimal getField027_03() { return field027_03; }
    public void setField027_03(BigDecimal field027_03) { this.field027_03 = field027_03; }

    public LocalDate getField027_04() { return field027_04; }
    public void setField027_04(LocalDate field027_04) { this.field027_04 = field027_04; }

    public Boolean getField027_05() { return field027_05; }
    public void setField027_05(Boolean field027_05) { this.field027_05 = field027_05; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV027)) return false;
        OnlineBankingSessionV027 that = (OnlineBankingSessionV027) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV027{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
