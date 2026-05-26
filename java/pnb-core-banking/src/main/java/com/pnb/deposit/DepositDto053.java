package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto053 — Data Transfer Object for deposit operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto053 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @Size(max = 200)
    @JsonProperty("depoField003")
    private String depoField003;

    @JsonProperty("depoField004")
    private LocalDate depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private Double depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @Size(max = 20)
    @JsonProperty("depoField008")
    private String depoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField009")
    private BigDecimal depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @JsonProperty("depoField011")
    private Double depoField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField012")
    private BigDecimal depoField012;

    public DepositDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto053 instance = new DepositDto053();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(String val) { instance.depoField003 = val; return this; }
        public Builder depoField004(LocalDate val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Double val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(String val) { instance.depoField008 = val; return this; }
        public Builder depoField009(BigDecimal val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Double val) { instance.depoField011 = val; return this; }
        public Builder depoField012(BigDecimal val) { instance.depoField012 = val; return this; }
        public DepositDto053 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public String getDepoField003() { return depoField003; }
    public void setDepoField003(String depoField003) { this.depoField003 = depoField003; }

    public LocalDate getDepoField004() { return depoField004; }
    public void setDepoField004(LocalDate depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public Double getDepoField006() { return depoField006; }
    public void setDepoField006(Double depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public String getDepoField008() { return depoField008; }
    public void setDepoField008(String depoField008) { this.depoField008 = depoField008; }

    public BigDecimal getDepoField009() { return depoField009; }
    public void setDepoField009(BigDecimal depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public Double getDepoField011() { return depoField011; }
    public void setDepoField011(Double depoField011) { this.depoField011 = depoField011; }

    public BigDecimal getDepoField012() { return depoField012; }
    public void setDepoField012(BigDecimal depoField012) { this.depoField012 = depoField012; }

    @Override
    public String toString() {
        return "DepositDto053{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
