package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto022 — Data Transfer Object for deposit operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto022 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @JsonProperty("depoField001")
    private Long depoField001;

    @JsonProperty("depoField002")
    private Integer depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private LocalDate depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Double depoField006;

    @Size(max = 20)
    @JsonProperty("depoField007")
    private String depoField007;

    @JsonProperty("depoField008")
    private Boolean depoField008;

    @JsonProperty("depoField009")
    private Boolean depoField009;

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
    private Long depoField014;

    @JsonProperty("depoField015")
    private Integer depoField015;

    @JsonProperty("depoField016")
    private Boolean depoField016;

    @JsonProperty("depoField017")
    private Integer depoField017;

    public DepositDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto022 instance = new DepositDto022();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Long val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Integer val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(LocalDate val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Double val) { instance.depoField006 = val; return this; }
        public Builder depoField007(String val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Boolean val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Boolean val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Boolean val) { instance.depoField010 = val; return this; }
        public Builder depoField011(BigDecimal val) { instance.depoField011 = val; return this; }
        public Builder depoField012(BigDecimal val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Integer val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Integer val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Boolean val) { instance.depoField016 = val; return this; }
        public Builder depoField017(Integer val) { instance.depoField017 = val; return this; }
        public DepositDto022 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public Long getDepoField001() { return depoField001; }
    public void setDepoField001(Long depoField001) { this.depoField001 = depoField001; }

    public Integer getDepoField002() { return depoField002; }
    public void setDepoField002(Integer depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public LocalDate getDepoField004() { return depoField004; }
    public void setDepoField004(LocalDate depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Double getDepoField006() { return depoField006; }
    public void setDepoField006(Double depoField006) { this.depoField006 = depoField006; }

    public String getDepoField007() { return depoField007; }
    public void setDepoField007(String depoField007) { this.depoField007 = depoField007; }

    public Boolean getDepoField008() { return depoField008; }
    public void setDepoField008(Boolean depoField008) { this.depoField008 = depoField008; }

    public Boolean getDepoField009() { return depoField009; }
    public void setDepoField009(Boolean depoField009) { this.depoField009 = depoField009; }

    public Boolean getDepoField010() { return depoField010; }
    public void setDepoField010(Boolean depoField010) { this.depoField010 = depoField010; }

    public BigDecimal getDepoField011() { return depoField011; }
    public void setDepoField011(BigDecimal depoField011) { this.depoField011 = depoField011; }

    public BigDecimal getDepoField012() { return depoField012; }
    public void setDepoField012(BigDecimal depoField012) { this.depoField012 = depoField012; }

    public Integer getDepoField013() { return depoField013; }
    public void setDepoField013(Integer depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public Integer getDepoField015() { return depoField015; }
    public void setDepoField015(Integer depoField015) { this.depoField015 = depoField015; }

    public Boolean getDepoField016() { return depoField016; }
    public void setDepoField016(Boolean depoField016) { this.depoField016 = depoField016; }

    public Integer getDepoField017() { return depoField017; }
    public void setDepoField017(Integer depoField017) { this.depoField017 = depoField017; }

    @Override
    public String toString() {
        return "DepositDto022{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
