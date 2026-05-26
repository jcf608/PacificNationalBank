package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto026 — Data Transfer Object for escrow operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto026 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private Long escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @Size(max = 60)
    @JsonProperty("escrField003")
    private String escrField003;

    @Size(max = 100)
    @JsonProperty("escrField004")
    private String escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Boolean escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField008")
    private BigDecimal escrField008;

    @JsonProperty("escrField009")
    private Double escrField009;

    public EscrowDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto026 instance = new EscrowDto026();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Long val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(String val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Boolean val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public Builder escrField008(BigDecimal val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Double val) { instance.escrField009 = val; return this; }
        public EscrowDto026 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public Long getEscrField001() { return escrField001; }
    public void setEscrField001(Long escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public String getEscrField003() { return escrField003; }
    public void setEscrField003(String escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Boolean getEscrField006() { return escrField006; }
    public void setEscrField006(Boolean escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    public BigDecimal getEscrField008() { return escrField008; }
    public void setEscrField008(BigDecimal escrField008) { this.escrField008 = escrField008; }

    public Double getEscrField009() { return escrField009; }
    public void setEscrField009(Double escrField009) { this.escrField009 = escrField009; }

    @Override
    public String toString() {
        return "EscrowDto026{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
