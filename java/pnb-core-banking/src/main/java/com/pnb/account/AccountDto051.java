package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto051 — Data Transfer Object for account operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto051 {

    @JsonProperty("accoField000")
    private Long accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private LocalDate accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @Size(max = 200)
    @JsonProperty("accoField004")
    private String accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Integer accoField008;

    @JsonProperty("accoField009")
    private LocalDate accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    public AccountDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto051 instance = new AccountDto051();

        public Builder accoField000(Long val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(LocalDate val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Integer val) { instance.accoField008 = val; return this; }
        public Builder accoField009(LocalDate val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public AccountDto051 build() { return instance; }
    }

    public Long getAccoField000() { return accoField000; }
    public void setAccoField000(Long accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public LocalDate getAccoField002() { return accoField002; }
    public void setAccoField002(LocalDate accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Integer getAccoField008() { return accoField008; }
    public void setAccoField008(Integer accoField008) { this.accoField008 = accoField008; }

    public LocalDate getAccoField009() { return accoField009; }
    public void setAccoField009(LocalDate accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    @Override
    public String toString() {
        return "AccountDto051{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
