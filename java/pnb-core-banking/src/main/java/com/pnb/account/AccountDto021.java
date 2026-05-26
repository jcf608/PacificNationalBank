package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto021 — Data Transfer Object for account operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto021 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @JsonProperty("accoField004")
    private Integer accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @JsonProperty("accoField006")
    private Integer accoField006;

    @JsonProperty("accoField007")
    private LocalDate accoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField008")
    private BigDecimal accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField010")
    private BigDecimal accoField010;

    @JsonProperty("accoField011")
    private LocalDate accoField011;

    @JsonProperty("accoField012")
    private LocalDate accoField012;

    @JsonProperty("accoField013")
    private Boolean accoField013;

    @JsonProperty("accoField014")
    private Double accoField014;

    @JsonProperty("accoField015")
    private Boolean accoField015;

    @JsonProperty("accoField016")
    private LocalDate accoField016;

    public AccountDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto021 instance = new AccountDto021();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Integer val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Integer val) { instance.accoField006 = val; return this; }
        public Builder accoField007(LocalDate val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public Builder accoField010(BigDecimal val) { instance.accoField010 = val; return this; }
        public Builder accoField011(LocalDate val) { instance.accoField011 = val; return this; }
        public Builder accoField012(LocalDate val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Boolean val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Double val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Boolean val) { instance.accoField015 = val; return this; }
        public Builder accoField016(LocalDate val) { instance.accoField016 = val; return this; }
        public AccountDto021 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public Integer getAccoField004() { return accoField004; }
    public void setAccoField004(Integer accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public Integer getAccoField006() { return accoField006; }
    public void setAccoField006(Integer accoField006) { this.accoField006 = accoField006; }

    public LocalDate getAccoField007() { return accoField007; }
    public void setAccoField007(LocalDate accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    public BigDecimal getAccoField010() { return accoField010; }
    public void setAccoField010(BigDecimal accoField010) { this.accoField010 = accoField010; }

    public LocalDate getAccoField011() { return accoField011; }
    public void setAccoField011(LocalDate accoField011) { this.accoField011 = accoField011; }

    public LocalDate getAccoField012() { return accoField012; }
    public void setAccoField012(LocalDate accoField012) { this.accoField012 = accoField012; }

    public Boolean getAccoField013() { return accoField013; }
    public void setAccoField013(Boolean accoField013) { this.accoField013 = accoField013; }

    public Double getAccoField014() { return accoField014; }
    public void setAccoField014(Double accoField014) { this.accoField014 = accoField014; }

    public Boolean getAccoField015() { return accoField015; }
    public void setAccoField015(Boolean accoField015) { this.accoField015 = accoField015; }

    public LocalDate getAccoField016() { return accoField016; }
    public void setAccoField016(LocalDate accoField016) { this.accoField016 = accoField016; }

    @Override
    public String toString() {
        return "AccountDto021{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
