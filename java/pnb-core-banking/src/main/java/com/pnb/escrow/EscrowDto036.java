package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto036 — Data Transfer Object for escrow operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto036 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @JsonProperty("escrField002")
    private Long escrField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField003")
    private BigDecimal escrField003;

    @Size(max = 20)
    @JsonProperty("escrField004")
    private String escrField004;

    @Size(max = 200)
    @JsonProperty("escrField005")
    private String escrField005;

    @JsonProperty("escrField006")
    private Long escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    public EscrowDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto036 instance = new EscrowDto036();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Long val) { instance.escrField002 = val; return this; }
        public Builder escrField003(BigDecimal val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Long val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public EscrowDto036 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public Long getEscrField002() { return escrField002; }
    public void setEscrField002(Long escrField002) { this.escrField002 = escrField002; }

    public BigDecimal getEscrField003() { return escrField003; }
    public void setEscrField003(BigDecimal escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public Long getEscrField006() { return escrField006; }
    public void setEscrField006(Long escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    @Override
    public String toString() {
        return "EscrowDto036{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
