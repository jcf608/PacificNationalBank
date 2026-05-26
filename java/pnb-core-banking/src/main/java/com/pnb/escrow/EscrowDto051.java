package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto051 — Data Transfer Object for escrow operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto051 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @JsonProperty("escrField001")
    private LocalDate escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @JsonProperty("escrField004")
    private Integer escrField004;

    @JsonProperty("escrField005")
    private LocalDate escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @JsonProperty("escrField008")
    private Integer escrField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField009")
    private BigDecimal escrField009;

    @JsonProperty("escrField010")
    private Long escrField010;

    public EscrowDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto051 instance = new EscrowDto051();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(LocalDate val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Integer val) { instance.escrField004 = val; return this; }
        public Builder escrField005(LocalDate val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Integer val) { instance.escrField008 = val; return this; }
        public Builder escrField009(BigDecimal val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Long val) { instance.escrField010 = val; return this; }
        public EscrowDto051 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public LocalDate getEscrField001() { return escrField001; }
    public void setEscrField001(LocalDate escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public Integer getEscrField004() { return escrField004; }
    public void setEscrField004(Integer escrField004) { this.escrField004 = escrField004; }

    public LocalDate getEscrField005() { return escrField005; }
    public void setEscrField005(LocalDate escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public Integer getEscrField008() { return escrField008; }
    public void setEscrField008(Integer escrField008) { this.escrField008 = escrField008; }

    public BigDecimal getEscrField009() { return escrField009; }
    public void setEscrField009(BigDecimal escrField009) { this.escrField009 = escrField009; }

    public Long getEscrField010() { return escrField010; }
    public void setEscrField010(Long escrField010) { this.escrField010 = escrField010; }

    @Override
    public String toString() {
        return "EscrowDto051{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
