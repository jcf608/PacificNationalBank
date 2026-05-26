package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto045 — Data Transfer Object for escrow operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto045 {

    @JsonProperty("escrField000")
    private Double escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @JsonProperty("escrField003")
    private Integer escrField003;

    @JsonProperty("escrField004")
    private Double escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Boolean escrField006;

    @JsonProperty("escrField007")
    private Double escrField007;

    @Size(max = 40)
    @JsonProperty("escrField008")
    private String escrField008;

    @JsonProperty("escrField009")
    private LocalDate escrField009;

    @JsonProperty("escrField010")
    private LocalDate escrField010;

    @JsonProperty("escrField011")
    private Long escrField011;

    @JsonProperty("escrField012")
    private Long escrField012;

    @JsonProperty("escrField013")
    private Double escrField013;

    @JsonProperty("escrField014")
    private Integer escrField014;

    @JsonProperty("escrField015")
    private Boolean escrField015;

    @Size(max = 200)
    @JsonProperty("escrField016")
    private String escrField016;

    public EscrowDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto045 instance = new EscrowDto045();

        public Builder escrField000(Double val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Integer val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Double val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Boolean val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Double val) { instance.escrField007 = val; return this; }
        public Builder escrField008(String val) { instance.escrField008 = val; return this; }
        public Builder escrField009(LocalDate val) { instance.escrField009 = val; return this; }
        public Builder escrField010(LocalDate val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Long val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Long val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Double val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Integer val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Boolean val) { instance.escrField015 = val; return this; }
        public Builder escrField016(String val) { instance.escrField016 = val; return this; }
        public EscrowDto045 build() { return instance; }
    }

    public Double getEscrField000() { return escrField000; }
    public void setEscrField000(Double escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public Integer getEscrField003() { return escrField003; }
    public void setEscrField003(Integer escrField003) { this.escrField003 = escrField003; }

    public Double getEscrField004() { return escrField004; }
    public void setEscrField004(Double escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Boolean getEscrField006() { return escrField006; }
    public void setEscrField006(Boolean escrField006) { this.escrField006 = escrField006; }

    public Double getEscrField007() { return escrField007; }
    public void setEscrField007(Double escrField007) { this.escrField007 = escrField007; }

    public String getEscrField008() { return escrField008; }
    public void setEscrField008(String escrField008) { this.escrField008 = escrField008; }

    public LocalDate getEscrField009() { return escrField009; }
    public void setEscrField009(LocalDate escrField009) { this.escrField009 = escrField009; }

    public LocalDate getEscrField010() { return escrField010; }
    public void setEscrField010(LocalDate escrField010) { this.escrField010 = escrField010; }

    public Long getEscrField011() { return escrField011; }
    public void setEscrField011(Long escrField011) { this.escrField011 = escrField011; }

    public Long getEscrField012() { return escrField012; }
    public void setEscrField012(Long escrField012) { this.escrField012 = escrField012; }

    public Double getEscrField013() { return escrField013; }
    public void setEscrField013(Double escrField013) { this.escrField013 = escrField013; }

    public Integer getEscrField014() { return escrField014; }
    public void setEscrField014(Integer escrField014) { this.escrField014 = escrField014; }

    public Boolean getEscrField015() { return escrField015; }
    public void setEscrField015(Boolean escrField015) { this.escrField015 = escrField015; }

    public String getEscrField016() { return escrField016; }
    public void setEscrField016(String escrField016) { this.escrField016 = escrField016; }

    @Override
    public String toString() {
        return "EscrowDto045{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
