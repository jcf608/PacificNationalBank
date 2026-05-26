package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto028 — Data Transfer Object for transaction operations.
 * Variant 28 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto028 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private Integer tranField001;

    @JsonProperty("tranField002")
    private Integer tranField002;

    @Size(max = 40)
    @JsonProperty("tranField003")
    private String tranField003;

    @Size(max = 20)
    @JsonProperty("tranField004")
    private String tranField004;

    @JsonProperty("tranField005")
    private Integer tranField005;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField006")
    private BigDecimal tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @JsonProperty("tranField008")
    private Integer tranField008;

    @JsonProperty("tranField009")
    private Long tranField009;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField010")
    private BigDecimal tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    public TransactionDto028() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto028 instance = new TransactionDto028();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Integer val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Integer val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(String val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Integer val) { instance.tranField005 = val; return this; }
        public Builder tranField006(BigDecimal val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Integer val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Long val) { instance.tranField009 = val; return this; }
        public Builder tranField010(BigDecimal val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public TransactionDto028 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public Integer getTranField001() { return tranField001; }
    public void setTranField001(Integer tranField001) { this.tranField001 = tranField001; }

    public Integer getTranField002() { return tranField002; }
    public void setTranField002(Integer tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public String getTranField004() { return tranField004; }
    public void setTranField004(String tranField004) { this.tranField004 = tranField004; }

    public Integer getTranField005() { return tranField005; }
    public void setTranField005(Integer tranField005) { this.tranField005 = tranField005; }

    public BigDecimal getTranField006() { return tranField006; }
    public void setTranField006(BigDecimal tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public Integer getTranField008() { return tranField008; }
    public void setTranField008(Integer tranField008) { this.tranField008 = tranField008; }

    public Long getTranField009() { return tranField009; }
    public void setTranField009(Long tranField009) { this.tranField009 = tranField009; }

    public BigDecimal getTranField010() { return tranField010; }
    public void setTranField010(BigDecimal tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    @Override
    public String toString() {
        return "TransactionDto028{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
