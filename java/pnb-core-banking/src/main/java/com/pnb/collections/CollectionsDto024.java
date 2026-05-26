package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto024 — Data Transfer Object for collections operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto024 {

    @JsonProperty("collField000")
    private Boolean collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @JsonProperty("collField002")
    private LocalDate collField002;

    @JsonProperty("collField003")
    private Double collField003;

    @Size(max = 60)
    @JsonProperty("collField004")
    private String collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField006")
    private BigDecimal collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    public CollectionsDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto024 instance = new CollectionsDto024();

        public Builder collField000(Boolean val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(LocalDate val) { instance.collField002 = val; return this; }
        public Builder collField003(Double val) { instance.collField003 = val; return this; }
        public Builder collField004(String val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(BigDecimal val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public CollectionsDto024 build() { return instance; }
    }

    public Boolean getCollField000() { return collField000; }
    public void setCollField000(Boolean collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public LocalDate getCollField002() { return collField002; }
    public void setCollField002(LocalDate collField002) { this.collField002 = collField002; }

    public Double getCollField003() { return collField003; }
    public void setCollField003(Double collField003) { this.collField003 = collField003; }

    public String getCollField004() { return collField004; }
    public void setCollField004(String collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public BigDecimal getCollField006() { return collField006; }
    public void setCollField006(BigDecimal collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    @Override
    public String toString() {
        return "CollectionsDto024{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
