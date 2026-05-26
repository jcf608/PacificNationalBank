package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto049 — Data Transfer Object for deposit operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto049 {

    @Size(max = 200)
    @JsonProperty("depoField000")
    private String depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @JsonProperty("depoField002")
    private Integer depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @Size(max = 60)
    @JsonProperty("depoField005")
    private String depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @JsonProperty("depoField008")
    private Boolean depoField008;

    public DepositDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto049 instance = new DepositDto049();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Integer val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Boolean val) { instance.depoField008 = val; return this; }
        public DepositDto049 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public Integer getDepoField002() { return depoField002; }
    public void setDepoField002(Integer depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public Boolean getDepoField008() { return depoField008; }
    public void setDepoField008(Boolean depoField008) { this.depoField008 = depoField008; }

    @Override
    public String toString() {
        return "DepositDto049{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
