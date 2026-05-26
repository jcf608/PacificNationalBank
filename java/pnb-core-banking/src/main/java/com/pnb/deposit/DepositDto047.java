package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto047 — Data Transfer Object for deposit operations.
 * Variant 47 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto047 {

    @JsonProperty("depoField000")
    private Double depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField003")
    private BigDecimal depoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField004")
    private BigDecimal depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField009")
    private BigDecimal depoField009;

    @JsonProperty("depoField010")
    private Long depoField010;

    @JsonProperty("depoField011")
    private Double depoField011;

    @JsonProperty("depoField012")
    private Double depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Boolean depoField014;

    @JsonProperty("depoField015")
    private Boolean depoField015;

    @JsonProperty("depoField016")
    private Integer depoField016;

    @JsonProperty("depoField017")
    private Boolean depoField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField018")
    private BigDecimal depoField018;

    public DepositDto047() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto047 instance = new DepositDto047();

        public Builder depoField000(Double val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(BigDecimal val) { instance.depoField003 = val; return this; }
        public Builder depoField004(BigDecimal val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(BigDecimal val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Long val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Double val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Double val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Boolean val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Boolean val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Integer val) { instance.depoField016 = val; return this; }
        public Builder depoField017(Boolean val) { instance.depoField017 = val; return this; }
        public Builder depoField018(BigDecimal val) { instance.depoField018 = val; return this; }
        public DepositDto047 build() { return instance; }
    }

    public Double getDepoField000() { return depoField000; }
    public void setDepoField000(Double depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public BigDecimal getDepoField003() { return depoField003; }
    public void setDepoField003(BigDecimal depoField003) { this.depoField003 = depoField003; }

    public BigDecimal getDepoField004() { return depoField004; }
    public void setDepoField004(BigDecimal depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public BigDecimal getDepoField009() { return depoField009; }
    public void setDepoField009(BigDecimal depoField009) { this.depoField009 = depoField009; }

    public Long getDepoField010() { return depoField010; }
    public void setDepoField010(Long depoField010) { this.depoField010 = depoField010; }

    public Double getDepoField011() { return depoField011; }
    public void setDepoField011(Double depoField011) { this.depoField011 = depoField011; }

    public Double getDepoField012() { return depoField012; }
    public void setDepoField012(Double depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Boolean getDepoField014() { return depoField014; }
    public void setDepoField014(Boolean depoField014) { this.depoField014 = depoField014; }

    public Boolean getDepoField015() { return depoField015; }
    public void setDepoField015(Boolean depoField015) { this.depoField015 = depoField015; }

    public Integer getDepoField016() { return depoField016; }
    public void setDepoField016(Integer depoField016) { this.depoField016 = depoField016; }

    public Boolean getDepoField017() { return depoField017; }
    public void setDepoField017(Boolean depoField017) { this.depoField017 = depoField017; }

    public BigDecimal getDepoField018() { return depoField018; }
    public void setDepoField018(BigDecimal depoField018) { this.depoField018 = depoField018; }

    @Override
    public String toString() {
        return "DepositDto047{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
