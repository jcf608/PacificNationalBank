package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto041 — Data Transfer Object for collections operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto041 {

    @JsonProperty("collField000")
    private Boolean collField000;

    @JsonProperty("collField001")
    private Integer collField001;

    @JsonProperty("collField002")
    private LocalDate collField002;

    @JsonProperty("collField003")
    private Boolean collField003;

    @JsonProperty("collField004")
    private Long collField004;

    @JsonProperty("collField005")
    private LocalDate collField005;

    @JsonProperty("collField006")
    private Integer collField006;

    @JsonProperty("collField007")
    private Integer collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private Boolean collField009;

    @JsonProperty("collField010")
    private Boolean collField010;

    @JsonProperty("collField011")
    private Boolean collField011;

    @JsonProperty("collField012")
    private Integer collField012;

    public CollectionsDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto041 instance = new CollectionsDto041();

        public Builder collField000(Boolean val) { instance.collField000 = val; return this; }
        public Builder collField001(Integer val) { instance.collField001 = val; return this; }
        public Builder collField002(LocalDate val) { instance.collField002 = val; return this; }
        public Builder collField003(Boolean val) { instance.collField003 = val; return this; }
        public Builder collField004(Long val) { instance.collField004 = val; return this; }
        public Builder collField005(LocalDate val) { instance.collField005 = val; return this; }
        public Builder collField006(Integer val) { instance.collField006 = val; return this; }
        public Builder collField007(Integer val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(Boolean val) { instance.collField009 = val; return this; }
        public Builder collField010(Boolean val) { instance.collField010 = val; return this; }
        public Builder collField011(Boolean val) { instance.collField011 = val; return this; }
        public Builder collField012(Integer val) { instance.collField012 = val; return this; }
        public CollectionsDto041 build() { return instance; }
    }

    public Boolean getCollField000() { return collField000; }
    public void setCollField000(Boolean collField000) { this.collField000 = collField000; }

    public Integer getCollField001() { return collField001; }
    public void setCollField001(Integer collField001) { this.collField001 = collField001; }

    public LocalDate getCollField002() { return collField002; }
    public void setCollField002(LocalDate collField002) { this.collField002 = collField002; }

    public Boolean getCollField003() { return collField003; }
    public void setCollField003(Boolean collField003) { this.collField003 = collField003; }

    public Long getCollField004() { return collField004; }
    public void setCollField004(Long collField004) { this.collField004 = collField004; }

    public LocalDate getCollField005() { return collField005; }
    public void setCollField005(LocalDate collField005) { this.collField005 = collField005; }

    public Integer getCollField006() { return collField006; }
    public void setCollField006(Integer collField006) { this.collField006 = collField006; }

    public Integer getCollField007() { return collField007; }
    public void setCollField007(Integer collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public Boolean getCollField009() { return collField009; }
    public void setCollField009(Boolean collField009) { this.collField009 = collField009; }

    public Boolean getCollField010() { return collField010; }
    public void setCollField010(Boolean collField010) { this.collField010 = collField010; }

    public Boolean getCollField011() { return collField011; }
    public void setCollField011(Boolean collField011) { this.collField011 = collField011; }

    public Integer getCollField012() { return collField012; }
    public void setCollField012(Integer collField012) { this.collField012 = collField012; }

    @Override
    public String toString() {
        return "CollectionsDto041{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
