package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto049 — Data Transfer Object for collections operations.
 * Variant 49 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto049 {

    @JsonProperty("collField000")
    private LocalDate collField000;

    @JsonProperty("collField001")
    private LocalDate collField001;

    @JsonProperty("collField002")
    private Long collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private Integer collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    public CollectionsDto049() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto049 instance = new CollectionsDto049();

        public Builder collField000(LocalDate val) { instance.collField000 = val; return this; }
        public Builder collField001(LocalDate val) { instance.collField001 = val; return this; }
        public Builder collField002(Long val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(Integer val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public CollectionsDto049 build() { return instance; }
    }

    public LocalDate getCollField000() { return collField000; }
    public void setCollField000(LocalDate collField000) { this.collField000 = collField000; }

    public LocalDate getCollField001() { return collField001; }
    public void setCollField001(LocalDate collField001) { this.collField001 = collField001; }

    public Long getCollField002() { return collField002; }
    public void setCollField002(Long collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public Integer getCollField005() { return collField005; }
    public void setCollField005(Integer collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    @Override
    public String toString() {
        return "CollectionsDto049{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
