package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto028 — Data Transfer Object for escrow operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto028 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField002")
    private BigDecimal escrField002;

    @JsonProperty("escrField003")
    private Long escrField003;

    @JsonProperty("escrField004")
    private Integer escrField004;

    @Size(max = 60)
    @JsonProperty("escrField005")
    private String escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    @JsonProperty("escrField008")
    private Long escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private Integer escrField010;

    @Size(max = 40)
    @JsonProperty("escrField011")
    private String escrField011;

    public EscrowDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto028 instance = new EscrowDto028();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(BigDecimal val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Long val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Integer val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Long val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Integer val) { instance.escrField010 = val; return this; }
        public Builder escrField011(String val) { instance.escrField011 = val; return this; }
        public EscrowDto028 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public BigDecimal getEscrField002() { return escrField002; }
    public void setEscrField002(BigDecimal escrField002) { this.escrField002 = escrField002; }

    public Long getEscrField003() { return escrField003; }
    public void setEscrField003(Long escrField003) { this.escrField003 = escrField003; }

    public Integer getEscrField004() { return escrField004; }
    public void setEscrField004(Integer escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    public Long getEscrField008() { return escrField008; }
    public void setEscrField008(Long escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public Integer getEscrField010() { return escrField010; }
    public void setEscrField010(Integer escrField010) { this.escrField010 = escrField010; }

    public String getEscrField011() { return escrField011; }
    public void setEscrField011(String escrField011) { this.escrField011 = escrField011; }

    @Override
    public String toString() {
        return "EscrowDto028{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
