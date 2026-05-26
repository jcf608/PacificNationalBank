package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto036 — Data Transfer Object for collections operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto036 {

    @JsonProperty("collField000")
    private Integer collField000;

    @JsonProperty("collField001")
    private Double collField001;

    @Size(max = 20)
    @JsonProperty("collField002")
    private String collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @JsonProperty("collField006")
    private LocalDate collField006;

    @JsonProperty("collField007")
    private Double collField007;

    public CollectionsDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto036 instance = new CollectionsDto036();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(Double val) { instance.collField001 = val; return this; }
        public Builder collField002(String val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(LocalDate val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public CollectionsDto036 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public Double getCollField001() { return collField001; }
    public void setCollField001(Double collField001) { this.collField001 = collField001; }

    public String getCollField002() { return collField002; }
    public void setCollField002(String collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public LocalDate getCollField006() { return collField006; }
    public void setCollField006(LocalDate collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    @Override
    public String toString() {
        return "CollectionsDto036{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
