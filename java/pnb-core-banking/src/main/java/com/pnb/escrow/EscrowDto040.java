package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto040 — Data Transfer Object for escrow operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto040 {

    @JsonProperty("escrField000")
    private Integer escrField000;

    @JsonProperty("escrField001")
    private Long escrField001;

    @JsonProperty("escrField002")
    private Integer escrField002;

    @JsonProperty("escrField003")
    private Boolean escrField003;

    @JsonProperty("escrField004")
    private Integer escrField004;

    @JsonProperty("escrField005")
    private Double escrField005;

    @JsonProperty("escrField006")
    private LocalDate escrField006;

    @JsonProperty("escrField007")
    private Integer escrField007;

    @JsonProperty("escrField008")
    private Integer escrField008;

    @JsonProperty("escrField009")
    private Integer escrField009;

    @JsonProperty("escrField010")
    private Boolean escrField010;

    @Size(max = 100)
    @JsonProperty("escrField011")
    private String escrField011;

    public EscrowDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto040 instance = new EscrowDto040();

        public Builder escrField000(Integer val) { instance.escrField000 = val; return this; }
        public Builder escrField001(Long val) { instance.escrField001 = val; return this; }
        public Builder escrField002(Integer val) { instance.escrField002 = val; return this; }
        public Builder escrField003(Boolean val) { instance.escrField003 = val; return this; }
        public Builder escrField004(Integer val) { instance.escrField004 = val; return this; }
        public Builder escrField005(Double val) { instance.escrField005 = val; return this; }
        public Builder escrField006(LocalDate val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Integer val) { instance.escrField007 = val; return this; }
        public Builder escrField008(Integer val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Integer val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Boolean val) { instance.escrField010 = val; return this; }
        public Builder escrField011(String val) { instance.escrField011 = val; return this; }
        public EscrowDto040 build() { return instance; }
    }

    public Integer getEscrField000() { return escrField000; }
    public void setEscrField000(Integer escrField000) { this.escrField000 = escrField000; }

    public Long getEscrField001() { return escrField001; }
    public void setEscrField001(Long escrField001) { this.escrField001 = escrField001; }

    public Integer getEscrField002() { return escrField002; }
    public void setEscrField002(Integer escrField002) { this.escrField002 = escrField002; }

    public Boolean getEscrField003() { return escrField003; }
    public void setEscrField003(Boolean escrField003) { this.escrField003 = escrField003; }

    public Integer getEscrField004() { return escrField004; }
    public void setEscrField004(Integer escrField004) { this.escrField004 = escrField004; }

    public Double getEscrField005() { return escrField005; }
    public void setEscrField005(Double escrField005) { this.escrField005 = escrField005; }

    public LocalDate getEscrField006() { return escrField006; }
    public void setEscrField006(LocalDate escrField006) { this.escrField006 = escrField006; }

    public Integer getEscrField007() { return escrField007; }
    public void setEscrField007(Integer escrField007) { this.escrField007 = escrField007; }

    public Integer getEscrField008() { return escrField008; }
    public void setEscrField008(Integer escrField008) { this.escrField008 = escrField008; }

    public Integer getEscrField009() { return escrField009; }
    public void setEscrField009(Integer escrField009) { this.escrField009 = escrField009; }

    public Boolean getEscrField010() { return escrField010; }
    public void setEscrField010(Boolean escrField010) { this.escrField010 = escrField010; }

    public String getEscrField011() { return escrField011; }
    public void setEscrField011(String escrField011) { this.escrField011 = escrField011; }

    @Override
    public String toString() {
        return "EscrowDto040{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
