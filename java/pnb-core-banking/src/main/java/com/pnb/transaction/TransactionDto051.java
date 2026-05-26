package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto051 — Data Transfer Object for transaction operations.
 * Variant 51 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto051 {

    @Size(max = 200)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField004")
    private BigDecimal tranField004;

    @JsonProperty("tranField005")
    private Long tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    @JsonProperty("tranField008")
    private LocalDate tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    public TransactionDto051() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto051 instance = new TransactionDto051();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Long val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(LocalDate val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public TransactionDto051 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public Long getTranField005() { return tranField005; }
    public void setTranField005(Long tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public LocalDate getTranField008() { return tranField008; }
    public void setTranField008(LocalDate tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    @Override
    public String toString() {
        return "TransactionDto051{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
