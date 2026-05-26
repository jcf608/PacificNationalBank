package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto029 — Data Transfer Object for account operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto029 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @Size(max = 20)
    @JsonProperty("accoField001")
    private String accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField003")
    private BigDecimal accoField003;

    @JsonProperty("accoField004")
    private LocalDate accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @JsonProperty("accoField006")
    private Double accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Boolean accoField008;

    @Size(max = 200)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private LocalDate accoField011;

    @JsonProperty("accoField012")
    private Long accoField012;

    public AccountDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto029 instance = new AccountDto029();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(String val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(BigDecimal val) { instance.accoField003 = val; return this; }
        public Builder accoField004(LocalDate val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Double val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Boolean val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(LocalDate val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Long val) { instance.accoField012 = val; return this; }
        public AccountDto029 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public String getAccoField001() { return accoField001; }
    public void setAccoField001(String accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public BigDecimal getAccoField003() { return accoField003; }
    public void setAccoField003(BigDecimal accoField003) { this.accoField003 = accoField003; }

    public LocalDate getAccoField004() { return accoField004; }
    public void setAccoField004(LocalDate accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public Double getAccoField006() { return accoField006; }
    public void setAccoField006(Double accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Boolean getAccoField008() { return accoField008; }
    public void setAccoField008(Boolean accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public LocalDate getAccoField011() { return accoField011; }
    public void setAccoField011(LocalDate accoField011) { this.accoField011 = accoField011; }

    public Long getAccoField012() { return accoField012; }
    public void setAccoField012(Long accoField012) { this.accoField012 = accoField012; }

    @Override
    public String toString() {
        return "AccountDto029{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
