package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto038 — Data Transfer Object for transaction operations.
 * Variant 38 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto038 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField001")
    private BigDecimal tranField001;

    @JsonProperty("tranField002")
    private Double tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @JsonProperty("tranField004")
    private LocalDate tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField008")
    private BigDecimal tranField008;

    @JsonProperty("tranField009")
    private Double tranField009;

    public TransactionDto038() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto038 instance = new TransactionDto038();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(BigDecimal val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Double val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(LocalDate val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(BigDecimal val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Double val) { instance.tranField009 = val; return this; }
        public TransactionDto038 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public BigDecimal getTranField001() { return tranField001; }
    public void setTranField001(BigDecimal tranField001) { this.tranField001 = tranField001; }

    public Double getTranField002() { return tranField002; }
    public void setTranField002(Double tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public LocalDate getTranField004() { return tranField004; }
    public void setTranField004(LocalDate tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public BigDecimal getTranField008() { return tranField008; }
    public void setTranField008(BigDecimal tranField008) { this.tranField008 = tranField008; }

    public Double getTranField009() { return tranField009; }
    public void setTranField009(Double tranField009) { this.tranField009 = tranField009; }

    @Override
    public String toString() {
        return "TransactionDto038{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
