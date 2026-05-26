package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto025 — Data Transfer Object for transaction operations.
 * Variant 25 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto025 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @JsonProperty("tranField001")
    private Integer tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @Size(max = 20)
    @JsonProperty("tranField003")
    private String tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @Size(max = 40)
    @JsonProperty("tranField005")
    private String tranField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField006")
    private BigDecimal tranField006;

    @JsonProperty("tranField007")
    private Integer tranField007;

    @Size(max = 40)
    @JsonProperty("tranField008")
    private String tranField008;

    public TransactionDto025() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto025 instance = new TransactionDto025();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Integer val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(String val) { instance.tranField005 = val; return this; }
        public Builder tranField006(BigDecimal val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Integer val) { instance.tranField007 = val; return this; }
        public Builder tranField008(String val) { instance.tranField008 = val; return this; }
        public TransactionDto025 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public Integer getTranField001() { return tranField001; }
    public void setTranField001(Integer tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public String getTranField005() { return tranField005; }
    public void setTranField005(String tranField005) { this.tranField005 = tranField005; }

    public BigDecimal getTranField006() { return tranField006; }
    public void setTranField006(BigDecimal tranField006) { this.tranField006 = tranField006; }

    public Integer getTranField007() { return tranField007; }
    public void setTranField007(Integer tranField007) { this.tranField007 = tranField007; }

    public String getTranField008() { return tranField008; }
    public void setTranField008(String tranField008) { this.tranField008 = tranField008; }

    @Override
    public String toString() {
        return "TransactionDto025{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
