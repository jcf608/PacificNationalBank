package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto057 — Data Transfer Object for branch operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto057 {

    @JsonProperty("branField000")
    private Boolean branField000;

    @Size(max = 40)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private LocalDate branField002;

    @JsonProperty("branField003")
    private Integer branField003;

    @JsonProperty("branField004")
    private Long branField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField005")
    private BigDecimal branField005;

    @Size(max = 100)
    @JsonProperty("branField006")
    private String branField006;

    @JsonProperty("branField007")
    private Long branField007;

    @Size(max = 100)
    @JsonProperty("branField008")
    private String branField008;

    @JsonProperty("branField009")
    private Integer branField009;

    @JsonProperty("branField010")
    private Boolean branField010;

    @JsonProperty("branField011")
    private Integer branField011;

    @JsonProperty("branField012")
    private Long branField012;

    @JsonProperty("branField013")
    private Boolean branField013;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField014")
    private BigDecimal branField014;

    @Size(max = 200)
    @JsonProperty("branField015")
    private String branField015;

    @Size(max = 40)
    @JsonProperty("branField016")
    private String branField016;

    public BranchDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto057 instance = new BranchDto057();

        public Builder branField000(Boolean val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(LocalDate val) { instance.branField002 = val; return this; }
        public Builder branField003(Integer val) { instance.branField003 = val; return this; }
        public Builder branField004(Long val) { instance.branField004 = val; return this; }
        public Builder branField005(BigDecimal val) { instance.branField005 = val; return this; }
        public Builder branField006(String val) { instance.branField006 = val; return this; }
        public Builder branField007(Long val) { instance.branField007 = val; return this; }
        public Builder branField008(String val) { instance.branField008 = val; return this; }
        public Builder branField009(Integer val) { instance.branField009 = val; return this; }
        public Builder branField010(Boolean val) { instance.branField010 = val; return this; }
        public Builder branField011(Integer val) { instance.branField011 = val; return this; }
        public Builder branField012(Long val) { instance.branField012 = val; return this; }
        public Builder branField013(Boolean val) { instance.branField013 = val; return this; }
        public Builder branField014(BigDecimal val) { instance.branField014 = val; return this; }
        public Builder branField015(String val) { instance.branField015 = val; return this; }
        public Builder branField016(String val) { instance.branField016 = val; return this; }
        public BranchDto057 build() { return instance; }
    }

    public Boolean getBranField000() { return branField000; }
    public void setBranField000(Boolean branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public LocalDate getBranField002() { return branField002; }
    public void setBranField002(LocalDate branField002) { this.branField002 = branField002; }

    public Integer getBranField003() { return branField003; }
    public void setBranField003(Integer branField003) { this.branField003 = branField003; }

    public Long getBranField004() { return branField004; }
    public void setBranField004(Long branField004) { this.branField004 = branField004; }

    public BigDecimal getBranField005() { return branField005; }
    public void setBranField005(BigDecimal branField005) { this.branField005 = branField005; }

    public String getBranField006() { return branField006; }
    public void setBranField006(String branField006) { this.branField006 = branField006; }

    public Long getBranField007() { return branField007; }
    public void setBranField007(Long branField007) { this.branField007 = branField007; }

    public String getBranField008() { return branField008; }
    public void setBranField008(String branField008) { this.branField008 = branField008; }

    public Integer getBranField009() { return branField009; }
    public void setBranField009(Integer branField009) { this.branField009 = branField009; }

    public Boolean getBranField010() { return branField010; }
    public void setBranField010(Boolean branField010) { this.branField010 = branField010; }

    public Integer getBranField011() { return branField011; }
    public void setBranField011(Integer branField011) { this.branField011 = branField011; }

    public Long getBranField012() { return branField012; }
    public void setBranField012(Long branField012) { this.branField012 = branField012; }

    public Boolean getBranField013() { return branField013; }
    public void setBranField013(Boolean branField013) { this.branField013 = branField013; }

    public BigDecimal getBranField014() { return branField014; }
    public void setBranField014(BigDecimal branField014) { this.branField014 = branField014; }

    public String getBranField015() { return branField015; }
    public void setBranField015(String branField015) { this.branField015 = branField015; }

    public String getBranField016() { return branField016; }
    public void setBranField016(String branField016) { this.branField016 = branField016; }

    @Override
    public String toString() {
        return "BranchDto057{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
