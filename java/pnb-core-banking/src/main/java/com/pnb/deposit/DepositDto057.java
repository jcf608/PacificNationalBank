package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto057 — Data Transfer Object for deposit operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto057 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @Size(max = 20)
    @JsonProperty("depoField002")
    private String depoField002;

    @Size(max = 100)
    @JsonProperty("depoField003")
    private String depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @JsonProperty("depoField008")
    private LocalDate depoField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField009")
    private BigDecimal depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField011")
    private BigDecimal depoField011;

    @Size(max = 100)
    @JsonProperty("depoField012")
    private String depoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField013")
    private BigDecimal depoField013;

    @JsonProperty("depoField014")
    private Long depoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField015")
    private BigDecimal depoField015;

    @JsonProperty("depoField016")
    private LocalDate depoField016;

    public DepositDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto057 instance = new DepositDto057();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(String val) { instance.depoField002 = val; return this; }
        public Builder depoField003(String val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(LocalDate val) { instance.depoField008 = val; return this; }
        public Builder depoField009(BigDecimal val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(String val) { instance.depoField012 = val; return this; }
        public Builder depoField013(BigDecimal val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(BigDecimal val) { instance.depoField015 = val; return this; }
        public Builder depoField016(LocalDate val) { instance.depoField016 = val; return this; }
        public DepositDto057 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public String getDepoField002() { return depoField002; }
    public void setDepoField002(String depoField002) { this.depoField002 = depoField002; }

    public String getDepoField003() { return depoField003; }
    public void setDepoField003(String depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public LocalDate getDepoField008() { return depoField008; }
    public void setDepoField008(LocalDate depoField008) { this.depoField008 = depoField008; }

    public BigDecimal getDepoField009() { return depoField009; }
    public void setDepoField009(BigDecimal depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public String getDepoField012() { return depoField012; }
    public void setDepoField012(String depoField012) { this.depoField012 = depoField012; }

    public BigDecimal getDepoField013() { return depoField013; }
    public void setDepoField013(BigDecimal depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public BigDecimal getDepoField015() { return depoField015; }
    public void setDepoField015(BigDecimal depoField015) { this.depoField015 = depoField015; }

    public LocalDate getDepoField016() { return depoField016; }
    public void setDepoField016(LocalDate depoField016) { this.depoField016 = depoField016; }

    @Override
    public String toString() {
        return "DepositDto057{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
