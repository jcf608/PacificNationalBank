package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto020 — Data Transfer Object for escrow operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto020 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @JsonProperty("escrField002")
    private Long escrField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField003")
    private BigDecimal escrField003;

    @Size(max = 40)
    @JsonProperty("escrField004")
    private String escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    @JsonProperty("escrField008")
    private Boolean escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @JsonProperty("escrField011")
    private Long escrField011;

    @JsonProperty("escrField012")
    private LocalDate escrField012;

    @JsonProperty("escrField013")
    private LocalDate escrField013;

    @JsonProperty("escrField014")
    private Long escrField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField015")
    private BigDecimal escrField015;

    public EscrowDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto020 instance = new EscrowDto020();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Long val) { instance.escrField002 = val; return this; }
        public Builder escrField003(BigDecimal val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Boolean val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Long val) { instance.escrField011 = val; return this; }
        public Builder escrField012(LocalDate val) { instance.escrField012 = val; return this; }
        public Builder escrField013(LocalDate val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Long val) { instance.escrField014 = val; return this; }
        public Builder escrField015(BigDecimal val) { instance.escrField015 = val; return this; }
        public EscrowDto020 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public Long getEscrField002() { return escrField002; }
    public void setEscrField002(Long escrField002) { this.escrField002 = escrField002; }

    public BigDecimal getEscrField003() { return escrField003; }
    public void setEscrField003(BigDecimal escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    public Boolean getEscrField008() { return escrField008; }
    public void setEscrField008(Boolean escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public Long getEscrField011() { return escrField011; }
    public void setEscrField011(Long escrField011) { this.escrField011 = escrField011; }

    public LocalDate getEscrField012() { return escrField012; }
    public void setEscrField012(LocalDate escrField012) { this.escrField012 = escrField012; }

    public LocalDate getEscrField013() { return escrField013; }
    public void setEscrField013(LocalDate escrField013) { this.escrField013 = escrField013; }

    public Long getEscrField014() { return escrField014; }
    public void setEscrField014(Long escrField014) { this.escrField014 = escrField014; }

    public BigDecimal getEscrField015() { return escrField015; }
    public void setEscrField015(BigDecimal escrField015) { this.escrField015 = escrField015; }

    @Override
    public String toString() {
        return "EscrowDto020{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
