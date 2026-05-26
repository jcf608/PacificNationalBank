package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto040 — Data Transfer Object for transaction operations.
 * Variant 40 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto040 {

    @JsonProperty("tranField000")
    private Long tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField003")
    private BigDecimal tranField003;

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
    private LocalDate tranField008;

    @JsonProperty("tranField009")
    private Integer tranField009;

    @JsonProperty("tranField010")
    private Double tranField010;

    @Size(max = 40)
    @JsonProperty("tranField011")
    private String tranField011;

    public TransactionDto040() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto040 instance = new TransactionDto040();

        public Builder tranField000(Long val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(BigDecimal val) { instance.tranField003 = val; return this; }
        public Builder tranField004(BigDecimal val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Boolean val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Long val) { instance.tranField007 = val; return this; }
        public Builder tranField008(LocalDate val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Integer val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Double val) { instance.tranField010 = val; return this; }
        public Builder tranField011(String val) { instance.tranField011 = val; return this; }
        public TransactionDto040 build() { return instance; }
    }

    public Long getTranField000() { return tranField000; }
    public void setTranField000(Long tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public BigDecimal getTranField003() { return tranField003; }
    public void setTranField003(BigDecimal tranField003) { this.tranField003 = tranField003; }

    public BigDecimal getTranField004() { return tranField004; }
    public void setTranField004(BigDecimal tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public Boolean getTranField006() { return tranField006; }
    public void setTranField006(Boolean tranField006) { this.tranField006 = tranField006; }

    public Long getTranField007() { return tranField007; }
    public void setTranField007(Long tranField007) { this.tranField007 = tranField007; }

    public LocalDate getTranField008() { return tranField008; }
    public void setTranField008(LocalDate tranField008) { this.tranField008 = tranField008; }

    public Integer getTranField009() { return tranField009; }
    public void setTranField009(Integer tranField009) { this.tranField009 = tranField009; }

    public Double getTranField010() { return tranField010; }
    public void setTranField010(Double tranField010) { this.tranField010 = tranField010; }

    public String getTranField011() { return tranField011; }
    public void setTranField011(String tranField011) { this.tranField011 = tranField011; }

    @Override
    public String toString() {
        return "TransactionDto040{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
