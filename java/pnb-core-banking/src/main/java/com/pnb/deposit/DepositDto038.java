package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto038 — Data Transfer Object for deposit operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto038 {

    @Size(max = 60)
    @JsonProperty("depoField000")
    private String depoField000;

    @Size(max = 200)
    @JsonProperty("depoField001")
    private String depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @JsonProperty("depoField003")
    private LocalDate depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    public DepositDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto038 instance = new DepositDto038();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(String val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(LocalDate val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public DepositDto038 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public String getDepoField001() { return depoField001; }
    public void setDepoField001(String depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public LocalDate getDepoField003() { return depoField003; }
    public void setDepoField003(LocalDate depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    @Override
    public String toString() {
        return "DepositDto038{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
