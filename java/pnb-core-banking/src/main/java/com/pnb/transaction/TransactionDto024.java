package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto024 — Data Transfer Object for transaction operations.
 * Variant 24 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto024 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @JsonProperty("tranField001")
    private Long tranField001;

    @JsonProperty("tranField002")
    private Long tranField002;

    @JsonProperty("tranField003")
    private LocalDate tranField003;

    @Size(max = 60)
    @JsonProperty("tranField004")
    private String tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @JsonProperty("tranField006")
    private Integer tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    public TransactionDto024() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto024 instance = new TransactionDto024();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Long val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Long val) { instance.tranField002 = val; return this; }
        public Builder tranField003(LocalDate val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Integer val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public TransactionDto024 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public Long getTranField001() { return tranField001; }
    public void setTranField001(Long tranField001) { this.tranField001 = tranField001; }

    public Long getTranField002() { return tranField002; }
    public void setTranField002(Long tranField002) { this.tranField002 = tranField002; }

    public LocalDate getTranField003() { return tranField003; }
    public void setTranField003(LocalDate tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public Integer getTranField006() { return tranField006; }
    public void setTranField006(Integer tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    @Override
    public String toString() {
        return "TransactionDto024{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
