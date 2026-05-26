package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto051 — Data Transfer Object for branch operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto051 {

    @JsonProperty("branField000")
    private Double branField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField001")
    private BigDecimal branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Boolean branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @Size(max = 60)
    @JsonProperty("branField006")
    private String branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    @JsonProperty("branField008")
    private Integer branField008;

    @Size(max = 100)
    @JsonProperty("branField009")
    private String branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    public BranchDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto051 instance = new BranchDto051();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(BigDecimal val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Boolean val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public Builder branField008(Integer val) { instance.branField008 = val; return this; }
        public Builder branField009(String val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public BranchDto051 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public BigDecimal getBranField001() { return branField001; }
    public void setBranField001(BigDecimal branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Boolean getBranField004() { return branField004; }
    public void setBranField004(Boolean branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    public Integer getBranField008() { return branField008; }
    public void setBranField008(Integer branField008) { this.branField008 = branField008; }

    public String getBranField009() { return branField009; }
    public void setBranField009(String branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    @Override
    public String toString() {
        return "BranchDto051{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
