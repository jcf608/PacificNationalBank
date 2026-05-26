package com.pnb.collections;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * CollectionsDto042 — Data Transfer Object for collections operations.
 * Variant 42 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionsDto042 {

    @JsonProperty("collField000")
    private Long collField000;

    @JsonProperty("collField001")
    private Integer collField001;

    @JsonProperty("collField002")
    private Integer collField002;

    @JsonProperty("collField003")
    private LocalDate collField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("collField004")
    private BigDecimal collField004;

    @JsonProperty("collField005")
    private Boolean collField005;

    @Size(max = 100)
    @JsonProperty("collField006")
    private String collField006;

    @Size(max = 20)
    @JsonProperty("collField007")
    private String collField007;

    @JsonProperty("collField008")
    private Double collField008;

    @JsonProperty("collField009")
    private LocalDate collField009;

    @JsonProperty("collField010")
    private Integer collField010;

    @JsonProperty("collField011")
    private Long collField011;

    @JsonProperty("collField012")
    private LocalDate collField012;

    @Size(max = 200)
    @JsonProperty("collField013")
    private String collField013;

    public CollectionsDto042() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final CollectionsDto042 instance = new CollectionsDto042();

        public Builder collField000(Long val) { instance.collField000 = val; return this; }
        public Builder collField001(Integer val) { instance.collField001 = val; return this; }
        public Builder collField002(Integer val) { instance.collField002 = val; return this; }
        public Builder collField003(LocalDate val) { instance.collField003 = val; return this; }
        public Builder collField004(BigDecimal val) { instance.collField004 = val; return this; }
        public Builder collField005(Boolean val) { instance.collField005 = val; return this; }
        public Builder collField006(String val) { instance.collField006 = val; return this; }
        public Builder collField007(String val) { instance.collField007 = val; return this; }
        public Builder collField008(Double val) { instance.collField008 = val; return this; }
        public Builder collField009(LocalDate val) { instance.collField009 = val; return this; }
        public Builder collField010(Integer val) { instance.collField010 = val; return this; }
        public Builder collField011(Long val) { instance.collField011 = val; return this; }
        public Builder collField012(LocalDate val) { instance.collField012 = val; return this; }
        public Builder collField013(String val) { instance.collField013 = val; return this; }
        public CollectionsDto042 build() { return instance; }
    }

    public Long getCollField000() { return collField000; }
    public void setCollField000(Long collField000) { this.collField000 = collField000; }

    public Integer getCollField001() { return collField001; }
    public void setCollField001(Integer collField001) { this.collField001 = collField001; }

    public Integer getCollField002() { return collField002; }
    public void setCollField002(Integer collField002) { this.collField002 = collField002; }

    public LocalDate getCollField003() { return collField003; }
    public void setCollField003(LocalDate collField003) { this.collField003 = collField003; }

    public BigDecimal getCollField004() { return collField004; }
    public void setCollField004(BigDecimal collField004) { this.collField004 = collField004; }

    public Boolean getCollField005() { return collField005; }
    public void setCollField005(Boolean collField005) { this.collField005 = collField005; }

    public String getCollField006() { return collField006; }
    public void setCollField006(String collField006) { this.collField006 = collField006; }

    public String getCollField007() { return collField007; }
    public void setCollField007(String collField007) { this.collField007 = collField007; }

    public Double getCollField008() { return collField008; }
    public void setCollField008(Double collField008) { this.collField008 = collField008; }

    public LocalDate getCollField009() { return collField009; }
    public void setCollField009(LocalDate collField009) { this.collField009 = collField009; }

    public Integer getCollField010() { return collField010; }
    public void setCollField010(Integer collField010) { this.collField010 = collField010; }

    public Long getCollField011() { return collField011; }
    public void setCollField011(Long collField011) { this.collField011 = collField011; }

    public LocalDate getCollField012() { return collField012; }
    public void setCollField012(LocalDate collField012) { this.collField012 = collField012; }

    public String getCollField013() { return collField013; }
    public void setCollField013(String collField013) { this.collField013 = collField013; }

    @Override
    public String toString() {
        return "CollectionsDto042{" +
            "collField000=" + collField000 + ", " +
            "collField001=" + collField001 + ", " +
            "collField002=" + collField002 + ", " +
            "collField003=" + collField003 + ", " +
            "collField004=" + collField004 + ", " +
            "}";
    }
}
