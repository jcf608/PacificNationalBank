package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto024 — Data Transfer Object for deposit operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto024 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @JsonProperty("depoField001")
    private Long depoField001;

    @JsonProperty("depoField002")
    private Boolean depoField002;

    @JsonProperty("depoField003")
    private LocalDate depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    public DepositDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto024 instance = new DepositDto024();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Long val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Boolean val) { instance.depoField002 = val; return this; }
        public Builder depoField003(LocalDate val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public DepositDto024 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public Long getDepoField001() { return depoField001; }
    public void setDepoField001(Long depoField001) { this.depoField001 = depoField001; }

    public Boolean getDepoField002() { return depoField002; }
    public void setDepoField002(Boolean depoField002) { this.depoField002 = depoField002; }

    public LocalDate getDepoField003() { return depoField003; }
    public void setDepoField003(LocalDate depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    @Override
    public String toString() {
        return "DepositDto024{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
