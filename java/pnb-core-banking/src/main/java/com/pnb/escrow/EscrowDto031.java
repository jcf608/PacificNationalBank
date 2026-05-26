package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto031 — Data Transfer Object for escrow operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto031 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private Long escrField001;

    @JsonProperty("escrField002")
    private Integer escrField002;

    @Size(max = 200)
    @JsonProperty("escrField003")
    private String escrField003;

    @JsonProperty("escrField004")
    private Double escrField004;

    @JsonProperty("escrField005")
    private LocalDate escrField005;

    @JsonProperty("escrField006")
    private Integer escrField006;

    @JsonProperty("escrField007")
    private Double escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @JsonProperty("escrField011")
    private Integer escrField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField012")
    private BigDecimal escrField012;

    @JsonProperty("escrField013")
    private LocalDate escrField013;

    @JsonProperty("escrField014")
    private Boolean escrField014;

    public EscrowDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto031 instance = new EscrowDto031();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Long val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Integer val) { instance.escrField002 = val; return this; }
        public Builder escrField003(String val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Double val) { instance.escrField004 = val; return this; }
        public Builder escrField005(LocalDate val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Integer val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Double val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Integer val) { instance.escrField011 = val; return this; }
        public Builder escrField012(BigDecimal val) { instance.escrField012 = val; return this; }
        public Builder escrField013(LocalDate val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Boolean val) { instance.escrField014 = val; return this; }
        public EscrowDto031 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public Long getEscrField001() { return escrField001; }
    public void setEscrField001(Long escrField001) { this.escrField001 = escrField001; }

    public Integer getEscrField002() { return escrField002; }
    public void setEscrField002(Integer escrField002) { this.escrField002 = escrField002; }

    public String getEscrField003() { return escrField003; }
    public void setEscrField003(String escrField003) { this.escrField003 = escrField003; }

    public Double getEscrField004() { return escrField004; }
    public void setEscrField004(Double escrField004) { this.escrField004 = escrField004; }

    public LocalDate getEscrField005() { return escrField005; }
    public void setEscrField005(LocalDate escrField005) { this.escrField005 = escrField005; }

    public Integer getEscrField006() { return escrField006; }
    public void setEscrField006(Integer escrField006) { this.escrField006 = escrField006; }

    public Double getEscrField007() { return escrField007; }
    public void setEscrField007(Double escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public Integer getEscrField011() { return escrField011; }
    public void setEscrField011(Integer escrField011) { this.escrField011 = escrField011; }

    public BigDecimal getEscrField012() { return escrField012; }
    public void setEscrField012(BigDecimal escrField012) { this.escrField012 = escrField012; }

    public LocalDate getEscrField013() { return escrField013; }
    public void setEscrField013(LocalDate escrField013) { this.escrField013 = escrField013; }

    public Boolean getEscrField014() { return escrField014; }
    public void setEscrField014(Boolean escrField014) { this.escrField014 = escrField014; }

    @Override
    public String toString() {
        return "EscrowDto031{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
