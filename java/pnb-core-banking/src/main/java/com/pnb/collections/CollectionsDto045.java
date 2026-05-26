package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto045 — Data Transfer Object for collections operations.
 * Variant 45 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto045 {

    @JsonProperty("collField000")
    private Integer collField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField001")
    private BigDecimal collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @Size(max = 20)
    @JsonProperty("collField003")
    private String collField003;

    @JsonProperty("collField004")
    private Boolean collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @Size(max = 100)
    @JsonProperty("collField007")
    private String collField007;

    @JsonProperty("collField008")
    private LocalDate collField008;

    @JsonProperty("collField009")
    private Double collField009;

    @JsonProperty("collField010")
    private Boolean collField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField011")
    private BigDecimal collField011;

    @JsonProperty("collField012")
    private Boolean collField012;

    @Size(max = 100)
    @JsonProperty("collField013")
    private String collField013;

    @JsonProperty("collField014")
    private Integer collField014;

    @JsonProperty("collField015")
    private Integer collField015;

    @JsonProperty("collField016")
    private Integer collField016;

    public CollectionsDto045() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto045 instance = new CollectionsDto045();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(BigDecimal val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(Boolean val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(LocalDate val) { instance.collField008 = val; return this; }
        public Builder collField009(Double val) { instance.collField009 = val; return this; }
        public Builder collField010(Boolean val) { instance.collField010 = val; return this; }
        public Builder collField011(BigDecimal val) { instance.collField011 = val; return this; }
        public Builder collField012(Boolean val) { instance.collField012 = val; return this; }
        public Builder collField013(String val) { instance.collField013 = val; return this; }
        public Builder collField014(Integer val) { instance.collField014 = val; return this; }
        public Builder collField015(Integer val) { instance.collField015 = val; return this; }
        public Builder collField016(Integer val) { instance.collField016 = val; return this; }
        public CollectionsDto045 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public BigDecimal getCollField001() { return collField001; }
    public void setCollField001(BigDecimal collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public Boolean getCollField004() { return collField004; }
    public void setCollField004(Boolean collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public LocalDate getCollField008() { return collField008; }
    public void setCollField008(LocalDate collField008) { this.collField008 = collField008; }

    public Double getCollField009() { return collField009; }
    public void setCollField009(Double collField009) { this.collField009 = collField009; }

    public Boolean getCollField010() { return collField010; }
    public void setCollField010(Boolean collField010) { this.collField010 = collField010; }

    public BigDecimal getCollField011() { return collField011; }
    public void setCollField011(BigDecimal collField011) { this.collField011 = collField011; }

    public Boolean getCollField012() { return collField012; }
    public void setCollField012(Boolean collField012) { this.collField012 = collField012; }

    public String getCollField013() { return collField013; }
    public void setCollField013(String collField013) { this.collField013 = collField013; }

    public Integer getCollField014() { return collField014; }
    public void setCollField014(Integer collField014) { this.collField014 = collField014; }

    public Integer getCollField015() { return collField015; }
    public void setCollField015(Integer collField015) { this.collField015 = collField015; }

    public Integer getCollField016() { return collField016; }
    public void setCollField016(Integer collField016) { this.collField016 = collField016; }

    @Override
    public String toString() {
        return "CollectionsDto045{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
