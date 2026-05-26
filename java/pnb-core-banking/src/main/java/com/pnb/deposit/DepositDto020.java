package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto020 — Data Transfer Object for deposit operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto020 {

    @JsonProperty("depoField000")
    private LocalDate depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @Size(max = 20)
    @JsonProperty("depoField005")
    private String depoField005;

    @JsonProperty("depoField006")
    private Integer depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @JsonProperty("depoField010")
    private Integer depoField010;

    @JsonProperty("depoField011")
    private Integer depoField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField012")
    private BigDecimal depoField012;

    @Size(max = 40)
    @JsonProperty("depoField013")
    private String depoField013;

    @JsonProperty("depoField014")
    private LocalDate depoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField015")
    private BigDecimal depoField015;

    public DepositDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto020 instance = new DepositDto020();

        public Builder depoField000(LocalDate val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Integer val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Integer val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Integer val) { instance.depoField011 = val; return this; }
        public Builder depoField012(BigDecimal val) { instance.depoField012 = val; return this; }
        public Builder depoField013(String val) { instance.depoField013 = val; return this; }
        public Builder depoField014(LocalDate val) { instance.depoField014 = val; return this; }
        public Builder depoField015(BigDecimal val) { instance.depoField015 = val; return this; }
        public DepositDto020 build() { return instance; }
    }

    public LocalDate getDepoField000() { return depoField000; }
    public void setDepoField000(LocalDate depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public Integer getDepoField006() { return depoField006; }
    public void setDepoField006(Integer depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public Integer getDepoField010() { return depoField010; }
    public void setDepoField010(Integer depoField010) { this.depoField010 = depoField010; }

    public Integer getDepoField011() { return depoField011; }
    public void setDepoField011(Integer depoField011) { this.depoField011 = depoField011; }

    public BigDecimal getDepoField012() { return depoField012; }
    public void setDepoField012(BigDecimal depoField012) { this.depoField012 = depoField012; }

    public String getDepoField013() { return depoField013; }
    public void setDepoField013(String depoField013) { this.depoField013 = depoField013; }

    public LocalDate getDepoField014() { return depoField014; }
    public void setDepoField014(LocalDate depoField014) { this.depoField014 = depoField014; }

    public BigDecimal getDepoField015() { return depoField015; }
    public void setDepoField015(BigDecimal depoField015) { this.depoField015 = depoField015; }

    @Override
    public String toString() {
        return "DepositDto020{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
