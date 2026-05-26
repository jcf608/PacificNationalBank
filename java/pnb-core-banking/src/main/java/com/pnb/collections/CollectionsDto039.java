package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto039 — Data Transfer Object for collections operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto039 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private Long collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private LocalDate collField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField008")
    private BigDecimal collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Boolean collField010;

    public CollectionsDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto039 instance = new CollectionsDto039();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(Long val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(LocalDate val) { instance.collField007 = val; return this; }
        public Builder collField008(BigDecimal val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Boolean val) { instance.collField010 = val; return this; }
        public CollectionsDto039 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public Long getCollField001() { return collField001; }
    public void setCollField001(Long collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public LocalDate getCollField007() { return collField007; }
    public void setCollField007(LocalDate collField007) { this.collField007 = collField007; }

    public BigDecimal getCollField008() { return collField008; }
    public void setCollField008(BigDecimal collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Boolean getCollField010() { return collField010; }
    public void setCollField010(Boolean collField010) { this.collField010 = collField010; }

    @Override
    public String toString() {
        return "CollectionsDto039{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
