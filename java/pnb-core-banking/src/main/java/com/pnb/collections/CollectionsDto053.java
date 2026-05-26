package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto053 — Data Transfer Object for collections operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto053 {

    @JsonProperty("collField000")
    private Long collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @JsonProperty("collField005")
    private Boolean collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Double collField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField008")
    private BigDecimal collField008;

    @JsonProperty("collField009")
    private Integer collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @JsonProperty("collField012")
    private LocalDate collField012;

    public CollectionsDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto053 instance = new CollectionsDto053();

        public Builder collField000(Long val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(Boolean val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public Builder collField008(BigDecimal val) { instance.collField008 = val; return this; }
        public Builder collField009(Integer val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(LocalDate val) { instance.collField012 = val; return this; }
        public CollectionsDto053 build() { return instance; }
    }

    public Long getCollField000() { return collField000; }
    public void setCollField000(Long collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public Boolean getCollField005() { return collField005; }
    public void setCollField005(Boolean collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    public BigDecimal getCollField008() { return collField008; }
    public void setCollField008(BigDecimal collField008) { this.collField008 = collField008; }

    public Integer getCollField009() { return collField009; }
    public void setCollField009(Integer collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public LocalDate getCollField012() { return collField012; }
    public void setCollField012(LocalDate collField012) { this.collField012 = collField012; }

    @Override
    public String toString() {
        return "CollectionsDto053{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
