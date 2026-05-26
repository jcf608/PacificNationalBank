package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto039 — Data Transfer Object for account operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto039 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private Long accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField004")
    private BigDecimal accoField004;

    @JsonProperty("accoField005")
    private Boolean accoField005;

    @Size(max = 200)
    @JsonProperty("accoField006")
    private String accoField006;

    @Size(max = 40)
    @JsonProperty("accoField007")
    private String accoField007;

    @JsonProperty("accoField008")
    private Double accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    @JsonProperty("accoField010")
    private Long accoField010;

    public AccountDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto039 instance = new AccountDto039();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Long val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(BigDecimal val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Boolean val) { instance.accoField005 = val; return this; }
        public Builder accoField006(String val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Double val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Long val) { instance.accoField010 = val; return this; }
        public AccountDto039 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public Long getAccoField002() { return accoField002; }
    public void setAccoField002(Long accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public BigDecimal getAccoField004() { return accoField004; }
    public void setAccoField004(BigDecimal accoField004) { this.accoField004 = accoField004; }

    public Boolean getAccoField005() { return accoField005; }
    public void setAccoField005(Boolean accoField005) { this.accoField005 = accoField005; }

    public String getAccoField006() { return accoField006; }
    public void setAccoField006(String accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public Double getAccoField008() { return accoField008; }
    public void setAccoField008(Double accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    public Long getAccoField010() { return accoField010; }
    public void setAccoField010(Long accoField010) { this.accoField010 = accoField010; }

    @Override
    public String toString() {
        return "AccountDto039{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
