package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto052 — Data Transfer Object for escrow operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto052 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @JsonProperty("escrField002")
    private Boolean escrField002;

    @JsonProperty("escrField003")
    private LocalDate escrField003;

    @JsonProperty("escrField004")
    private LocalDate escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @JsonProperty("escrField006")
    private Boolean escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @JsonProperty("escrField008")
    private Integer escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private LocalDate escrField010;

    @JsonProperty("escrField011")
    private Integer escrField011;

    public EscrowDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto052 instance = new EscrowDto052();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Boolean val) { instance.escrField002 = val; return this; }
        public Builder escrField003(LocalDate val) { instance.escrField003 = val; return this; }
        public Builder escrField004(LocalDate val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Boolean val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Integer val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(LocalDate val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Integer val) { instance.escrField011 = val; return this; }
        public EscrowDto052 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public Boolean getEscrField002() { return escrField002; }
    public void setEscrField002(Boolean escrField002) { this.escrField002 = escrField002; }

    public LocalDate getEscrField003() { return escrField003; }
    public void setEscrField003(LocalDate escrField003) { this.escrField003 = escrField003; }

    public LocalDate getEscrField004() { return escrField004; }
    public void setEscrField004(LocalDate escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public Boolean getEscrField006() { return escrField006; }
    public void setEscrField006(Boolean escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public Integer getEscrField008() { return escrField008; }
    public void setEscrField008(Integer escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public LocalDate getEscrField010() { return escrField010; }
    public void setEscrField010(LocalDate escrField010) { this.escrField010 = escrField010; }

    public Integer getEscrField011() { return escrField011; }
    public void setEscrField011(Integer escrField011) { this.escrField011 = escrField011; }

    @Override
    public String toString() {
        return "EscrowDto052{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
