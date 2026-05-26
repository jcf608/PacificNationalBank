package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto048 — Data Transfer Object for account operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto048 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private Integer accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private Double accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @JsonProperty("accoField006")
    private Double accoField006;

    @Size(max = 60)
    @JsonProperty("accoField007")
    private String accoField007;

    public AccountDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto048 instance = new AccountDto048();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Integer val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Double val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Double val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public AccountDto048 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public Integer getAccoField001() { return accoField001; }
    public void setAccoField001(Integer accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public Double getAccoField003() { return accoField003; }
    public void setAccoField003(Double accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public Double getAccoField006() { return accoField006; }
    public void setAccoField006(Double accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    @Override
    public String toString() {
        return "AccountDto048{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
