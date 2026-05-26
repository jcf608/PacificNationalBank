package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto053 — Data Transfer Object for account operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto053 {

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField000")
    private BigDecimal accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @Size(max = 60)
    @JsonProperty("accoField004")
    private String accoField004;

    @JsonProperty("accoField005")
    private Double accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Long accoField008;

    @JsonProperty("accoField009")
    private Integer accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    @Size(max = 40)
    @JsonProperty("accoField011")
    private String accoField011;

    @JsonProperty("accoField012")
    private Integer accoField012;

    public AccountDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto053 instance = new AccountDto053();

        public Builder accoField000(BigDecimal val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Double val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Long val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Integer val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public Builder accoField011(String val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Integer val) { instance.accoField012 = val; return this; }
        public AccountDto053 build() { return instance; }
    }

    public BigDecimal getAccoField000() { return accoField000; }
    public void setAccoField000(BigDecimal accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public Double getAccoField005() { return accoField005; }
    public void setAccoField005(Double accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Long getAccoField008() { return accoField008; }
    public void setAccoField008(Long accoField008) { this.accoField008 = accoField008; }

    public Integer getAccoField009() { return accoField009; }
    public void setAccoField009(Integer accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    public String getAccoField011() { return accoField011; }
    public void setAccoField011(String accoField011) { this.accoField011 = accoField011; }

    public Integer getAccoField012() { return accoField012; }
    public void setAccoField012(Integer accoField012) { this.accoField012 = accoField012; }

    @Override
    public String toString() {
        return "AccountDto053{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
