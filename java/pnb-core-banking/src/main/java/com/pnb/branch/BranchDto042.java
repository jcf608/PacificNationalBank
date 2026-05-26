package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto042 — Data Transfer Object for branch operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto042 {

    @JsonProperty("branField000")
    private LocalDate branField000;

    @JsonProperty("branField001")
    private LocalDate branField001;

    @JsonProperty("branField002")
    private Long branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField004")
    private BigDecimal branField004;

    @Size(max = 60)
    @JsonProperty("branField005")
    private String branField005;

    @JsonProperty("branField006")
    private Boolean branField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField007")
    private BigDecimal branField007;

    @JsonProperty("branField008")
    private LocalDate branField008;

    @Size(max = 60)
    @JsonProperty("branField009")
    private String branField009;

    @JsonProperty("branField010")
    private Boolean branField010;

    @JsonProperty("branField011")
    private Integer branField011;

    @Size(max = 20)
    @JsonProperty("branField012")
    private String branField012;

    @JsonProperty("branField013")
    private Integer branField013;

    public BranchDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto042 instance = new BranchDto042();

        public Builder branField000(LocalDate val) { instance.branField000 = val; return this; }
        public Builder branField001(LocalDate val) { instance.branField001 = val; return this; }
        public Builder branField002(Long val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(BigDecimal val) { instance.branField004 = val; return this; }
        public Builder branField005(String val) { instance.branField005 = val; return this; }
        public Builder branField006(Boolean val) { instance.branField006 = val; return this; }
        public Builder branField007(BigDecimal val) { instance.branField007 = val; return this; }
        public Builder branField008(LocalDate val) { instance.branField008 = val; return this; }
        public Builder branField009(String val) { instance.branField009 = val; return this; }
        public Builder branField010(Boolean val) { instance.branField010 = val; return this; }
        public Builder branField011(Integer val) { instance.branField011 = val; return this; }
        public Builder branField012(String val) { instance.branField012 = val; return this; }
        public Builder branField013(Integer val) { instance.branField013 = val; return this; }
        public BranchDto042 build() { return instance; }
    }

    public LocalDate getBranField000() { return branField000; }
    public void setBranField000(LocalDate branField000) { this.branField000 = branField000; }

    public LocalDate getBranField001() { return branField001; }
    public void setBranField001(LocalDate branField001) { this.branField001 = branField001; }

    public Long getBranField002() { return branField002; }
    public void setBranField002(Long branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public BigDecimal getBranField004() { return branField004; }
    public void setBranField004(BigDecimal branField004) { this.branField004 = branField004; }

    public String getBranField005() { return branField005; }
    public void setBranField005(String branField005) { this.branField005 = branField005; }

    public Boolean getBranField006() { return branField006; }
    public void setBranField006(Boolean branField006) { this.branField006 = branField006; }

    public BigDecimal getBranField007() { return branField007; }
    public void setBranField007(BigDecimal branField007) { this.branField007 = branField007; }

    public LocalDate getBranField008() { return branField008; }
    public void setBranField008(LocalDate branField008) { this.branField008 = branField008; }

    public String getBranField009() { return branField009; }
    public void setBranField009(String branField009) { this.branField009 = branField009; }

    public Boolean getBranField010() { return branField010; }
    public void setBranField010(Boolean branField010) { this.branField010 = branField010; }

    public Integer getBranField011() { return branField011; }
    public void setBranField011(Integer branField011) { this.branField011 = branField011; }

    public String getBranField012() { return branField012; }
    public void setBranField012(String branField012) { this.branField012 = branField012; }

    public Integer getBranField013() { return branField013; }
    public void setBranField013(Integer branField013) { this.branField013 = branField013; }

    @Override
    public String toString() {
        return "BranchDto042{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
