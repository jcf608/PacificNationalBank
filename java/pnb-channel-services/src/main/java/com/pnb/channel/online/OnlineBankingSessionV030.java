package com.pnb.channel.online;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * OnlineBankingSessionV030 — Pacific National Bank entity.
 * Auto-generated domain object.
 */
@Entity
@Table(name = "ONLINEBANKINGSESSIONV030")
public class OnlineBankingSessionV030 {

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

    @Column(name = "FLD_030_00")
    private BigDecimal field030_00;

    @Column(name = "FLD_030_01")
    private BigDecimal field030_01;

    @Column(name = "FLD_030_02")
    private String field030_02;

    @Column(name = "FLD_030_03")
    private Integer field030_03;

    @Column(name = "FLD_030_04")
    private String field030_04;

    @Column(name = "FLD_030_05")
    private Boolean field030_05;

    @Column(name = "FLD_030_06")
    private Boolean field030_06;

    @Column(name = "FLD_030_07")
    private BigDecimal field030_07;

    @Column(name = "FLD_030_08")
    private Boolean field030_08;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Version
    private Long version;

    public OnlineBankingSessionV030() {}

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

    public BigDecimal getField030_00() { return field030_00; }
    public void setField030_00(BigDecimal field030_00) { this.field030_00 = field030_00; }

    public BigDecimal getField030_01() { return field030_01; }
    public void setField030_01(BigDecimal field030_01) { this.field030_01 = field030_01; }

    public String getField030_02() { return field030_02; }
    public void setField030_02(String field030_02) { this.field030_02 = field030_02; }

    public Integer getField030_03() { return field030_03; }
    public void setField030_03(Integer field030_03) { this.field030_03 = field030_03; }

    public String getField030_04() { return field030_04; }
    public void setField030_04(String field030_04) { this.field030_04 = field030_04; }

    public Boolean getField030_05() { return field030_05; }
    public void setField030_05(Boolean field030_05) { this.field030_05 = field030_05; }

    public Boolean getField030_06() { return field030_06; }
    public void setField030_06(Boolean field030_06) { this.field030_06 = field030_06; }

    public BigDecimal getField030_07() { return field030_07; }
    public void setField030_07(BigDecimal field030_07) { this.field030_07 = field030_07; }

    public Boolean getField030_08() { return field030_08; }
    public void setField030_08(Boolean field030_08) { this.field030_08 = field030_08; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineBankingSessionV030)) return false;
        OnlineBankingSessionV030 that = (OnlineBankingSessionV030) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }

    @Override
    public String toString() {
        return "OnlineBankingSessionV030{" +
            "id=" + id +
            ", sessionId=" + sessionId +
            ", customerId=" + customerId +
            ", ipAddress=" + ipAddress +
            ", userAgent=" + userAgent +
            ", loginTime=" + loginTime +
            '}';
    }
}
