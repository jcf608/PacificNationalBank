package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto028 — Data Transfer Object for branch operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto028 {

    @JsonProperty("branField000")
    private Double branField000;

    @Size(max = 100)
    @JsonProperty("branField001")
    private String branField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField002")
    private BigDecimal branField002;

    @JsonProperty("branField003")
    private Boolean branField003;

    @Size(max = 60)
    @JsonProperty("branField004")
    private String branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @Size(max = 200)
    @JsonProperty("branField007")
    private String branField007;

    @Size(max = 100)
    @JsonProperty("branField008")
    private String branField008;

    @JsonProperty("branField009")
    private Double branField009;

    @JsonProperty("branField010")
    private Boolean branField010;

    @Size(max = 20)
    @JsonProperty("branField011")
    private String branField011;

    public BranchDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto028 instance = new BranchDto028();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(BigDecimal val) { instance.branField002 = val; return this; }
        public Builder branField003(Boolean val) { instance.branField003 = val; return this; }
        public Builder branField004(String val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(String val) { instance.branField008 = val; return this; }
        public Builder branField009(Double val) { instance.branField009 = val; return this; }
        public Builder branField010(Boolean val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public BranchDto028 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public BigDecimal getBranField002() { return branField002; }
    public void setBranField002(BigDecimal branField002) { this.branField002 = branField002; }

    public Boolean getBranField003() { return branField003; }
    public void setBranField003(Boolean branField003) { this.branField003 = branField003; }

    public String getBranField004() { return branField004; }
    public void setBranField004(String branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public String getBranField008() { return branField008; }
    public void setBranField008(String branField008) { this.branField008 = branField008; }

    public Double getBranField009() { return branField009; }
    public void setBranField009(Double branField009) { this.branField009 = branField009; }

    public Boolean getBranField010() { return branField010; }
    public void setBranField010(Boolean branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    @Override
    public String toString() {
        return "BranchDto028{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
