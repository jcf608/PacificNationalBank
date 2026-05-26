package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto029 — Data Transfer Object for escrow operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto029 {

    @JsonProperty("escrField000")
    private Long escrField000;

    @JsonProperty("escrField001")
    private LocalDate escrField001;

    @JsonProperty("escrField002")
    private Double escrField002;

    @JsonProperty("escrField003")
    private Boolean escrField003;

    @JsonProperty("escrField004")
    private Long escrField004;

    @JsonProperty("escrField005")
    private Integer escrField005;

    @JsonProperty("escrField006")
    private Boolean escrField006;

    @Size(max = 40)
    @JsonProperty("escrField007")
    private String escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private Integer escrField009;

    @Size(max = 200)
    @JsonProperty("escrField010")
    private String escrField010;

    @JsonProperty("escrField011")
    private Boolean escrField011;

    @JsonProperty("escrField012")
    private Integer escrField012;

    public EscrowDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto029 instance = new EscrowDto029();

        public Builder escrField000(Long val) { instance.escrField000 = val; return this; }
        public Builder escrField001(LocalDate val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Double val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Boolean val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Long val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Integer val) { instance.escrField005 = val; return this; }
        public Builder escrField006(Boolean val) { instance.escrField006 = val; return this; }
        public Builder escrField007(String val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Integer val) { instance.escrField009 = val; return this; }
        public Builder escrField010(String val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Boolean val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Integer val) { instance.escrField012 = val; return this; }
        public EscrowDto029 build() { return instance; }
    }

    public Long getEscrField000() { return escrField000; }
    public void setEscrField000(Long escrField000) { this.escrField000 = escrField000; }

    public LocalDate getEscrField001() { return escrField001; }
    public void setEscrField001(LocalDate escrField001) { this.escrField001 = escrField001; }

    public Double getEscrField002() { return escrField002; }
    public void setEscrField002(Double escrField002) { this.escrField002 = escrField002; }

    public Boolean getEscrField003() { return escrField003; }
    public void setEscrField003(Boolean escrField003) { this.escrField003 = escrField003; }

    public Long getEscrField004() { return escrField004; }
    public void setEscrField004(Long escrField004) { this.escrField004 = escrField004; }

    public Integer getEscrField005() { return escrField005; }
    public void setEscrField005(Integer escrField005) { this.escrField005 = escrField005; }

    public Boolean getEscrField006() { return escrField006; }
    public void setEscrField006(Boolean escrField006) { this.escrField006 = escrField006; }

    public String getEscrField007() { return escrField007; }
    public void setEscrField007(String escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public Integer getEscrField009() { return escrField009; }
    public void setEscrField009(Integer escrField009) { this.escrField009 = escrField009; }

    public String getEscrField010() { return escrField010; }
    public void setEscrField010(String escrField010) { this.escrField010 = escrField010; }

    public Boolean getEscrField011() { return escrField011; }
    public void setEscrField011(Boolean escrField011) { this.escrField011 = escrField011; }

    public Integer getEscrField012() { return escrField012; }
    public void setEscrField012(Integer escrField012) { this.escrField012 = escrField012; }

    @Override
    public String toString() {
        return "EscrowDto029{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
