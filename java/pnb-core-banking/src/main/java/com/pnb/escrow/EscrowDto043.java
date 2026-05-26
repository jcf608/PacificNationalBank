package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto043 — Data Transfer Object for escrow operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto043 {

    @JsonProperty("escrField000")
    private Double escrField000;

    @Size(max = 100)
    @JsonProperty("escrField001")
    private String escrField001;

    @JsonProperty("escrField002")
    private Boolean escrField002;

    @JsonProperty("escrField003")
    private LocalDate escrField003;

    @JsonProperty("escrField004")
    private Integer escrField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField005")
    private BigDecimal escrField005;

    @JsonProperty("escrField006")
    private Integer escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    @JsonProperty("escrField008")
    private Long escrField008;

    @JsonProperty("escrField009")
    private Double escrField009;

    @JsonProperty("escrField010")
    private Double escrField010;

    @JsonProperty("escrField011")
    private LocalDate escrField011;

    @Size(max = 200)
    @JsonProperty("escrField012")
    private String escrField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField013")
    private BigDecimal escrField013;

    @JsonProperty("escrField014")
    private Integer escrField014;

    public EscrowDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto043 instance = new EscrowDto043();

        public Builder escrField000(Double val) { instance.escrField000 = val; return this; }
        public Builder escrField001(String val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Boolean val) { instance.escrField002 = val; return this; }
        public Builder escrField003(LocalDate val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Integer val) { instance.escrField004 = val; return this; }
        public Builder escrField005(BigDecimal val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Integer val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Long val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Double val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Double val) { instance.escrField010 = val; return this; }
        public Builder escrField011(LocalDate val) { instance.escrField011 = val; return this; }
        public Builder escrField012(String val) { instance.escrField012 = val; return this; }
        public Builder escrField013(BigDecimal val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Integer val) { instance.escrField014 = val; return this; }
        public EscrowDto043 build() { return instance; }
    }

    public Double getEscrField000() { return escrField000; }
    public void setEscrField000(Double escrField000) { this.escrField000 = escrField000; }

    public String getEscrField001() { return escrField001; }
    public void setEscrField001(String escrField001) { this.escrField001 = escrField001; }

    public Boolean getEscrField002() { return escrField002; }
    public void setEscrField002(Boolean escrField002) { this.escrField002 = escrField002; }

    public LocalDate getEscrField003() { return escrField003; }
    public void setEscrField003(LocalDate escrField003) { this.escrField003 = escrField003; }

    public Integer getEscrField004() { return escrField004; }
    public void setEscrField004(Integer escrField004) { this.escrField004 = escrField004; }

    public BigDecimal getEscrField005() { return escrField005; }
    public void setEscrField005(BigDecimal escrField005) { this.escrField005 = escrField005; }

    public Integer getEscrField006() { return escrField006; }
    public void setEscrField006(Integer escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    public Long getEscrField008() { return escrField008; }
    public void setEscrField008(Long escrField008) { this.escrField008 = escrField008; }

    public Double getEscrField009() { return escrField009; }
    public void setEscrField009(Double escrField009) { this.escrField009 = escrField009; }

    public Double getEscrField010() { return escrField010; }
    public void setEscrField010(Double escrField010) { this.escrField010 = escrField010; }

    public LocalDate getEscrField011() { return escrField011; }
    public void setEscrField011(LocalDate escrField011) { this.escrField011 = escrField011; }

    public String getEscrField012() { return escrField012; }
    public void setEscrField012(String escrField012) { this.escrField012 = escrField012; }

    public BigDecimal getEscrField013() { return escrField013; }
    public void setEscrField013(BigDecimal escrField013) { this.escrField013 = escrField013; }

    public Integer getEscrField014() { return escrField014; }
    public void setEscrField014(Integer escrField014) { this.escrField014 = escrField014; }

    @Override
    public String toString() {
        return "EscrowDto043{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
