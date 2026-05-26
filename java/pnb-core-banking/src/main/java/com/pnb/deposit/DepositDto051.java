package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto051 — Data Transfer Object for deposit operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto051 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @Size(max = 60)
    @JsonProperty("depoField002")
    private String depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Long depoField005;

    @JsonProperty("depoField006")
    private Integer depoField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField007")
    private BigDecimal depoField007;

    @Size(max = 100)
    @JsonProperty("depoField008")
    private String depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    public DepositDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto051 instance = new DepositDto051();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(String val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Long val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Integer val) { instance.depoField006 = val; return this; }
        public Builder depoField007(BigDecimal val) { instance.depoField007 = val; return this; }
        public Builder depoField008(String val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public DepositDto051 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public String getDepoField002() { return depoField002; }
    public void setDepoField002(String depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Long getDepoField005() { return depoField005; }
    public void setDepoField005(Long depoField005) { this.depoField005 = depoField005; }

    public Integer getDepoField006() { return depoField006; }
    public void setDepoField006(Integer depoField006) { this.depoField006 = depoField006; }

    public BigDecimal getDepoField007() { return depoField007; }
    public void setDepoField007(BigDecimal depoField007) { this.depoField007 = depoField007; }

    public String getDepoField008() { return depoField008; }
    public void setDepoField008(String depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    @Override
    public String toString() {
        return "DepositDto051{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
