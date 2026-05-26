package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto046 — Data Transfer Object for deposit operations.
 * Variant 46 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto046 {

    @JsonProperty("depoField000")
    private Double depoField000;

    @JsonProperty("depoField001")
    private Boolean depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private LocalDate depoField004;

    @JsonProperty("depoField005")
    private Double depoField005;

    @JsonProperty("depoField006")
    private Boolean depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private Long depoField010;

    @JsonProperty("depoField011")
    private Boolean depoField011;

    @JsonProperty("depoField012")
    private LocalDate depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Boolean depoField014;

    @Size(max = 100)
    @JsonProperty("depoField015")
    private String depoField015;

    @JsonProperty("depoField016")
    private Long depoField016;

    @JsonProperty("depoField017")
    private LocalDate depoField017;

    public DepositDto046() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto046 instance = new DepositDto046();

        public Builder depoField000(Double val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Boolean val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(LocalDate val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Double val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Boolean val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Long val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Boolean val) { instance.depoField011 = val; return this; }
        public Builder depoField012(LocalDate val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Boolean val) { instance.depoField014 = val; return this; }
        public Builder depoField015(String val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Long val) { instance.depoField016 = val; return this; }
        public Builder depoField017(LocalDate val) { instance.depoField017 = val; return this; }
        public DepositDto046 build() { return instance; }
    }

    public Double getDepoField000() { return depoField000; }
    public void setDepoField000(Double depoField000) { this.depoField000 = depoField000; }

    public Boolean getDepoField001() { return depoField001; }
    public void setDepoField001(Boolean depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public LocalDate getDepoField004() { return depoField004; }
    public void setDepoField004(LocalDate depoField004) { this.depoField004 = depoField004; }

    public Double getDepoField005() { return depoField005; }
    public void setDepoField005(Double depoField005) { this.depoField005 = depoField005; }

    public Boolean getDepoField006() { return depoField006; }
    public void setDepoField006(Boolean depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public Long getDepoField010() { return depoField010; }
    public void setDepoField010(Long depoField010) { this.depoField010 = depoField010; }

    public Boolean getDepoField011() { return depoField011; }
    public void setDepoField011(Boolean depoField011) { this.depoField011 = depoField011; }

    public LocalDate getDepoField012() { return depoField012; }
    public void setDepoField012(LocalDate depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Boolean getDepoField014() { return depoField014; }
    public void setDepoField014(Boolean depoField014) { this.depoField014 = depoField014; }

    public String getDepoField015() { return depoField015; }
    public void setDepoField015(String depoField015) { this.depoField015 = depoField015; }

    public Long getDepoField016() { return depoField016; }
    public void setDepoField016(Long depoField016) { this.depoField016 = depoField016; }

    public LocalDate getDepoField017() { return depoField017; }
    public void setDepoField017(LocalDate depoField017) { this.depoField017 = depoField017; }

    @Override
    public String toString() {
        return "DepositDto046{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
