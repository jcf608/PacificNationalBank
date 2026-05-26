package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto041 — Data Transfer Object for account operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto041 {

    @JsonProperty("accoField000")
    private Long accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private LocalDate accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @JsonProperty("accoField007")
    private Long accoField007;

    @JsonProperty("accoField008")
    private Long accoField008;

    @JsonProperty("accoField009")
    private Integer accoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField010")
    private BigDecimal accoField010;

    @JsonProperty("accoField011")
    private LocalDate accoField011;

    @JsonProperty("accoField012")
    private Integer accoField012;

    public AccountDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto041 instance = new AccountDto041();

        public Builder accoField000(Long val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(LocalDate val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Long val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Long val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Integer val) { instance.accoField009 = val; return this; }
        public Builder accoField010(BigDecimal val) { instance.accoField010 = val; return this; }
        public Builder accoField011(LocalDate val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Integer val) { instance.accoField012 = val; return this; }
        public AccountDto041 build() { return instance; }
    }

    public Long getAccoField000() { return accoField000; }
    public void setAccoField000(Long accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public LocalDate getAccoField005() { return accoField005; }
    public void setAccoField005(LocalDate accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public Long getAccoField007() { return accoField007; }
    public void setAccoField007(Long accoField007) { this.accoField007 = accoField007; }

    public Long getAccoField008() { return accoField008; }
    public void setAccoField008(Long accoField008) { this.accoField008 = accoField008; }

    public Integer getAccoField009() { return accoField009; }
    public void setAccoField009(Integer accoField009) { this.accoField009 = accoField009; }

    public BigDecimal getAccoField010() { return accoField010; }
    public void setAccoField010(BigDecimal accoField010) { this.accoField010 = accoField010; }

    public LocalDate getAccoField011() { return accoField011; }
    public void setAccoField011(LocalDate accoField011) { this.accoField011 = accoField011; }

    public Integer getAccoField012() { return accoField012; }
    public void setAccoField012(Integer accoField012) { this.accoField012 = accoField012; }

    @Override
    public String toString() {
        return "AccountDto041{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
