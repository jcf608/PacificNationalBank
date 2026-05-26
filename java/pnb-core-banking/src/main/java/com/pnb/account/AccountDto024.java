package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto024 — Data Transfer Object for account operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto024 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private Long accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private Integer accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @JsonProperty("accoField005")
    private Boolean accoField005;

    @JsonProperty("accoField006")
    private Integer accoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField007")
    private BigDecimal accoField007;

    public AccountDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto024 instance = new AccountDto024();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Long val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Integer val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Boolean val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Integer val) { instance.accoField006 = val; return this; }
        public Builder accoField007(BigDecimal val) { instance.accoField007 = val; return this; }
        public AccountDto024 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public Long getAccoField001() { return accoField001; }
    public void setAccoField001(Long accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public Integer getAccoField003() { return accoField003; }
    public void setAccoField003(Integer accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public Boolean getAccoField005() { return accoField005; }
    public void setAccoField005(Boolean accoField005) { this.accoField005 = accoField005; }

    public Integer getAccoField006() { return accoField006; }
    public void setAccoField006(Integer accoField006) { this.accoField006 = accoField006; }

    public BigDecimal getAccoField007() { return accoField007; }
    public void setAccoField007(BigDecimal accoField007) { this.accoField007 = accoField007; }

    @Override
    public String toString() {
        return "AccountDto024{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
