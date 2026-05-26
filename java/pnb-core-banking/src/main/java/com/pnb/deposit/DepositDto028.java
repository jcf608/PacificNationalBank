package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto028 — Data Transfer Object for deposit operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto028 {

    @JsonProperty("depoField000")
    private Boolean depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Integer depoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField007")
    private BigDecimal depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private Long depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    public DepositDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto028 instance = new DepositDto028();

        public Builder depoField000(Boolean val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Integer val) { instance.depoField006 = val; return this; }
        public Builder depoField007(BigDecimal val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Long val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public DepositDto028 build() { return instance; }
    }

    public Boolean getDepoField000() { return depoField000; }
    public void setDepoField000(Boolean depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Integer getDepoField006() { return depoField006; }
    public void setDepoField006(Integer depoField006) { this.depoField006 = depoField006; }

    public BigDecimal getDepoField007() { return depoField007; }
    public void setDepoField007(BigDecimal depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public Long getDepoField010() { return depoField010; }
    public void setDepoField010(Long depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    @Override
    public String toString() {
        return "DepositDto028{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
