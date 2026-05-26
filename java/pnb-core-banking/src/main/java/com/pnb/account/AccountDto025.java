package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto025 — Data Transfer Object for account operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto025 {

    @JsonProperty("accoField000")
    private Long accoField000;

    @Size(max = 20)
    @JsonProperty("accoField001")
    private String accoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField002")
    private BigDecimal accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private LocalDate accoField005;

    @JsonProperty("accoField006")
    private Double accoField006;

    @JsonProperty("accoField007")
    private Double accoField007;

    @Size(max = 60)
    @JsonProperty("accoField008")
    private String accoField008;

    public AccountDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto025 instance = new AccountDto025();

        public Builder accoField000(Long val) { instance.accoField000 = val; return this; }
        public Builder accoField001(String val) { instance.accoField001 = val; return this; }
        public Builder accoField002(BigDecimal val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(LocalDate val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Double val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Double val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public AccountDto025 build() { return instance; }
    }

    public Long getAccoField000() { return accoField000; }
    public void setAccoField000(Long accoField000) { this.accoField000 = accoField000; }

    public String getAccoField001() { return accoField001; }
    public void setAccoField001(String accoField001) { this.accoField001 = accoField001; }

    public BigDecimal getAccoField002() { return accoField002; }
    public void setAccoField002(BigDecimal accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public LocalDate getAccoField005() { return accoField005; }
    public void setAccoField005(LocalDate accoField005) { this.accoField005 = accoField005; }

    public Double getAccoField006() { return accoField006; }
    public void setAccoField006(Double accoField006) { this.accoField006 = accoField006; }

    public Double getAccoField007() { return accoField007; }
    public void setAccoField007(Double accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    @Override
    public String toString() {
        return "AccountDto025{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
