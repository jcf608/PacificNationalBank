package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto028 — Data Transfer Object for account operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto028 {

    @Size(max = 40)
    @JsonProperty("accoField000")
    private String accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private LocalDate accoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField003")
    private BigDecimal accoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField004")
    private BigDecimal accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @Size(max = 200)
    @JsonProperty("accoField007")
    private String accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @Size(max = 100)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private Double accoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField011")
    private BigDecimal accoField011;

    public AccountDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto028 instance = new AccountDto028();

        public Builder accoField000(String val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(LocalDate val) { instance.accoField002 = val; return this; }
        public Builder accoField003(BigDecimal val) { instance.accoField003 = val; return this; }
        public Builder accoField004(BigDecimal val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Double val) { instance.accoField010 = val; return this; }
        public Builder accoField011(BigDecimal val) { instance.accoField011 = val; return this; }
        public AccountDto028 build() { return instance; }
    }

    public String getAccoField000() { return accoField000; }
    public void setAccoField000(String accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public LocalDate getAccoField002() { return accoField002; }
    public void setAccoField002(LocalDate accoField002) { this.accoField002 = accoField002; }

    public BigDecimal getAccoField003() { return accoField003; }
    public void setAccoField003(BigDecimal accoField003) { this.accoField003 = accoField003; }

    public BigDecimal getAccoField004() { return accoField004; }
    public void setAccoField004(BigDecimal accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public Double getAccoField010() { return accoField010; }
    public void setAccoField010(Double accoField010) { this.accoField010 = accoField010; }

    public BigDecimal getAccoField011() { return accoField011; }
    public void setAccoField011(BigDecimal accoField011) { this.accoField011 = accoField011; }

    @Override
    public String toString() {
        return "AccountDto028{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
