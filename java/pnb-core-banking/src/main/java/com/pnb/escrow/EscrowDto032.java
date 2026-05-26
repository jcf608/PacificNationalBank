package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto032 — Data Transfer Object for escrow operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto032 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @JsonProperty("escrField002")
    private Integer escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @Size(max = 200)
    @JsonProperty("escrField004")
    private String escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Double escrField007;

    @JsonProperty("escrField008")
    private Double escrField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField009")
    private BigDecimal escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @JsonProperty("escrField011")
    private Double escrField011;

    @JsonProperty("escrField012")
    private Double escrField012;

    @JsonProperty("escrField013")
    private Integer escrField013;

    @JsonProperty("escrField014")
    private LocalDate escrField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField015")
    private BigDecimal escrField015;

    public EscrowDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto032 instance = new EscrowDto032();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Integer val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Double val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Double val) { instance.escrField008 = val; return this; }
        public Builder escrField009(BigDecimal val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Double val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Double val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Integer val) { instance.escrField013 = val; return this; }
        public Builder escrField014(LocalDate val) { instance.escrField014 = val; return this; }
        public Builder escrField015(BigDecimal val) { instance.escrField015 = val; return this; }
        public EscrowDto032 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public Integer getEscrField002() { return escrField002; }
    public void setEscrField002(Integer escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Double getEscrField007() { return escrField007; }
    public void setEscrField007(Double escrField007) { this.escrField007 = escrField007; }

    public Double getEscrField008() { return escrField008; }
    public void setEscrField008(Double escrField008) { this.escrField008 = escrField008; }

    public BigDecimal getEscrField009() { return escrField009; }
    public void setEscrField009(BigDecimal escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public Double getEscrField011() { return escrField011; }
    public void setEscrField011(Double escrField011) { this.escrField011 = escrField011; }

    public Double getEscrField012() { return escrField012; }
    public void setEscrField012(Double escrField012) { this.escrField012 = escrField012; }

    public Integer getEscrField013() { return escrField013; }
    public void setEscrField013(Integer escrField013) { this.escrField013 = escrField013; }

    public LocalDate getEscrField014() { return escrField014; }
    public void setEscrField014(LocalDate escrField014) { this.escrField014 = escrField014; }

    public BigDecimal getEscrField015() { return escrField015; }
    public void setEscrField015(BigDecimal escrField015) { this.escrField015 = escrField015; }

    @Override
    public String toString() {
        return "EscrowDto032{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
