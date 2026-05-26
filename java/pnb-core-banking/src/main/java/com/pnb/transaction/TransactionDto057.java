package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto057 — Data Transfer Object for transaction operations.
 * Variant 57 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto057 {

    @JsonProperty("tranField000")
    private Boolean tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField002")
    private BigDecimal tranField002;

    @Size(max = 20)
    @JsonProperty("tranField003")
    private String tranField003;

    @JsonProperty("tranField004")
    private Double tranField004;

    @JsonProperty("tranField005")
    private Boolean tranField005;

    @JsonProperty("tranField006")
    private Double tranField006;

    @JsonProperty("tranField007")
    private Integer tranField007;

    @Size(max = 100)
    @JsonProperty("tranField008")
    private String tranField008;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField009")
    private BigDecimal tranField009;

    @Size(max = 60)
    @JsonProperty("tranField010")
    private String tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    @JsonProperty("tranField012")
    private Boolean tranField012;

    @JsonProperty("tranField013")
    private Boolean tranField013;

    @JsonProperty("tranField014")
    private Integer tranField014;

    @Size(max = 40)
    @JsonProperty("tranField015")
    private String tranField015;

    @JsonProperty("tranField016")
    private Integer tranField016;

    public TransactionDto057() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto057 instance = new TransactionDto057();

        public Builder tranField000(Boolean val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(BigDecimal val) { instance.tranField002 = val; return this; }
        public Builder tranField003(String val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Double val) { instance.tranField004 = val; return this; }
        public Builder tranField005(Boolean val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Double val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Integer val) { instance.tranField007 = val; return this; }
        public Builder tranField008(String val) { instance.tranField008 = val; return this; }
        public Builder tranField009(BigDecimal val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Boolean val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Boolean val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Integer val) { instance.tranField014 = val; return this; }
        public Builder tranField015(String val) { instance.tranField015 = val; return this; }
        public Builder tranField016(Integer val) { instance.tranField016 = val; return this; }
        public TransactionDto057 build() { return instance; }
    }

    public Boolean getTranField000() { return tranField000; }
    public void setTranField000(Boolean tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public BigDecimal getTranField002() { return tranField002; }
    public void setTranField002(BigDecimal tranField002) { this.tranField002 = tranField002; }

    public String getTranField003() { return tranField003; }
    public void setTranField003(String tranField003) { this.tranField003 = tranField003; }

    public Double getTranField004() { return tranField004; }
    public void setTranField004(Double tranField004) { this.tranField004 = tranField004; }

    public Boolean getTranField005() { return tranField005; }
    public void setTranField005(Boolean tranField005) { this.tranField005 = tranField005; }

    public Double getTranField006() { return tranField006; }
    public void setTranField006(Double tranField006) { this.tranField006 = tranField006; }

    public Integer getTranField007() { return tranField007; }
    public void setTranField007(Integer tranField007) { this.tranField007 = tranField007; }

    public String getTranField008() { return tranField008; }
    public void setTranField008(String tranField008) { this.tranField008 = tranField008; }

    public BigDecimal getTranField009() { return tranField009; }
    public void setTranField009(BigDecimal tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    public Boolean getTranField012() { return tranField012; }
    public void setTranField012(Boolean tranField012) { this.tranField012 = tranField012; }

    public Boolean getTranField013() { return tranField013; }
    public void setTranField013(Boolean tranField013) { this.tranField013 = tranField013; }

    public Integer getTranField014() { return tranField014; }
    public void setTranField014(Integer tranField014) { this.tranField014 = tranField014; }

    public String getTranField015() { return tranField015; }
    public void setTranField015(String tranField015) { this.tranField015 = tranField015; }

    public Integer getTranField016() { return tranField016; }
    public void setTranField016(Integer tranField016) { this.tranField016 = tranField016; }

    @Override
    public String toString() {
        return "TransactionDto057{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
