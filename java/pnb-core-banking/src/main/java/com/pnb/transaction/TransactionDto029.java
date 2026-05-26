package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto029 — Data Transfer Object for transaction operations.
 * Variant 29 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto029 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @JsonProperty("tranField002")
    private Double tranField002;

    @JsonProperty("tranField003")
    private Long tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField005")
    private BigDecimal tranField005;

    @JsonProperty("tranField006")
    private LocalDate tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    @JsonProperty("tranField010")
    private Integer tranField010;

    @JsonProperty("tranField011")
    private Double tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    public TransactionDto029() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto029 instance = new TransactionDto029();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Double val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Long val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(BigDecimal val) { instance.tranField005 = val; return this; }
        public Builder tranField006(LocalDate val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Integer val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Double val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public TransactionDto029 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public Double getTranField002() { return tranField002; }
    public void setTranField002(Double tranField002) { this.tranField002 = tranField002; }

    public Long getTranField003() { return tranField003; }
    public void setTranField003(Long tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public BigDecimal getTranField005() { return tranField005; }
    public void setTranField005(BigDecimal tranField005) { this.tranField005 = tranField005; }

    public LocalDate getTranField006() { return tranField006; }
    public void setTranField006(LocalDate tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    public Integer getTranField010() { return tranField010; }
    public void setTranField010(Integer tranField010) { this.tranField010 = tranField010; }

    public Double getTranField011() { return tranField011; }
    public void setTranField011(Double tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    @Override
    public String toString() {
        return "TransactionDto029{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
