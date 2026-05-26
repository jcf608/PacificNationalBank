package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto020 — Data Transfer Object for transaction operations.
 * Variant 20 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto020 {

    @Size(max = 40)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @JsonProperty("tranField003")
    private Double tranField003;

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
    private Double tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @JsonProperty("tranField010")
    private Double tranField010;

    @JsonProperty("tranField011")
    private Integer tranField011;

    @JsonProperty("tranField012")
    private Integer tranField012;

    @JsonProperty("tranField013")
    private Long tranField013;

    @JsonProperty("tranField014")
    private LocalDate tranField014;

    @JsonProperty("tranField015")
    private LocalDate tranField015;

    public TransactionDto020() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto020 instance = new TransactionDto020();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Double val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(String val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Double val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Double val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Integer val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Integer val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Long val) { instance.tranField013 = val; return this; }
        public Builder tranField014(LocalDate val) { instance.tranField014 = val; return this; }
        public Builder tranField015(LocalDate val) { instance.tranField015 = val; return this; }
        public TransactionDto020 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public Double getTranField003() { return tranField003; }
    public void setTranField003(Double tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public String getTranField006() { return tranField006; }
    public void setTranField006(String tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Double getTranField008() { return tranField008; }
    public void setTranField008(Double tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public Double getTranField010() { return tranField010; }
    public void setTranField010(Double tranField010) { this.tranField010 = tranField010; }

    public Integer getTranField011() { return tranField011; }
    public void setTranField011(Integer tranField011) { this.tranField011 = tranField011; }

    public Integer getTranField012() { return tranField012; }
    public void setTranField012(Integer tranField012) { this.tranField012 = tranField012; }

    public Long getTranField013() { return tranField013; }
    public void setTranField013(Long tranField013) { this.tranField013 = tranField013; }

    public LocalDate getTranField014() { return tranField014; }
    public void setTranField014(LocalDate tranField014) { this.tranField014 = tranField014; }

    public LocalDate getTranField015() { return tranField015; }
    public void setTranField015(LocalDate tranField015) { this.tranField015 = tranField015; }

    @Override
    public String toString() {
        return "TransactionDto020{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
