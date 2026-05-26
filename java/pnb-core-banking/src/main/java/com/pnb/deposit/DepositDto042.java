package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto042 — Data Transfer Object for deposit operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto042 {

    @Size(max = 100)
    @JsonProperty("depoField000")
    private String depoField000;

    @JsonProperty("depoField001")
    private Long depoField001;

    @JsonProperty("depoField002")
    private Integer depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @Size(max = 40)
    @JsonProperty("depoField004")
    private String depoField004;

    @JsonProperty("depoField005")
    private Long depoField005;

    @Size(max = 200)
    @JsonProperty("depoField006")
    private String depoField006;

    @JsonProperty("depoField007")
    private LocalDate depoField007;

    @JsonProperty("depoField008")
    private Double depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @JsonProperty("depoField010")
    private Double depoField010;

    @JsonProperty("depoField011")
    private Boolean depoField011;

    @JsonProperty("depoField012")
    private Boolean depoField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField013")
    private BigDecimal depoField013;

    public DepositDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto042 instance = new DepositDto042();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Long val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Integer val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(String val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Long val) { instance.depoField005 = val; return this; }
        public Builder depoField006(String val) { instance.depoField006 = val; return this; }
        public Builder depoField007(LocalDate val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Double val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Double val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Boolean val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Boolean val) { instance.depoField012 = val; return this; }
        public Builder depoField013(BigDecimal val) { instance.depoField013 = val; return this; }
        public DepositDto042 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public Long getDepoField001() { return depoField001; }
    public void setDepoField001(Long depoField001) { this.depoField001 = depoField001; }

    public Integer getDepoField002() { return depoField002; }
    public void setDepoField002(Integer depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public String getDepoField004() { return depoField004; }
    public void setDepoField004(String depoField004) { this.depoField004 = depoField004; }

    public Long getDepoField005() { return depoField005; }
    public void setDepoField005(Long depoField005) { this.depoField005 = depoField005; }

    public String getDepoField006() { return depoField006; }
    public void setDepoField006(String depoField006) { this.depoField006 = depoField006; }

    public LocalDate getDepoField007() { return depoField007; }
    public void setDepoField007(LocalDate depoField007) { this.depoField007 = depoField007; }

    public Double getDepoField008() { return depoField008; }
    public void setDepoField008(Double depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public Double getDepoField010() { return depoField010; }
    public void setDepoField010(Double depoField010) { this.depoField010 = depoField010; }

    public Boolean getDepoField011() { return depoField011; }
    public void setDepoField011(Boolean depoField011) { this.depoField011 = depoField011; }

    public Boolean getDepoField012() { return depoField012; }
    public void setDepoField012(Boolean depoField012) { this.depoField012 = depoField012; }

    public BigDecimal getDepoField013() { return depoField013; }
    public void setDepoField013(BigDecimal depoField013) { this.depoField013 = depoField013; }

    @Override
    public String toString() {
        return "DepositDto042{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
