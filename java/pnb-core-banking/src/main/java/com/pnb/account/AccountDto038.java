package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto038 — Data Transfer Object for account operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto038 {

    @JsonProperty("accoField000")
    private Integer accoField000;

    @JsonProperty("accoField001")
    private Long accoField001;

    @JsonProperty("accoField002")
    private LocalDate accoField002;

    @JsonProperty("accoField003")
    private Long accoField003;

    @JsonProperty("accoField004")
    private Double accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @JsonProperty("accoField007")
    private Long accoField007;

    @Size(max = 100)
    @JsonProperty("accoField008")
    private String accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    public AccountDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto038 instance = new AccountDto038();

        public Builder accoField000(Integer val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Long val) { instance.accoField001 = val; return this; }
        public Builder accoField002(LocalDate val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Long val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Double val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Long val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public AccountDto038 build() { return instance; }
    }

    public Integer getAccoField000() { return accoField000; }
    public void setAccoField000(Integer accoField000) { this.accoField000 = accoField000; }

    public Long getAccoField001() { return accoField001; }
    public void setAccoField001(Long accoField001) { this.accoField001 = accoField001; }

    public LocalDate getAccoField002() { return accoField002; }
    public void setAccoField002(LocalDate accoField002) { this.accoField002 = accoField002; }

    public Long getAccoField003() { return accoField003; }
    public void setAccoField003(Long accoField003) { this.accoField003 = accoField003; }

    public Double getAccoField004() { return accoField004; }
    public void setAccoField004(Double accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public Long getAccoField007() { return accoField007; }
    public void setAccoField007(Long accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    @Override
    public String toString() {
        return "AccountDto038{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
