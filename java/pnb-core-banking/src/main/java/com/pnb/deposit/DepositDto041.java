package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto041 — Data Transfer Object for deposit operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto041 {

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField000")
    private BigDecimal depoField000;

    @JsonProperty("depoField001")
    private LocalDate depoField001;

    @JsonProperty("depoField002")
    private Long depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Integer depoField004;

    @Size(max = 20)
    @JsonProperty("depoField005")
    private String depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @JsonProperty("depoField010")
    private Boolean depoField010;

    @JsonProperty("depoField011")
    private LocalDate depoField011;

    @JsonProperty("depoField012")
    private LocalDate depoField012;

    public DepositDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto041 instance = new DepositDto041();

        public Builder depoField000(BigDecimal val) { instance.depoField000 = val; return this; }
        public Builder depoField001(LocalDate val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Long val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Integer val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Boolean val) { instance.depoField010 = val; return this; }
        public Builder depoField011(LocalDate val) { instance.depoField011 = val; return this; }
        public Builder depoField012(LocalDate val) { instance.depoField012 = val; return this; }
        public DepositDto041 build() { return instance; }
    }

    public BigDecimal getDepoField000() { return depoField000; }
    public void setDepoField000(BigDecimal depoField000) { this.depoField000 = depoField000; }

    public LocalDate getDepoField001() { return depoField001; }
    public void setDepoField001(LocalDate depoField001) { this.depoField001 = depoField001; }

    public Long getDepoField002() { return depoField002; }
    public void setDepoField002(Long depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Integer getDepoField004() { return depoField004; }
    public void setDepoField004(Integer depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public Boolean getDepoField010() { return depoField010; }
    public void setDepoField010(Boolean depoField010) { this.depoField010 = depoField010; }

    public LocalDate getDepoField011() { return depoField011; }
    public void setDepoField011(LocalDate depoField011) { this.depoField011 = depoField011; }

    public LocalDate getDepoField012() { return depoField012; }
    public void setDepoField012(LocalDate depoField012) { this.depoField012 = depoField012; }

    @Override
    public String toString() {
        return "DepositDto041{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
