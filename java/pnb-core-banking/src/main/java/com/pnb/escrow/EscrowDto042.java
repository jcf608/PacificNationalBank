package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto042 — Data Transfer Object for escrow operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto042 {

    @JsonProperty("escrField000")
    private Double escrField000;

    @JsonProperty("escrField001")
    private Long escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField003")
    private BigDecimal escrField003;

    @JsonProperty("escrField004")
    private Boolean escrField004;

    @Size(max = 20)
    @JsonProperty("escrField005")
    private String escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField008")
    private BigDecimal escrField008;

    @JsonProperty("escrField009")
    private Boolean escrField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField010")
    private BigDecimal escrField010;

    @JsonProperty("escrField011")
    private Boolean escrField011;

    @JsonProperty("escrField012")
    private Double escrField012;

    @JsonProperty("escrField013")
    private Integer escrField013;

    public EscrowDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto042 instance = new EscrowDto042();

        public Builder escrField000(Double val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Long val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(BigDecimal val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Boolean val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(BigDecimal val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Boolean val) { instance.escrField009 = val; return this; }
        public Builder escrField010(BigDecimal val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Boolean val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Double val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Integer val) { instance.escrField013 = val; return this; }
        public EscrowDto042 build() { return instance; }
    }

    public Double getEscrField000() { return escrField000; }
    public void setEscrField000(Double escrField000) { this.escrField000 = escrField000; }

    public Long getEscrField001() { return escrField001; }
    public void setEscrField001(Long escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public BigDecimal getEscrField003() { return escrField003; }
    public void setEscrField003(BigDecimal escrField003) { this.escrField003 = escrField003; }

    public Boolean getEscrField004() { return escrField004; }
    public void setEscrField004(Boolean escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public BigDecimal getEscrField008() { return escrField008; }
    public void setEscrField008(BigDecimal escrField008) { this.escrField008 = escrField008; }

    public Boolean getEscrField009() { return escrField009; }
    public void setEscrField009(Boolean escrField009) { this.escrField009 = escrField009; }

    public BigDecimal getEscrField010() { return escrField010; }
    public void setEscrField010(BigDecimal escrField010) { this.escrField010 = escrField010; }

    public Boolean getEscrField011() { return escrField011; }
    public void setEscrField011(Boolean escrField011) { this.escrField011 = escrField011; }

    public Double getEscrField012() { return escrField012; }
    public void setEscrField012(Double escrField012) { this.escrField012 = escrField012; }

    public Integer getEscrField013() { return escrField013; }
    public void setEscrField013(Integer escrField013) { this.escrField013 = escrField013; }

    @Override
    public String toString() {
        return "EscrowDto042{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
