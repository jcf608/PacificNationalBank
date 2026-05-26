package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto037 — Data Transfer Object for deposit operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto037 {

    @Size(max = 40)
    @JsonProperty("depoField000")
    private String depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @Size(max = 20)
    @JsonProperty("depoField005")
    private String depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @Size(max = 200)
    @JsonProperty("depoField008")
    private String depoField008;

    public DepositDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto037 instance = new DepositDto037();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(String val) { instance.depoField008 = val; return this; }
        public DepositDto037 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public String getDepoField008() { return depoField008; }
    public void setDepoField008(String depoField008) { this.depoField008 = depoField008; }

    @Override
    public String toString() {
        return "DepositDto037{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
