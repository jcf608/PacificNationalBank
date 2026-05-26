package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV005 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV005")
public class OnlineBankingSessionV005 {

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

    @Column(name = "FLD_005_00")
    private Boolean field005_00;

    @Column(name = "FLD_005_01")
    private Integer field005_01;

    @Column(name = "FLD_005_02")
    private String field005_02;

    @Column(name = "FLD_005_03")
    private BigDecimal field005_03;

    @Column(name = "FLD_005_04")
    private LocalDate field005_04;

    @Column(name = "FLD_005_05")
    private Integer field005_05;

    @Column(name = "FLD_005_06")
    private Integer field005_06;

    @Column(name = "FLD_005_07")
    private BigDecimal field005_07;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV005() {}

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

    public Boolean getField005_00() { return field005_00; }
    public void setField005_00(Boolean field005_00) { this.field005_00 = field005_00; }

    public Integer getField005_01() { return field005_01; }
    public void setField005_01(Integer field005_01) { this.field005_01 = field005_01; }

    public String getField005_02() { return field005_02; }
    public void setField005_02(String field005_02) { this.field005_02 = field005_02; }

    public BigDecimal getField005_03() { return field005_03; }
    public void setField005_03(BigDecimal field005_03) { this.field005_03 = field005_03; }

    public LocalDate getField005_04() { return field005_04; }
    public void setField005_04(LocalDate field005_04) { this.field005_04 = field005_04; }

    public Integer getField005_05() { return field005_05; }
    public void setField005_05(Integer field005_05) { this.field005_05 = field005_05; }

    public Integer getField005_06() { return field005_06; }
    public void setField005_06(Integer field005_06) { this.field005_06 = field005_06; }

    public BigDecimal getField005_07() { return field005_07; }
    public void setField005_07(BigDecimal field005_07) { this.field005_07 = field005_07; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV005)) return false;
        OnlineBankingSessionV005 that = (OnlineBankingSessionV005) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV005{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
