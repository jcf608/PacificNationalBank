package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto031 — Data Transfer Object for account operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto031 {

    @Size(max = 40)
    @JsonProperty("accoField000")
    private String accoField000;

    @JsonProperty("accoField001")
    private Integer accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @JsonProperty("accoField003")
    private Double accoField003;

    @JsonProperty("accoField004")
    private Integer accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @Size(max = 60)
    @JsonProperty("accoField007")
    private String accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @JsonProperty("accoField009")
    private Boolean accoField009;

    @Size(max = 200)
    @JsonProperty("accoField010")
    private String accoField010;

    @JsonProperty("accoField011")
    private Integer accoField011;

    @JsonProperty("accoField012")
    private Integer accoField012;

    @JsonProperty("accoField013")
    private Integer accoField013;

    @JsonProperty("accoField014")
    private LocalDate accoField014;

    public AccountDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto031 instance = new AccountDto031();

        public Builder accoField000(String val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Integer val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Double val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Integer val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Boolean val) { instance.accoField009 = val; return this; }
        public Builder accoField010(String val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Integer val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Integer val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Integer val) { instance.accoField013 = val; return this; }
        public Builder accoField014(LocalDate val) { instance.accoField014 = val; return this; }
        public AccountDto031 build() { return instance; }
    }

    public String getAccoField000() { return accoField000; }
    public void setAccoField000(String accoField000) { this.accoField000 = accoField000; }

    public Integer getAccoField001() { return accoField001; }
    public void setAccoField001(Integer accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public Double getAccoField003() { return accoField003; }
    public void setAccoField003(Double accoField003) { this.accoField003 = accoField003; }

    public Integer getAccoField004() { return accoField004; }
    public void setAccoField004(Integer accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public Boolean getAccoField009() { return accoField009; }
    public void setAccoField009(Boolean accoField009) { this.accoField009 = accoField009; }

    public String getAccoField010() { return accoField010; }
    public void setAccoField010(String accoField010) { this.accoField010 = accoField010; }

    public Integer getAccoField011() { return accoField011; }
    public void setAccoField011(Integer accoField011) { this.accoField011 = accoField011; }

    public Integer getAccoField012() { return accoField012; }
    public void setAccoField012(Integer accoField012) { this.accoField012 = accoField012; }

    public Integer getAccoField013() { return accoField013; }
    public void setAccoField013(Integer accoField013) { this.accoField013 = accoField013; }

    public LocalDate getAccoField014() { return accoField014; }
    public void setAccoField014(LocalDate accoField014) { this.accoField014 = accoField014; }

    @Override
    public String toString() {
        return "AccountDto031{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
