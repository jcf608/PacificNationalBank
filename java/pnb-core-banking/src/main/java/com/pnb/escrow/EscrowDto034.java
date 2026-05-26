package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto034 — Data Transfer Object for escrow operations.
 * Variant 34 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto034 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @JsonProperty("escrField002")
    private Long escrField002;

    @JsonProperty("escrField003")
    private Long escrField003;

    @Size(max = 200)
    @JsonProperty("escrField004")
    private String escrField004;

    @JsonProperty("escrField005")
    private LocalDate escrField005;

    @JsonProperty("escrField006")
    private Long escrField006;

    @JsonProperty("escrField007")
    private Boolean escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private Integer escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @JsonProperty("escrField011")
    private LocalDate escrField011;

    @JsonProperty("escrField012")
    private Boolean escrField012;

    @JsonProperty("escrField013")
    private Boolean escrField013;

    @JsonProperty("escrField014")
    private Double escrField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField015")
    private BigDecimal escrField015;

    @JsonProperty("escrField016")
    private Double escrField016;

    @Size(max = 200)
    @JsonProperty("escrField017")
    private String escrField017;

    public EscrowDto034() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto034 instance = new EscrowDto034();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Long val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Long val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(LocalDate val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Long val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Boolean val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Integer val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(LocalDate val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Boolean val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Boolean val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Double val) { instance.escrField014 = val; return this; }
        public Builder escrField015(BigDecimal val) { instance.escrField015 = val; return this; }
        public Builder escrField016(Double val) { instance.escrField016 = val; return this; }
        public Builder escrField017(String val) { instance.escrField017 = val; return this; }
        public EscrowDto034 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public Long getEscrField002() { return escrField002; }
    public void setEscrField002(Long escrField002) { this.escrField002 = escrField002; }

    public Long getEscrField003() { return escrField003; }
    public void setEscrField003(Long escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public LocalDate getEscrField005() { return escrField005; }
    public void setEscrField005(LocalDate escrField005) { this.escrField005 = escrField005; }

    public Long getEscrField006() { return escrField006; }
    public void setEscrField006(Long escrField006) { this.escrField006 = escrField006; }

    public Boolean getEscrField007() { return escrField007; }
    public void setEscrField007(Boolean escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public Integer getEscrField009() { return escrField009; }
    public void setEscrField009(Integer escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public LocalDate getEscrField011() { return escrField011; }
    public void setEscrField011(LocalDate escrField011) { this.escrField011 = escrField011; }

    public Boolean getEscrField012() { return escrField012; }
    public void setEscrField012(Boolean escrField012) { this.escrField012 = escrField012; }

    public Boolean getEscrField013() { return escrField013; }
    public void setEscrField013(Boolean escrField013) { this.escrField013 = escrField013; }

    public Double getEscrField014() { return escrField014; }
    public void setEscrField014(Double escrField014) { this.escrField014 = escrField014; }

    public BigDecimal getEscrField015() { return escrField015; }
    public void setEscrField015(BigDecimal escrField015) { this.escrField015 = escrField015; }

    public Double getEscrField016() { return escrField016; }
    public void setEscrField016(Double escrField016) { this.escrField016 = escrField016; }

    public String getEscrField017() { return escrField017; }
    public void setEscrField017(String escrField017) { this.escrField017 = escrField017; }

    @Override
    public String toString() {
        return "EscrowDto034{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
