package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto056 — Data Transfer Object for deposit operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto056 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Integer depoField001;

    @JsonProperty("depoField002")
    private Double depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField008")
    private BigDecimal depoField008;

    @Size(max = 100)
    @JsonProperty("depoField009")
    private String depoField009;

    @JsonProperty("depoField010")
    private Boolean depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField012")
    private BigDecimal depoField012;

    @JsonProperty("depoField013")
    private Integer depoField013;

    @JsonProperty("depoField014")
    private Integer depoField014;

    @JsonProperty("depoField015")
    private Boolean depoField015;

    public DepositDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto056 instance = new DepositDto056();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Integer val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Double val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(BigDecimal val) { instance.depoField008 = val; return this; }
        public Builder depoField009(String val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Boolean val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(BigDecimal val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Integer val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Integer val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Boolean val) { instance.depoField015 = val; return this; }
        public DepositDto056 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Integer getDepoField001() { return depoField001; }
    public void setDepoField001(Integer depoField001) { this.depoField001 = depoField001; }

    public Double getDepoField002() { return depoField002; }
    public void setDepoField002(Double depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public BigDecimal getDepoField008() { return depoField008; }
    public void setDepoField008(BigDecimal depoField008) { this.depoField008 = depoField008; }

    public String getDepoField009() { return depoField009; }
    public void setDepoField009(String depoField009) { this.depoField009 = depoField009; }

    public Boolean getDepoField010() { return depoField010; }
    public void setDepoField010(Boolean depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public BigDecimal getDepoField012() { return depoField012; }
    public void setDepoField012(BigDecimal depoField012) { this.depoField012 = depoField012; }

    public Integer getDepoField013() { return depoField013; }
    public void setDepoField013(Integer depoField013) { this.depoField013 = depoField013; }

    public Integer getDepoField014() { return depoField014; }
    public void setDepoField014(Integer depoField014) { this.depoField014 = depoField014; }

    public Boolean getDepoField015() { return depoField015; }
    public void setDepoField015(Boolean depoField015) { this.depoField015 = depoField015; }

    @Override
    public String toString() {
        return "DepositDto056{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
