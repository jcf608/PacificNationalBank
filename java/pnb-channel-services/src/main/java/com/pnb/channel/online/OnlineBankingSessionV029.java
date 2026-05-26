package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV029 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV029")
public class OnlineBankingSessionV029 {

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

    @Column(name = "FLD_029_00")
    private BigDecimal field029_00;

    @Column(name = "FLD_029_01")
    private Integer field029_01;

    @Column(name = "FLD_029_02")
    private LocalDate field029_02;

    @Column(name = "FLD_029_03")
    private Integer field029_03;

    @Column(name = "FLD_029_04")
    private LocalDate field029_04;

    @Column(name = "FLD_029_05")
    private Boolean field029_05;

    @Column(name = "FLD_029_06")
    private LocalDate field029_06;

    @Column(name = "FLD_029_07")
    private String field029_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV029() {}

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

    public BigDecimal getField029_00() { return field029_00; }
    public void setField029_00(BigDecimal field029_00) { this.field029_00 = field029_00; }

    public Integer getField029_01() { return field029_01; }
    public void setField029_01(Integer field029_01) { this.field029_01 = field029_01; }

    public LocalDate getField029_02() { return field029_02; }
    public void setField029_02(LocalDate field029_02) { this.field029_02 = field029_02; }

    public Integer getField029_03() { return field029_03; }
    public void setField029_03(Integer field029_03) { this.field029_03 = field029_03; }

    public LocalDate getField029_04() { return field029_04; }
    public void setField029_04(LocalDate field029_04) { this.field029_04 = field029_04; }

    public Boolean getField029_05() { return field029_05; }
    public void setField029_05(Boolean field029_05) { this.field029_05 = field029_05; }

    public LocalDate getField029_06() { return field029_06; }
    public void setField029_06(LocalDate field029_06) { this.field029_06 = field029_06; }

    public String getField029_07() { return field029_07; }
    public void setField029_07(String field029_07) { this.field029_07 = field029_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV029)) return false;
        OnlineBankingSessionV029 that = (OnlineBankingSessionV029) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV029{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
