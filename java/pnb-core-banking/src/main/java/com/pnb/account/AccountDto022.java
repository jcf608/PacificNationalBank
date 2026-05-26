package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto022 — Data Transfer Object for account operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto022 {

    @JsonProperty("accoField000")
    private Long accoField000;

    @JsonProperty("accoField001")
    private Integer accoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField002")
    private BigDecimal accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @Size(max = 20)
    @JsonProperty("accoField007")
    private String accoField007;

    @Size(max = 60)
    @JsonProperty("accoField008")
    private String accoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField009")
    private BigDecimal accoField009;

    @Size(max = 40)
    @JsonProperty("accoField010")
    private String accoField010;

    @Size(max = 100)
    @JsonProperty("accoField011")
    private String accoField011;

    @JsonProperty("accoField012")
    private LocalDate accoField012;

    @JsonProperty("accoField013")
    private Long accoField013;

    @Size(max = 40)
    @JsonProperty("accoField014")
    private String accoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField015")
    private BigDecimal accoField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField016")
    private BigDecimal accoField016;

    @JsonProperty("accoField017")
    private Integer accoField017;

    public AccountDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto022 instance = new AccountDto022();

        public Builder accoField000(Long val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Integer val) { instance.accoField001 = val; return this; }
        public Builder accoField002(BigDecimal val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public Builder accoField009(BigDecimal val) { instance.accoField009 = val; return this; }
        public Builder accoField010(String val) { instance.accoField010 = val; return this; }
        public Builder accoField011(String val) { instance.accoField011 = val; return this; }
        public Builder accoField012(LocalDate val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Long val) { instance.accoField013 = val; return this; }
        public Builder accoField014(String val) { instance.accoField014 = val; return this; }
        public Builder accoField015(BigDecimal val) { instance.accoField015 = val; return this; }
        public Builder accoField016(BigDecimal val) { instance.accoField016 = val; return this; }
        public Builder accoField017(Integer val) { instance.accoField017 = val; return this; }
        public AccountDto022 build() { return instance; }
    }

    public Long getAccoField000() { return accoField000; }
    public void setAccoField000(Long accoField000) { this.accoField000 = accoField000; }

    public Integer getAccoField001() { return accoField001; }
    public void setAccoField001(Integer accoField001) { this.accoField001 = accoField001; }

    public BigDecimal getAccoField002() { return accoField002; }
    public void setAccoField002(BigDecimal accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    public BigDecimal getAccoField009() { return accoField009; }
    public void setAccoField009(BigDecimal accoField009) { this.accoField009 = accoField009; }

    public String getAccoField010() { return accoField010; }
    public void setAccoField010(String accoField010) { this.accoField010 = accoField010; }

    public String getAccoField011() { return accoField011; }
    public void setAccoField011(String accoField011) { this.accoField011 = accoField011; }

    public LocalDate getAccoField012() { return accoField012; }
    public void setAccoField012(LocalDate accoField012) { this.accoField012 = accoField012; }

    public Long getAccoField013() { return accoField013; }
    public void setAccoField013(Long accoField013) { this.accoField013 = accoField013; }

    public String getAccoField014() { return accoField014; }
    public void setAccoField014(String accoField014) { this.accoField014 = accoField014; }

    public BigDecimal getAccoField015() { return accoField015; }
    public void setAccoField015(BigDecimal accoField015) { this.accoField015 = accoField015; }

    public BigDecimal getAccoField016() { return accoField016; }
    public void setAccoField016(BigDecimal accoField016) { this.accoField016 = accoField016; }

    public Integer getAccoField017() { return accoField017; }
    public void setAccoField017(Integer accoField017) { this.accoField017 = accoField017; }

    @Override
    public String toString() {
        return "AccountDto022{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
