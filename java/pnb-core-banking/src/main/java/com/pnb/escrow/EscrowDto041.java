package com.pnb.escrow;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * EscrowDto041 — Data Transfer Object for escrow operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EscrowDto041 {

    @JsonProperty("escrField000")
    private LocalDate escrField000;

    @Size(max = 60)
    @JsonProperty("escrField001")
    private String escrField001;

    @Size(max = 40)
    @JsonProperty("escrField002")
    private String escrField002;

    @Size(max = 60)
    @JsonProperty("escrField003")
    private String escrField003;

    @Size(max = 40)
    @JsonProperty("escrField004")
    private String escrField004;

    @Size(max = 100)
    @JsonProperty("escrField005")
    private String escrField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("escrField006")
    private BigDecimal escrField006;

    @JsonProperty("escrField007")
    private Long escrField007;

    @JsonProperty("escrField008")
    private LocalDate escrField008;

    @JsonProperty("escrField009")
    private Integer escrField009;

    @JsonProperty("escrField010")
    private Integer escrField010;

    @JsonProperty("escrField011")
    private Boolean escrField011;

    @JsonProperty("escrField012")
    private Long escrField012;

    public EscrowDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final EscrowDto041 instance = new EscrowDto041();

        public Builder escrField000(LocalDate val) { instance.escrField000 = val; return this; }
        public Builder escrField001(String val) { instance.escrField001 = val; return this; }
        public Builder escrField002(String val) { instance.escrField002 = val; return this; }
        public Builder escrField003(String val) { instance.escrField003 = val; return this; }
        public Builder escrField004(String val) { instance.escrField004 = val; return this; }
        public Builder escrField005(String val) { instance.escrField005 = val; return this; }
        public Builder escrField006(BigDecimal val) { instance.escrField006 = val; return this; }
        public Builder escrField007(Long val) { instance.escrField007 = val; return this; }
        public Builder escrField008(LocalDate val) { instance.escrField008 = val; return this; }
        public Builder escrField009(Integer val) { instance.escrField009 = val; return this; }
        public Builder escrField010(Integer val) { instance.escrField010 = val; return this; }
        public Builder escrField011(Boolean val) { instance.escrField011 = val; return this; }
        public Builder escrField012(Long val) { instance.escrField012 = val; return this; }
        public EscrowDto041 build() { return instance; }
    }

    public LocalDate getEscrField000() { return escrField000; }
    public void setEscrField000(LocalDate escrField000) { this.escrField000 = escrField000; }

    public String getEscrField001() { return escrField001; }
    public void setEscrField001(String escrField001) { this.escrField001 = escrField001; }

    public String getEscrField002() { return escrField002; }
    public void setEscrField002(String escrField002) { this.escrField002 = escrField002; }

    public String getEscrField003() { return escrField003; }
    public void setEscrField003(String escrField003) { this.escrField003 = escrField003; }

    public String getEscrField004() { return escrField004; }
    public void setEscrField004(String escrField004) { this.escrField004 = escrField004; }

    public String getEscrField005() { return escrField005; }
    public void setEscrField005(String escrField005) { this.escrField005 = escrField005; }

    public BigDecimal getEscrField006() { return escrField006; }
    public void setEscrField006(BigDecimal escrField006) { this.escrField006 = escrField006; }

    public Long getEscrField007() { return escrField007; }
    public void setEscrField007(Long escrField007) { this.escrField007 = escrField007; }

    public LocalDate getEscrField008() { return escrField008; }
    public void setEscrField008(LocalDate escrField008) { this.escrField008 = escrField008; }

    public Integer getEscrField009() { return escrField009; }
    public void setEscrField009(Integer escrField009) { this.escrField009 = escrField009; }

    public Integer getEscrField010() { return escrField010; }
    public void setEscrField010(Integer escrField010) { this.escrField010 = escrField010; }

    public Boolean getEscrField011() { return escrField011; }
    public void setEscrField011(Boolean escrField011) { this.escrField011 = escrField011; }

    public Long getEscrField012() { return escrField012; }
    public void setEscrField012(Long escrField012) { this.escrField012 = escrField012; }

    @Override
    public String toString() {
        return "EscrowDto041{" +
            "escrField000=" + escrField000 + ", " +
            "escrField001=" + escrField001 + ", " +
            "escrField002=" + escrField002 + ", " +
            "escrField003=" + escrField003 + ", " +
            "escrField004=" + escrField004 + ", " +
            "}";
    }
}
