package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto041 — Data Transfer Object for transaction operations.
 * Variant 41 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto041 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField001")
    private BigDecimal tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @JsonProperty("tranField003")
    private Integer tranField003;

    @JsonProperty("tranField004")
    private LocalDate tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField006")
    private BigDecimal tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @Size(max = 20)
    @JsonProperty("tranField008")
    private String tranField008;

    @JsonProperty("tranField009")
    private Boolean tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    @JsonProperty("tranField012")
    private LocalDate tranField012;

    public TransactionDto041() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto041 instance = new TransactionDto041();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(BigDecimal val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Integer val) { instance.tranField003 = val; return this; }
        public Builder tranField004(LocalDate val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(BigDecimal val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(String val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Boolean val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public Builder tranField012(LocalDate val) { instance.tranField012 = val; return this; }
        public TransactionDto041 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public BigDecimal getTranField001() { return tranField001; }
    public void setTranField001(BigDecimal tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public Integer getTranField003() { return tranField003; }
    public void setTranField003(Integer tranField003) { this.tranField003 = tranField003; }

    public LocalDate getTranField004() { return tranField004; }
    public void setTranField004(LocalDate tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public BigDecimal getTranField006() { return tranField006; }
    public void setTranField006(BigDecimal tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public String getTranField008() { return tranField008; }
    public void setTranField008(String tranField008) { this.tranField008 = tranField008; }

    public Boolean getTranField009() { return tranField009; }
    public void setTranField009(Boolean tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    public LocalDate getTranField012() { return tranField012; }
    public void setTranField012(LocalDate tranField012) { this.tranField012 = tranField012; }

    @Override
    public String toString() {
        return "TransactionDto041{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
