package com.pnb.deposit;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * DepositDto029 — Data Transfer Object for deposit operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepositDto029 {

    @JsonProperty("depoField000")
    private Integer depoField000;

    @Size(max = 100)
    @JsonProperty("depoField001")
    private String depoField001;

    @JsonProperty("depoField002")
    private Integer depoField002;

    @Size(max = 20)
    @JsonProperty("depoField003")
    private String depoField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("depoField004")
    private BigDecimal depoField004;

    @Size(max = 200)
    @JsonProperty("depoField005")
    private String depoField005;

    @JsonProperty("depoField006")
    private LocalDate depoField006;

    @JsonProperty("depoField007")
    private Integer depoField007;

    @JsonProperty("depoField008")
    private Long depoField008;

    @JsonProperty("depoField009")
    private LocalDate depoField009;

    @JsonProperty("depoField010")
    private LocalDate depoField010;

    @JsonProperty("depoField011")
    private LocalDate depoField011;

    @JsonProperty("depoField012")
    private Boolean depoField012;

    public DepositDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final DepositDto029 instance = new DepositDto029();

        public Builder depoField000(Integer val) { instance.depoField000 = val; return this; }
        public Builder depoField001(String val) { instance.depoField001 = val; return this; }
        public Builder depoField002(Integer val) { instance.depoField002 = val; return this; }
        public Builder depoField003(String val) { instance.depoField003 = val; return this; }
        public Builder depoField004(BigDecimal val) { instance.depoField004 = val; return this; }
        public Builder depoField005(String val) { instance.depoField005 = val; return this; }
        public Builder depoField006(LocalDate val) { instance.depoField006 = val; return this; }
        public Builder depoField007(Integer val) { instance.depoField007 = val; return this; }
        public Builder depoField008(Long val) { instance.depoField008 = val; return this; }
        public Builder depoField009(LocalDate val) { instance.depoField009 = val; return this; }
        public Builder depoField010(LocalDate val) { instance.depoField010 = val; return this; }
        public Builder depoField011(LocalDate val) { instance.depoField011 = val; return this; }
        public Builder depoField012(Boolean val) { instance.depoField012 = val; return this; }
        public DepositDto029 build() { return instance; }
    }

    public Integer getDepoField000() { return depoField000; }
    public void setDepoField000(Integer depoField000) { this.depoField000 = depoField000; }

    public String getDepoField001() { return depoField001; }
    public void setDepoField001(String depoField001) { this.depoField001 = depoField001; }

    public Integer getDepoField002() { return depoField002; }
    public void setDepoField002(Integer depoField002) { this.depoField002 = depoField002; }

    public String getDepoField003() { return depoField003; }
    public void setDepoField003(String depoField003) { this.depoField003 = depoField003; }

    public BigDecimal getDepoField004() { return depoField004; }
    public void setDepoField004(BigDecimal depoField004) { this.depoField004 = depoField004; }

    public String getDepoField005() { return depoField005; }
    public void setDepoField005(String depoField005) { this.depoField005 = depoField005; }

    public LocalDate getDepoField006() { return depoField006; }
    public void setDepoField006(LocalDate depoField006) { this.depoField006 = depoField006; }

    public Integer getDepoField007() { return depoField007; }
    public void setDepoField007(Integer depoField007) { this.depoField007 = depoField007; }

    public Long getDepoField008() { return depoField008; }
    public void setDepoField008(Long depoField008) { this.depoField008 = depoField008; }

    public LocalDate getDepoField009() { return depoField009; }
    public void setDepoField009(LocalDate depoField009) { this.depoField009 = depoField009; }

    public LocalDate getDepoField010() { return depoField010; }
    public void setDepoField010(LocalDate depoField010) { this.depoField010 = depoField010; }

    public LocalDate getDepoField011() { return depoField011; }
    public void setDepoField011(LocalDate depoField011) { this.depoField011 = depoField011; }

    public Boolean getDepoField012() { return depoField012; }
    public void setDepoField012(Boolean depoField012) { this.depoField012 = depoField012; }

    @Override
    public String toString() {
        return "DepositDto029{" +
            "depoField000=" + depoField000 + ", " +
            "depoField001=" + depoField001 + ", " +
            "depoField002=" + depoField002 + ", " +
            "depoField003=" + depoField003 + ", " +
            "depoField004=" + depoField004 + ", " +
            "}";
    }
}
