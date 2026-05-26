package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto047 — Data Transfer Object for account operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto047 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @Size(max = 200)
    @JsonProperty("accoField001")
    private String accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @JsonProperty("accoField003")
    private LocalDate accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @JsonProperty("accoField005")
    private LocalDate accoField005;

    @Size(max = 20)
    @JsonProperty("accoField006")
    private String accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @Size(max = 20)
    @JsonProperty("accoField008")
    private String accoField008;

    @JsonProperty("accoField009")
    private Boolean accoField009;

    @JsonProperty("accoField010")
    private Integer accoField010;

    @JsonProperty("accoField011")
    private Long accoField011;

    @JsonProperty("accoField012")
    private Double accoField012;

    @Size(max = 40)
    @JsonProperty("accoField013")
    private String accoField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("accoField014")
    private BigDecimal accoField014;

    @JsonProperty("accoField015")
    private LocalDate accoField015;

    @JsonProperty("accoField016")
    private Integer accoField016;

    @JsonProperty("accoField017")
    private Double accoField017;

    @JsonProperty("accoField018")
    private LocalDate accoField018;

    public AccountDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto047 instance = new AccountDto047();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(String val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(LocalDate val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(LocalDate val) { instance.accoField005 = val; return this; }
        public Builder accoField006(String val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(String val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Boolean val) { instance.accoField009 = val; return this; }
        public Builder accoField010(Integer val) { instance.accoField010 = val; return this; }
        public Builder accoField011(Long val) { instance.accoField011 = val; return this; }
        public Builder accoField012(Double val) { instance.accoField012 = val; return this; }
        public Builder accoField013(String val) { instance.accoField013 = val; return this; }
        public Builder accoField014(BigDecimal val) { instance.accoField014 = val; return this; }
        public Builder accoField015(LocalDate val) { instance.accoField015 = val; return this; }
        public Builder accoField016(Integer val) { instance.accoField016 = val; return this; }
        public Builder accoField017(Double val) { instance.accoField017 = val; return this; }
        public Builder accoField018(LocalDate val) { instance.accoField018 = val; return this; }
        public AccountDto047 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public String getAccoField001() { return accoField001; }
    public void setAccoField001(String accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public LocalDate getAccoField003() { return accoField003; }
    public void setAccoField003(LocalDate accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public LocalDate getAccoField005() { return accoField005; }
    public void setAccoField005(LocalDate accoField005) { this.accoField005 = accoField005; }

    public String getAccoField006() { return accoField006; }
    public void setAccoField006(String accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public String getAccoField008() { return accoField008; }
    public void setAccoField008(String accoField008) { this.accoField008 = accoField008; }

    public Boolean getAccoField009() { return accoField009; }
    public void setAccoField009(Boolean accoField009) { this.accoField009 = accoField009; }

    public Integer getAccoField010() { return accoField010; }
    public void setAccoField010(Integer accoField010) { this.accoField010 = accoField010; }

    public Long getAccoField011() { return accoField011; }
    public void setAccoField011(Long accoField011) { this.accoField011 = accoField011; }

    public Double getAccoField012() { return accoField012; }
    public void setAccoField012(Double accoField012) { this.accoField012 = accoField012; }

    public String getAccoField013() { return accoField013; }
    public void setAccoField013(String accoField013) { this.accoField013 = accoField013; }

    public BigDecimal getAccoField014() { return accoField014; }
    public void setAccoField014(BigDecimal accoField014) { this.accoField014 = accoField014; }

    public LocalDate getAccoField015() { return accoField015; }
    public void setAccoField015(LocalDate accoField015) { this.accoField015 = accoField015; }

    public Integer getAccoField016() { return accoField016; }
    public void setAccoField016(Integer accoField016) { this.accoField016 = accoField016; }

    public Double getAccoField017() { return accoField017; }
    public void setAccoField017(Double accoField017) { this.accoField017 = accoField017; }

    public LocalDate getAccoField018() { return accoField018; }
    public void setAccoField018(LocalDate accoField018) { this.accoField018 = accoField018; }

    @Override
    public String toString() {
        return "AccountDto047{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
