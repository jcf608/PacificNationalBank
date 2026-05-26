package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto053 — Data Transfer Object for escrow operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto053 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField001")
    private BigDecimal escrField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField002")
    private BigDecimal escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @Size(max = 60)
    @JsonProperty("escrField004")
    private String escrField004;

    @Size(max = 100)
    @JsonProperty("escrField005")
    private String escrField005;

    @Size(max = 100)
    @JsonProperty("escrField006")
    private String escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField008")
    private BigDecimal escrField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField009")
    private BigDecimal escrField009;

    @JsonProperty("escrField010")
    private Long escrField010;

    @JsonProperty("escrField011")
    private Integer escrField011;

    @JsonProperty("escrField012")
    private Double escrField012;

    public EscrowDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto053 instance = new EscrowDto053();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(BigDecimal val) { instance.escrField001 = val; return this; }
        public Builder escrField002(BigDecimal val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(String val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(BigDecimal val) { instance.escrField008 = val; return this; }
        public Builder escrField009(BigDecimal val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Long val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Integer val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Double val) { instance.escrField012 = val; return this; }
        public EscrowDto053 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public BigDecimal getEscrField001() { return escrField001; }
    public void setEscrField001(BigDecimal escrField001) { this.escrField001 = escrField001; }

    public BigDecimal getEscrField002() { return escrField002; }
    public void setEscrField002(BigDecimal escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public String getEscrField006() { return escrField006; }
    public void setEscrField006(String escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public BigDecimal getEscrField008() { return escrField008; }
    public void setEscrField008(BigDecimal escrField008) { this.escrField008 = escrField008; }

    public BigDecimal getEscrField009() { return escrField009; }
    public void setEscrField009(BigDecimal escrField009) { this.escrField009 = escrField009; }

    public Long getEscrField010() { return escrField010; }
    public void setEscrField010(Long escrField010) { this.escrField010 = escrField010; }

    public Integer getEscrField011() { return escrField011; }
    public void setEscrField011(Integer escrField011) { this.escrField011 = escrField011; }

    public Double getEscrField012() { return escrField012; }
    public void setEscrField012(Double escrField012) { this.escrField012 = escrField012; }

    @Override
    public String toString() {
        return "EscrowDto053{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
