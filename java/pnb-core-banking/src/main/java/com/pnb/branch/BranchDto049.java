package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto049 — Data Transfer Object for branch operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto049 {

    @Size(max = 60)
    @JsonProperty("branField000")
    private String branField000;

    @JsonProperty("branField001")
    private Integer branField001;

    @Size(max = 20)
    @JsonProperty("branField002")
    private String branField002;

    @JsonProperty("branField003")
    private Double branField003;

    @JsonProperty("branField004")
    private LocalDate branField004;

    @JsonProperty("branField005")
    private Integer branField005;

    @JsonProperty("branField006")
    private LocalDate branField006;

    @JsonProperty("branField007")
    private Integer branField007;

    @JsonProperty("branField008")
    private Long branField008;

    public BranchDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto049 instance = new BranchDto049();

        public Builder branField000(String val) { instance.branField000 = val; return this; }
        public Builder branField001(Integer val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(Double val) { instance.branField003 = val; return this; }
        public Builder branField004(LocalDate val) { instance.branField004 = val; return this; }
        public Builder branField005(Integer val) { instance.branField005 = val; return this; }
        public Builder branField006(LocalDate val) { instance.branField006 = val; return this; }
        public Builder branField007(Integer val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public BranchDto049 build() { return instance; }
    }

    public String getBranField000() { return branField000; }
    public void setBranField000(String branField000) { this.branField000 = branField000; }

    public Integer getBranField001() { return branField001; }
    public void setBranField001(Integer branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public Double getBranField003() { return branField003; }
    public void setBranField003(Double branField003) { this.branField003 = branField003; }

    public LocalDate getBranField004() { return branField004; }
    public void setBranField004(LocalDate branField004) { this.branField004 = branField004; }

    public Integer getBranField005() { return branField005; }
    public void setBranField005(Integer branField005) { this.branField005 = branField005; }

    public LocalDate getBranField006() { return branField006; }
    public void setBranField006(LocalDate branField006) { this.branField006 = branField006; }

    public Integer getBranField007() { return branField007; }
    public void setBranField007(Integer branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    @Override
    public String toString() {
        return "BranchDto049{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
