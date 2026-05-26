package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto044 — Data Transfer Object for escrow operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto044 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @JsonProperty("escrField001")
    private Boolean escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @JsonProperty("escrField003")
    private Boolean escrField003;

    @JsonProperty("escrField004")
    private Double escrField004;

    @Size(max = 200)
    @JsonProperty("escrField005")
    private String escrField005;

    @JsonProperty("escrField006")
    private Long escrField006;

    @Size(max = 200)
    @JsonProperty("escrField007")
    private String escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private Boolean escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @Size(max = 60)
    @JsonProperty("escrField011")
    private String escrField011;

    @JsonProperty("escrField012")
    private Double escrField012;

    @JsonProperty("escrField013")
    private Integer escrField013;

    @Size(max = 60)
    @JsonProperty("escrField014")
    private String escrField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField015")
    private BigDecimal escrField015;

    public EscrowDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto044 instance = new EscrowDto044();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Boolean val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Boolean val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Double val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Long val) { instance.escrField006 = val; return this; }
        public Builder escrField007(String val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Boolean val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(String val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Double val) { instance.escrField012 = val; return this; }
        public Builder escrField013(Integer val) { instance.escrField013 = val; return this; }
        public Builder escrField014(String val) { instance.escrField014 = val; return this; }
        public Builder escrField015(BigDecimal val) { instance.escrField015 = val; return this; }
        public EscrowDto044 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public Boolean getEscrField001() { return escrField001; }
    public void setEscrField001(Boolean escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public Boolean getEscrField003() { return escrField003; }
    public void setEscrField003(Boolean escrField003) { this.escrField003 = escrField003; }

    public Double getEscrField004() { return escrField004; }
    public void setEscrField004(Double escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public Long getEscrField006() { return escrField006; }
    public void setEscrField006(Long escrField006) { this.escrField006 = escrField006; }

    public String getEscrField007() { return escrField007; }
    public void setEscrField007(String escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public Boolean getEscrField009() { return escrField009; }
    public void setEscrField009(Boolean escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public String getEscrField011() { return escrField011; }
    public void setEscrField011(String escrField011) { this.escrField011 = escrField011; }

    public Double getEscrField012() { return escrField012; }
    public void setEscrField012(Double escrField012) { this.escrField012 = escrField012; }

    public Integer getEscrField013() { return escrField013; }
    public void setEscrField013(Integer escrField013) { this.escrField013 = escrField013; }

    public String getEscrField014() { return escrField014; }
    public void setEscrField014(String escrField014) { this.escrField014 = escrField014; }

    public BigDecimal getEscrField015() { return escrField015; }
    public void setEscrField015(BigDecimal escrField015) { this.escrField015 = escrField015; }

    @Override
    public String toString() {
        return "EscrowDto044{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
