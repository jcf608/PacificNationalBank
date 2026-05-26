package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto048 — Data Transfer Object for deposit operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto048 {

    @JsonProperty("depoField000")
    private LocalDate depoField000;

    @Size(max = 100)
    @JsonProperty("depoField001")
    private String depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField004")
    private BigDecimal depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    public DepositDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto048 instance = new DepositDto048();

        public Builder depoField000(LocalDate val) { instance.depoField000 = val; return this; }
        public Builder depoField001(String val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(BigDecimal val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public DepositDto048 build() { return instance; }
    }

    public LocalDate getDepoField000() { return depoField000; }
    public void setDepoField000(LocalDate depoField000) { this.depoField000 = depoField000; }

    public String getDepoField001() { return depoField001; }
    public void setDepoField001(String depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public BigDecimal getDepoField004() { return depoField004; }
    public void setDepoField004(BigDecimal depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    @Override
    public String toString() {
        return "DepositDto048{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
