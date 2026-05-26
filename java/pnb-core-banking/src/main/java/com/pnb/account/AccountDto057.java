package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto057 — Data Transfer Object for account operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto057 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Long accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @JsonProperty("accoField005")
    private Boolean accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @Size(max = 40)
    @JsonProperty("accoField007")
    private String accoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField008")
    private BigDecimal accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private LocalDate accoField011;

    @JsonProperty("accoField012")
    private Long accoField012;

    @JsonProperty("accoField013")
    private Long accoField013;

    @JsonProperty("accoField014")
    private Boolean accoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField015")
    private BigDecimal accoField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField016")
    private BigDecimal accoField016;

    public AccountDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto057 instance = new AccountDto057();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Long val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Boolean val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(LocalDate val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Long val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Long val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Boolean val) { instance.accoField014 = val; return this; }
        public Builder accoField015(BigDecimal val) { instance.accoField015 = val; return this; }
        public Builder accoField016(BigDecimal val) { instance.accoField016 = val; return this; }
        public AccountDto057 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Long getAccoField002() { return accoField002; }
    public void setAccoField002(Long accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public Boolean getAccoField005() { return accoField005; }
    public void setAccoField005(Boolean accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public LocalDate getAccoField011() { return accoField011; }
    public void setAccoField011(LocalDate accoField011) { this.accoField011 = accoField011; }

    public Long getAccoField012() { return accoField012; }
    public void setAccoField012(Long accoField012) { this.accoField012 = accoField012; }

    public Long getAccoField013() { return accoField013; }
    public void setAccoField013(Long accoField013) { this.accoField013 = accoField013; }

    public Boolean getAccoField014() { return accoField014; }
    public void setAccoField014(Boolean accoField014) { this.accoField014 = accoField014; }

    public BigDecimal getAccoField015() { return accoField015; }
    public void setAccoField015(BigDecimal accoField015) { this.accoField015 = accoField015; }

    public BigDecimal getAccoField016() { return accoField016; }
    public void setAccoField016(BigDecimal accoField016) { this.accoField016 = accoField016; }

    @Override
    public String toString() {
        return "AccountDto057{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
