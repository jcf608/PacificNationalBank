package com.pnb.account;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * AccountDto036 — Data Transfer Object for account operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDto036 {

    @JsonProperty("accoField000")
    private LocalDate accoField000;

    @JsonProperty("accoField001")
    private LocalDate accoField001;

    @JsonProperty("accoField002")
    private Integer accoField002;

    @JsonProperty("accoField003")
    private Double accoField003;

    @JsonProperty("accoField004")
    private Long accoField004;

    @Size(max = 60)
    @JsonProperty("accoField005")
    private String accoField005;

    @JsonProperty("accoField006")
    private LocalDate accoField006;

    @Size(max = 20)
    @JsonProperty("accoField007")
    private String accoField007;

    public AccountDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final AccountDto036 instance = new AccountDto036();

        public Builder accoField000(LocalDate val) { instance.accoField000 = val; return this; }
        public Builder accoField001(LocalDate val) { instance.accoField001 = val; return this; }
        public Builder accoField002(Integer val) { instance.accoField002 = val; return this; }
        public Builder accoField003(Double val) { instance.accoField003 = val; return this; }
        public Builder accoField004(Long val) { instance.accoField004 = val; return this; }
        public Builder accoField005(String val) { instance.accoField005 = val; return this; }
        public Builder accoField006(LocalDate val) { instance.accoField006 = val; return this; }
        public Builder accoField007(String val) { instance.accoField007 = val; return this; }
        public AccountDto036 build() { return instance; }
    }

    public LocalDate getAccoField000() { return accoField000; }
    public void setAccoField000(LocalDate accoField000) { this.accoField000 = accoField000; }

    public LocalDate getAccoField001() { return accoField001; }
    public void setAccoField001(LocalDate accoField001) { this.accoField001 = accoField001; }

    public Integer getAccoField002() { return accoField002; }
    public void setAccoField002(Integer accoField002) { this.accoField002 = accoField002; }

    public Double getAccoField003() { return accoField003; }
    public void setAccoField003(Double accoField003) { this.accoField003 = accoField003; }

    public Long getAccoField004() { return accoField004; }
    public void setAccoField004(Long accoField004) { this.accoField004 = accoField004; }

    public String getAccoField005() { return accoField005; }
    public void setAccoField005(String accoField005) { this.accoField005 = accoField005; }

    public LocalDate getAccoField006() { return accoField006; }
    public void setAccoField006(LocalDate accoField006) { this.accoField006 = accoField006; }

    public String getAccoField007() { return accoField007; }
    public void setAccoField007(String accoField007) { this.accoField007 = accoField007; }

    @Override
    public String toString() {
        return "AccountDto036{" +
            "accoField000=" + accoField000 + ", " +
            "accoField001=" + accoField001 + ", " +
            "accoField002=" + accoField002 + ", " +
            "accoField003=" + accoField003 + ", " +
            "accoField004=" + accoField004 + ", " +
            "}";
    }
}
