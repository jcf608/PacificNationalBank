package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto032 — Data Transfer Object for deposit operations.
 * Variant 32 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto032 {

    @Size(max = 100)
    @JsonProperty("depoField000")
    private String depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @JsonProperty("depoField002")
    private Double depoField002;

    @JsonProperty("depoField003")
    private Long depoField003;

    @Size(max = 60)
    @JsonProperty("depoField004")
    private String depoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField005")
    private BigDecimal depoField005;

    @Size(max = 100)
    @JsonProperty("depoField006")
    private String depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @JsonProperty("depoField008")
    private Integer depoField008;

    @Size(max = 60)
    @JsonProperty("depoField009")
    private String depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @JsonProperty("depoField011")
    private Double depoField011;

    @JsonProperty("depoField012")
    private Integer depoField012;

    @JsonProperty("depoField013")
    private LocalDate depoField013;

    @JsonProperty("depoField014")
    private Long depoField014;

    @JsonProperty("depoField015")
    private Integer depoField015;

    public DepositDto032() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto032 instance = new DepositDto032();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Double val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Long val) { instance.depoField003 = val; return this; }
        public Builder depoField004(String val) { instance.depoField004 = val; return this; }
        public Builder depoField005(BigDecimal val) { instance.depoField005 = val; return this; }
        public Builder depoField006(String val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Integer val) { instance.depoField008 = val; return this; }
        public Builder depoField009(String val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Double val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Integer val) { instance.depoField012 = val; return this; }
        public Builder depoField013(LocalDate val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(Integer val) { instance.depoField015 = val; return this; }
        public DepositDto032 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public Double getDepoField002() { return depoField002; }
    public void setDepoField002(Double depoField002) { this.depoField002 = depoField002; }

    public Long getDepoField003() { return depoField003; }
    public void setDepoField003(Long depoField003) { this.depoField003 = depoField003; }

    public String getDepoField004() { return depoField004; }
    public void setDepoField004(String depoField004) { this.depoField004 = depoField004; }

    public BigDecimal getDepoField005() { return depoField005; }
    public void setDepoField005(BigDecimal depoField005) { this.depoField005 = depoField005; }

    public String getDepoField006() { return depoField006; }
    public void setDepoField006(String depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public Integer getDepoField008() { return depoField008; }
    public void setDepoField008(Integer depoField008) { this.depoField008 = depoField008; }

    public String getDepoField009() { return depoField009; }
    public void setDepoField009(String depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public Double getDepoField011() { return depoField011; }
    public void setDepoField011(Double depoField011) { this.depoField011 = depoField011; }

    public Integer getDepoField012() { return depoField012; }
    public void setDepoField012(Integer depoField012) { this.depoField012 = depoField012; }

    public LocalDate getDepoField013() { return depoField013; }
    public void setDepoField013(LocalDate depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public Integer getDepoField015() { return depoField015; }
    public void setDepoField015(Integer depoField015) { this.depoField015 = depoField015; }

    @Override
    public String toString() {
        return "DepositDto032{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
