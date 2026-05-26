package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto027 — Data Transfer Object for transaction operations.
 * Variant 27 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto027 {

    @JsonProperty("tranField000")
    private Double tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Double tranField002;

    @JsonProperty("tranField003")
    private Boolean tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Integer tranField006;

    @JsonProperty("tranField007")
    private Integer tranField007;

    @JsonProperty("tranField008")
    private Boolean tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @Size(max = 60)
    @JsonProperty("tranField010")
    private String tranField010;

    public TransactionDto027() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto027 instance = new TransactionDto027();

        public Builder tranField000(Double val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Double val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Boolean val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Integer val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Integer val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Boolean val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public TransactionDto027 build() { return instance; }
    }

    public Double getTranField000() { return tranField000; }
    public void setTranField000(Double tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Double getTranField002() { return tranField002; }
    public void setTranField002(Double tranField002) { this.tranField002 = tranField002; }

    public Boolean getTranField003() { return tranField003; }
    public void setTranField003(Boolean tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Integer getTranField006() { return tranField006; }
    public void setTranField006(Integer tranField006) { this.tranField006 = tranField006; }

    public Integer getTranField007() { return tranField007; }
    public void setTranField007(Integer tranField007) { this.tranField007 = tranField007; }

    public Boolean getTranField008() { return tranField008; }
    public void setTranField008(Boolean tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    @Override
    public String toString() {
        return "TransactionDto027{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
