package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto050 — Data Transfer Object for transaction operations.
 * Variant 50 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto050 {

    @JsonProperty("tranField000")
    private LocalDate tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Integer tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @Size(max = 200)
    @JsonProperty("tranField006")
    private String tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @JsonProperty("tranField008")
    private Long tranField008;

    @JsonProperty("tranField009")
    private LocalDate tranField009;

    public TransactionDto050() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto050 instance = new TransactionDto050();

        public Builder tranField000(LocalDate val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Integer val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(String val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Long val) { instance.tranField008 = val; return this; }
        public Builder tranField009(LocalDate val) { instance.tranField009 = val; return this; }
        public TransactionDto050 build() { return instance; }
    }

    public LocalDate getTranField000() { return tranField000; }
    public void setTranField000(LocalDate tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Integer getTranField002() { return tranField002; }
    public void setTranField002(Integer tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public String getTranField006() { return tranField006; }
    public void setTranField006(String tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Long getTranField008() { return tranField008; }
    public void setTranField008(Long tranField008) { this.tranField008 = tranField008; }

    public LocalDate getTranField009() { return tranField009; }
    public void setTranField009(LocalDate tranField009) { this.tranField009 = tranField009; }

    @Override
    public String toString() {
        return "TransactionDto050{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
