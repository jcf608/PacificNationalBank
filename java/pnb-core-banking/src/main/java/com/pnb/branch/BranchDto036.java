package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto036 — Data Transfer Object for branch operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto036 {

    @DecimalMin(value = "0.00")
    @JsonProperty("branField000")
    private BigDecimal branField000;

    @Size(max = 60)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @JsonProperty("branField003")
    private Long branField003;

    @JsonProperty("branField004")
    private Double branField004;

    @Size(max = 200)
    @JsonProperty("branField005")
    private String branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private Double branField007;

    public BranchDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto036 instance = new BranchDto036();

        public Builder branField000(BigDecimal val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(Long val) { instance.branField003 = val; return this; }
        public Builder branField004(Double val) { instance.branField004 = val; return this; }
        public Builder branField005(String val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(Double val) { instance.branField007 = val; return this; }
        public BranchDto036 build() { return instance; }
    }

    public BigDecimal getBranField000() { return branField000; }
    public void setBranField000(BigDecimal branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public Long getBranField003() { return branField003; }
    public void setBranField003(Long branField003) { this.branField003 = branField003; }

    public Double getBranField004() { return branField004; }
    public void setBranField004(Double branField004) { this.branField004 = branField004; }

    public String getBranField005() { return branField005; }
    public void setBranField005(String branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public Double getBranField007() { return branField007; }
    public void setBranField007(Double branField007) { this.branField007 = branField007; }

    @Override
    public String toString() {
        return "BranchDto036{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
