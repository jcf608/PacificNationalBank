package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto037 — Data Transfer Object for account operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto037 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @JsonProperty("accoField001")
    private Integer accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @Size(max = 100)
    @JsonProperty("accoField003")
    private String accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField006")
    private BigDecimal accoField006;

    @Size(max = 200)
    @JsonProperty("accoField007")
    private String accoField007;

    @JsonProperty("accoField008")
    private Long accoField008;

    public AccountDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto037 instance = new AccountDto037();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Integer val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(String val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(BigDecimal val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Long val) { instance.accoField008 = val; return this; }
        public AccountDto037 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public Integer getAccoField001() { return accoField001; }
    public void setAccoField001(Integer accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public String getAccoField003() { return accoField003; }
    public void setAccoField003(String accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public BigDecimal getAccoField006() { return accoField006; }
    public void setAccoField006(BigDecimal accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public Long getAccoField008() { return accoField008; }
    public void setAccoField008(Long accoField008) { this.accoField008 = accoField008; }

    @Override
    public String toString() {
        return "AccountDto037{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
