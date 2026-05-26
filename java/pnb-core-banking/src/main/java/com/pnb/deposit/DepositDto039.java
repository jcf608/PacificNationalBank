package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto039 — Data Transfer Object for deposit operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto039 {

    @Size(max = 60)
    @JsonProperty("depoField000")
    private String depoField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField001")
    private BigDecimal depoField001;

    @JsonProperty("depoField002")
    private LocalDate depoField002;

    @JsonProperty("depoField003")
    private Long depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private Boolean depoField008;

    @JsonProperty("depoField009")
    private Double depoField009;

    @JsonProperty("depoField010")
    private Long depoField010;

    public DepositDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto039 instance = new DepositDto039();

        public Builder depoField000(String val) { instance.depoField000 = val; return this; }
        public Builder depoField001(BigDecimal val) { instance.depoField001 = val; return this; }
        public Builder depoField002(LocalDate val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Long val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Boolean val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Double val) { instance.depoField009 = val; return this; }
        public Builder depoField010(Long val) { instance.depoField010 = val; return this; }
        public DepositDto039 build() { return instance; }
    }

    public String getDepoField000() { return depoField000; }
    public void setDepoField000(String depoField000) { this.depoField000 = depoField000; }

    public BigDecimal getDepoField001() { return depoField001; }
    public void setDepoField001(BigDecimal depoField001) { this.depoField001 = depoField001; }

    public LocalDate getDepoField002() { return depoField002; }
    public void setDepoField002(LocalDate depoField002) { this.depoField002 = depoField002; }

    public Long getDepoField003() { return depoField003; }
    public void setDepoField003(Long depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public Boolean getDepoField008() { return depoField008; }
    public void setDepoField008(Boolean depoField008) { this.depoField008 = depoField008; }

    public Double getDepoField009() { return depoField009; }
    public void setDepoField009(Double depoField009) { this.depoField009 = depoField009; }

    public Long getDepoField010() { return depoField010; }
    public void setDepoField010(Long depoField010) { this.depoField010 = depoField010; }

    @Override
    public String toString() {
        return "DepositDto039{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
