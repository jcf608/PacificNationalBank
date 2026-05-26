package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto037 — Data Transfer Object for escrow operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto037 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField001")
    private BigDecimal escrField001;

    @JsonProperty("escrField002")
    private Boolean escrField002;

    @JsonProperty("escrField003")
    private Integer escrField003;

    @JsonProperty("escrField004")
    private Long escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @Size(max = 20)
    @JsonProperty("escrField006")
    private String escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @JsonProperty("escrField008")
    private Boolean escrField008;

    public EscrowDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto037 instance = new EscrowDto037();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(BigDecimal val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Boolean val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Integer val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Long val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(String val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Boolean val) { instance.escrField008 = val; return this; }
        public EscrowDto037 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public BigDecimal getEscrField001() { return escrField001; }
    public void setEscrField001(BigDecimal escrField001) { this.escrField001 = escrField001; }

    public Boolean getEscrField002() { return escrField002; }
    public void setEscrField002(Boolean escrField002) { this.escrField002 = escrField002; }

    public Integer getEscrField003() { return escrField003; }
    public void setEscrField003(Integer escrField003) { this.escrField003 = escrField003; }

    public Long getEscrField004() { return escrField004; }
    public void setEscrField004(Long escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public String getEscrField006() { return escrField006; }
    public void setEscrField006(String escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public Boolean getEscrField008() { return escrField008; }
    public void setEscrField008(Boolean escrField008) { this.escrField008 = escrField008; }

    @Override
    public String toString() {
        return "EscrowDto037{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
