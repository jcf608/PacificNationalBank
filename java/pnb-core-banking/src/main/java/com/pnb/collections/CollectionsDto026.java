package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto026 — Data Transfer Object for collections operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto026 {

    @JsonProperty("collField000")
    private Double collField000;

    @Size(max = 60)
    @JsonProperty("collField001")
    private String collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private Integer collField003;

    @JsonProperty("collField004")
    private LocalDate collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @JsonProperty("collField006")
    private Double collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Boolean collField008;

    @Size(max = 20)
    @JsonProperty("collField009")
    private String collField009;

    public CollectionsDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto026 instance = new CollectionsDto026();

        public Builder collField000(Double val) { instance.collField000 = val; return this; }
        public Builder collField001(String val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(Integer val) { instance.collField003 = val; return this; }
        public Builder collField004(LocalDate val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(Double val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Boolean val) { instance.collField008 = val; return this; }
        public Builder collField009(String val) { instance.collField009 = val; return this; }
        public CollectionsDto026 build() { return instance; }
    }

    public Double getCollField000() { return collField000; }
    public void setCollField000(Double collField000) { this.collField000 = collField000; }

    public String getCollField001() { return collField001; }
    public void setCollField001(String collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public Integer getCollField003() { return collField003; }
    public void setCollField003(Integer collField003) { this.collField003 = collField003; }

    public LocalDate getCollField004() { return collField004; }
    public void setCollField004(LocalDate collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public Double getCollField006() { return collField006; }
    public void setCollField006(Double collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Boolean getCollField008() { return collField008; }
    public void setCollField008(Boolean collField008) { this.collField008 = collField008; }

    public String getCollField009() { return collField009; }
    public void setCollField009(String collField009) { this.collField009 = collField009; }

    @Override
    public String toString() {
        return "CollectionsDto026{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
