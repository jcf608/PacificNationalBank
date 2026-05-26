package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto052 — Data Transfer Object for collections operations.
 * Variant 52 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto052 {

    @JsonProperty("collField000")
    private Boolean collField000;

    @Size(max = 40)
    @JsonProperty("collField001")
    private String collField001;

    @JsonProperty("collField002")
    private Boolean collField002;

    @JsonProperty("collField003")
    private Long collField003;

    @JsonProperty("collField004")
    private Boolean collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @JsonProperty("collField006")
    private Integer collField006;

    @JsonProperty("collField007")
    private Boolean collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private Long collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @JsonProperty("collField011")
    private Integer collField011;

    public CollectionsDto052() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto052 instance = new CollectionsDto052();

        public Builder collField000(Boolean val) { instance.collField000 = val; return this; }
        public Builder collField001(String val) { instance.collField001 = val; return this; }
        public Builder collField002(Boolean val) { instance.collField002 = val; return this; }
        public Builder collField003(Long val) { instance.collField003 = val; return this; }
        public Builder collField004(Boolean val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(Integer val) { instance.collField006 = val; return this; }
        public Builder collField007(Boolean val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(Long val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(Integer val) { instance.collField011 = val; return this; }
        public CollectionsDto052 build() { return instance; }
    }

    public Boolean getCollField000() { return collField000; }
    public void setCollField000(Boolean collField000) { this.collField000 = collField000; }

    public String getCollField001() { return collField001; }
    public void setCollField001(String collField001) { this.collField001 = collField001; }

    public Boolean getCollField002() { return collField002; }
    public void setCollField002(Boolean collField002) { this.collField002 = collField002; }

    public Long getCollField003() { return collField003; }
    public void setCollField003(Long collField003) { this.collField003 = collField003; }

    public Boolean getCollField004() { return collField004; }
    public void setCollField004(Boolean collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public Integer getCollField006() { return collField006; }
    public void setCollField006(Integer collField006) { this.collField006 = collField006; }

    public Boolean getCollField007() { return collField007; }
    public void setCollField007(Boolean collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public Long getCollField009() { return collField009; }
    public void setCollField009(Long collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public Integer getCollField011() { return collField011; }
    public void setCollField011(Integer collField011) { this.collField011 = collField011; }

    @Override
    public String toString() {
        return "CollectionsDto052{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
