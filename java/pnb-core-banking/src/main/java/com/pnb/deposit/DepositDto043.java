package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto043 — Data Transfer Object for deposit operations.
 * Variant 43 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto043 {

    @JsonProperty("depoField000")
    private Double depoField000;

    @JsonProperty("depoField001")
    private Integer depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Long depoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField004")
    private BigDecimal depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField010")
    private BigDecimal depoField010;

    @JsonProperty("depoField011")
    private Long depoField011;

    @JsonProperty("depoField012")
    private Integer depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Boolean depoField014;

    public DepositDto043() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto043 instance = new DepositDto043();

        public Builder depoField000(Double val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Integer val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Long val) { instance.depoField003 = val; return this; }
        public Builder depoField004(BigDecimal val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(BigDecimal val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Long val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Integer val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Boolean val) { instance.depoField014 = val; return this; }
        public DepositDto043 build() { return instance; }
    }

    public Double getDepoField000() { return depoField000; }
    public void setDepoField000(Double depoField000) { this.depoField000 = depoField000; }

    public Integer getDepoField001() { return depoField001; }
    public void setDepoField001(Integer depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Long getDepoField003() { return depoField003; }
    public void setDepoField003(Long depoField003) { this.depoField003 = depoField003; }

    public BigDecimal getDepoField004() { return depoField004; }
    public void setDepoField004(BigDecimal depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public BigDecimal getDepoField010() { return depoField010; }
    public void setDepoField010(BigDecimal depoField010) { this.depoField010 = depoField010; }

    public Long getDepoField011() { return depoField011; }
    public void setDepoField011(Long depoField011) { this.depoField011 = depoField011; }

    public Integer getDepoField012() { return depoField012; }
    public void setDepoField012(Integer depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Boolean getDepoField014() { return depoField014; }
    public void setDepoField014(Boolean depoField014) { this.depoField014 = depoField014; }

    @Override
    public String toString() {
        return "DepositDto043{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
