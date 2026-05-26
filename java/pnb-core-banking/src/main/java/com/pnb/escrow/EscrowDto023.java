package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto023 — Data Transfer Object for escrow operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto023 {

    @JsonProperty("escrField000")
    private Integer escrField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField001")
    private BigDecimal escrField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField002")
    private BigDecimal escrField002;

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
    private Integer escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @JsonProperty("escrField008")
    private Long escrField008;

    @JsonProperty("escrField009")
    private Long escrField009;

    @JsonProperty("escrField010")
    private Integer escrField010;

    @JsonProperty("escrField011")
    private Double escrField011;

    @JsonProperty("escrField012")
    private LocalDate escrField012;

    @JsonProperty("escrField013")
    private Double escrField013;

    @JsonProperty("escrField014")
    private Boolean escrField014;

    @JsonProperty("escrField015")
    private LocalDate escrField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField016")
    private BigDecimal escrField016;

    @JsonProperty("escrField017")
    private Long escrField017;

    @JsonProperty("escrField018")
    private Boolean escrField018;

    public EscrowDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto023 instance = new EscrowDto023();

        public Builder escrField000(Integer val) { instance.escrField000 = val; return this; }
        public Builder escrField001(BigDecimal val) { instance.escrField001 = val; return this; }
        public Builder escrField002(BigDecimal val) { instance.escrField002 = val; return this; }
        public Builder escrField003(BigDecimal val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Integer val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Long val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Long val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Integer val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Double val) { instance.escrField011 = val; return this; }
        public Builder escrField012(LocalDate val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Double val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Boolean val) { instance.escrField014 = val; return this; }
        public Builder escrField015(LocalDate val) { instance.escrField015 = val; return this; }
        public Builder escrField016(BigDecimal val) { instance.escrField016 = val; return this; }
        public Builder escrField017(Long val) { instance.escrField017 = val; return this; }
        public Builder escrField018(Boolean val) { instance.escrField018 = val; return this; }
        public EscrowDto023 build() { return instance; }
    }

    public Integer getEscrField000() { return escrField000; }
    public void setEscrField000(Integer escrField000) { this.escrField000 = escrField000; }

    public BigDecimal getEscrField001() { return escrField001; }
    public void setEscrField001(BigDecimal escrField001) { this.escrField001 = escrField001; }

    public BigDecimal getEscrField002() { return escrField002; }
    public void setEscrField002(BigDecimal escrField002) { this.escrField002 = escrField002; }

    public BigDecimal getEscrField003() { return escrField003; }
    public void setEscrField003(BigDecimal escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public Integer getEscrField006() { return escrField006; }
    public void setEscrField006(Integer escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public Long getEscrField008() { return escrField008; }
    public void setEscrField008(Long escrField008) { this.escrField008 = escrField008; }

    public Long getEscrField009() { return escrField009; }
    public void setEscrField009(Long escrField009) { this.escrField009 = escrField009; }

    public Integer getEscrField010() { return escrField010; }
    public void setEscrField010(Integer escrField010) { this.escrField010 = escrField010; }

    public Double getEscrField011() { return escrField011; }
    public void setEscrField011(Double escrField011) { this.escrField011 = escrField011; }

    public LocalDate getEscrField012() { return escrField012; }
    public void setEscrField012(LocalDate escrField012) { this.escrField012 = escrField012; }

    public Double getEscrField013() { return escrField013; }
    public void setEscrField013(Double escrField013) { this.escrField013 = escrField013; }

    public Boolean getEscrField014() { return escrField014; }
    public void setEscrField014(Boolean escrField014) { this.escrField014 = escrField014; }

    public LocalDate getEscrField015() { return escrField015; }
    public void setEscrField015(LocalDate escrField015) { this.escrField015 = escrField015; }

    public BigDecimal getEscrField016() { return escrField016; }
    public void setEscrField016(BigDecimal escrField016) { this.escrField016 = escrField016; }

    public Long getEscrField017() { return escrField017; }
    public void setEscrField017(Long escrField017) { this.escrField017 = escrField017; }

    public Boolean getEscrField018() { return escrField018; }
    public void setEscrField018(Boolean escrField018) { this.escrField018 = escrField018; }

    @Override
    public String toString() {
        return "EscrowDto023{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
