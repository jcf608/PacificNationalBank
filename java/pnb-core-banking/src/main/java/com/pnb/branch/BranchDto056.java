package com.pnb.branch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * BranchDto056 — Data Transfer Object for branch operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchDto056 {

    @Size(max = 40)
    @JsonProperty("branField000")
    private String branField000;

    @Size(max = 100)
    @JsonProperty("branField001")
    private String branField001;

    @JsonProperty("branField002")
    private Double branField002;

    @JsonProperty("branField003")
    private LocalDate branField003;

    @JsonProperty("branField004")
    private Double branField004;

    @JsonProperty("branField005")
    private Long branField005;

    @JsonProperty("branField006")
    private Long branField006;

    @Size(max = 20)
    @JsonProperty("branField007")
    private String branField007;

    @JsonProperty("branField008")
    private Long branField008;

    @JsonProperty("branField009")
    private Boolean branField009;

    @JsonProperty("branField010")
    private Boolean branField010;

    @JsonProperty("branField011")
    private Boolean branField011;

    @JsonProperty("branField012")
    private Boolean branField012;

    @JsonProperty("branField013")
    private Double branField013;

    @Size(max = 40)
    @JsonProperty("branField014")
    private String branField014;

    @JsonProperty("branField015")
    private LocalDate branField015;

    public BranchDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final BranchDto056 instance = new BranchDto056();

        public Builder branField000(String val) { instance.branField000 = val; return this; }
        public Builder branField001(String val) { instance.branField001 = val; return this; }
        public Builder branField002(Double val) { instance.branField002 = val; return this; }
        public Builder branField003(LocalDate val) { instance.branField003 = val; return this; }
        public Builder branField004(Double val) { instance.branField004 = val; return this; }
        public Builder branField005(Long val) { instance.branField005 = val; return this; }
        public Builder branField006(Long val) { instance.branField006 = val; return this; }
        public Builder branField007(String val) { instance.branField007 = val; return this; }
        public Builder branField008(Long val) { instance.branField008 = val; return this; }
        public Builder branField009(Boolean val) { instance.branField009 = val; return this; }
        public Builder branField010(Boolean val) { instance.branField010 = val; return this; }
        public Builder branField011(Boolean val) { instance.branField011 = val; return this; }
        public Builder branField012(Boolean val) { instance.branField012 = val; return this; }
        public Builder branField013(Double val) { instance.branField013 = val; return this; }
        public Builder branField014(String val) { instance.branField014 = val; return this; }
        public Builder branField015(LocalDate val) { instance.branField015 = val; return this; }
        public BranchDto056 build() { return instance; }
    }

    public String getBranField000() { return branField000; }
    public void setBranField000(String branField000) { this.branField000 = branField000; }

    public String getBranField001() { return branField001; }
    public void setBranField001(String branField001) { this.branField001 = branField001; }

    public Double getBranField002() { return branField002; }
    public void setBranField002(Double branField002) { this.branField002 = branField002; }

    public LocalDate getBranField003() { return branField003; }
    public void setBranField003(LocalDate branField003) { this.branField003 = branField003; }

    public Double getBranField004() { return branField004; }
    public void setBranField004(Double branField004) { this.branField004 = branField004; }

    public Long getBranField005() { return branField005; }
    public void setBranField005(Long branField005) { this.branField005 = branField005; }

    public Long getBranField006() { return branField006; }
    public void setBranField006(Long branField006) { this.branField006 = branField006; }

    public String getBranField007() { return branField007; }
    public void setBranField007(String branField007) { this.branField007 = branField007; }

    public Long getBranField008() { return branField008; }
    public void setBranField008(Long branField008) { this.branField008 = branField008; }

    public Boolean getBranField009() { return branField009; }
    public void setBranField009(Boolean branField009) { this.branField009 = branField009; }

    public Boolean getBranField010() { return branField010; }
    public void setBranField010(Boolean branField010) { this.branField010 = branField010; }

    public Boolean getBranField011() { return branField011; }
    public void setBranField011(Boolean branField011) { this.branField011 = branField011; }

    public Boolean getBranField012() { return branField012; }
    public void setBranField012(Boolean branField012) { this.branField012 = branField012; }

    public Double getBranField013() { return branField013; }
    public void setBranField013(Double branField013) { this.branField013 = branField013; }

    public String getBranField014() { return branField014; }
    public void setBranField014(String branField014) { this.branField014 = branField014; }

    public LocalDate getBranField015() { return branField015; }
    public void setBranField015(LocalDate branField015) { this.branField015 = branField015; }

    @Override
    public String toString() {
        return "BranchDto056{" +
            "branField000=" + branField000 + ", " +
            "branField001=" + branField001 + ", " +
            "branField002=" + branField002 + ", " +
            "branField003=" + branField003 + ", " +
            "branField004=" + branField004 + ", " +
            "}";
    }
}
