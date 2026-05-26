package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto053 — Data Transfer Object for transaction operations.
 * Variant 53 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto053 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField001")
    private BigDecimal tranField001;

    @JsonProperty("tranField002")
    private LocalDate tranField002;

    @JsonProperty("tranField003")
    private LocalDate tranField003;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField004")
    private BigDecimal tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @JsonProperty("tranField006")
    private Boolean tranField006;

    @JsonProperty("tranField007")
    private Long tranField007;

    @JsonProperty("tranField008")
    private Double tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @JsonProperty("tranField010")
    private Integer tranField010;

    @Size(max = 20)
    @JsonProperty("tranField011")
    private String tranField011;

    @Size(max = 20)
    @JsonProperty("tranField012")
    private String tranField012;

    public TransactionDto053() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto053 instance = new TransactionDto053();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(BigDecimal val) { instance.tranField001 = val; return this; }
        public Builder tranField002(LocalDate val) { instance.tranField002 = val; return this; }
        public Builder tranField003(LocalDate val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Integer val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public Builder tranField012(String val) { instance.tranField012 = val; return this; }
        public TransactionDto053 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public BigDecimal getTranField001() { return tranField001; }
    public void setTranField001(BigDecimal tranField001) { this.tranField001 = tranField001; }

    public LocalDate getTranField002() { return tranField002; }
    public void setTranField002(LocalDate tranField002) { this.tranField002 = tranField002; }

    public LocalDate getTranField003() { return tranField003; }
    public void setTranField003(LocalDate tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public Integer getTranField010() { return tranField010; }
    public void setTranField010(Integer tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    public String getTranField012() { return tranField012; }
    public void setTranField012(String tranField012) { this.tranField012 = tranField012; }

    @Override
    public String toString() {
        return "TransactionDto053{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
