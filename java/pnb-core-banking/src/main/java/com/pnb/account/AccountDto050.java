package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto050 — Data Transfer Object for account operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto050 {

    @JsonProperty("accoField000")
    private Long accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @JsonProperty("accoField005")
    private LocalDate accoField005;

    @JsonProperty("accoField006")
    private Boolean accoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField007")
    private BigDecimal accoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField008")
    private BigDecimal accoField008;

    @JsonProperty("accoField009")
    private Boolean accoField009;

    public AccountDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto050 instance = new AccountDto050();

        public Builder accoField000(Long val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(LocalDate val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Boolean val) { instance.accoField006 = val; return this; }
        public Builder accoField007(BigDecimal val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Boolean val) { instance.accoField009 = val; return this; }
        public AccountDto050 build() { return instance; }
    }

    public Long getAccoField000() { return accoField000; }
    public void setAccoField000(Long accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public LocalDate getAccoField005() { return accoField005; }
    public void setAccoField005(LocalDate accoField005) { this.accoField005 = accoField005; }

    public Boolean getAccoField006() { return accoField006; }
    public void setAccoField006(Boolean accoField006) { this.accoField006 = accoField006; }

    public BigDecimal getAccoField007() { return accoField007; }
    public void setAccoField007(BigDecimal accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public Boolean getAccoField009() { return accoField009; }
    public void setAccoField009(Boolean accoField009) { this.accoField009 = accoField009; }

    @Override
    public String toString() {
        return "AccountDto050{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
