package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto030 — Data Transfer Object for escrow operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto030 {

    @Size(max = 60)
    @JsonProperty("escrField000")
    private String escrField000;

    @JsonProperty("escrField001")
    private Double escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @JsonProperty("escrField004")
    private Long escrField004;

    @JsonProperty("escrField005")
    private Long escrField005;

    @JsonProperty("escrField006")
    private Double escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @JsonProperty("escrField008")
    private Integer escrField008;

    @JsonProperty("escrField009")
    private Boolean escrField009;

    @JsonProperty("escrField010")
    private Double escrField010;

    @JsonProperty("escrField011")
    private Long escrField011;

    @JsonProperty("escrField012")
    private Integer escrField012;

    @JsonProperty("escrField013")
    private Long escrField013;

    public EscrowDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto030 instance = new EscrowDto030();

        public Builder escrField000(String val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Double val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Long val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Long val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Double val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Integer val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Boolean val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Double val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Long val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Integer val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Long val) { instance.escrField013 = val; return this; }
        public EscrowDto030 build() { return instance; }
    }

    public String getEscrField000() { return escrField000; }
    public void setEscrField000(String escrField000) { this.escrField000 = escrField000; }

    public Double getEscrField001() { return escrField001; }
    public void setEscrField001(Double escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public Long getEscrField004() { return escrField004; }
    public void setEscrField004(Long escrField004) { this.escrField004 = escrField004; }

    public Long getEscrField005() { return escrField005; }
    public void setEscrField005(Long escrField005) { this.escrField005 = escrField005; }

    public Double getEscrField006() { return escrField006; }
    public void setEscrField006(Double escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public Integer getEscrField008() { return escrField008; }
    public void setEscrField008(Integer escrField008) { this.escrField008 = escrField008; }

    public Boolean getEscrField009() { return escrField009; }
    public void setEscrField009(Boolean escrField009) { this.escrField009 = escrField009; }

    public Double getEscrField010() { return escrField010; }
    public void setEscrField010(Double escrField010) { this.escrField010 = escrField010; }

    public Long getEscrField011() { return escrField011; }
    public void setEscrField011(Long escrField011) { this.escrField011 = escrField011; }

    public Integer getEscrField012() { return escrField012; }
    public void setEscrField012(Integer escrField012) { this.escrField012 = escrField012; }

    public Long getEscrField013() { return escrField013; }
    public void setEscrField013(Long escrField013) { this.escrField013 = escrField013; }

    @Override
    public String toString() {
        return "EscrowDto030{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
