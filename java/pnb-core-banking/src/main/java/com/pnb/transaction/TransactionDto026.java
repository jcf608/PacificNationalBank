package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto026 — Data Transfer Object for transaction operations.
 * Variant 26 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto026 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @JsonProperty("tranField006")
    private LocalDate tranField006;

    @Size(max = 200)
    @JsonProperty("tranField007")
    private String tranField007;

    @JsonProperty("tranField008")
    private Double tranField008;

    @JsonProperty("tranField009")
    private Integer tranField009;

    public TransactionDto026() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto026 instance = new TransactionDto026();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(LocalDate val) { instance.tranField006 = val; return this; }
        public Builder tranField007(String val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Integer val) { instance.tranField009 = val; return this; }
        public TransactionDto026 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public LocalDate getTranField006() { return tranField006; }
    public void setTranField006(LocalDate tranField006) { this.tranField006 = tranField006; }

    public String getTranField007() { return tranField007; }
    public void setTranField007(String tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public Integer getTranField009() { return tranField009; }
    public void setTranField009(Integer tranField009) { this.tranField009 = tranField009; }

    @Override
    public String toString() {
        return "TransactionDto026{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
