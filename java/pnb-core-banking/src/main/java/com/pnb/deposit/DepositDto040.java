package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto040 — Data Transfer Object for deposit operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto040 {

    @JsonProperty("depoField000")
    private Long depoField000;

    @JsonProperty("depoField001")
    private Double depoField001;

    @Size(max = 20)
    @JsonProperty("depoField002")
    private String depoField002;

    @JsonProperty("depoField003")
    private Integer depoField003;

    @JsonProperty("depoField004")
    private Long depoField004;

    @JsonProperty("depoField005")
    private Boolean depoField005;

    @JsonProperty("depoField006")
    private Boolean depoField006;

    @JsonProperty("depoField007")
    private Boolean depoField007;

    @Size(max = 200)
    @JsonProperty("depoField008")
    private String depoField008;

    @JsonProperty("depoField009")
    private Long depoField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField010")
    private BigDecimal depoField010;

    @JsonProperty("depoField011")
    private Integer depoField011;

    public DepositDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto040 instance = new DepositDto040();

        public Builder depoField000(Long val) { instance.depoField000 = val; return this; }
        public Builder depoField001(Double val) { instance.depoField001 = val; return this; }
        public Builder depoField002(String val) { instance.depoField002 = val; return this; }
        public Builder depoField003(Integer val) { instance.depoField003 = val; return this; }
        public Builder depoField004(Long val) { instance.depoField004 = val; return this; }
        public Builder depoField005(Boolean val) { instance.depoField005 = val; return this; }
        public Builder depoField006(Boolean val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Boolean val) { instance.depoField007 = val; return this; }
        public Builder depoField008(String val) { instance.depoField008 = val; return this; }
        public Builder depoField009(Long val) { instance.depoField009 = val; return this; }
        public Builder depoField010(BigDecimal val) { instance.depoField010 = val; return this; }
        public Builder depoField011(Integer val) { instance.depoField011 = val; return this; }
        public DepositDto040 build() { return instance; }
    }

    public Long getDepoField000() { return depoField000; }
    public void setDepoField000(Long depoField000) { this.depoField000 = depoField000; }

    public Double getDepoField001() { return depoField001; }
    public void setDepoField001(Double depoField001) { this.depoField001 = depoField001; }

    public String getDepoField002() { return depoField002; }
    public void setDepoField002(String depoField002) { this.depoField002 = depoField002; }

    public Integer getDepoField003() { return depoField003; }
    public void setDepoField003(Integer depoField003) { this.depoField003 = depoField003; }

    public Long getDepoField004() { return depoField004; }
    public void setDepoField004(Long depoField004) { this.depoField004 = depoField004; }

    public Boolean getDepoField005() { return depoField005; }
    public void setDepoField005(Boolean depoField005) { this.depoField005 = depoField005; }

    public Boolean getDepoField006() { return depoField006; }
    public void setDepoField006(Boolean depoField006) { this.depoField006 = depoField006; }

    public Boolean getDepoField007() { return depoField007; }
    public void setDepoField007(Boolean depoField007) { this.depoField007 = depoField007; }

    public String getDepoField008() { return depoField008; }
    public void setDepoField008(String depoField008) { this.depoField008 = depoField008; }

    public Long getDepoField009() { return depoField009; }
    public void setDepoField009(Long depoField009) { this.depoField009 = depoField009; }

    public BigDecimal getDepoField010() { return depoField010; }
    public void setDepoField010(BigDecimal depoField010) { this.depoField010 = depoField010; }

    public Integer getDepoField011() { return depoField011; }
    public void setDepoField011(Integer depoField011) { this.depoField011 = depoField011; }

    @Override
    public String toString() {
        return "DepositDto040{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
