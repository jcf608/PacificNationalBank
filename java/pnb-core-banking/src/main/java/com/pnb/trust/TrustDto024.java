package com.pnb.trust;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TrustDto024 — Data Transfer Object for trust operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrustDto024 {

    @JsonProperty("trusField000")
    private Double trusField000;

    @JsonProperty("trusField001")
    private Long trusField001;

    @JsonProperty("trusField002")
    private Boolean trusField002;

    @JsonProperty("trusField003")
    private Boolean trusField003;

    @Size(max = 100)
    @JsonProperty("trusField004")
    private String trusField004;

    @JsonProperty("trusField005")
    private Integer trusField005;

    @Size(max = 40)
    @JsonProperty("trusField006")
    private String trusField006;

    @Size(max = 200)
    @JsonProperty("trusField007")
    private String trusField007;

    public TrustDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TrustDto024 instance = new TrustDto024();

        public Builder trusField000(Double val) { instance.trusField000 = val; return this; }
        public Builder trusField001(Long val) { instance.trusField001 = val; return this; }
        public Builder trusField002(Boolean val) { instance.trusField002 = val; return this; }
        public Builder trusField003(Boolean val) { instance.trusField003 = val; return this; }
        public Builder trusField004(String val) { instance.trusField004 = val; return this; }
        public Builder trusField005(Integer val) { instance.trusField005 = val; return this; }
        public Builder trusField006(String val) { instance.trusField006 = val; return this; }
        public Builder trusField007(String val) { instance.trusField007 = val; return this; }
        public TrustDto024 build() { return instance; }
    }

    public Double getTrusField000() { return trusField000; }
    public void setTrusField000(Double trusField000) { this.trusField000 = trusField000; }

    public Long getTrusField001() { return trusField001; }
    public void setTrusField001(Long trusField001) { this.trusField001 = trusField001; }

    public Boolean getTrusField002() { return trusField002; }
    public void setTrusField002(Boolean trusField002) { this.trusField002 = trusField002; }

    public Boolean getTrusField003() { return trusField003; }
    public void setTrusField003(Boolean trusField003) { this.trusField003 = trusField003; }

    public String getTrusField004() { return trusField004; }
    public void setTrusField004(String trusField004) { this.trusField004 = trusField004; }

    public Integer getTrusField005() { return trusField005; }
    public void setTrusField005(Integer trusField005) { this.trusField005 = trusField005; }

    public String getTrusField006() { return trusField006; }
    public void setTrusField006(String trusField006) { this.trusField006 = trusField006; }

    public String getTrusField007() { return trusField007; }
    public void setTrusField007(String trusField007) { this.trusField007 = trusField007; }

    @Override
    public String toString() {
        return "TrustDto024{" +
            "trusField000=" + trusField000 + ", " +
            "trusField001=" + trusField001 + ", " +
            "trusField002=" + trusField002 + ", " +
            "trusField003=" + trusField003 + ", " +
            "trusField004=" + trusField004 + ", " +
            "}";
    }
}
