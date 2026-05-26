package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto045 — Data Transfer Object for deposit operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto045 {

    @JsonProperty("depoField000")
    private Boolean depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Double depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @Size(max = 20)
    @JsonProperty("depoField005")
    private String depoField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField006")
    private BigDecimal depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private LocalDate depoField008;

    @JsonProperty("depoField009")
    private Boolean depoField009;

    @JsonProperty("depoField010")
    private Integer depoField010;

    @JsonProperty("depoField011")
    private Integer depoField011;

    @JsonProperty("depoField012")
    private LocalDate depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Boolean depoField014;

    @JsonProperty("depoField015")
    private LocalDate depoField015;

    @JsonProperty("depoField016")
    private Integer depoField016;

    public DepositDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto045 instance = new DepositDto045();

        public Builder depoField000(Boolean val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Double val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(BigDecimal val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(LocalDate val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Boolean val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Integer val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Integer val) { instance.depoField011 = val; return this; }
        public Builder depoField012(LocalDate val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Boolean val) { instance.depoField014 = val; return this; }
        public Builder depoField015(LocalDate val) { instance.depoField015 = val; return this; }
        public Builder depoField016(Integer val) { instance.depoField016 = val; return this; }
        public DepositDto045 build() { return instance; }
    }

    public Boolean getDepoField000() { return depoField000; }
    public void setDepoField000(Boolean depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Double getDepoField003() { return depoField003; }
    public void setDepoField003(Double depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public BigDecimal getDepoField006() { return depoField006; }
    public void setDepoField006(BigDecimal depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public LocalDate getDepoField008() { return depoField008; }
    public void setDepoField008(LocalDate depoField008) { this.depoField008 = depoField008; }

    public Boolean getDepoField009() { return depoField009; }
    public void setDepoField009(Boolean depoField009) { this.depoField009 = depoField009; }

    public Integer getDepoField010() { return depoField010; }
    public void setDepoField010(Integer depoField010) { this.depoField010 = depoField010; }

    public Integer getDepoField011() { return depoField011; }
    public void setDepoField011(Integer depoField011) { this.depoField011 = depoField011; }

    public LocalDate getDepoField012() { return depoField012; }
    public void setDepoField012(LocalDate depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Boolean getDepoField014() { return depoField014; }
    public void setDepoField014(Boolean depoField014) { this.depoField014 = depoField014; }

    public LocalDate getDepoField015() { return depoField015; }
    public void setDepoField015(LocalDate depoField015) { this.depoField015 = depoField015; }

    public Integer getDepoField016() { return depoField016; }
    public void setDepoField016(Integer depoField016) { this.depoField016 = depoField016; }

    @Override
    public String toString() {
        return "DepositDto045{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
