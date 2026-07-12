package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV013 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV013")
public class OnlineBankingSessionV013 {

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

    @Column(name = "FLD_013_00")
    private LocalDate field013_00;

    @Column(name = "FLD_013_01")
    private Boolean field013_01;

    @Column(name = "FLD_013_02")
    private Boolean field013_02;

    @Column(name = "FLD_013_03")
    private Boolean field013_03;

    @Column(name = "FLD_013_04")
    private String field013_04;

    @Column(name = "FLD_013_05")
    private String field013_05;

    @Column(name = "FLD_013_06")
    private Boolean field013_06;

    @Column(name = "FLD_013_07")
    private LocalDate field013_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV013() {}

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

    public LocalDate getField013_00() { return field013_00; }
    public void setField013_00(LocalDate field013_00) { this.field013_00 = field013_00; }

    public Boolean getField013_01() { return field013_01; }
    public void setField013_01(Boolean field013_01) { this.field013_01 = field013_01; }

    public Boolean getField013_02() { return field013_02; }
    public void setField013_02(Boolean field013_02) { this.field013_02 = field013_02; }

    public Boolean getField013_03() { return field013_03; }
    public void setField013_03(Boolean field013_03) { this.field013_03 = field013_03; }

    public String getField013_04() { return field013_04; }
    public void setField013_04(String field013_04) { this.field013_04 = field013_04; }

    public String getField013_05() { return field013_05; }
    public void setField013_05(String field013_05) { this.field013_05 = field013_05; }

    public Boolean getField013_06() { return field013_06; }
    public void setField013_06(Boolean field013_06) { this.field013_06 = field013_06; }

    public LocalDate getField013_07() { return field013_07; }
    public void setField013_07(LocalDate field013_07) { this.field013_07 = field013_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV013)) return false;
        OnlineBankingSessionV013 that = (OnlineBankingSessionV013) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV013{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
