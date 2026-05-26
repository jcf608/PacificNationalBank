package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto030 — Data Transfer Object for deposit operations.
 * Variant 30 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto030 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @JsonProperty("depoField002")
    private Double depoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField003")
    private BigDecimal depoField003;

    @JsonProperty("depoField004")
    private LocalDate depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Boolean depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @JsonProperty("depoField008")
    private LocalDate depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @JsonProperty("depoField010")
    private LocalDate depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    @JsonProperty("depoField012")
    private Long depoField012;

    @Size(max = 40)
    @JsonProperty("depoField013")
    private String depoField013;

    public DepositDto030() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto030 instance = new DepositDto030();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Double val) { instance.depoField002 = val; return this; }
        public Builder depoField003(BigDecimal val) { instance.depoField003 = val; return this; }
        public Builder depoField004(LocalDate val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Boolean val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(LocalDate val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(LocalDate val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Long val) { instance.depoField012 = val; return this; }
        public Builder depoField013(String val) { instance.depoField013 = val; return this; }
        public DepositDto030 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public Double getDepoField002() { return depoField002; }
    public void setDepoField002(Double depoField002) { this.depoField002 = depoField002; }

    public BigDecimal getDepoField003() { return depoField003; }
    public void setDepoField003(BigDecimal depoField003) { this.depoField003 = depoField003; }

    public LocalDate getDepoField004() { return depoField004; }
    public void setDepoField004(LocalDate depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Boolean getDepoField006() { return depoField006; }
    public void setDepoField006(Boolean depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public LocalDate getDepoField008() { return depoField008; }
    public void setDepoField008(LocalDate depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public LocalDate getDepoField010() { return depoField010; }
    public void setDepoField010(LocalDate depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public Long getDepoField012() { return depoField012; }
    public void setDepoField012(Long depoField012) { this.depoField012 = depoField012; }

    public String getDepoField013() { return depoField013; }
    public void setDepoField013(String depoField013) { this.depoField013 = depoField013; }

    @Override
    public String toString() {
        return "DepositDto030{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
