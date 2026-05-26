package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto026 — Data Transfer Object for account operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto026 {

    @Size(max = 200)
    @JsonProperty("accoField000")
    private String accoField000;

    @JsonProperty("accoField001")
    private Double accoField001;

    @JsonProperty("accoField002")
    private Double accoField002;

    @JsonProperty("accoField003")
    private Double accoField003;

    @JsonProperty("accoField004")
    private Boolean accoField004;

    @JsonProperty("accoField005")
    private Integer accoField005;

    @Size(max = 60)
    @JsonProperty("accoField006")
    private String accoField006;

    @JsonProperty("accoField007")
    private Boolean accoField007;

    @JsonProperty("accoField008")
    private Integer accoField008;

    @JsonProperty("accoField009")
    private Integer accoField009;

    public AccountDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto026 instance = new AccountDto026();

        public Builder accoField000(String val) { instance.accoField000 = val; return this; }
        public Builder accoField001(Double val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Double val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Double val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Boolean val) { instance.accoField004 = val; return this; }
        public Builder accoField005(Integer val) { instance.accoField005 = val; return this; }
        public Builder accoField006(String val) { instance.accoField006 = val; return this; }
        public Builder accoField007(Boolean val) { instance.accoField007 = val; return this; }
        public Builder accoField008(Integer val) { instance.accoField008 = val; return this; }
        public Builder accoField009(Integer val) { instance.accoField009 = val; return this; }
        public AccountDto026 build() { return instance; }
    }

    public String getAccoField000() { return accoField000; }
    public void setAccoField000(String accoField000) { this.accoField000 = accoField000; }

    public Double getAccoField001() { return accoField001; }
    public void setAccoField001(Double accoField001) { this.accoField001 = accoField001; }

    public Double getAccoField002() { return accoField002; }
    public void setAccoField002(Double accoField002) { this.accoField002 = accoField002; }

    public Double getAccoField003() { return accoField003; }
    public void setAccoField003(Double accoField003) { this.accoField003 = accoField003; }

    public Boolean getAccoField004() { return accoField004; }
    public void setAccoField004(Boolean accoField004) { this.accoField004 = accoField004; }

    public Integer getAccoField005() { return accoField005; }
    public void setAccoField005(Integer accoField005) { this.accoField005 = accoField005; }

    public String getAccoField006() { return accoField006; }
    public void setAccoField006(String accoField006) { this.accoField006 = accoField006; }

    public Boolean getAccoField007() { return accoField007; }
    public void setAccoField007(Boolean accoField007) { this.accoField007 = accoField007; }

    public Integer getAccoField008() { return accoField008; }
    public void setAccoField008(Integer accoField008) { this.accoField008 = accoField008; }

    public Integer getAccoField009() { return accoField009; }
    public void setAccoField009(Integer accoField009) { this.accoField009 = accoField009; }

    @Override
    public String toString() {
        return "AccountDto026{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
