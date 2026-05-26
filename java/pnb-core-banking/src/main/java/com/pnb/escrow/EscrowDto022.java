package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto022 — Data Transfer Object for escrow operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto022 {

    @JsonProperty("escrField000")
    private Integer escrField000;

    @JsonProperty("escrField001")
    private LocalDate escrField001;

    @JsonProperty("escrField002")
    private LocalDate escrField002;

    @Size(max = 100)
    @JsonProperty("escrField003")
    private String escrField003;

    @JsonProperty("escrField004")
    private LocalDate escrField004;

    @JsonProperty("escrField005")
    private Boolean escrField005;

    @Size(max = 200)
    @JsonProperty("escrField006")
    private String escrField006;

    @JsonProperty("escrField007")
    private LocalDate escrField007;

    @JsonProperty("escrField008")
    private Double escrField008;

    @JsonProperty("escrField009")
    private Long escrField009;

    @JsonProperty("escrField010")
    private Long escrField010;

    @JsonProperty("escrField011")
    private Integer escrField011;

    @JsonProperty("escrField012")
    private LocalDate escrField012;

    @JsonProperty("escrField013")
    private LocalDate escrField013;

    @JsonProperty("escrField014")
    private LocalDate escrField014;

    @JsonProperty("escrField015")
    private Long escrField015;

    @JsonProperty("escrField016")
    private Integer escrField016;

    @JsonProperty("escrField017")
    private Integer escrField017;

    public EscrowDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto022 instance = new EscrowDto022();

        public Builder escrField000(Integer val) { instance.escrField000 = val; return this; }
        public Builder escrField001(LocalDate val) { instance.escrField001 = val; return this; }
        public Builder escrField002(LocalDate val) { instance.escrField002 = val; return this; }
        public Builder escrField003(String val) { instance.escrField003 = val; return this; }
        public Builder escrField004(LocalDate val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Boolean val) { instance.escrField005 = val; return this; }
        public Builder escrField006(String val) { instance.escrField006 = val; return this; }
        public Builder escrField007(LocalDate val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Double val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Long val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Long val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Integer val) { instance.escrField011 = val; return this; }
        public Builder escrField012(LocalDate val) { instance.escrField012 = val; return this; }
        public Builder escrField013(LocalDate val) { instance.escrField013 = val; return this; }
        public Builder escrField014(LocalDate val) { instance.escrField014 = val; return this; }
        public Builder escrField015(Long val) { instance.escrField015 = val; return this; }
        public Builder escrField016(Integer val) { instance.escrField016 = val; return this; }
        public Builder escrField017(Integer val) { instance.escrField017 = val; return this; }
        public EscrowDto022 build() { return instance; }
    }

    public Integer getEscrField000() { return escrField000; }
    public void setEscrField000(Integer escrField000) { this.escrField000 = escrField000; }

    public LocalDate getEscrField001() { return escrField001; }
    public void setEscrField001(LocalDate escrField001) { this.escrField001 = escrField001; }

    public LocalDate getEscrField002() { return escrField002; }
    public void setEscrField002(LocalDate escrField002) { this.escrField002 = escrField002; }

    public String getEscrField003() { return escrField003; }
    public void setEscrField003(String escrField003) { this.escrField003 = escrField003; }

    public LocalDate getEscrField004() { return escrField004; }
    public void setEscrField004(LocalDate escrField004) { this.escrField004 = escrField004; }

    public Boolean getEscrField005() { return escrField005; }
    public void setEscrField005(Boolean escrField005) { this.escrField005 = escrField005; }

    public String getEscrField006() { return escrField006; }
    public void setEscrField006(String escrField006) { this.escrField006 = escrField006; }

    public LocalDate getEscrField007() { return escrField007; }
    public void setEscrField007(LocalDate escrField007) { this.escrField007 = escrField007; }

    public Double getEscrField008() { return escrField008; }
    public void setEscrField008(Double escrField008) { this.escrField008 = escrField008; }

    public Long getEscrField009() { return escrField009; }
    public void setEscrField009(Long escrField009) { this.escrField009 = escrField009; }

    public Long getEscrField010() { return escrField010; }
    public void setEscrField010(Long escrField010) { this.escrField010 = escrField010; }

    public Integer getEscrField011() { return escrField011; }
    public void setEscrField011(Integer escrField011) { this.escrField011 = escrField011; }

    public LocalDate getEscrField012() { return escrField012; }
    public void setEscrField012(LocalDate escrField012) { this.escrField012 = escrField012; }

    public LocalDate getEscrField013() { return escrField013; }
    public void setEscrField013(LocalDate escrField013) { this.escrField013 = escrField013; }

    public LocalDate getEscrField014() { return escrField014; }
    public void setEscrField014(LocalDate escrField014) { this.escrField014 = escrField014; }

    public Long getEscrField015() { return escrField015; }
    public void setEscrField015(Long escrField015) { this.escrField015 = escrField015; }

    public Integer getEscrField016() { return escrField016; }
    public void setEscrField016(Integer escrField016) { this.escrField016 = escrField016; }

    public Integer getEscrField017() { return escrField017; }
    public void setEscrField017(Integer escrField017) { this.escrField017 = escrField017; }

    @Override
    public String toString() {
        return "EscrowDto022{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
