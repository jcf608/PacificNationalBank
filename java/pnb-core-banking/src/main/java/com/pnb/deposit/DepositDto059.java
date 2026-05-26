package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto059 — Data Transfer Object for deposit operations.
 * Variant 59 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto059 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @Size(max = 20)
    @JsonProperty("depoField004")
    private String depoField004;

    @JsonProperty("depoField005")
    private Double depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @JsonProperty("depoField008")
    private Integer depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @JsonProperty("depoField010")
    private Long depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    @JsonProperty("depoField012")
    private Long depoField012;

    @JsonProperty("depoField013")
    private Long depoField013;

    @JsonProperty("depoField014")
    private Long depoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField015")
    private BigDecimal depoField015;

    @JsonProperty("depoField016")
    private Integer depoField016;

    @JsonProperty("depoField017")
    private Integer depoField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField018")
    private BigDecimal depoField018;

    public DepositDto059() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto059 instance = new DepositDto059();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(String val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Double val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Integer val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Long val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Long val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Long val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(BigDecimal val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Integer val) { instance.depoField016 = val; return this; }
        public Builder depoField017(Integer val) { instance.depoField017 = val; return this; }
        public Builder depoField018(BigDecimal val) { instance.depoField018 = val; return this; }
        public DepositDto059 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public String getDepoField004() { return depoField004; }
    public void setDepoField004(String depoField004) { this.depoField004 = depoField004; }

    public Double getDepoField005() { return depoField005; }
    public void setDepoField005(Double depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public Integer getDepoField008() { return depoField008; }
    public void setDepoField008(Integer depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public Long getDepoField010() { return depoField010; }
    public void setDepoField010(Long depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public Long getDepoField012() { return depoField012; }
    public void setDepoField012(Long depoField012) { this.depoField012 = depoField012; }

    public Long getDepoField013() { return depoField013; }
    public void setDepoField013(Long depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public BigDecimal getDepoField015() { return depoField015; }
    public void setDepoField015(BigDecimal depoField015) { this.depoField015 = depoField015; }

    public Integer getDepoField016() { return depoField016; }
    public void setDepoField016(Integer depoField016) { this.depoField016 = depoField016; }

    public Integer getDepoField017() { return depoField017; }
    public void setDepoField017(Integer depoField017) { this.depoField017 = depoField017; }

    public BigDecimal getDepoField018() { return depoField018; }
    public void setDepoField018(BigDecimal depoField018) { this.depoField018 = depoField018; }

    @Override
    public String toString() {
        return "DepositDto059{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
