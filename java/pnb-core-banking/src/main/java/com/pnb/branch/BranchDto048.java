package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto048 — Data Transfer Object for branch operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto048 {

    @Size(max = 200)
    @JsonProperty("branField000")
    private String branField000;

    @JsonProperty("branField001")
    private Integer branField001;

    @Size(max = 60)
    @JsonProperty("branField002")
    private String branField002;

    @JsonProperty("branField003")
    private Boolean branField003;

    @JsonProperty("branField004")
    private Long branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private Boolean branField006;

    @JsonProperty("branField007")
    private LocalDate branField007;

    public BranchDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto048 instance = new BranchDto048();

        public Builder branField000(String val) { instance.branField000 = val; return this; }
        public Builder branField001(Integer val) { instance.branField001 = val; return this; }
        public Builder branField002(String val) { instance.branField002 = val; return this; }
        public Builder branField003(Boolean val) { instance.branField003 = val; return this; }
        public Builder branField004(Long val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(Boolean val) { instance.branField006 = val; return this; }
        public Builder branField007(LocalDate val) { instance.branField007 = val; return this; }
        public BranchDto048 build() { return instance; }
    }

    public String getBranField000() { return branField000; }
    public void setBranField000(String branField000) { this.branField000 = branField000; }

    public Integer getBranField001() { return branField001; }
    public void setBranField001(Integer branField001) { this.branField001 = branField001; }

    public String getBranField002() { return branField002; }
    public void setBranField002(String branField002) { this.branField002 = branField002; }

    public Boolean getBranField003() { return branField003; }
    public void setBranField003(Boolean branField003) { this.branField003 = branField003; }

    public Long getBranField004() { return branField004; }
    public void setBranField004(Long branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public Boolean getBranField006() { return branField006; }
    public void setBranField006(Boolean branField006) { this.branField006 = branField006; }

    public LocalDate getBranField007() { return branField007; }
    public void setBranField007(LocalDate branField007) { this.branField007 = branField007; }

    @Override
    public String toString() {
        return "BranchDto048{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
