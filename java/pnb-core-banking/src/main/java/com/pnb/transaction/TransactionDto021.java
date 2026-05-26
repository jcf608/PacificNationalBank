package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto021 — Data Transfer Object for transaction operations.
 * Variant 21 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto021 {

    @JsonProperty("tranField000")
    private LocalDate tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private Double tranField002;

    @JsonProperty("tranField003")
    private Boolean tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @JsonProperty("tranField005")
    private Double tranField005;

    @JsonProperty("tranField006")
    private Long tranField006;

    @JsonProperty("tranField007")
    private Double tranField007;

    @JsonProperty("tranField008")
    private Boolean tranField008;

    @Size(max = 200)
    @JsonProperty("tranField009")
    private String tranField009;

    @JsonProperty("tranField010")
    private Boolean tranField010;

    @JsonProperty("tranField011")
    private Double tranField011;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField012")
    private BigDecimal tranField012;

    @JsonProperty("tranField013")
    private LocalDate tranField013;

    @Size(max = 20)
    @JsonProperty("tranField014")
    private String tranField014;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField015")
    private BigDecimal tranField015;

    @Size(max = 40)
    @JsonProperty("tranField016")
    private String tranField016;

    public TransactionDto021() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto021 instance = new TransactionDto021();

        public Builder tranField000(LocalDate val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Double val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Boolean val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Double val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Long val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Double val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Boolean val) { instance.tranField008 = val; return this; }
        public Builder tranField009(String val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Boolean val) { instance.tranField010 = val; return this; }
        public Builder tranField011(Double val) { instance.tranField011 = val; return this; }
        public Builder tranField012(BigDecimal val) { instance.tranField012 = val; return this; }
        public Builder tranField013(LocalDate val) { instance.tranField013 = val; return this; }
        public Builder tranField014(String val) { instance.tranField014 = val; return this; }
        public Builder tranField015(BigDecimal val) { instance.tranField015 = val; return this; }
        public Builder tranField016(String val) { instance.tranField016 = val; return this; }
        public TransactionDto021 build() { return instance; }
    }

    public LocalDate getTranField000() { return tranField000; }
    public void setTranField000(LocalDate tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public Double getTranField002() { return tranField002; }
    public void setTranField002(Double tranField002) { this.tranField002 = tranField002; }

    public Boolean getTranField003() { return tranField003; }
    public void setTranField003(Boolean tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public Double getTranField005() { return tranField005; }
    public void setTranField005(Double tranField005) { this.tranField005 = tranField005; }

    public Long getTranField006() { return tranField006; }
    public void setTranField006(Long tranField006) { this.tranField006 = tranField006; }

    public Double getTranField007() { return tranField007; }
    public void setTranField007(Double tranField007) { this.tranField007 = tranField007; }

    public Boolean getTranField008() { return tranField008; }
    public void setTranField008(Boolean tranField008) { this.tranField008 = tranField008; }

    public String getTranField009() { return tranField009; }
    public void setTranField009(String tranField009) { this.tranField009 = tranField009; }

    public Boolean getTranField010() { return tranField010; }
    public void setTranField010(Boolean tranField010) { this.tranField010 = tranField010; }

    public Double getTranField011() { return tranField011; }
    public void setTranField011(Double tranField011) { this.tranField011 = tranField011; }

    public BigDecimal getTranField012() { return tranField012; }
    public void setTranField012(BigDecimal tranField012) { this.tranField012 = tranField012; }

    public LocalDate getTranField013() { return tranField013; }
    public void setTranField013(LocalDate tranField013) { this.tranField013 = tranField013; }

    public String getTranField014() { return tranField014; }
    public void setTranField014(String tranField014) { this.tranField014 = tranField014; }

    public BigDecimal getTranField015() { return tranField015; }
    public void setTranField015(BigDecimal tranField015) { this.tranField015 = tranField015; }

    public String getTranField016() { return tranField016; }
    public void setTranField016(String tranField016) { this.tranField016 = tranField016; }

    @Override
    public String toString() {
        return "TransactionDto021{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
