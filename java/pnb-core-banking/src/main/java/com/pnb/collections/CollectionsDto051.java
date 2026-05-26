package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto051 — Data Transfer Object for collections operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto051 {

    @JsonProperty("collField000")
    private Double collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField002")
    private BigDecimal collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @Size(max = 40)
    @JsonProperty("collField004")
    private String collField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField005")
    private BigDecimal collField005;

    @Size(max = 20)
    @JsonProperty("collField006")
    private String collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @JsonProperty("collField009")
    private Double collField009;

    @JsonProperty("collField010")
    private Long collField010;

    public CollectionsDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto051 instance = new CollectionsDto051();

        public Builder collField000(Double val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(BigDecimal val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(String val) { instance.collField004 = val; return this; }
        public Builder collField005(BigDecimal val) { instance.collField005 = val; return this; }
        public Builder collField006(String val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(Double val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public CollectionsDto051 build() { return instance; }
    }

    public Double getCollField000() { return collField000; }
    public void setCollField000(Double collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public BigDecimal getCollField002() { return collField002; }
    public void setCollField002(BigDecimal collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public String getCollField004() { return collField004; }
    public void setCollField004(String collField004) { this.collField004 = collField004; }

    public BigDecimal getCollField005() { return collField005; }
    public void setCollField005(BigDecimal collField005) { this.collField005 = collField005; }

    public String getCollField006() { return collField006; }
    public void setCollField006(String collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public Double getCollField009() { return collField009; }
    public void setCollField009(Double collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    @Override
    public String toString() {
        return "CollectionsDto051{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
