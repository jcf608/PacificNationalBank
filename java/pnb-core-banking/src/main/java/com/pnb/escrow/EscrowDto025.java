package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto025 — Data Transfer Object for escrow operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto025 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @Size(max = 100)
    @JsonProperty("escrField001")
    private String escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private LocalDate escrField003;

    @JsonProperty("escrField004")
    private Double escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @JsonProperty("escrField008")
    private Double escrField008;

    public EscrowDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto025 instance = new EscrowDto025();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(String val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(LocalDate val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Double val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Double val) { instance.escrField008 = val; return this; }
        public EscrowDto025 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public String getEscrField001() { return escrField001; }
    public void setEscrField001(String escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public LocalDate getEscrField003() { return escrField003; }
    public void setEscrField003(LocalDate escrField003) { this.escrField003 = escrField003; }

    public Double getEscrField004() { return escrField004; }
    public void setEscrField004(Double escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public Double getEscrField008() { return escrField008; }
    public void setEscrField008(Double escrField008) { this.escrField008 = escrField008; }

    @Override
    public String toString() {
        return "EscrowDto025{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
