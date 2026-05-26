package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto055 — Data Transfer Object for escrow operations.
 * Variant 55 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto055 {

    @Size(max = 20)
    @JsonProperty("escrField000")
    private String escrField000;

    @JsonProperty("escrField001")
    private Integer escrField001;

    @Size(max = 40)
    @JsonProperty("escrField002")
    private String escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @Size(max = 200)
    @JsonProperty("escrField004")
    private String escrField004;

    @Size(max = 200)
    @JsonProperty("escrField005")
    private String escrField005;

    @Size(max = 100)
    @JsonProperty("escrField006")
    private String escrField006;

    @JsonProperty("escrField007")
    private Boolean escrField007;

    @JsonProperty("escrField008")
    private Double escrField008;

    @JsonProperty("escrField009")
    private Long escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @JsonProperty("escrField011")
    private Double escrField011;

    @Size(max = 40)
    @JsonProperty("escrField012")
    private String escrField012;

    @JsonProperty("escrField013")
    private Boolean escrField013;

    @JsonProperty("escrField014")
    private LocalDate escrField014;

    public EscrowDto055() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto055 instance = new EscrowDto055();

        public Builder escrField000(String val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Integer val) { instance.escrField001 = val; return this; }
        public Builder escrField002(String val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(String val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Boolean val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Double val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Long val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Double val) { instance.escrField011 = val; return this; }
        public Builder escrField012(String val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Boolean val) { instance.escrField013 = val; return this; }
        public Builder escrField014(LocalDate val) { instance.escrField014 = val; return this; }
        public EscrowDto055 build() { return instance; }
    }

    public String getEscrField000() { return escrField000; }
    public void setEscrField000(String escrField000) { this.escrField000 = escrField000; }

    public Integer getEscrField001() { return escrField001; }
    public void setEscrField001(Integer escrField001) { this.escrField001 = escrField001; }

    public String getEscrField002() { return escrField002; }
    public void setEscrField002(String escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public String getEscrField006() { return escrField006; }
    public void setEscrField006(String escrField006) { this.escrField006 = escrField006; }

    public Boolean getEscrField007() { return escrField007; }
    public void setEscrField007(Boolean escrField007) { this.escrField007 = escrField007; }

    public Double getEscrField008() { return escrField008; }
    public void setEscrField008(Double escrField008) { this.escrField008 = escrField008; }

    public Long getEscrField009() { return escrField009; }
    public void setEscrField009(Long escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public Double getEscrField011() { return escrField011; }
    public void setEscrField011(Double escrField011) { this.escrField011 = escrField011; }

    public String getEscrField012() { return escrField012; }
    public void setEscrField012(String escrField012) { this.escrField012 = escrField012; }

    public Boolean getEscrField013() { return escrField013; }
    public void setEscrField013(Boolean escrField013) { this.escrField013 = escrField013; }

    public LocalDate getEscrField014() { return escrField014; }
    public void setEscrField014(LocalDate escrField014) { this.escrField014 = escrField014; }

    @Override
    public String toString() {
        return "EscrowDto055{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
