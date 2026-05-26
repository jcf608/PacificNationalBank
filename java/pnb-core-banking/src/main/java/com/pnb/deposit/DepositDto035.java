package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto035 — Data Transfer Object for deposit operations.
 * Variant 35 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto035 {

    @JsonProperty("depoField000")
    private Double depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Boolean depoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField007")
    private BigDecimal depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @JsonProperty("depoField011")
    private LocalDate depoField011;

    @JsonProperty("depoField012")
    private Double depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Double depoField014;

    @JsonProperty("depoField015")
    private Long depoField015;

    @JsonProperty("depoField016")
    private LocalDate depoField016;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField017")
    private BigDecimal depoField017;

    @JsonProperty("depoField018")
    private Long depoField018;

    public DepositDto035() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto035 instance = new DepositDto035();

        public Builder depoField000(Double val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Boolean val) { instance.depoField006 = val; return this; }
        public Builder depoField007(BigDecimal val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(LocalDate val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Double val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Double val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Long val) { instance.depoField015 = val; return this; }
        public Builder depoField016(LocalDate val) { instance.depoField016 = val; return this; }
        public Builder depoField017(BigDecimal val) { instance.depoField017 = val; return this; }
        public Builder depoField018(Long val) { instance.depoField018 = val; return this; }
        public DepositDto035 build() { return instance; }
    }

    public Double getDepoField000() { return depoField000; }
    public void setDepoField000(Double depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Boolean getDepoField006() { return depoField006; }
    public void setDepoField006(Boolean depoField006) { this.depoField006 = depoField006; }

    public BigDecimal getDepoField007() { return depoField007; }
    public void setDepoField007(BigDecimal depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public LocalDate getDepoField011() { return depoField011; }
    public void setDepoField011(LocalDate depoField011) { this.depoField011 = depoField011; }

    public Double getDepoField012() { return depoField012; }
    public void setDepoField012(Double depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Double getDepoField014() { return depoField014; }
    public void setDepoField014(Double depoField014) { this.depoField014 = depoField014; }

    public Long getDepoField015() { return depoField015; }
    public void setDepoField015(Long depoField015) { this.depoField015 = depoField015; }

    public LocalDate getDepoField016() { return depoField016; }
    public void setDepoField016(LocalDate depoField016) { this.depoField016 = depoField016; }

    public BigDecimal getDepoField017() { return depoField017; }
    public void setDepoField017(BigDecimal depoField017) { this.depoField017 = depoField017; }

    public Long getDepoField018() { return depoField018; }
    public void setDepoField018(Long depoField018) { this.depoField018 = depoField018; }

    @Override
    public String toString() {
        return "DepositDto035{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
