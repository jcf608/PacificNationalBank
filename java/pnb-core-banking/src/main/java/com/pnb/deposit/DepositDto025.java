package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto025 — Data Transfer Object for deposit operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto025 {

    @JsonProperty("depoField000")
    private Boolean depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @Size(max = 100)
    @JsonProperty("depoField005")
    private String depoField005;

    @JsonProperty("depoField006")
    private Integer depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    public DepositDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto025 instance = new DepositDto025();

        public Builder depoField000(Boolean val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Integer val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public DepositDto025 build() { return instance; }
    }

    public Boolean getDepoField000() { return depoField000; }
    public void setDepoField000(Boolean depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public Integer getDepoField006() { return depoField006; }
    public void setDepoField006(Integer depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    @Override
    public String toString() {
        return "DepositDto025{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
