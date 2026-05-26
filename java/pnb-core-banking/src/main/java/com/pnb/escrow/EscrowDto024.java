package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto024 — Data Transfer Object for escrow operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto024 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private Long escrField001;

    @JsonProperty("escrField002")
    private Boolean escrField002;

    @JsonProperty("escrField003")
    private LocalDate escrField003;

    @JsonProperty("escrField004")
    private Double escrField004;

    @Size(max = 60)
    @JsonProperty("escrField005")
    private String escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    public EscrowDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto024 instance = new EscrowDto024();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Long val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Boolean val) { instance.escrField002 = val; return this; }
        public Builder escrField003(LocalDate val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Double val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public EscrowDto024 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public Long getEscrField001() { return escrField001; }
    public void setEscrField001(Long escrField001) { this.escrField001 = escrField001; }

    public Boolean getEscrField002() { return escrField002; }
    public void setEscrField002(Boolean escrField002) { this.escrField002 = escrField002; }

    public LocalDate getEscrField003() { return escrField003; }
    public void setEscrField003(LocalDate escrField003) { this.escrField003 = escrField003; }

    public Double getEscrField004() { return escrField004; }
    public void setEscrField004(Double escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    @Override
    public String toString() {
        return "EscrowDto024{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
