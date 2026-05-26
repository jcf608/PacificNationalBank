package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto052 — Data Transfer Object for deposit operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto052 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Integer depoField001;

    @JsonProperty("depoField002")
    private Boolean depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Double depoField007;

    @JsonProperty("depoField008")
    private LocalDate depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @Size(max = 60)
    @JsonProperty("depoField010")
    private String depoField010;

    @JsonProperty("depoField011")
    private Integer depoField011;

    public DepositDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto052 instance = new DepositDto052();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Integer val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Boolean val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Double val) { instance.depoField007 = val; return this; }
        public Builder depoField008(LocalDate val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(String val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Integer val) { instance.depoField011 = val; return this; }
        public DepositDto052 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Integer getDepoField001() { return depoField001; }
    public void setDepoField001(Integer depoField001) { this.depoField001 = depoField001; }

    public Boolean getDepoField002() { return depoField002; }
    public void setDepoField002(Boolean depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Double getDepoField007() { return depoField007; }
    public void setDepoField007(Double depoField007) { this.depoField007 = depoField007; }

    public LocalDate getDepoField008() { return depoField008; }
    public void setDepoField008(LocalDate depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public String getDepoField010() { return depoField010; }
    public void setDepoField010(String depoField010) { this.depoField010 = depoField010; }

    public Integer getDepoField011() { return depoField011; }
    public void setDepoField011(Integer depoField011) { this.depoField011 = depoField011; }

    @Override
    public String toString() {
        return "DepositDto052{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
