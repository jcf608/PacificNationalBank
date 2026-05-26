package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto037 — Data Transfer Object for collections operations.
 * Variant 37 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto037 {

    @Size(max = 40)
    @JsonProperty("collField000")
    private String collField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField001")
    private BigDecimal collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private Integer collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    @Size(max = 200)
    @JsonProperty("collField008")
    private String collField008;

    public CollectionsDto037() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto037 instance = new CollectionsDto037();

        public Builder collField000(String val) { instance.collField000 = val; return this; }
        public Builder collField001(BigDecimal val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(Integer val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public CollectionsDto037 build() { return instance; }
    }

    public String getCollField000() { return collField000; }
    public void setCollField000(String collField000) { this.collField000 = collField000; }

    public BigDecimal getCollField001() { return collField001; }
    public void setCollField001(BigDecimal collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public Integer getCollField006() { return collField006; }
    public void setCollField006(Integer collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    @Override
    public String toString() {
        return "CollectionsDto037{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
