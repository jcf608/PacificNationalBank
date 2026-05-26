package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto027 — Data Transfer Object for deposit operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto027 {

    @JsonProperty("depoField000")
    private Boolean depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @Size(max = 20)
    @JsonProperty("depoField002")
    private String depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Double depoField005;

    @JsonProperty("depoField006")
    private Double depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @JsonProperty("depoField008")
    private LocalDate depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField010")
    private BigDecimal depoField010;

    public DepositDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto027 instance = new DepositDto027();

        public Builder depoField000(Boolean val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(String val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Double val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Double val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(LocalDate val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(BigDecimal val) { instance.depoField010 = val; return this; }
        public DepositDto027 build() { return instance; }
    }

    public Boolean getDepoField000() { return depoField000; }
    public void setDepoField000(Boolean depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public String getDepoField002() { return depoField002; }
    public void setDepoField002(String depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Double getDepoField005() { return depoField005; }
    public void setDepoField005(Double depoField005) { this.depoField005 = depoField005; }

    public Double getDepoField006() { return depoField006; }
    public void setDepoField006(Double depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public LocalDate getDepoField008() { return depoField008; }
    public void setDepoField008(LocalDate depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public BigDecimal getDepoField010() { return depoField010; }
    public void setDepoField010(BigDecimal depoField010) { this.depoField010 = depoField010; }

    @Override
    public String toString() {
        return "DepositDto027{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
