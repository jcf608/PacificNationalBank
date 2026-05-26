package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto050 — Data Transfer Object for escrow operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto050 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @JsonProperty("escrField001")
    private Integer escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @JsonProperty("escrField003")
    private LocalDate escrField003;

    @JsonProperty("escrField004")
    private LocalDate escrField004;

    @Size(max = 60)
    @JsonProperty("escrField005")
    private String escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField008")
    private BigDecimal escrField008;

    @JsonProperty("escrField009")
    private Integer escrField009;

    public EscrowDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto050 instance = new EscrowDto050();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Integer val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(LocalDate val) { instance.escrField003 = val; return this; }
        public Builder escrField004(LocalDate val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(BigDecimal val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Integer val) { instance.escrField009 = val; return this; }
        public EscrowDto050 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public Integer getEscrField001() { return escrField001; }
    public void setEscrField001(Integer escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public LocalDate getEscrField003() { return escrField003; }
    public void setEscrField003(LocalDate escrField003) { this.escrField003 = escrField003; }

    public LocalDate getEscrField004() { return escrField004; }
    public void setEscrField004(LocalDate escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public BigDecimal getEscrField008() { return escrField008; }
    public void setEscrField008(BigDecimal escrField008) { this.escrField008 = escrField008; }

    public Integer getEscrField009() { return escrField009; }
    public void setEscrField009(Integer escrField009) { this.escrField009 = escrField009; }

    @Override
    public String toString() {
        return "EscrowDto050{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
