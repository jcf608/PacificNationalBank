package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto050 — Data Transfer Object for deposit operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto050 {

    @JsonProperty("depoField000")
    private Long depoField000;

    @Size(max = 20)
    @JsonProperty("depoField001")
    private String depoField001;

    @Size(max = 20)
    @JsonProperty("depoField002")
    private String depoField002;

    @JsonProperty("depoField003")
    private Boolean depoField003;

    @JsonProperty("depoField004")
    private Double depoField004;

    @JsonProperty("depoField005")
    private Integer depoField005;

    @JsonProperty("depoField006")
    private Double depoField006;

    @JsonProperty("depoField007")
    private Long depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private Boolean depoField009;

    public DepositDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto050 instance = new DepositDto050();

        public Builder depoField000(Long val) { instance.depoField000 = val; return this; }
        public Builder depoField001(String val) { instance.depoField001 = val; return this; }
        public Builder depoField002(String val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Boolean val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Double val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Integer val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Double val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Long val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Boolean val) { instance.depoField009 = val; return this; }
        public DepositDto050 build() { return instance; }
    }

    public Long getDepoField000() { return depoField000; }
    public void setDepoField000(Long depoField000) { this.depoField000 = depoField000; }

    public String getDepoField001() { return depoField001; }
    public void setDepoField001(String depoField001) { this.depoField001 = depoField001; }

    public String getDepoField002() { return depoField002; }
    public void setDepoField002(String depoField002) { this.depoField002 = depoField002; }

    public Boolean getDepoField003() { return depoField003; }
    public void setDepoField003(Boolean depoField003) { this.depoField003 = depoField003; }

    public Double getDepoField004() { return depoField004; }
    public void setDepoField004(Double depoField004) { this.depoField004 = depoField004; }

    public Integer getDepoField005() { return depoField005; }
    public void setDepoField005(Integer depoField005) { this.depoField005 = depoField005; }

    public Double getDepoField006() { return depoField006; }
    public void setDepoField006(Double depoField006) { this.depoField006 = depoField006; }

    public Long getDepoField007() { return depoField007; }
    public void setDepoField007(Long depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public Boolean getDepoField009() { return depoField009; }
    public void setDepoField009(Boolean depoField009) { this.depoField009 = depoField009; }

    @Override
    public String toString() {
        return "DepositDto050{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
