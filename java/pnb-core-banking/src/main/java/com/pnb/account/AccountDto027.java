package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto027 — Data Transfer Object for account operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto027 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private Integer accoField001;

    @Size(max = 200)
    @JsonProperty("accoField002")
    private String accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @JsonProperty("accoField007")
    private Long accoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField008")
    private BigDecimal accoField008;

    @Size(max = 40)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    public AccountDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto027 instance = new AccountDto027();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Integer val) { instance.accoField001 = val; return this; }
        public Builder accoField002(String val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Long val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public AccountDto027 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public Integer getAccoField001() { return accoField001; }
    public void setAccoField001(Integer accoField001) { this.accoField001 = accoField001; }

    public String getAccoField002() { return accoField002; }
    public void setAccoField002(String accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public Long getAccoField007() { return accoField007; }
    public void setAccoField007(Long accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    @Override
    public String toString() {
        return "AccountDto027{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
