package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto036 — Data Transfer Object for transaction operations.
 * Variant 36 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto036 {

    @Size(max = 40)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @Size(max = 60)
    @JsonProperty("tranField002")
    private String tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @JsonProperty("tranField004")
    private Boolean tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField006")
    private BigDecimal tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    public TransactionDto036() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto036 instance = new TransactionDto036();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(String val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Boolean val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(BigDecimal val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public TransactionDto036 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public String getTranField002() { return tranField002; }
    public void setTranField002(String tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public Boolean getTranField004() { return tranField004; }
    public void setTranField004(Boolean tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public BigDecimal getTranField006() { return tranField006; }
    public void setTranField006(BigDecimal tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    @Override
    public String toString() {
        return "TransactionDto036{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
