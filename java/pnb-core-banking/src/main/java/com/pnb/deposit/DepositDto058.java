package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto058 — Data Transfer Object for deposit operations.
 * Variant 58 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto058 {

    @JsonProperty("depoField000")
    private Double depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField003")
    private BigDecimal depoField003;

    @Size(max = 40)
    @JsonProperty("depoField004")
    private String depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private Long depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @Size(max = 20)
    @JsonProperty("depoField008")
    private String depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private LocalDate depoField010;

    @JsonProperty("depoField011")
    private Long depoField011;

    @JsonProperty("depoField012")
    private Double depoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField013")
    private BigDecimal depoField013;

    @JsonProperty("depoField014")
    private LocalDate depoField014;

    @JsonProperty("depoField015")
    private Integer depoField015;

    @JsonProperty("depoField016")
    private Integer depoField016;

    @Size(max = 40)
    @JsonProperty("depoField017")
    private String depoField017;

    public DepositDto058() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto058 instance = new DepositDto058();

        public Builder depoField000(Double val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(BigDecimal val) { instance.depoField003 = val; return this; }
        public Builder depoField004(String val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Long val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(String val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(LocalDate val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Long val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Double val) { instance.depoField012 = val; return this; }
        public Builder depoField013(BigDecimal val) { instance.depoField013 = val; return this; }
        public Builder depoField014(LocalDate val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Integer val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Integer val) { instance.depoField016 = val; return this; }
        public Builder depoField017(String val) { instance.depoField017 = val; return this; }
        public DepositDto058 build() { return instance; }
    }

    public Double getDepoField000() { return depoField000; }
    public void setDepoField000(Double depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public BigDecimal getDepoField003() { return depoField003; }
    public void setDepoField003(BigDecimal depoField003) { this.depoField003 = depoField003; }

    public String getDepoField004() { return depoField004; }
    public void setDepoField004(String depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public Long getDepoField006() { return depoField006; }
    public void setDepoField006(Long depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public String getDepoField008() { return depoField008; }
    public void setDepoField008(String depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public LocalDate getDepoField010() { return depoField010; }
    public void setDepoField010(LocalDate depoField010) { this.depoField010 = depoField010; }

    public Long getDepoField011() { return depoField011; }
    public void setDepoField011(Long depoField011) { this.depoField011 = depoField011; }

    public Double getDepoField012() { return depoField012; }
    public void setDepoField012(Double depoField012) { this.depoField012 = depoField012; }

    public BigDecimal getDepoField013() { return depoField013; }
    public void setDepoField013(BigDecimal depoField013) { this.depoField013 = depoField013; }

    public LocalDate getDepoField014() { return depoField014; }
    public void setDepoField014(LocalDate depoField014) { this.depoField014 = depoField014; }

    public Integer getDepoField015() { return depoField015; }
    public void setDepoField015(Integer depoField015) { this.depoField015 = depoField015; }

    public Integer getDepoField016() { return depoField016; }
    public void setDepoField016(Integer depoField016) { this.depoField016 = depoField016; }

    public String getDepoField017() { return depoField017; }
    public void setDepoField017(String depoField017) { this.depoField017 = depoField017; }

    @Override
    public String toString() {
        return "DepositDto058{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
