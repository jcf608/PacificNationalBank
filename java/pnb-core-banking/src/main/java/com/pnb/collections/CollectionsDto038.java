package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto038 — Data Transfer Object for collections operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto038 {

    @Size(max = 60)
    @JsonProperty("collField000")
    private String collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @JsonProperty("collField002")
    private Double collField002;

    @Size(max = 60)
    @JsonProperty("collField003")
    private String collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @Size(max = 100)
    @JsonProperty("collField005")
    private String collField005;

    @JsonProperty("collField006")
    private LocalDate collField006;

    @JsonProperty("collField007")
    private Double collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private Long collField009;

    public CollectionsDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto038 instance = new CollectionsDto038();

        public Builder collField000(String val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(Double val) { instance.collField002 = val; return this; }
        public Builder collField003(String val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(String val) { instance.collField005 = val; return this; }
        public Builder collField006(LocalDate val) { instance.collField006 = val; return this; }
        public Builder collField007(Double val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(Long val) { instance.collField009 = val; return this; }
        public CollectionsDto038 build() { return instance; }
    }

    public String getCollField000() { return collField000; }
    public void setCollField000(String collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public Double getCollField002() { return collField002; }
    public void setCollField002(Double collField002) { this.collField002 = collField002; }

    public String getCollField003() { return collField003; }
    public void setCollField003(String collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public String getCollField005() { return collField005; }
    public void setCollField005(String collField005) { this.collField005 = collField005; }

    public LocalDate getCollField006() { return collField006; }
    public void setCollField006(LocalDate collField006) { this.collField006 = collField006; }

    public Double getCollField007() { return collField007; }
    public void setCollField007(Double collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public Long getCollField009() { return collField009; }
    public void setCollField009(Long collField009) { this.collField009 = collField009; }

    @Override
    public String toString() {
        return "CollectionsDto038{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
