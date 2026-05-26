package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto052 — Data Transfer Object for account operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto052 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @Size(max = 200)
    @JsonProperty("accoField003")
    private String accoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField004")
    private BigDecimal accoField004;

    @JsonProperty("accoField005")
    private Boolean accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @JsonProperty("accoField007")
    private Double accoField007;

    @JsonProperty("accoField008")
    private Double accoField008;

    @Size(max = 20)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private Boolean accoField011;

    public AccountDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto052 instance = new AccountDto052();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(String val) { instance.accoField003 = val; return this; }
        public Builder accoField004(BigDecimal val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Boolean val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Double val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Double val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Boolean val) { instance.accoField011 = val; return this; }
        public AccountDto052 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public String getAccoField003() { return accoField003; }
    public void setAccoField003(String accoField003) { this.accoField003 = accoField003; }

    public BigDecimal getAccoField004() { return accoField004; }
    public void setAccoField004(BigDecimal accoField004) { this.accoField004 = accoField004; }

    public Boolean getAccoField005() { return accoField005; }
    public void setAccoField005(Boolean accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public Double getAccoField007() { return accoField007; }
    public void setAccoField007(Double accoField007) { this.accoField007 = accoField007; }

    public Double getAccoField008() { return accoField008; }
    public void setAccoField008(Double accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public Boolean getAccoField011() { return accoField011; }
    public void setAccoField011(Boolean accoField011) { this.accoField011 = accoField011; }

    @Override
    public String toString() {
        return "AccountDto052{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
