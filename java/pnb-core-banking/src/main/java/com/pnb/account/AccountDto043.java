package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto043 — Data Transfer Object for account operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto043 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @Size(max = 60)
    @JsonProperty("accoField002")
    private String accoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField003")
    private BigDecimal accoField003;

    @Size(max = 200)
    @JsonProperty("accoField004")
    private String accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @Size(max = 60)
    @JsonProperty("accoField006")
    private String accoField006;

    @JsonProperty("accoField007")
    private Integer accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @Size(max = 40)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField011")
    private BigDecimal accoField011;

    @JsonProperty("accoField012")
    private Double accoField012;

    @JsonProperty("accoField013")
    private Long accoField013;

    @JsonProperty("accoField014")
    private LocalDate accoField014;

    public AccountDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto043 instance = new AccountDto043();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(String val) { instance.accoField002 = val; return this; }
        public Builder accoField003(BigDecimal val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(String val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Integer val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(BigDecimal val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Double val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Long val) { instance.accoField013 = val; return this; }
        public Builder accoField014(LocalDate val) { instance.accoField014 = val; return this; }
        public AccountDto043 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public String getAccoField002() { return accoField002; }
    public void setAccoField002(String accoField002) { this.accoField002 = accoField002; }

    public BigDecimal getAccoField003() { return accoField003; }
    public void setAccoField003(BigDecimal accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public String getAccoField006() { return accoField006; }
    public void setAccoField006(String accoField006) { this.accoField006 = accoField006; }

    public Integer getAccoField007() { return accoField007; }
    public void setAccoField007(Integer accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public BigDecimal getAccoField011() { return accoField011; }
    public void setAccoField011(BigDecimal accoField011) { this.accoField011 = accoField011; }

    public Double getAccoField012() { return accoField012; }
    public void setAccoField012(Double accoField012) { this.accoField012 = accoField012; }

    public Long getAccoField013() { return accoField013; }
    public void setAccoField013(Long accoField013) { this.accoField013 = accoField013; }

    public LocalDate getAccoField014() { return accoField014; }
    public void setAccoField014(LocalDate accoField014) { this.accoField014 = accoField014; }

    @Override
    public String toString() {
        return "AccountDto043{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
