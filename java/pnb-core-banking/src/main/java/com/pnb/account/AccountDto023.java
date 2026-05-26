package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto023 — Data Transfer Object for account operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto023 {

    @Size(max = 20)
    @JsonProperty("accoField000")
    private String accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private Integer accoField003;

    @JsonProperty("accoField004")
    private Integer accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private Boolean accoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField007")
    private BigDecimal accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @JsonProperty("accoField009")
    private LocalDate accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    @JsonProperty("accoField011")
    private Integer accoField011;

    @JsonProperty("accoField012")
    private Double accoField012;

    @Size(max = 40)
    @JsonProperty("accoField013")
    private String accoField013;

    @JsonProperty("accoField014")
    private Boolean accoField014;

    @JsonProperty("accoField015")
    private Double accoField015;

    @JsonProperty("accoField016")
    private Double accoField016;

    @JsonProperty("accoField017")
    private Boolean accoField017;

    @Size(max = 40)
    @JsonProperty("accoField018")
    private String accoField018;

    public AccountDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto023 instance = new AccountDto023();

        public Builder accoField000(String val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Integer val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Integer val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Boolean val) { instance.accoField006 = val; return this; }
        public Builder accoField007(BigDecimal val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(LocalDate val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Integer val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Double val) { instance.accoField012 = val; return this; }
        public Builder accoField013(String val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Boolean val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Double val) { instance.accoField015 = val; return this; }
        public Builder accoField016(Double val) { instance.accoField016 = val; return this; }
        public Builder accoField017(Boolean val) { instance.accoField017 = val; return this; }
        public Builder accoField018(String val) { instance.accoField018 = val; return this; }
        public AccountDto023 build() { return instance; }
    }

    public String getAccoField000() { return accoField000; }
    public void setAccoField000(String accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public Integer getAccoField003() { return accoField003; }
    public void setAccoField003(Integer accoField003) { this.accoField003 = accoField003; }

    public Integer getAccoField004() { return accoField004; }
    public void setAccoField004(Integer accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public Boolean getAccoField006() { return accoField006; }
    public void setAccoField006(Boolean accoField006) { this.accoField006 = accoField006; }

    public BigDecimal getAccoField007() { return accoField007; }
    public void setAccoField007(BigDecimal accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public LocalDate getAccoField009() { return accoField009; }
    public void setAccoField009(LocalDate accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    public Integer getAccoField011() { return accoField011; }
    public void setAccoField011(Integer accoField011) { this.accoField011 = accoField011; }

    public Double getAccoField012() { return accoField012; }
    public void setAccoField012(Double accoField012) { this.accoField012 = accoField012; }

    public String getAccoField013() { return accoField013; }
    public void setAccoField013(String accoField013) { this.accoField013 = accoField013; }

    public Boolean getAccoField014() { return accoField014; }
    public void setAccoField014(Boolean accoField014) { this.accoField014 = accoField014; }

    public Double getAccoField015() { return accoField015; }
    public void setAccoField015(Double accoField015) { this.accoField015 = accoField015; }

    public Double getAccoField016() { return accoField016; }
    public void setAccoField016(Double accoField016) { this.accoField016 = accoField016; }

    public Boolean getAccoField017() { return accoField017; }
    public void setAccoField017(Boolean accoField017) { this.accoField017 = accoField017; }

    public String getAccoField018() { return accoField018; }
    public void setAccoField018(String accoField018) { this.accoField018 = accoField018; }

    @Override
    public String toString() {
        return "AccountDto023{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
