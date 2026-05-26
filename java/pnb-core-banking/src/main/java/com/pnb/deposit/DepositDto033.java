package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto033 — Data Transfer Object for deposit operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto033 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @JsonProperty("depoField002")
    private Integer depoField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField003")
    private BigDecimal depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private LocalDate depoField005;

    @JsonProperty("depoField006")
    private Double depoField006;

    @Size(max = 200)
    @JsonProperty("depoField007")
    private String depoField007;

    @JsonProperty("depoField008")
    private Boolean depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @Size(max = 20)
    @JsonProperty("depoField010")
    private String depoField010;

    @JsonProperty("depoField011")
    private LocalDate depoField011;

    @JsonProperty("depoField012")
    private Boolean depoField012;

    @JsonProperty("depoField013")
    private Boolean depoField013;

    @JsonProperty("depoField014")
    private Boolean depoField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField015")
    private BigDecimal depoField015;

    @JsonProperty("depoField016")
    private Boolean depoField016;

    public DepositDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto033 instance = new DepositDto033();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Integer val) { instance.depoField002 = val; return this; }
        public Builder depoField003(BigDecimal val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(LocalDate val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Double val) { instance.depoField006 = val; return this; }
        public Builder depoField007(String val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Boolean val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(String val) { instance.depoField010 = val; return this; }
        public Builder depoField011(LocalDate val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Boolean val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Boolean val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Boolean val) { instance.depoField014 = val; return this; }
        public Builder depoField015(BigDecimal val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Boolean val) { instance.depoField016 = val; return this; }
        public DepositDto033 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public Integer getDepoField002() { return depoField002; }
    public void setDepoField002(Integer depoField002) { this.depoField002 = depoField002; }

    public BigDecimal getDepoField003() { return depoField003; }
    public void setDepoField003(BigDecimal depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public LocalDate getDepoField005() { return depoField005; }
    public void setDepoField005(LocalDate depoField005) { this.depoField005 = depoField005; }

    public Double getDepoField006() { return depoField006; }
    public void setDepoField006(Double depoField006) { this.depoField006 = depoField006; }

    public String getDepoField007() { return depoField007; }
    public void setDepoField007(String depoField007) { this.depoField007 = depoField007; }

    public Boolean getDepoField008() { return depoField008; }
    public void setDepoField008(Boolean depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public String getDepoField010() { return depoField010; }
    public void setDepoField010(String depoField010) { this.depoField010 = depoField010; }

    public LocalDate getDepoField011() { return depoField011; }
    public void setDepoField011(LocalDate depoField011) { this.depoField011 = depoField011; }

    public Boolean getDepoField012() { return depoField012; }
    public void setDepoField012(Boolean depoField012) { this.depoField012 = depoField012; }

    public Boolean getDepoField013() { return depoField013; }
    public void setDepoField013(Boolean depoField013) { this.depoField013 = depoField013; }

    public Boolean getDepoField014() { return depoField014; }
    public void setDepoField014(Boolean depoField014) { this.depoField014 = depoField014; }

    public BigDecimal getDepoField015() { return depoField015; }
    public void setDepoField015(BigDecimal depoField015) { this.depoField015 = depoField015; }

    public Boolean getDepoField016() { return depoField016; }
    public void setDepoField016(Boolean depoField016) { this.depoField016 = depoField016; }

    @Override
    public String toString() {
        return "DepositDto033{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
