package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto055 — Data Transfer Object for account operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto055 {

    @JsonProperty("accoField000")
    private Double accoField000;

    @JsonProperty("accoField001")
    private Boolean accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Double accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @JsonProperty("accoField006")
    private Double accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @Size(max = 100)
    @JsonProperty("accoField008")
    private String accoField008;

    @Size(max = 100)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private LocalDate accoField010;

    @Size(max = 60)
    @JsonProperty("accoField011")
    private String accoField011;

    @JsonProperty("accoField012")
    private Boolean accoField012;

    @JsonProperty("accoField013")
    private Long accoField013;

    @JsonProperty("accoField014")
    private Double accoField014;

    public AccountDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto055 instance = new AccountDto055();

        public Builder accoField000(Double val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Boolean val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Double val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Double val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(LocalDate val) { instance.accoField010 = val; return this; }
        public Builder accoField011(String val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Boolean val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Long val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Double val) { instance.accoField014 = val; return this; }
        public AccountDto055 build() { return instance; }
    }

    public Double getAccoField000() { return accoField000; }
    public void setAccoField000(Double accoField000) { this.accoField000 = accoField000; }

    public Boolean getAccoField001() { return accoField001; }
    public void setAccoField001(Boolean accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Double getAccoField004() { return accoField004; }
    public void setAccoField004(Double accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public Double getAccoField006() { return accoField006; }
    public void setAccoField006(Double accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public LocalDate getAccoField010() { return accoField010; }
    public void setAccoField010(LocalDate accoField010) { this.accoField010 = accoField010; }

    public String getAccoField011() { return accoField011; }
    public void setAccoField011(String accoField011) { this.accoField011 = accoField011; }

    public Boolean getAccoField012() { return accoField012; }
    public void setAccoField012(Boolean accoField012) { this.accoField012 = accoField012; }

    public Long getAccoField013() { return accoField013; }
    public void setAccoField013(Long accoField013) { this.accoField013 = accoField013; }

    public Double getAccoField014() { return accoField014; }
    public void setAccoField014(Double accoField014) { this.accoField014 = accoField014; }

    @Override
    public String toString() {
        return "AccountDto055{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
