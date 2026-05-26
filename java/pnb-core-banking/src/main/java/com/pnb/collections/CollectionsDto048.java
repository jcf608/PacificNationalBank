package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto048 — Data Transfer Object for collections operations.
 * Variant 48 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto048 {

    @Size(max = 40)
    @JsonProperty("collField000")
    private String collField000;

    @JsonProperty("collField001")
    private Integer collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @JsonProperty("collField004")
    private Integer collField004;

    @JsonProperty("collField005")
    private Integer collField005;

    @JsonProperty("collField006")
    private Long collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    public CollectionsDto048() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto048 instance = new CollectionsDto048();

        public Builder collField000(String val) { instance.collField000 = val; return this; }
        public Builder collField001(Integer val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(Integer val) { instance.collField004 = val; return this; }
        public Builder collField005(Integer val) { instance.collField005 = val; return this; }
        public Builder collField006(Long val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public CollectionsDto048 build() { return instance; }
    }

    public String getCollField000() { return collField000; }
    public void setCollField000(String collField000) { this.collField000 = collField000; }

    public Integer getCollField001() { return collField001; }
    public void setCollField001(Integer collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public Integer getCollField004() { return collField004; }
    public void setCollField004(Integer collField004) { this.collField004 = collField004; }

    public Integer getCollField005() { return collField005; }
    public void setCollField005(Integer collField005) { this.collField005 = collField005; }

    public Long getCollField006() { return collField006; }
    public void setCollField006(Long collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    @Override
    public String toString() {
        return "CollectionsDto048{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
