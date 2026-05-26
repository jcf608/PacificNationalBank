package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto054 — Data Transfer Object for deposit operations.
 * Variant 54 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto054 {

    @JsonProperty("depoField000")
    private Long depoField000;

    @JsonProperty("depoField001")
    private Integer depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @JsonProperty("depoField003")
    private Long depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private LocalDate depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @JsonProperty("depoField010")
    private Boolean depoField010;

    @JsonProperty("depoField011")
    private Integer depoField011;

    @JsonProperty("depoField012")
    private LocalDate depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    public DepositDto054() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto054 instance = new DepositDto054();

        public Builder depoField000(Long val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Integer val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Long val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(LocalDate val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Boolean val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Integer val) { instance.depoField011 = val; return this; }
        public Builder depoField012(LocalDate val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public DepositDto054 build() { return instance; }
    }

    public Long getDepoField000() { return depoField000; }
    public void setDepoField000(Long depoField000) { this.depoField000 = depoField000; }

    public Integer getDepoField001() { return depoField001; }
    public void setDepoField001(Integer depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public Long getDepoField003() { return depoField003; }
    public void setDepoField003(Long depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public LocalDate getDepoField005() { return depoField005; }
    public void setDepoField005(LocalDate depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public Boolean getDepoField010() { return depoField010; }
    public void setDepoField010(Boolean depoField010) { this.depoField010 = depoField010; }

    public Integer getDepoField011() { return depoField011; }
    public void setDepoField011(Integer depoField011) { this.depoField011 = depoField011; }

    public LocalDate getDepoField012() { return depoField012; }
    public void setDepoField012(LocalDate depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    @Override
    public String toString() {
        return "DepositDto054{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
