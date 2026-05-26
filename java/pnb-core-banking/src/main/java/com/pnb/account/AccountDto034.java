package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto034 — Data Transfer Object for account operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto034 {

    @JsonProperty("accoField000")
    private Boolean accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @Size(max = 200)
    @JsonProperty("accoField002")
    private String accoField002;

    @JsonProperty("accoField003")
    private Double accoField003;

    @JsonProperty("accoField004")
    private Double accoField004;

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
    private Boolean accoField009;

    @JsonProperty("accoField010")
    private Long accoField010;

    @JsonProperty("accoField011")
    private Integer accoField011;

    @JsonProperty("accoField012")
    private Double accoField012;

    @Size(max = 20)
    @JsonProperty("accoField013")
    private String accoField013;

    @JsonProperty("accoField014")
    private LocalDate accoField014;

    @JsonProperty("accoField015")
    private Long accoField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField016")
    private BigDecimal accoField016;

    @Size(max = 100)
    @JsonProperty("accoField017")
    private String accoField017;

    public AccountDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto034 instance = new AccountDto034();

        public Builder accoField000(Boolean val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(String val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Double val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Double val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Integer val) { instance.accoField006 = val; return this; }
        public Builder accoField007(LocalDate val) { instance.accoField007 = val; return this; }
        public Builder accoField008(BigDecimal val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Boolean val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Long val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Integer val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Double val) { instance.accoField012 = val; return this; }
        public Builder accoField013(String val) { instance.accoField013 = val; return this; }
        public Builder accoField014(LocalDate val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Long val) { instance.accoField015 = val; return this; }
        public Builder accoField016(BigDecimal val) { instance.accoField016 = val; return this; }
        public Builder accoField017(String val) { instance.accoField017 = val; return this; }
        public AccountDto034 build() { return instance; }
    }

    public Boolean getAccoField000() { return accoField000; }
    public void setAccoField000(Boolean accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public String getAccoField002() { return accoField002; }
    public void setAccoField002(String accoField002) { this.accoField002 = accoField002; }

    public Double getAccoField003() { return accoField003; }
    public void setAccoField003(Double accoField003) { this.accoField003 = accoField003; }

    public Double getAccoField004() { return accoField004; }
    public void setAccoField004(Double accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public Integer getAccoField006() { return accoField006; }
    public void setAccoField006(Integer accoField006) { this.accoField006 = accoField006; }

    public LocalDate getAccoField007() { return accoField007; }
    public void setAccoField007(LocalDate accoField007) { this.accoField007 = accoField007; }

    public BigDecimal getAccoField008() { return accoField008; }
    public void setAccoField008(BigDecimal accoField008) { this.accoField008 = accoField008; }

    public Boolean getAccoField009() { return accoField009; }
    public void setAccoField009(Boolean accoField009) { this.accoField009 = accoField009; }

    public Long getAccoField010() { return accoField010; }
    public void setAccoField010(Long accoField010) { this.accoField010 = accoField010; }

    public Integer getAccoField011() { return accoField011; }
    public void setAccoField011(Integer accoField011) { this.accoField011 = accoField011; }

    public Double getAccoField012() { return accoField012; }
    public void setAccoField012(Double accoField012) { this.accoField012 = accoField012; }

    public String getAccoField013() { return accoField013; }
    public void setAccoField013(String accoField013) { this.accoField013 = accoField013; }

    public LocalDate getAccoField014() { return accoField014; }
    public void setAccoField014(LocalDate accoField014) { this.accoField014 = accoField014; }

    public Long getAccoField015() { return accoField015; }
    public void setAccoField015(Long accoField015) { this.accoField015 = accoField015; }

    public BigDecimal getAccoField016() { return accoField016; }
    public void setAccoField016(BigDecimal accoField016) { this.accoField016 = accoField016; }

    public String getAccoField017() { return accoField017; }
    public void setAccoField017(String accoField017) { this.accoField017 = accoField017; }

    @Override
    public String toString() {
        return "AccountDto034{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
