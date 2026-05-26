package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto038 — Data Transfer Object for escrow operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto038 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private Boolean escrField003;

    @JsonProperty("escrField004")
    private Integer escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @JsonProperty("escrField006")
    private Integer escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @JsonProperty("escrField008")
    private Long escrField008;

    @Size(max = 20)
    @JsonProperty("escrField009")
    private String escrField009;

    public EscrowDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto038 instance = new EscrowDto038();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Boolean val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Integer val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Integer val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Long val) { instance.escrField008 = val; return this; }
        public Builder escrField009(String val) { instance.escrField009 = val; return this; }
        public EscrowDto038 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public Boolean getEscrField003() { return escrField003; }
    public void setEscrField003(Boolean escrField003) { this.escrField003 = escrField003; }

    public Integer getEscrField004() { return escrField004; }
    public void setEscrField004(Integer escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public Integer getEscrField006() { return escrField006; }
    public void setEscrField006(Integer escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public Long getEscrField008() { return escrField008; }
    public void setEscrField008(Long escrField008) { this.escrField008 = escrField008; }

    public String getEscrField009() { return escrField009; }
    public void setEscrField009(String escrField009) { this.escrField009 = escrField009; }

    @Override
    public String toString() {
        return "EscrowDto038{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
