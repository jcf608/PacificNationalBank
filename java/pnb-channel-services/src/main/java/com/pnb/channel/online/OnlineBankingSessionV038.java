package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV038 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV038")
public class OnlineBankingSessionV038 {

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

    @Column(name = "FLD_038_00")
    private Integer field038_00;

    @Column(name = "FLD_038_01")
    private BigDecimal field038_01;

    @Column(name = "FLD_038_02")
    private Integer field038_02;

    @Column(name = "FLD_038_03")
    private BigDecimal field038_03;

    @Column(name = "FLD_038_04")
    private BigDecimal field038_04;

    @Column(name = "FLD_038_05")
    private Integer field038_05;

    @Column(name = "FLD_038_06")
    private BigDecimal field038_06;

    @Column(name = "FLD_038_07")
    private Integer field038_07;

    @Column(name = "FLD_038_08")
    private LocalDate field038_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV038() {}

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

    public Integer getField038_00() { return field038_00; }
    public void setField038_00(Integer field038_00) { this.field038_00 = field038_00; }

    public BigDecimal getField038_01() { return field038_01; }
    public void setField038_01(BigDecimal field038_01) { this.field038_01 = field038_01; }

    public Integer getField038_02() { return field038_02; }
    public void setField038_02(Integer field038_02) { this.field038_02 = field038_02; }

    public BigDecimal getField038_03() { return field038_03; }
    public void setField038_03(BigDecimal field038_03) { this.field038_03 = field038_03; }

    public BigDecimal getField038_04() { return field038_04; }
    public void setField038_04(BigDecimal field038_04) { this.field038_04 = field038_04; }

    public Integer getField038_05() { return field038_05; }
    public void setField038_05(Integer field038_05) { this.field038_05 = field038_05; }

    public BigDecimal getField038_06() { return field038_06; }
    public void setField038_06(BigDecimal field038_06) { this.field038_06 = field038_06; }

    public Integer getField038_07() { return field038_07; }
    public void setField038_07(Integer field038_07) { this.field038_07 = field038_07; }

    public LocalDate getField038_08() { return field038_08; }
    public void setField038_08(LocalDate field038_08) { this.field038_08 = field038_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV038)) return false;
        OnlineBankingSessionV038 that = (OnlineBankingSessionV038) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV038{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
