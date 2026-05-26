package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto025 — Data Transfer Object for collections operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto025 {

    @DecimalMin(value = "0.00")
    @JsonProperty("collField000")
    private BigDecimal collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @JsonProperty("collField003")
    private LocalDate collField003;

    @JsonProperty("collField004")
    private Integer collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @JsonProperty("collField006")
    private Boolean collField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField007")
    private BigDecimal collField007;

    @Size(max = 20)
    @JsonProperty("collField008")
    private String collField008;

    public CollectionsDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto025 instance = new CollectionsDto025();

        public Builder collField000(BigDecimal val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(LocalDate val) { instance.collField003 = val; return this; }
        public Builder collField004(Integer val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(Boolean val) { instance.collField006 = val; return this; }
        public Builder collField007(BigDecimal val) { instance.collField007 = val; return this; }
        public Builder collField008(String val) { instance.collField008 = val; return this; }
        public CollectionsDto025 build() { return instance; }
    }

    public BigDecimal getCollField000() { return collField000; }
    public void setCollField000(BigDecimal collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public LocalDate getCollField003() { return collField003; }
    public void setCollField003(LocalDate collField003) { this.collField003 = collField003; }

    public Integer getCollField004() { return collField004; }
    public void setCollField004(Integer collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public Boolean getCollField006() { return collField006; }
    public void setCollField006(Boolean collField006) { this.collField006 = collField006; }

    public BigDecimal getCollField007() { return collField007; }
    public void setCollField007(BigDecimal collField007) { this.collField007 = collField007; }

    public String getCollField008() { return collField008; }
    public void setCollField008(String collField008) { this.collField008 = collField008; }

    @Override
    public String toString() {
        return "CollectionsDto025{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
