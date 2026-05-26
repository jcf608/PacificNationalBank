package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto044 — Data Transfer Object for account operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto044 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private LocalDate accoField002;

    @JsonProperty("accoField003")
    private Long accoField003;

    @JsonProperty("accoField004")
    private Integer accoField004;

    @Size(max = 20)
    @JsonProperty("accoField005")
    private String accoField005;

    @JsonProperty("accoField006")
    private Double accoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField007")
    private BigDecimal accoField007;

    @Size(max = 200)
    @JsonProperty("accoField008")
    private String accoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField009")
    private BigDecimal accoField009;

    @JsonProperty("accoField010")
    private Boolean accoField010;

    @JsonProperty("accoField011")
    private Long accoField011;

    @JsonProperty("accoField012")
    private Boolean accoField012;

    @Size(max = 20)
    @JsonProperty("accoField013")
    private String accoField013;

    @JsonProperty("accoField014")
    private Double accoField014;

    @JsonProperty("accoField015")
    private Integer accoField015;

    public AccountDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto044 instance = new AccountDto044();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(LocalDate val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Long val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Integer val) { instance.accoField004 = val; return this; }
        public Builder accoField005(String val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Double val) { instance.accoField006 = val; return this; }
        public Builder accoField007(BigDecimal val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public Builder accoField009(BigDecimal val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Boolean val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Long val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Boolean val) { instance.accoField012 = val; return this; }
        public Builder accoField013(String val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Double val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Integer val) { instance.accoField015 = val; return this; }
        public AccountDto044 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public LocalDate getAccoField002() { return accoField002; }
    public void setAccoField002(LocalDate accoField002) { this.accoField002 = accoField002; }

    public Long getAccoField003() { return accoField003; }
    public void setAccoField003(Long accoField003) { this.accoField003 = accoField003; }

    public Integer getAccoField004() { return accoField004; }
    public void setAccoField004(Integer accoField004) { this.accoField004 = accoField004; }

    public String getAccoField005() { return accoField005; }
    public void setAccoField005(String accoField005) { this.accoField005 = accoField005; }

    public Double getAccoField006() { return accoField006; }
    public void setAccoField006(Double accoField006) { this.accoField006 = accoField006; }

    public BigDecimal getAccoField007() { return accoField007; }
    public void setAccoField007(BigDecimal accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    public BigDecimal getAccoField009() { return accoField009; }
    public void setAccoField009(BigDecimal accoField009) { this.accoField009 = accoField009; }

    public Boolean getAccoField010() { return accoField010; }
    public void setAccoField010(Boolean accoField010) { this.accoField010 = accoField010; }

    public Long getAccoField011() { return accoField011; }
    public void setAccoField011(Long accoField011) { this.accoField011 = accoField011; }

    public Boolean getAccoField012() { return accoField012; }
    public void setAccoField012(Boolean accoField012) { this.accoField012 = accoField012; }

    public String getAccoField013() { return accoField013; }
    public void setAccoField013(String accoField013) { this.accoField013 = accoField013; }

    public Double getAccoField014() { return accoField014; }
    public void setAccoField014(Double accoField014) { this.accoField014 = accoField014; }

    public Integer getAccoField015() { return accoField015; }
    public void setAccoField015(Integer accoField015) { this.accoField015 = accoField015; }

    @Override
    public String toString() {
        return "AccountDto044{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
