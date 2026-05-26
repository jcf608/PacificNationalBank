package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto054 — Data Transfer Object for escrow operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto054 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @Size(max = 60)
    @JsonProperty("escrField001")
    private String escrField001;

    @JsonProperty("escrField002")
    private Boolean escrField002;

    @JsonProperty("escrField003")
    private Long escrField003;

    @JsonProperty("escrField004")
    private Long escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Boolean escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @JsonProperty("escrField008")
    private Boolean escrField008;

    @Size(max = 20)
    @JsonProperty("escrField009")
    private String escrField009;

    @JsonProperty("escrField010")
    private Double escrField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField011")
    private BigDecimal escrField011;

    @JsonProperty("escrField012")
    private Long escrField012;

    @JsonProperty("escrField013")
    private LocalDate escrField013;

    public EscrowDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto054 instance = new EscrowDto054();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(String val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Boolean val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Long val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Long val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Boolean val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Boolean val) { instance.escrField008 = val; return this; }
        public Builder escrField009(String val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Double val) { instance.escrField010 = val; return this; }
        public Builder escrField011(BigDecimal val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Long val) { instance.escrField012 = val; return this; }
        public Builder escrField013(LocalDate val) { instance.escrField013 = val; return this; }
        public EscrowDto054 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public String getEscrField001() { return escrField001; }
    public void setEscrField001(String escrField001) { this.escrField001 = escrField001; }

    public Boolean getEscrField002() { return escrField002; }
    public void setEscrField002(Boolean escrField002) { this.escrField002 = escrField002; }

    public Long getEscrField003() { return escrField003; }
    public void setEscrField003(Long escrField003) { this.escrField003 = escrField003; }

    public Long getEscrField004() { return escrField004; }
    public void setEscrField004(Long escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Boolean getEscrField006() { return escrField006; }
    public void setEscrField006(Boolean escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public Boolean getEscrField008() { return escrField008; }
    public void setEscrField008(Boolean escrField008) { this.escrField008 = escrField008; }

    public String getEscrField009() { return escrField009; }
    public void setEscrField009(String escrField009) { this.escrField009 = escrField009; }

    public Double getEscrField010() { return escrField010; }
    public void setEscrField010(Double escrField010) { this.escrField010 = escrField010; }

    public BigDecimal getEscrField011() { return escrField011; }
    public void setEscrField011(BigDecimal escrField011) { this.escrField011 = escrField011; }

    public Long getEscrField012() { return escrField012; }
    public void setEscrField012(Long escrField012) { this.escrField012 = escrField012; }

    public LocalDate getEscrField013() { return escrField013; }
    public void setEscrField013(LocalDate escrField013) { this.escrField013 = escrField013; }

    @Override
    public String toString() {
        return "EscrowDto054{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
