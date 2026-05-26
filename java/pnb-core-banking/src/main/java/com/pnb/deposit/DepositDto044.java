package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto044 — Data Transfer Object for deposit operations.
 * Variant 44 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto044 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @JsonProperty("depoField001")
    private Long depoField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField002")
    private BigDecimal depoField002;

    @JsonProperty("depoField003")
    private LocalDate depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField005")
    private BigDecimal depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @Size(max = 40)
    @JsonProperty("depoField007")
    private String depoField007;

    @JsonProperty("depoField008")
    private Boolean depoField008;

    @Size(max = 200)
    @JsonProperty("depoField009")
    private String depoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField010")
    private BigDecimal depoField010;

    @JsonProperty("depoField011")
    private Long depoField011;

    @JsonProperty("depoField012")
    private Integer depoField012;

    @JsonProperty("depoField013")
    private Double depoField013;

    @JsonProperty("depoField014")
    private Long depoField014;

    @Size(max = 200)
    @JsonProperty("depoField015")
    private String depoField015;

    public DepositDto044() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto044 instance = new DepositDto044();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Long val) { instance.depoField001 = val; return this; }
        public Builder depoField002(BigDecimal val) { instance.depoField002 = val; return this; }
        public Builder depoField003(LocalDate val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(BigDecimal val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(String val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Boolean val) { instance.depoField008 = val; return this; }
        public Builder depoField009(String val) { instance.depoField009 = val; return this; }
        public Builder depoField010(BigDecimal val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Long val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Integer val) { instance.depoField012 = val; return this; }
        public Builder depoField013(Double val) { instance.depoField013 = val; return this; }
        public Builder depoField014(Long val) { instance.depoField014 = val; return this; }
        public Builder depoField015(String val) { instance.depoField015 = val; return this; }
        public DepositDto044 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public Long getDepoField001() { return depoField001; }
    public void setDepoField001(Long depoField001) { this.depoField001 = depoField001; }

    public BigDecimal getDepoField002() { return depoField002; }
    public void setDepoField002(BigDecimal depoField002) { this.depoField002 = depoField002; }

    public LocalDate getDepoField003() { return depoField003; }
    public void setDepoField003(LocalDate depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public BigDecimal getDepoField005() { return depoField005; }
    public void setDepoField005(BigDecimal depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public String getDepoField007() { return depoField007; }
    public void setDepoField007(String depoField007) { this.depoField007 = depoField007; }

    public Boolean getDepoField008() { return depoField008; }
    public void setDepoField008(Boolean depoField008) { this.depoField008 = depoField008; }

    public String getDepoField009() { return depoField009; }
    public void setDepoField009(String depoField009) { this.depoField009 = depoField009; }

    public BigDecimal getDepoField010() { return depoField010; }
    public void setDepoField010(BigDecimal depoField010) { this.depoField010 = depoField010; }

    public Long getDepoField011() { return depoField011; }
    public void setDepoField011(Long depoField011) { this.depoField011 = depoField011; }

    public Integer getDepoField012() { return depoField012; }
    public void setDepoField012(Integer depoField012) { this.depoField012 = depoField012; }

    public Double getDepoField013() { return depoField013; }
    public void setDepoField013(Double depoField013) { this.depoField013 = depoField013; }

    public Long getDepoField014() { return depoField014; }
    public void setDepoField014(Long depoField014) { this.depoField014 = depoField014; }

    public String getDepoField015() { return depoField015; }
    public void setDepoField015(String depoField015) { this.depoField015 = depoField015; }

    @Override
    public String toString() {
        return "DepositDto044{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
