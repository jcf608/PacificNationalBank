package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto033 — Data Transfer Object for account operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto033 {

    @JsonProperty("accoField000")
    private Integer accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField004")
    private BigDecimal accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField006")
    private BigDecimal accoField006;

    @JsonProperty("accoField007")
    private Double accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @JsonProperty("accoField009")
    private Integer accoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField010")
    private BigDecimal accoField010;

    @Size(max = 100)
    @JsonProperty("accoField011")
    private String accoField011;

    @Size(max = 100)
    @JsonProperty("accoField012")
    private String accoField012;

    @JsonProperty("accoField013")
    private Boolean accoField013;

    @Size(max = 20)
    @JsonProperty("accoField014")
    private String accoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField015")
    private BigDecimal accoField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField016")
    private BigDecimal accoField016;

    public AccountDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto033 instance = new AccountDto033();

        public Builder accoField000(Integer val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(BigDecimal val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(BigDecimal val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Double val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Integer val) { instance.accoField009 = val; return this; }
        public Builder accoField010(BigDecimal val) { instance.accoField010 = val; return this; }
        public Builder accoField011(String val) { instance.accoField011 = val; return this; }
        public Builder accoField012(String val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Boolean val) { instance.accoField013 = val; return this; }
        public Builder accoField014(String val) { instance.accoField014 = val; return this; }
        public Builder accoField015(BigDecimal val) { instance.accoField015 = val; return this; }
        public Builder accoField016(BigDecimal val) { instance.accoField016 = val; return this; }
        public AccountDto033 build() { return instance; }
    }

    public Integer getAccoField000() { return accoField000; }
    public void setAccoField000(Integer accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public BigDecimal getAccoField004() { return accoField004; }
    public void setAccoField004(BigDecimal accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public BigDecimal getAccoField006() { return accoField006; }
    public void setAccoField006(BigDecimal accoField006) { this.accoField006 = accoField006; }

    public Double getAccoField007() { return accoField007; }
    public void setAccoField007(Double accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public Integer getAccoField009() { return accoField009; }
    public void setAccoField009(Integer accoField009) { this.accoField009 = accoField009; }

    public BigDecimal getAccoField010() { return accoField010; }
    public void setAccoField010(BigDecimal accoField010) { this.accoField010 = accoField010; }

    public String getAccoField011() { return accoField011; }
    public void setAccoField011(String accoField011) { this.accoField011 = accoField011; }

    public String getAccoField012() { return accoField012; }
    public void setAccoField012(String accoField012) { this.accoField012 = accoField012; }

    public Boolean getAccoField013() { return accoField013; }
    public void setAccoField013(Boolean accoField013) { this.accoField013 = accoField013; }

    public String getAccoField014() { return accoField014; }
    public void setAccoField014(String accoField014) { this.accoField014 = accoField014; }

    public BigDecimal getAccoField015() { return accoField015; }
    public void setAccoField015(BigDecimal accoField015) { this.accoField015 = accoField015; }

    public BigDecimal getAccoField016() { return accoField016; }
    public void setAccoField016(BigDecimal accoField016) { this.accoField016 = accoField016; }

    @Override
    public String toString() {
        return "AccountDto033{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
