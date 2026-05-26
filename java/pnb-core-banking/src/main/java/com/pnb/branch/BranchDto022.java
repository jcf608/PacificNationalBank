package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto022 — Data Transfer Object for branch operations.
 * Variant 22 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto022 {

    @JsonProperty("branField000")
    private Double branField000;

    @JsonProperty("branField001")
    private LocalDate branField001;

    @JsonProperty("branField002")
    private Boolean branField002;

    @JsonProperty("branField003")
    private Double branField003;

    @JsonProperty("branField004")
    private LocalDate branField004;

    @JsonProperty("branField005")
    private Double branField005;

    @JsonProperty("branField006")
    private Double branField006;

    @JsonProperty("branField007")
    private Long branField007;

    @JsonProperty("branField008")
    private Long branField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("branField009")
    private BigDecimal branField009;

    @JsonProperty("branField010")
    private LocalDate branField010;

    @Size(max = 60)
    @JsonProperty("branField011")
    private String branField011;

    @Size(max = 40)
    @JsonProperty("branField012")
    private String branField012;

    @JsonProperty("branField013")
    private Boolean branField013;

    @JsonProperty("branField014")
    private LocalDate branField014;

    @JsonProperty("branField015")
    private Long branField015;

    @Size(max = 100)
    @JsonProperty("branField016")
    private String branField016;

    @JsonProperty("branField017")
    private LocalDate branField017;

    public BranchDto022() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto022 instance = new BranchDto022();

        public Builder branField000(Double val) { instance.branField000 = val; return this; }
        public Builder branField001(LocalDate val) { instance.branField001 = val; return this; }
        public Builder branField002(Boolean val) { instance.branField002 = val; return this; }
        public Builder branField003(Double val) { instance.branField003 = val; return this; }
        public Builder branField004(LocalDate val) { instance.branField004 = val; return this; }
        public Builder branField005(Double val) { instance.branField005 = val; return this; }
        public Builder branField006(Double val) { instance.branField006 = val; return this; }
        public Builder branField007(Long val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public Builder branField009(BigDecimal val) { instance.branField009 = val; return this; }
        public Builder branField010(LocalDate val) { instance.branField010 = val; return this; }
        public Builder branField011(String val) { instance.branField011 = val; return this; }
        public Builder branField012(String val) { instance.branField012 = val; return this; }
        public Builder branField013(Boolean val) { instance.branField013 = val; return this; }
        public Builder branField014(LocalDate val) { instance.branField014 = val; return this; }
        public Builder branField015(Long val) { instance.branField015 = val; return this; }
        public Builder branField016(String val) { instance.branField016 = val; return this; }
        public Builder branField017(LocalDate val) { instance.branField017 = val; return this; }
        public BranchDto022 build() { return instance; }
    }

    public Double getBranField000() { return branField000; }
    public void setBranField000(Double branField000) { this.branField000 = branField000; }

    public LocalDate getBranField001() { return branField001; }
    public void setBranField001(LocalDate branField001) { this.branField001 = branField001; }

    public Boolean getBranField002() { return branField002; }
    public void setBranField002(Boolean branField002) { this.branField002 = branField002; }

    public Double getBranField003() { return branField003; }
    public void setBranField003(Double branField003) { this.branField003 = branField003; }

    public LocalDate getBranField004() { return branField004; }
    public void setBranField004(LocalDate branField004) { this.branField004 = branField004; }

    public Double getBranField005() { return branField005; }
    public void setBranField005(Double branField005) { this.branField005 = branField005; }

    public Double getBranField006() { return branField006; }
    public void setBranField006(Double branField006) { this.branField006 = branField006; }

    public Long getBranField007() { return branField007; }
    public void setBranField007(Long branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    public BigDecimal getBranField009() { return branField009; }
    public void setBranField009(BigDecimal branField009) { this.branField009 = branField009; }

    public LocalDate getBranField010() { return branField010; }
    public void setBranField010(LocalDate branField010) { this.branField010 = branField010; }

    public String getBranField011() { return branField011; }
    public void setBranField011(String branField011) { this.branField011 = branField011; }

    public String getBranField012() { return branField012; }
    public void setBranField012(String branField012) { this.branField012 = branField012; }

    public Boolean getBranField013() { return branField013; }
    public void setBranField013(Boolean branField013) { this.branField013 = branField013; }

    public LocalDate getBranField014() { return branField014; }
    public void setBranField014(LocalDate branField014) { this.branField014 = branField014; }

    public Long getBranField015() { return branField015; }
    public void setBranField015(Long branField015) { this.branField015 = branField015; }

    public String getBranField016() { return branField016; }
    public void setBranField016(String branField016) { this.branField016 = branField016; }

    public LocalDate getBranField017() { return branField017; }
    public void setBranField017(LocalDate branField017) { this.branField017 = branField017; }

    @Override
    public String toString() {
        return "BranchDto022{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
