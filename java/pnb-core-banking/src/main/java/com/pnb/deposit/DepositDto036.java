package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto036 — Data Transfer Object for deposit operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto036 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Long depoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField004")
    private BigDecimal depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    public DepositDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto036 instance = new DepositDto036();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Long val) { instance.depoField003 = val; return this; }
        public Builder depoField004(BigDecimal val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public DepositDto036 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Long getDepoField003() { return depoField003; }
    public void setDepoField003(Long depoField003) { this.depoField003 = depoField003; }

    public BigDecimal getDepoField004() { return depoField004; }
    public void setDepoField004(BigDecimal depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    @Override
    public String toString() {
        return "DepositDto036{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
