package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto027 — Data Transfer Object for escrow operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto027 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private Long escrField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField004")
    private BigDecimal escrField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField005")
    private BigDecimal escrField005;

    @JsonProperty("escrField006")
    private LocalDate escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @Size(max = 100)
    @JsonProperty("escrField008")
    private String escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    public EscrowDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto027 instance = new EscrowDto027();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Long val) { instance.escrField003 = val; return this; }
        public Builder escrField004(BigDecimal val) { instance.escrField004 = val; return this; }
        public Builder escrField005(BigDecimal val) { instance.escrField005 = val; return this; }
        public Builder escrField006(LocalDate val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(String val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public EscrowDto027 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public Long getEscrField003() { return escrField003; }
    public void setEscrField003(Long escrField003) { this.escrField003 = escrField003; }

    public BigDecimal getEscrField004() { return escrField004; }
    public void setEscrField004(BigDecimal escrField004) { this.escrField004 = escrField004; }

    public BigDecimal getEscrField005() { return escrField005; }
    public void setEscrField005(BigDecimal escrField005) { this.escrField005 = escrField005; }

    public LocalDate getEscrField006() { return escrField006; }
    public void setEscrField006(LocalDate escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public String getEscrField008() { return escrField008; }
    public void setEscrField008(String escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    @Override
    public String toString() {
        return "EscrowDto027{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
