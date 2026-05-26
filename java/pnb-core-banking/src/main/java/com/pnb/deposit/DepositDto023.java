package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto023 — Data Transfer Object for deposit operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto023 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Long depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @JsonProperty("depoField010")
    private Integer depoField010;

    @JsonProperty("depoField011")
    private Long depoField011;

    @Size(max = 60)
    @JsonProperty("depoField012")
    private String depoField012;

    @JsonProperty("depoField013")
    private Boolean depoField013;

    @JsonProperty("depoField014")
    private Long depoField014;

    @JsonProperty("depoField015")
    private Double depoField015;

    @JsonProperty("depoField016")
    private LocalDate depoField016;

    @Size(max = 20)
    @JsonProperty("depoField017")
    private String depoField017;

    @JsonProperty("depoField018")
    private Integer depoField018;

    public DepositDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto023 instance = new DepositDto023();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Long val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Integer val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Long val) { instance.depoField011 = val; return this; }
        public Builder depoField012(String val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Boolean val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Double val) { instance.depoField015 = val; return this; }
        public Builder depoField016(LocalDate val) { instance.depoField016 = val; return this; }
        public Builder depoField017(String val) { instance.depoField017 = val; return this; }
        public Builder depoField018(Integer val) { instance.depoField018 = val; return this; }
        public DepositDto023 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Long getDepoField001() { return depoField001; }
    public void setDepoField001(Long depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public Integer getDepoField010() { return depoField010; }
    public void setDepoField010(Integer depoField010) { this.depoField010 = depoField010; }

    public Long getDepoField011() { return depoField011; }
    public void setDepoField011(Long depoField011) { this.depoField011 = depoField011; }

    public String getDepoField012() { return depoField012; }
    public void setDepoField012(String depoField012) { this.depoField012 = depoField012; }

    public Boolean getDepoField013() { return depoField013; }
    public void setDepoField013(Boolean depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public Double getDepoField015() { return depoField015; }
    public void setDepoField015(Double depoField015) { this.depoField015 = depoField015; }

    public LocalDate getDepoField016() { return depoField016; }
    public void setDepoField016(LocalDate depoField016) { this.depoField016 = depoField016; }

    public String getDepoField017() { return depoField017; }
    public void setDepoField017(String depoField017) { this.depoField017 = depoField017; }

    public Integer getDepoField018() { return depoField018; }
    public void setDepoField018(Integer depoField018) { this.depoField018 = depoField018; }

    @Override
    public String toString() {
        return "DepositDto023{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
