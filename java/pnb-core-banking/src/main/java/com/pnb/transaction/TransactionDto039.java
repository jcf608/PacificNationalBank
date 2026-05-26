package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto039 — Data Transfer Object for transaction operations.
 * Variant 39 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto039 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private Long tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @JsonProperty("tranField006")
    private LocalDate tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @JsonProperty("tranField008")
    private Long tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @Size(max = 200)
    @JsonProperty("tranField010")
    private String tranField010;

    public TransactionDto039() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto039 instance = new TransactionDto039();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Long val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(LocalDate val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Long val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public TransactionDto039 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public Long getTranField002() { return tranField002; }
    public void setTranField002(Long tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public LocalDate getTranField006() { return tranField006; }
    public void setTranField006(LocalDate tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Long getTranField008() { return tranField008; }
    public void setTranField008(Long tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    @Override
    public String toString() {
        return "TransactionDto039{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
