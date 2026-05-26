package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto049 — Data Transfer Object for account operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto049 {

    @JsonProperty("accoField000")
    private Integer accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private Long accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @JsonProperty("accoField007")
    private Integer accoField007;

    @JsonProperty("accoField008")
    private Double accoField008;

    public AccountDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto049 instance = new AccountDto049();

        public Builder accoField000(Integer val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Long val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Integer val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Double val) { instance.accoField008 = val; return this; }
        public AccountDto049 build() { return instance; }
    }

    public Integer getAccoField000() { return accoField000; }
    public void setAccoField000(Integer accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public Long getAccoField003() { return accoField003; }
    public void setAccoField003(Long accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public Integer getAccoField007() { return accoField007; }
    public void setAccoField007(Integer accoField007) { this.accoField007 = accoField007; }

    public Double getAccoField008() { return accoField008; }
    public void setAccoField008(Double accoField008) { this.accoField008 = accoField008; }

    @Override
    public String toString() {
        return "AccountDto049{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
