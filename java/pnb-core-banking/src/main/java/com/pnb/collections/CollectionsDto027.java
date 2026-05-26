package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto027 — Data Transfer Object for collections operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto027 {

    @JsonProperty("collField000")
    private Integer collField000;

    @Size(max = 200)
    @JsonProperty("collField001")
    private String collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @Size(max = 200)
    @JsonProperty("collField003")
    private String collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @JsonProperty("collField007")
    private LocalDate collField007;

    @Size(max = 40)
    @JsonProperty("collField008")
    private String collField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField009")
    private BigDecimal collField009;

    @Size(max = 20)
    @JsonProperty("collField010")
    private String collField010;

    public CollectionsDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto027 instance = new CollectionsDto027();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(String val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(LocalDate val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public Builder collField009(BigDecimal val) { instance.collField009 = val; return this; }
        public Builder collField010(String val) { instance.collField010 = val; return this; }
        public CollectionsDto027 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public String getCollField001() { return collField001; }
    public void setCollField001(String collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public LocalDate getCollField007() { return collField007; }
    public void setCollField007(LocalDate collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    public BigDecimal getCollField009() { return collField009; }
    public void setCollField009(BigDecimal collField009) { this.collField009 = collField009; }

    public String getCollField010() { return collField010; }
    public void setCollField010(String collField010) { this.collField010 = collField010; }

    @Override
    public String toString() {
        return "CollectionsDto027{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
