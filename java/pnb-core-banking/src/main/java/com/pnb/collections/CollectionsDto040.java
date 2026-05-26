package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto040 — Data Transfer Object for collections operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto040 {

    @JsonProperty("collField000")
    private Integer collField000;

    @JsonProperty("collField001")
    private Boolean collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField003")
    private BigDecimal collField003;

    @JsonProperty("collField004")
    private Double collField004;

    @JsonProperty("collField005")
    private Long collField005;

    @JsonProperty("collField006")
    private Boolean collField006;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField007")
    private BigDecimal collField007;

    @JsonProperty("collField008")
    private Integer collField008;

    @Size(max = 20)
    @JsonProperty("collField009")
    private String collField009;

    @JsonProperty("collField010")
    private Long collField010;

    @JsonProperty("collField011")
    private Boolean collField011;

    public CollectionsDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto040 instance = new CollectionsDto040();

        public Builder collField000(Integer val) { instance.collField000 = val; return this; }
        public Builder collField001(Boolean val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(BigDecimal val) { instance.collField003 = val; return this; }
        public Builder collField004(Double val) { instance.collField004 = val; return this; }
        public Builder collField005(Long val) { instance.collField005 = val; return this; }
        public Builder collField006(Boolean val) { instance.collField006 = val; return this; }
        public Builder collField007(BigDecimal val) { instance.collField007 = val; return this; }
        public Builder collField008(Integer val) { instance.collField008 = val; return this; }
        public Builder collField009(String val) { instance.collField009 = val; return this; }
        public Builder collField010(Long val) { instance.collField010 = val; return this; }
        public Builder collField011(Boolean val) { instance.collField011 = val; return this; }
        public CollectionsDto040 build() { return instance; }
    }

    public Integer getCollField000() { return collField000; }
    public void setCollField000(Integer collField000) { this.collField000 = collField000; }

    public Boolean getCollField001() { return collField001; }
    public void setCollField001(Boolean collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public BigDecimal getCollField003() { return collField003; }
    public void setCollField003(BigDecimal collField003) { this.collField003 = collField003; }

    public Double getCollField004() { return collField004; }
    public void setCollField004(Double collField004) { this.collField004 = collField004; }

    public Long getCollField005() { return collField005; }
    public void setCollField005(Long collField005) { this.collField005 = collField005; }

    public Boolean getCollField006() { return collField006; }
    public void setCollField006(Boolean collField006) { this.collField006 = collField006; }

    public BigDecimal getCollField007() { return collField007; }
    public void setCollField007(BigDecimal collField007) { this.collField007 = collField007; }

    public Integer getCollField008() { return collField008; }
    public void setCollField008(Integer collField008) { this.collField008 = collField008; }

    public String getCollField009() { return collField009; }
    public void setCollField009(String collField009) { this.collField009 = collField009; }

    public Long getCollField010() { return collField010; }
    public void setCollField010(Long collField010) { this.collField010 = collField010; }

    public Boolean getCollField011() { return collField011; }
    public void setCollField011(Boolean collField011) { this.collField011 = collField011; }

    @Override
    public String toString() {
        return "CollectionsDto040{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
