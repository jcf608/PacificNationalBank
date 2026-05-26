package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto046 — Data Transfer Object for escrow operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto046 {

    @JsonProperty("escrField000")
    private Boolean escrField000;

    @JsonProperty("escrField001")
    private Integer escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private Double escrField003;

    @Size(max = 60)
    @JsonProperty("escrField004")
    private String escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Integer escrField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField007")
    private BigDecimal escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private Long escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField011")
    private BigDecimal escrField011;

    @Size(max = 20)
    @JsonProperty("escrField012")
    private String escrField012;

    @JsonProperty("escrField013")
    private Long escrField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField014")
    private BigDecimal escrField014;

    @JsonProperty("escrField015")
    private LocalDate escrField015;

    @Size(max = 40)
    @JsonProperty("escrField016")
    private String escrField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField017")
    private BigDecimal escrField017;

    public EscrowDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto046 instance = new EscrowDto046();

        public Builder escrField000(Boolean val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Integer val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Double val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Integer val) { instance.escrField006 = val; return this; }
        public Builder escrField007(BigDecimal val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Long val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(BigDecimal val) { instance.escrField011 = val; return this; }
        public Builder escrField012(String val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Long val) { instance.escrField013 = val; return this; }
        public Builder escrField014(BigDecimal val) { instance.escrField014 = val; return this; }
        public Builder escrField015(LocalDate val) { instance.escrField015 = val; return this; }
        public Builder escrField016(String val) { instance.escrField016 = val; return this; }
        public Builder escrField017(BigDecimal val) { instance.escrField017 = val; return this; }
        public EscrowDto046 build() { return instance; }
    }

    public Boolean getEscrField000() { return escrField000; }
    public void setEscrField000(Boolean escrField000) { this.escrField000 = escrField000; }

    public Integer getEscrField001() { return escrField001; }
    public void setEscrField001(Integer escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public Double getEscrField003() { return escrField003; }
    public void setEscrField003(Double escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Integer getEscrField006() { return escrField006; }
    public void setEscrField006(Integer escrField006) { this.escrField006 = escrField006; }

    public BigDecimal getEscrField007() { return escrField007; }
    public void setEscrField007(BigDecimal escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public Long getEscrField009() { return escrField009; }
    public void setEscrField009(Long escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public BigDecimal getEscrField011() { return escrField011; }
    public void setEscrField011(BigDecimal escrField011) { this.escrField011 = escrField011; }

    public String getEscrField012() { return escrField012; }
    public void setEscrField012(String escrField012) { this.escrField012 = escrField012; }

    public Long getEscrField013() { return escrField013; }
    public void setEscrField013(Long escrField013) { this.escrField013 = escrField013; }

    public BigDecimal getEscrField014() { return escrField014; }
    public void setEscrField014(BigDecimal escrField014) { this.escrField014 = escrField014; }

    public LocalDate getEscrField015() { return escrField015; }
    public void setEscrField015(LocalDate escrField015) { this.escrField015 = escrField015; }

    public String getEscrField016() { return escrField016; }
    public void setEscrField016(String escrField016) { this.escrField016 = escrField016; }

    public BigDecimal getEscrField017() { return escrField017; }
    public void setEscrField017(BigDecimal escrField017) { this.escrField017 = escrField017; }

    @Override
    public String toString() {
        return "EscrowDto046{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
