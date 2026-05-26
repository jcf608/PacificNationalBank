package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto021 — Data Transfer Object for deposit operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto021 {

    @JsonProperty("depoField000")
    private LocalDate depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @JsonProperty("depoField002")
    private Double depoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField003")
    private BigDecimal depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField005")
    private BigDecimal depoField005;

    @JsonProperty("depoField006")
    private Integer depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField009")
    private BigDecimal depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField012")
    private BigDecimal depoField012;

    @JsonProperty("depoField013")
    private LocalDate depoField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField014")
    private BigDecimal depoField014;

    @Size(max = 20)
    @JsonProperty("depoField015")
    private String depoField015;

    @JsonProperty("depoField016")
    private Integer depoField016;

    public DepositDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto021 instance = new DepositDto021();

        public Builder depoField000(LocalDate val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Double val) { instance.depoField002 = val; return this; }
        public Builder depoField003(BigDecimal val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(BigDecimal val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Integer val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(BigDecimal val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(BigDecimal val) { instance.depoField012 = val; return this; }
        public Builder depoField013(LocalDate val) { instance.depoField013 = val; return this; }
        public Builder depoField014(BigDecimal val) { instance.depoField014 = val; return this; }
        public Builder depoField015(String val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Integer val) { instance.depoField016 = val; return this; }
        public DepositDto021 build() { return instance; }
    }

    public LocalDate getDepoField000() { return depoField000; }
    public void setDepoField000(LocalDate depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public Double getDepoField002() { return depoField002; }
    public void setDepoField002(Double depoField002) { this.depoField002 = depoField002; }

    public BigDecimal getDepoField003() { return depoField003; }
    public void setDepoField003(BigDecimal depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public BigDecimal getDepoField005() { return depoField005; }
    public void setDepoField005(BigDecimal depoField005) { this.depoField005 = depoField005; }

    public Integer getDepoField006() { return depoField006; }
    public void setDepoField006(Integer depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public BigDecimal getDepoField009() { return depoField009; }
    public void setDepoField009(BigDecimal depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public BigDecimal getDepoField012() { return depoField012; }
    public void setDepoField012(BigDecimal depoField012) { this.depoField012 = depoField012; }

    public LocalDate getDepoField013() { return depoField013; }
    public void setDepoField013(LocalDate depoField013) { this.depoField013 = depoField013; }

    public BigDecimal getDepoField014() { return depoField014; }
    public void setDepoField014(BigDecimal depoField014) { this.depoField014 = depoField014; }

    public String getDepoField015() { return depoField015; }
    public void setDepoField015(String depoField015) { this.depoField015 = depoField015; }

    public Integer getDepoField016() { return depoField016; }
    public void setDepoField016(Integer depoField016) { this.depoField016 = depoField016; }

    @Override
    public String toString() {
        return "DepositDto021{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
