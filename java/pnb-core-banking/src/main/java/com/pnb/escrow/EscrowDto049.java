package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto049 — Data Transfer Object for escrow operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto049 {

    @JsonProperty("escrField000")
    private Double escrField000;

    @JsonProperty("escrField001")
    private LocalDate escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField003")
    private BigDecimal escrField003;

    @JsonProperty("escrField004")
    private Boolean escrField004;

    @JsonProperty("escrField005")
    private Double escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @JsonProperty("escrField008")
    private Double escrField008;

    public EscrowDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto049 instance = new EscrowDto049();

        public Builder escrField000(Double val) { instance.escrField000 = val; return this; }
        public Builder escrField001(LocalDate val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(BigDecimal val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Boolean val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Double val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Double val) { instance.escrField008 = val; return this; }
        public EscrowDto049 build() { return instance; }
    }

    public Double getEscrField000() { return escrField000; }
    public void setEscrField000(Double escrField000) { this.escrField000 = escrField000; }

    public LocalDate getEscrField001() { return escrField001; }
    public void setEscrField001(LocalDate escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public BigDecimal getEscrField003() { return escrField003; }
    public void setEscrField003(BigDecimal escrField003) { this.escrField003 = escrField003; }

    public Boolean getEscrField004() { return escrField004; }
    public void setEscrField004(Boolean escrField004) { this.escrField004 = escrField004; }

    public Double getEscrField005() { return escrField005; }
    public void setEscrField005(Double escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public Double getEscrField008() { return escrField008; }
    public void setEscrField008(Double escrField008) { this.escrField008 = escrField008; }

    @Override
    public String toString() {
        return "EscrowDto049{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
