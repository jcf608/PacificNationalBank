package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV020 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV020")
public class OnlineBankingSessionV020 {

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

    @Column(name = "FLD_020_00")
    private LocalDate field020_00;

    @Column(name = "FLD_020_01")
    private Boolean field020_01;

    @Column(name = "FLD_020_02")
    private LocalDate field020_02;

    @Column(name = "FLD_020_03")
    private Boolean field020_03;

    @Column(name = "FLD_020_04")
    private Integer field020_04;

    @Column(name = "FLD_020_05")
    private Boolean field020_05;

    @Column(name = "FLD_020_06")
    private String field020_06;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV020() {}

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

    public LocalDate getField020_00() { return field020_00; }
    public void setField020_00(LocalDate field020_00) { this.field020_00 = field020_00; }

    public Boolean getField020_01() { return field020_01; }
    public void setField020_01(Boolean field020_01) { this.field020_01 = field020_01; }

    public LocalDate getField020_02() { return field020_02; }
    public void setField020_02(LocalDate field020_02) { this.field020_02 = field020_02; }

    public Boolean getField020_03() { return field020_03; }
    public void setField020_03(Boolean field020_03) { this.field020_03 = field020_03; }

    public Integer getField020_04() { return field020_04; }
    public void setField020_04(Integer field020_04) { this.field020_04 = field020_04; }

    public Boolean getField020_05() { return field020_05; }
    public void setField020_05(Boolean field020_05) { this.field020_05 = field020_05; }

    public String getField020_06() { return field020_06; }
    public void setField020_06(String field020_06) { this.field020_06 = field020_06; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV020)) return false;
        OnlineBankingSessionV020 that = (OnlineBankingSessionV020) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV020{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
