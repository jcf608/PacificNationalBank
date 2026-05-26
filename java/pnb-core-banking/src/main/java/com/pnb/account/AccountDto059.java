package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto059 — Data Transfer Object for account operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto059 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @Size(max = 200)
    @JsonProperty("accoField003")
    private String accoField003;

    @Size(max = 100)
    @JsonProperty("accoField004")
    private String accoField004;

    @JsonProperty("accoField005")
    private Long accoField005;

    @JsonProperty("accoField006")
    private Integer accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @JsonProperty("accoField009")
    private Integer accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private Double accoField011;

    @JsonProperty("accoField012")
    private Boolean accoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField013")
    private BigDecimal accoField013;

    @JsonProperty("accoField014")
    private Long accoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField015")
    private BigDecimal accoField015;

    @JsonProperty("accoField016")
    private Double accoField016;

    @Size(max = 40)
    @JsonProperty("accoField017")
    private String accoField017;

    @JsonProperty("accoField018")
    private Long accoField018;

    public AccountDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto059 instance = new AccountDto059();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(String val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Long val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Integer val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Integer val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Double val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Boolean val) { instance.accoField012 = val; return this; }
        public Builder accoField013(BigDecimal val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Long val) { instance.accoField014 = val; return this; }
        public Builder accoField015(BigDecimal val) { instance.accoField015 = val; return this; }
        public Builder accoField016(Double val) { instance.accoField016 = val; return this; }
        public Builder accoField017(String val) { instance.accoField017 = val; return this; }
        public Builder accoField018(Long val) { instance.accoField018 = val; return this; }
        public AccountDto059 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public String getAccoField003() { return accoField003; }
    public void setAccoField003(String accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public Long getAccoField005() { return accoField005; }
    public void setAccoField005(Long accoField005) { this.accoField005 = accoField005; }

    public Integer getAccoField006() { return accoField006; }
    public void setAccoField006(Integer accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public Integer getAccoField009() { return accoField009; }
    public void setAccoField009(Integer accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public Double getAccoField011() { return accoField011; }
    public void setAccoField011(Double accoField011) { this.accoField011 = accoField011; }

    public Boolean getAccoField012() { return accoField012; }
    public void setAccoField012(Boolean accoField012) { this.accoField012 = accoField012; }

    public BigDecimal getAccoField013() { return accoField013; }
    public void setAccoField013(BigDecimal accoField013) { this.accoField013 = accoField013; }

    public Long getAccoField014() { return accoField014; }
    public void setAccoField014(Long accoField014) { this.accoField014 = accoField014; }

    public BigDecimal getAccoField015() { return accoField015; }
    public void setAccoField015(BigDecimal accoField015) { this.accoField015 = accoField015; }

    public Double getAccoField016() { return accoField016; }
    public void setAccoField016(Double accoField016) { this.accoField016 = accoField016; }

    public String getAccoField017() { return accoField017; }
    public void setAccoField017(String accoField017) { this.accoField017 = accoField017; }

    public Long getAccoField018() { return accoField018; }
    public void setAccoField018(Long accoField018) { this.accoField018 = accoField018; }

    @Override
    public String toString() {
        return "AccountDto059{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
