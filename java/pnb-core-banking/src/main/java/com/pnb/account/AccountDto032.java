package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto032 — Data Transfer Object for account operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto032 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField001")
    private BigDecimal accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @JsonProperty("accoField004")
    private LocalDate accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private Boolean accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Integer accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    @JsonProperty("accoField011")
    private Boolean accoField011;

    @JsonProperty("accoField012")
    private LocalDate accoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField013")
    private BigDecimal accoField013;

    @JsonProperty("accoField014")
    private LocalDate accoField014;

    @JsonProperty("accoField015")
    private Long accoField015;

    public AccountDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto032 instance = new AccountDto032();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(BigDecimal val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(LocalDate val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Boolean val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Integer val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Boolean val) { instance.accoField011 = val; return this; }
        public Builder accoField012(LocalDate val) { instance.accoField012 = val; return this; }
        public Builder accoField013(BigDecimal val) { instance.accoField013 = val; return this; }
        public Builder accoField014(LocalDate val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Long val) { instance.accoField015 = val; return this; }
        public AccountDto032 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public BigDecimal getAccoField001() { return accoField001; }
    public void setAccoField001(BigDecimal accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public LocalDate getAccoField004() { return accoField004; }
    public void setAccoField004(LocalDate accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public Boolean getAccoField006() { return accoField006; }
    public void setAccoField006(Boolean accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Integer getAccoField008() { return accoField008; }
    public void setAccoField008(Integer accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    public Boolean getAccoField011() { return accoField011; }
    public void setAccoField011(Boolean accoField011) { this.accoField011 = accoField011; }

    public LocalDate getAccoField012() { return accoField012; }
    public void setAccoField012(LocalDate accoField012) { this.accoField012 = accoField012; }

    public BigDecimal getAccoField013() { return accoField013; }
    public void setAccoField013(BigDecimal accoField013) { this.accoField013 = accoField013; }

    public LocalDate getAccoField014() { return accoField014; }
    public void setAccoField014(LocalDate accoField014) { this.accoField014 = accoField014; }

    public Long getAccoField015() { return accoField015; }
    public void setAccoField015(Long accoField015) { this.accoField015 = accoField015; }

    @Override
    public String toString() {
        return "AccountDto032{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
