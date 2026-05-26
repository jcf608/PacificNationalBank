package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto035 — Data Transfer Object for escrow operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto035 {

    @Size(max = 60)
    @JsonProperty("escrField000")
    private String escrField000;

    @Size(max = 60)
    @JsonProperty("escrField001")
    private String escrField001;

    @JsonProperty("escrField002")
    private Long escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @JsonProperty("escrField004")
    private LocalDate escrField004;

    @JsonProperty("escrField005")
    private Long escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @JsonProperty("escrField008")
    private Boolean escrField008;

    @JsonProperty("escrField009")
    private Double escrField009;

    @JsonProperty("escrField010")
    private LocalDate escrField010;

    @JsonProperty("escrField011")
    private Boolean escrField011;

    @JsonProperty("escrField012")
    private Long escrField012;

    @Size(max = 40)
    @JsonProperty("escrField013")
    private String escrField013;

    @JsonProperty("escrField014")
    private Boolean escrField014;

    @JsonProperty("escrField015")
    private Integer escrField015;

    @JsonProperty("escrField016")
    private Boolean escrField016;

    @JsonProperty("escrField017")
    private Integer escrField017;

    @Size(max = 200)
    @JsonProperty("escrField018")
    private String escrField018;

    public EscrowDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto035 instance = new EscrowDto035();

        public Builder escrField000(String val) { instance.escrField000 = val; return this; }
        public Builder escrField001(String val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Long val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(LocalDate val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Long val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Boolean val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Double val) { instance.escrField009 = val; return this; }
        public Builder escrField010(LocalDate val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Boolean val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Long val) { instance.escrField012 = val; return this; }
        public Builder escrField013(String val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Boolean val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Integer val) { instance.escrField015 = val; return this; }
        public Builder escrField016(Boolean val) { instance.escrField016 = val; return this; }
        public Builder escrField017(Integer val) { instance.escrField017 = val; return this; }
        public Builder escrField018(String val) { instance.escrField018 = val; return this; }
        public EscrowDto035 build() { return instance; }
    }

    public String getEscrField000() { return escrField000; }
    public void setEscrField000(String escrField000) { this.escrField000 = escrField000; }

    public String getEscrField001() { return escrField001; }
    public void setEscrField001(String escrField001) { this.escrField001 = escrField001; }

    public Long getEscrField002() { return escrField002; }
    public void setEscrField002(Long escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public LocalDate getEscrField004() { return escrField004; }
    public void setEscrField004(LocalDate escrField004) { this.escrField004 = escrField004; }

    public Long getEscrField005() { return escrField005; }
    public void setEscrField005(Long escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public Boolean getEscrField008() { return escrField008; }
    public void setEscrField008(Boolean escrField008) { this.escrField008 = escrField008; }

    public Double getEscrField009() { return escrField009; }
    public void setEscrField009(Double escrField009) { this.escrField009 = escrField009; }

    public LocalDate getEscrField010() { return escrField010; }
    public void setEscrField010(LocalDate escrField010) { this.escrField010 = escrField010; }

    public Boolean getEscrField011() { return escrField011; }
    public void setEscrField011(Boolean escrField011) { this.escrField011 = escrField011; }

    public Long getEscrField012() { return escrField012; }
    public void setEscrField012(Long escrField012) { this.escrField012 = escrField012; }

    public String getEscrField013() { return escrField013; }
    public void setEscrField013(String escrField013) { this.escrField013 = escrField013; }

    public Boolean getEscrField014() { return escrField014; }
    public void setEscrField014(Boolean escrField014) { this.escrField014 = escrField014; }

    public Integer getEscrField015() { return escrField015; }
    public void setEscrField015(Integer escrField015) { this.escrField015 = escrField015; }

    public Boolean getEscrField016() { return escrField016; }
    public void setEscrField016(Boolean escrField016) { this.escrField016 = escrField016; }

    public Integer getEscrField017() { return escrField017; }
    public void setEscrField017(Integer escrField017) { this.escrField017 = escrField017; }

    public String getEscrField018() { return escrField018; }
    public void setEscrField018(String escrField018) { this.escrField018 = escrField018; }

    @Override
    public String toString() {
        return "EscrowDto035{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
