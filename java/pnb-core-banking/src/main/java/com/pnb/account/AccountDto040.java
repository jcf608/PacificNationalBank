package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto040 — Data Transfer Object for account operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto040 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField002")
    private BigDecimal accoField002;

    @Size(max = 60)
    @JsonProperty("accoField003")
    private String accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private Boolean accoField006;

    @Size(max = 20)
    @JsonProperty("accoField007")
    private String accoField007;

    @JsonProperty("accoField008")
    private LocalDate accoField008;

    @JsonProperty("accoField009")
    private Double accoField009;

    @Size(max = 200)
    @JsonProperty("accoField010")
    private String accoField010;

    @JsonProperty("accoField011")
    private Integer accoField011;

    public AccountDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto040 instance = new AccountDto040();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(BigDecimal val) { instance.accoField002 = val; return this; }
        public Builder accoField003(String val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Boolean val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public Builder accoField008(LocalDate val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Double val) { instance.accoField009 = val; return this; }
        public Builder accoField010(String val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Integer val) { instance.accoField011 = val; return this; }
        public AccountDto040 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public BigDecimal getAccoField002() { return accoField002; }
    public void setAccoField002(BigDecimal accoField002) { this.accoField002 = accoField002; }

    public String getAccoField003() { return accoField003; }
    public void setAccoField003(String accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public Boolean getAccoField006() { return accoField006; }
    public void setAccoField006(Boolean accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    public LocalDate getAccoField008() { return accoField008; }
    public void setAccoField008(LocalDate accoField008) { this.accoField008 = accoField008; }

    public Double getAccoField009() { return accoField009; }
    public void setAccoField009(Double accoField009) { this.accoField009 = accoField009; }

    public String getAccoField010() { return accoField010; }
    public void setAccoField010(String accoField010) { this.accoField010 = accoField010; }

    public Integer getAccoField011() { return accoField011; }
    public void setAccoField011(Integer accoField011) { this.accoField011 = accoField011; }

    @Override
    public String toString() {
        return "AccountDto040{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
