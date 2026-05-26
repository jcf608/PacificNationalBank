package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto031 — Data Transfer Object for deposit operations.
 * Variant 31 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto031 {

    @JsonProperty("depoField000")
    private Boolean depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @JsonProperty("depoField004")
    private Boolean depoField004;

    @JsonProperty("depoField005")
    private LocalDate depoField005;

    @JsonProperty("depoField006")
    private Boolean depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private Boolean depoField010;

    @JsonProperty("depoField011")
    private Double depoField011;

    @JsonProperty("depoField012")
    private Boolean depoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField013")
    private BigDecimal depoField013;

    @JsonProperty("depoField014")
    private Integer depoField014;

    public DepositDto031() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto031 instance = new DepositDto031();

        public Builder depoField000(Boolean val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Boolean val) { instance.depoField004 = val; return this; }
        public Builder depoField005(LocalDate val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Boolean val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Boolean val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Double val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Boolean val) { instance.depoField012 = val; return this; }
        public Builder depoField013(BigDecimal val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Integer val) { instance.depoField014 = val; return this; }
        public DepositDto031 build() { return instance; }
    }

    public Boolean getDepoField000() { return depoField000; }
    public void setDepoField000(Boolean depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public Boolean getDepoField004() { return depoField004; }
    public void setDepoField004(Boolean depoField004) { this.depoField004 = depoField004; }

    public LocalDate getDepoField005() { return depoField005; }
    public void setDepoField005(LocalDate depoField005) { this.depoField005 = depoField005; }

    public Boolean getDepoField006() { return depoField006; }
    public void setDepoField006(Boolean depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public Boolean getDepoField010() { return depoField010; }
    public void setDepoField010(Boolean depoField010) { this.depoField010 = depoField010; }

    public Double getDepoField011() { return depoField011; }
    public void setDepoField011(Double depoField011) { this.depoField011 = depoField011; }

    public Boolean getDepoField012() { return depoField012; }
    public void setDepoField012(Boolean depoField012) { this.depoField012 = depoField012; }

    public BigDecimal getDepoField013() { return depoField013; }
    public void setDepoField013(BigDecimal depoField013) { this.depoField013 = depoField013; }

    public Integer getDepoField014() { return depoField014; }
    public void setDepoField014(Integer depoField014) { this.depoField014 = depoField014; }

    @Override
    public String toString() {
        return "DepositDto031{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
