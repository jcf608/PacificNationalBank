package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto020 — Data Transfer Object for account operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto020 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Double accoField004;

    @Size(max = 100)
    @JsonProperty("accoField005")
    private String accoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField006")
    private BigDecimal accoField006;

    @JsonProperty("accoField007")
    private Integer accoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField008")
    private BigDecimal accoField008;

    @JsonProperty("accoField009")
    private Long accoField009;

    @Size(max = 40)
    @JsonProperty("accoField010")
    private String accoField010;

    @JsonProperty("accoField011")
    private Integer accoField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField012")
    private BigDecimal accoField012;

    @JsonProperty("accoField013")
    private Integer accoField013;

    @JsonProperty("accoField014")
    private Double accoField014;

    @Size(max = 40)
    @JsonProperty("accoField015")
    private String accoField015;

    public AccountDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto020 instance = new AccountDto020();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Double val) { instance.accoField004 = val; return this; }
        public Builder accoField005(String val) { instance.accoField005 = val; return this; }
        public Builder accoField006(BigDecimal val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Integer val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Long val) { instance.accoField009 = val; return this; }
        public Builder accoField010(String val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Integer val) { instance.accoField011 = val; return this; }
        public Builder accoField012(BigDecimal val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Integer val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Double val) { instance.accoField014 = val; return this; }
        public Builder accoField015(String val) { instance.accoField015 = val; return this; }
        public AccountDto020 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Double getAccoField004() { return accoField004; }
    public void setAccoField004(Double accoField004) { this.accoField004 = accoField004; }

    public String getAccoField005() { return accoField005; }
    public void setAccoField005(String accoField005) { this.accoField005 = accoField005; }

    public BigDecimal getAccoField006() { return accoField006; }
    public void setAccoField006(BigDecimal accoField006) { this.accoField006 = accoField006; }

    public Integer getAccoField007() { return accoField007; }
    public void setAccoField007(Integer accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public Long getAccoField009() { return accoField009; }
    public void setAccoField009(Long accoField009) { this.accoField009 = accoField009; }

    public String getAccoField010() { return accoField010; }
    public void setAccoField010(String accoField010) { this.accoField010 = accoField010; }

    public Integer getAccoField011() { return accoField011; }
    public void setAccoField011(Integer accoField011) { this.accoField011 = accoField011; }

    public BigDecimal getAccoField012() { return accoField012; }
    public void setAccoField012(BigDecimal accoField012) { this.accoField012 = accoField012; }

    public Integer getAccoField013() { return accoField013; }
    public void setAccoField013(Integer accoField013) { this.accoField013 = accoField013; }

    public Double getAccoField014() { return accoField014; }
    public void setAccoField014(Double accoField014) { this.accoField014 = accoField014; }

    public String getAccoField015() { return accoField015; }
    public void setAccoField015(String accoField015) { this.accoField015 = accoField015; }

    @Override
    public String toString() {
        return "AccountDto020{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
