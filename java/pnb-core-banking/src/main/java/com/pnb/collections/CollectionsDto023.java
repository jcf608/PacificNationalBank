package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto023 — Data Transfer Object for collections operations.
 * Variant 23 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto023 {

    @JsonProperty("collField000")
    private Integer collField000;

    @JsonProperty("collField001")
    private Long collField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField002")
    private BigDecimal collField002;

    @Size(max = 200)
    @JsonProperty("collField003")
    private String collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @JsonProperty("collField005")
    private Double collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @Size(max = 60)
    @JsonProperty("collField007")
    private String collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @JsonProperty("collField009")
    private Double collField009;

    @JsonProperty("collField010")
    private LocalDate collField010;

    @JsonProperty("collField011")
    private Integer collField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField012")
    private BigDecimal collField012;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField013")
    private BigDecimal collField013;

    @JsonProperty("collField014")
    private Integer collField014;

    @JsonProperty("collField015")
    private Long collField015;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField016")
    private BigDecimal collField016;

    @Size(max = 100)
    @JsonProperty("collField017")
    private String collField017;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField018")
    private BigDecimal collField018;

    public CollectionsDto023() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto023 instance = new CollectionsDto023();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(Long val) { instance.collField001 = val; return this; }
        public Builder collField002(BigDecimal val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(Double val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(Double val) { instance.collField009 = val; return this; }
        public Builder collField010(LocalDate val) { instance.collField010 = val; return this; }
        public Builder collField011(Integer val) { instance.collField011 = val; return this; }
        public Builder collField012(BigDecimal val) { instance.collField012 = val; return this; }
        public Builder collField013(BigDecimal val) { instance.collField013 = val; return this; }
        public Builder collField014(Integer val) { instance.collField014 = val; return this; }
        public Builder collField015(Long val) { instance.collField015 = val; return this; }
        public Builder collField016(BigDecimal val) { instance.collField016 = val; return this; }
        public Builder collField017(String val) { instance.collField017 = val; return this; }
        public Builder collField018(BigDecimal val) { instance.collField018 = val; return this; }
        public CollectionsDto023 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public Long getCollField001() { return collField001; }
    public void setCollField001(Long collField001) { this.collField001 = collField001; }

    public BigDecimal getCollField002() { return collField002; }
    public void setCollField002(BigDecimal collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public Double getCollField005() { return collField005; }
    public void setCollField005(Double collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public Double getCollField009() { return collField009; }
    public void setCollField009(Double collField009) { this.collField009 = collField009; }

    public LocalDate getCollField010() { return collField010; }
    public void setCollField010(LocalDate collField010) { this.collField010 = collField010; }

    public Integer getCollField011() { return collField011; }
    public void setCollField011(Integer collField011) { this.collField011 = collField011; }

    public BigDecimal getCollField012() { return collField012; }
    public void setCollField012(BigDecimal collField012) { this.collField012 = collField012; }

    public BigDecimal getCollField013() { return collField013; }
    public void setCollField013(BigDecimal collField013) { this.collField013 = collField013; }

    public Integer getCollField014() { return collField014; }
    public void setCollField014(Integer collField014) { this.collField014 = collField014; }

    public Long getCollField015() { return collField015; }
    public void setCollField015(Long collField015) { this.collField015 = collField015; }

    public BigDecimal getCollField016() { return collField016; }
    public void setCollField016(BigDecimal collField016) { this.collField016 = collField016; }

    public String getCollField017() { return collField017; }
    public void setCollField017(String collField017) { this.collField017 = collField017; }

    public BigDecimal getCollField018() { return collField018; }
    public void setCollField018(BigDecimal collField018) { this.collField018 = collField018; }

    @Override
    public String toString() {
        return "CollectionsDto023{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
