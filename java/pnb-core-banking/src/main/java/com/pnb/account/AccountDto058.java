package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto058 — Data Transfer Object for account operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto058 {

    @JsonProperty("accoField000")
    private Boolean accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Boolean accoField002;

    @JsonProperty("accoField003")
    private Boolean accoField003;

    @Size(max = 100)
    @JsonProperty("accoField004")
    private String accoField004;

    @JsonProperty("accoField005")
    private Boolean accoField005;

    @JsonProperty("accoField006")
    private Integer accoField006;

    @JsonProperty("accoField007")
    private LocalDate accoField007;

    @JsonProperty("accoField008")
    private Double accoField008;

    @Size(max = 200)
    @JsonProperty("accoField009")
    private String accoField009;

    @JsonProperty("accoField010")
    private Long accoField010;

    @JsonProperty("accoField011")
    private Long accoField011;

    @JsonProperty("accoField012")
    private Boolean accoField012;

    @JsonProperty("accoField013")
    private Long accoField013;

    @JsonProperty("accoField014")
    private Long accoField014;

    @JsonProperty("accoField015")
    private Double accoField015;

    @JsonProperty("accoField016")
    private LocalDate accoField016;

    @JsonProperty("accoField017")
    private Integer accoField017;

    public AccountDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto058 instance = new AccountDto058();

        public Builder accoField000(Boolean val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Boolean val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Boolean val) { instance.accoField003 = val; return this; }
        public Builder accoField004(String val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Boolean val) { instance.accoField005 = val; return this; }
        public Builder accoField006(Integer val) { instance.accoField006 = val; return this; }
        public Builder accoField007(LocalDate val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Double val) { instance.accoField008 = val; return this; }
        public Builder accoField009(String val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Long val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Long val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Boolean val) { instance.accoField012 = val; return this; }
        public Builder accoField013(Long val) { instance.accoField013 = val; return this; }
        public Builder accoField014(Long val) { instance.accoField014 = val; return this; }
        public Builder accoField015(Double val) { instance.accoField015 = val; return this; }
        public Builder accoField016(LocalDate val) { instance.accoField016 = val; return this; }
        public Builder accoField017(Integer val) { instance.accoField017 = val; return this; }
        public AccountDto058 build() { return instance; }
    }

    public Boolean getAccoField000() { return accoField000; }
    public void setAccoField000(Boolean accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Boolean getAccoField002() { return accoField002; }
    public void setAccoField002(Boolean accoField002) { this.accoField002 = accoField002; }

    public Boolean getAccoField003() { return accoField003; }
    public void setAccoField003(Boolean accoField003) { this.accoField003 = accoField003; }

    public String getAccoField004() { return accoField004; }
    public void setAccoField004(String accoField004) { this.accoField004 = accoField004; }

    public Boolean getAccoField005() { return accoField005; }
    public void setAccoField005(Boolean accoField005) { this.accoField005 = accoField005; }

    public Integer getAccoField006() { return accoField006; }
    public void setAccoField006(Integer accoField006) { this.accoField006 = accoField006; }

    public LocalDate getAccoField007() { return accoField007; }
    public void setAccoField007(LocalDate accoField007) { this.accoField007 = accoField007; }

    public Double getAccoField008() { return accoField008; }
    public void setAccoField008(Double accoField008) { this.accoField008 = accoField008; }

    public String getAccoField009() { return accoField009; }
    public void setAccoField009(String accoField009) { this.accoField009 = accoField009; }

    public Long getAccoField010() { return accoField010; }
    public void setAccoField010(Long accoField010) { this.accoField010 = accoField010; }

    public Long getAccoField011() { return accoField011; }
    public void setAccoField011(Long accoField011) { this.accoField011 = accoField011; }

    public Boolean getAccoField012() { return accoField012; }
    public void setAccoField012(Boolean accoField012) { this.accoField012 = accoField012; }

    public Long getAccoField013() { return accoField013; }
    public void setAccoField013(Long accoField013) { this.accoField013 = accoField013; }

    public Long getAccoField014() { return accoField014; }
    public void setAccoField014(Long accoField014) { this.accoField014 = accoField014; }

    public Double getAccoField015() { return accoField015; }
    public void setAccoField015(Double accoField015) { this.accoField015 = accoField015; }

    public LocalDate getAccoField016() { return accoField016; }
    public void setAccoField016(LocalDate accoField016) { this.accoField016 = accoField016; }

    public Integer getAccoField017() { return accoField017; }
    public void setAccoField017(Integer accoField017) { this.accoField017 = accoField017; }

    @Override
    public String toString() {
        return "AccountDto058{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
