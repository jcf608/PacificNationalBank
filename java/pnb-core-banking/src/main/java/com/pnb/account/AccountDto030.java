package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto030 — Data Transfer Object for account operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto030 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @Size(max = 200)
    @JsonProperty("accoField003")
    private String accoField003;

    @Size(max = 20)
    @JsonProperty("accoField004")
    private String accoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField005")
    private BigDecimal accoField005;

    @JsonProperty("accoField006")
    private Long accoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField007")
    private BigDecimal accoField007;

    @JsonProperty("accoField008")
    private LocalDate accoField008;

    @JsonProperty("accoField009")
    private Boolean accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private Long accoField011;

    @JsonProperty("accoField012")
    private Boolean accoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField013")
    private BigDecimal accoField013;

    public AccountDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto030 instance = new AccountDto030();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(String val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(BigDecimal val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Long val) { instance.accoField006 = val; return this; }
        public Builder accoField007(BigDecimal val) { instance.accoField007 = val; return this; }
        public Builder accoField008(LocalDate val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Boolean val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Long val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Boolean val) { instance.accoField012 = val; return this; }
        public Builder accoField013(BigDecimal val) { instance.accoField013 = val; return this; }
        public AccountDto030 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public String getAccoField003() { return accoField003; }
    public void setAccoField003(String accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public BigDecimal getAccoField005() { return accoField005; }
    public void setAccoField005(BigDecimal accoField005) { this.accoField005 = accoField005; }

    public Long getAccoField006() { return accoField006; }
    public void setAccoField006(Long accoField006) { this.accoField006 = accoField006; }

    public BigDecimal getAccoField007() { return accoField007; }
    public void setAccoField007(BigDecimal accoField007) { this.accoField007 = accoField007; }

    public LocalDate getAccoField008() { return accoField008; }
    public void setAccoField008(LocalDate accoField008) { this.accoField008 = accoField008; }

    public Boolean getAccoField009() { return accoField009; }
    public void setAccoField009(Boolean accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public Long getAccoField011() { return accoField011; }
    public void setAccoField011(Long accoField011) { this.accoField011 = accoField011; }

    public Boolean getAccoField012() { return accoField012; }
    public void setAccoField012(Boolean accoField012) { this.accoField012 = accoField012; }

    public BigDecimal getAccoField013() { return accoField013; }
    public void setAccoField013(BigDecimal accoField013) { this.accoField013 = accoField013; }

    @Override
    public String toString() {
        return "AccountDto030{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
