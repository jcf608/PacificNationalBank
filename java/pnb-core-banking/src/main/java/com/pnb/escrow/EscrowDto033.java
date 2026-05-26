package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto033 — Data Transfer Object for escrow operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto033 {

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField000")
    private BigDecimal escrField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField001")
    private BigDecimal escrField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField002")
    private BigDecimal escrField002;

    @JsonProperty("escrField003")
    private Integer escrField003;

    @JsonProperty("escrField004")
    private Boolean escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField008")
    private BigDecimal escrField008;

    @Size(max = 200)
    @JsonProperty("escrField009")
    private String escrField009;

    @JsonProperty("escrField010")
    private Integer escrField010;

    @JsonProperty("escrField011")
    private Boolean escrField011;

    @Size(max = 200)
    @JsonProperty("escrField012")
    private String escrField012;

    @Size(max = 100)
    @JsonProperty("escrField013")
    private String escrField013;

    @JsonProperty("escrField014")
    private Integer escrField014;

    @JsonProperty("escrField015")
    private Integer escrField015;

    @Size(max = 60)
    @JsonProperty("escrField016")
    private String escrField016;

    public EscrowDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto033 instance = new EscrowDto033();

        public Builder escrField000(BigDecimal val) { instance.escrField000 = val; return this; }
        public Builder escrField001(BigDecimal val) { instance.escrField001 = val; return this; }
        public Builder escrField002(BigDecimal val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Integer val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Boolean val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(BigDecimal val) { instance.escrField008 = val; return this; }
        public Builder escrField009(String val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Integer val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Boolean val) { instance.escrField011 = val; return this; }
        public Builder escrField012(String val) { instance.escrField012 = val; return this; }
        public Builder escrField013(String val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Integer val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Integer val) { instance.escrField015 = val; return this; }
        public Builder escrField016(String val) { instance.escrField016 = val; return this; }
        public EscrowDto033 build() { return instance; }
    }

    public BigDecimal getEscrField000() { return escrField000; }
    public void setEscrField000(BigDecimal escrField000) { this.escrField000 = escrField000; }

    public BigDecimal getEscrField001() { return escrField001; }
    public void setEscrField001(BigDecimal escrField001) { this.escrField001 = escrField001; }

    public BigDecimal getEscrField002() { return escrField002; }
    public void setEscrField002(BigDecimal escrField002) { this.escrField002 = escrField002; }

    public Integer getEscrField003() { return escrField003; }
    public void setEscrField003(Integer escrField003) { this.escrField003 = escrField003; }

    public Boolean getEscrField004() { return escrField004; }
    public void setEscrField004(Boolean escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public BigDecimal getEscrField008() { return escrField008; }
    public void setEscrField008(BigDecimal escrField008) { this.escrField008 = escrField008; }

    public String getEscrField009() { return escrField009; }
    public void setEscrField009(String escrField009) { this.escrField009 = escrField009; }

    public Integer getEscrField010() { return escrField010; }
    public void setEscrField010(Integer escrField010) { this.escrField010 = escrField010; }

    public Boolean getEscrField011() { return escrField011; }
    public void setEscrField011(Boolean escrField011) { this.escrField011 = escrField011; }

    public String getEscrField012() { return escrField012; }
    public void setEscrField012(String escrField012) { this.escrField012 = escrField012; }

    public String getEscrField013() { return escrField013; }
    public void setEscrField013(String escrField013) { this.escrField013 = escrField013; }

    public Integer getEscrField014() { return escrField014; }
    public void setEscrField014(Integer escrField014) { this.escrField014 = escrField014; }

    public Integer getEscrField015() { return escrField015; }
    public void setEscrField015(Integer escrField015) { this.escrField015 = escrField015; }

    public String getEscrField016() { return escrField016; }
    public void setEscrField016(String escrField016) { this.escrField016 = escrField016; }

    @Override
    public String toString() {
        return "EscrowDto033{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
