package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto047 — Data Transfer Object for escrow operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto047 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField001")
    private BigDecimal escrField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField002")
    private BigDecimal escrField002;

    @Size(max = 40)
    @JsonProperty("escrField003")
    private String escrField003;

    @JsonProperty("escrField004")
    private Boolean escrField004;

    @JsonProperty("escrField005")
    private LocalDate escrField005;

    @JsonProperty("escrField006")
    private LocalDate escrField006;

    @JsonProperty("escrField007")
    private Double escrField007;

    @JsonProperty("escrField008")
    private Boolean escrField008;

    @Size(max = 40)
    @JsonProperty("escrField009")
    private String escrField009;

    @JsonProperty("escrField010")
    private LocalDate escrField010;

    @Size(max = 60)
    @JsonProperty("escrField011")
    private String escrField011;

    @Size(max = 40)
    @JsonProperty("escrField012")
    private String escrField012;

    @JsonProperty("escrField013")
    private Boolean escrField013;

    @JsonProperty("escrField014")
    private Integer escrField014;

    @JsonProperty("escrField015")
    private Double escrField015;

    @JsonProperty("escrField016")
    private LocalDate escrField016;

    @JsonProperty("escrField017")
    private Integer escrField017;

    @JsonProperty("escrField018")
    private LocalDate escrField018;

    public EscrowDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto047 instance = new EscrowDto047();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(BigDecimal val) { instance.escrField001 = val; return this; }
        public Builder escrField002(BigDecimal val) { instance.escrField002 = val; return this; }
        public Builder escrField003(String val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Boolean val) { instance.escrField004 = val; return this; }
        public Builder escrField005(LocalDate val) { instance.escrField005 = val; return this; }
        public Builder escrField006(LocalDate val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Double val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Boolean val) { instance.escrField008 = val; return this; }
        public Builder escrField009(String val) { instance.escrField009 = val; return this; }
        public Builder escrField010(LocalDate val) { instance.escrField010 = val; return this; }
        public Builder escrField011(String val) { instance.escrField011 = val; return this; }
        public Builder escrField012(String val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Boolean val) { instance.escrField013 = val; return this; }
        public Builder escrField014(Integer val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Double val) { instance.escrField015 = val; return this; }
        public Builder escrField016(LocalDate val) { instance.escrField016 = val; return this; }
        public Builder escrField017(Integer val) { instance.escrField017 = val; return this; }
        public Builder escrField018(LocalDate val) { instance.escrField018 = val; return this; }
        public EscrowDto047 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public BigDecimal getEscrField001() { return escrField001; }
    public void setEscrField001(BigDecimal escrField001) { this.escrField001 = escrField001; }

    public BigDecimal getEscrField002() { return escrField002; }
    public void setEscrField002(BigDecimal escrField002) { this.escrField002 = escrField002; }

    public String getEscrField003() { return escrField003; }
    public void setEscrField003(String escrField003) { this.escrField003 = escrField003; }

    public Boolean getEscrField004() { return escrField004; }
    public void setEscrField004(Boolean escrField004) { this.escrField004 = escrField004; }

    public LocalDate getEscrField005() { return escrField005; }
    public void setEscrField005(LocalDate escrField005) { this.escrField005 = escrField005; }

    public LocalDate getEscrField006() { return escrField006; }
    public void setEscrField006(LocalDate escrField006) { this.escrField006 = escrField006; }

    public Double getEscrField007() { return escrField007; }
    public void setEscrField007(Double escrField007) { this.escrField007 = escrField007; }

    public Boolean getEscrField008() { return escrField008; }
    public void setEscrField008(Boolean escrField008) { this.escrField008 = escrField008; }

    public String getEscrField009() { return escrField009; }
    public void setEscrField009(String escrField009) { this.escrField009 = escrField009; }

    public LocalDate getEscrField010() { return escrField010; }
    public void setEscrField010(LocalDate escrField010) { this.escrField010 = escrField010; }

    public String getEscrField011() { return escrField011; }
    public void setEscrField011(String escrField011) { this.escrField011 = escrField011; }

    public String getEscrField012() { return escrField012; }
    public void setEscrField012(String escrField012) { this.escrField012 = escrField012; }

    public Boolean getEscrField013() { return escrField013; }
    public void setEscrField013(Boolean escrField013) { this.escrField013 = escrField013; }

    public Integer getEscrField014() { return escrField014; }
    public void setEscrField014(Integer escrField014) { this.escrField014 = escrField014; }

    public Double getEscrField015() { return escrField015; }
    public void setEscrField015(Double escrField015) { this.escrField015 = escrField015; }

    public LocalDate getEscrField016() { return escrField016; }
    public void setEscrField016(LocalDate escrField016) { this.escrField016 = escrField016; }

    public Integer getEscrField017() { return escrField017; }
    public void setEscrField017(Integer escrField017) { this.escrField017 = escrField017; }

    public LocalDate getEscrField018() { return escrField018; }
    public void setEscrField018(LocalDate escrField018) { this.escrField018 = escrField018; }

    @Override
    public String toString() {
        return "EscrowDto047{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
