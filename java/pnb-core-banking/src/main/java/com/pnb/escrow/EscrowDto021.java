package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto021 — Data Transfer Object for escrow operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto021 {

    @JsonProperty("escrField000")
    private Double escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @Size(max = 40)
    @JsonProperty("escrField002")
    private String escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField004")
    private BigDecimal escrField004;

    @JsonProperty("escrField005")
    private Double escrField005;

    @JsonProperty("escrField006")
    private LocalDate escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @JsonProperty("escrField008")
    private Long escrField008;

    @JsonProperty("escrField009")
    private Boolean escrField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField010")
    private BigDecimal escrField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField011")
    private BigDecimal escrField011;

    @JsonProperty("escrField012")
    private Long escrField012;

    @JsonProperty("escrField013")
    private LocalDate escrField013;

    @JsonProperty("escrField014")
    private Long escrField014;

    @JsonProperty("escrField015")
    private Boolean escrField015;

    @JsonProperty("escrField016")
    private Integer escrField016;

    public EscrowDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto021 instance = new EscrowDto021();

        public Builder escrField000(Double val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(String val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(BigDecimal val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Double val) { instance.escrField005 = val; return this; }
        public Builder escrField006(LocalDate val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Long val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Boolean val) { instance.escrField009 = val; return this; }
        public Builder escrField010(BigDecimal val) { instance.escrField010 = val; return this; }
        public Builder escrField011(BigDecimal val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Long val) { instance.escrField012 = val; return this; }
        public Builder escrField013(LocalDate val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Long val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Boolean val) { instance.escrField015 = val; return this; }
        public Builder escrField016(Integer val) { instance.escrField016 = val; return this; }
        public EscrowDto021 build() { return instance; }
    }

    public Double getEscrField000() { return escrField000; }
    public void setEscrField000(Double escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public String getEscrField002() { return escrField002; }
    public void setEscrField002(String escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public BigDecimal getEscrField004() { return escrField004; }
    public void setEscrField004(BigDecimal escrField004) { this.escrField004 = escrField004; }

    public Double getEscrField005() { return escrField005; }
    public void setEscrField005(Double escrField005) { this.escrField005 = escrField005; }

    public LocalDate getEscrField006() { return escrField006; }
    public void setEscrField006(LocalDate escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public Long getEscrField008() { return escrField008; }
    public void setEscrField008(Long escrField008) { this.escrField008 = escrField008; }

    public Boolean getEscrField009() { return escrField009; }
    public void setEscrField009(Boolean escrField009) { this.escrField009 = escrField009; }

    public BigDecimal getEscrField010() { return escrField010; }
    public void setEscrField010(BigDecimal escrField010) { this.escrField010 = escrField010; }

    public BigDecimal getEscrField011() { return escrField011; }
    public void setEscrField011(BigDecimal escrField011) { this.escrField011 = escrField011; }

    public Long getEscrField012() { return escrField012; }
    public void setEscrField012(Long escrField012) { this.escrField012 = escrField012; }

    public LocalDate getEscrField013() { return escrField013; }
    public void setEscrField013(LocalDate escrField013) { this.escrField013 = escrField013; }

    public Long getEscrField014() { return escrField014; }
    public void setEscrField014(Long escrField014) { this.escrField014 = escrField014; }

    public Boolean getEscrField015() { return escrField015; }
    public void setEscrField015(Boolean escrField015) { this.escrField015 = escrField015; }

    public Integer getEscrField016() { return escrField016; }
    public void setEscrField016(Integer escrField016) { this.escrField016 = escrField016; }

    @Override
    public String toString() {
        return "EscrowDto021{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
