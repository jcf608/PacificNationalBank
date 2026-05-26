package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto025 — Data Transfer Object for trust operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto025 {

    @JsonProperty("trusField000")
    private Long trusField000;

    @JsonProperty("trusField001")
    private Double trusField001;

    @JsonProperty("trusField002")
    private LocalDate trusField002;

    @Size(max = 20)
    @JsonProperty("trusField003")
    private String trusField003;

    @Size(max = 40)
    @JsonProperty("trusField004")
    private String trusField004;

    @JsonProperty("trusField005")
    private Boolean trusField005;

    @JsonProperty("trusField006")
    private Boolean trusField006;

    @JsonProperty("trusField007")
    private Long trusField007;

    @JsonProperty("trusField008")
    private Boolean trusField008;

    public TrustDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto025 instance = new TrustDto025();

        public Builder trusField000(Long val) { instance.trusField000 = val; return this; }
        public Builder trusField001(Double val) { instance.trusField001 = val; return this; }
        public Builder trusField002(LocalDate val) { instance.trusField002 = val; return this; }
        public Builder trusField003(String val) { instance.trusField003 = val; return this; }
        public Builder trusField004(String val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Boolean val) { instance.trusField005 = val; return this; }
        public Builder trusField006(Boolean val) { instance.trusField006 = val; return this; }
        public Builder trusField007(Long val) { instance.trusField007 = val; return this; }
        public Builder trusField008(Boolean val) { instance.trusField008 = val; return this; }
        public TrustDto025 build() { return instance; }
    }

    public Long getTrusField000() { return trusField000; }
    public void setTrusField000(Long trusField000) { this.trusField000 = trusField000; }

    public Double getTrusField001() { return trusField001; }
    public void setTrusField001(Double trusField001) { this.trusField001 = trusField001; }

    public LocalDate getTrusField002() { return trusField002; }
    public void setTrusField002(LocalDate trusField002) { this.trusField002 = trusField002; }

    public String getTrusField003() { return trusField003; }
    public void setTrusField003(String trusField003) { this.trusField003 = trusField003; }

    public String getTrusField004() { return trusField004; }
    public void setTrusField004(String trusField004) { this.trusField004 = trusField004; }

    public Boolean getTrusField005() { return trusField005; }
    public void setTrusField005(Boolean trusField005) { this.trusField005 = trusField005; }

    public Boolean getTrusField006() { return trusField006; }
    public void setTrusField006(Boolean trusField006) { this.trusField006 = trusField006; }

    public Long getTrusField007() { return trusField007; }
    public void setTrusField007(Long trusField007) { this.trusField007 = trusField007; }

    public Boolean getTrusField008() { return trusField008; }
    public void setTrusField008(Boolean trusField008) { this.trusField008 = trusField008; }

    @Override
    public String toString() {
        return "TrustDto025{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
