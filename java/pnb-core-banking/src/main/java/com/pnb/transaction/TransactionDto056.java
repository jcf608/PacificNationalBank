package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto056 — Data Transfer Object for transaction operations.
 * Variant 56 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto056 {

    @Size(max = 100)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private Double tranField001;

    @Size(max = 40)
    @JsonProperty("tranField002")
    private String tranField002;

    @JsonProperty("tranField003")
    private Double tranField003;

    @JsonProperty("tranField004")
    private Integer tranField004;

    @JsonProperty("tranField005")
    private LocalDate tranField005;

    @JsonProperty("tranField006")
    private Integer tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @JsonProperty("tranField008")
    private Boolean tranField008;

    @JsonProperty("tranField009")
    private Long tranField009;

    @Size(max = 200)
    @JsonProperty("tranField010")
    private String tranField010;

    @DecimalMin(value = "0.00")
    @JsonProperty("tranField011")
    private BigDecimal tranField011;

    @JsonProperty("tranField012")
    private Double tranField012;

    @JsonProperty("tranField013")
    private Boolean tranField013;

    @JsonProperty("tranField014")
    private Integer tranField014;

    @JsonProperty("tranField015")
    private Long tranField015;

    public TransactionDto056() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto056 instance = new TransactionDto056();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(Double val) { instance.tranField001 = val; return this; }
        public Builder tranField002(String val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Double val) { instance.tranField003 = val; return this; }
        public Builder tranField004(Integer val) { instance.tranField004 = val; return this; }
        public Builder tranField005(LocalDate val) { instance.tranField005 = val; return this; }
        public Builder tranField006(Integer val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Boolean val) { instance.tranField008 = val; return this; }
        public Builder tranField009(Long val) { instance.tranField009 = val; return this; }
        public Builder tranField010(String val) { instance.tranField010 = val; return this; }
        public Builder tranField011(BigDecimal val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Double val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Boolean val) { instance.tranField013 = val; return this; }
        public Builder tranField014(Integer val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Long val) { instance.tranField015 = val; return this; }
        public TransactionDto056 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public Double getTranField001() { return tranField001; }
    public void setTranField001(Double tranField001) { this.tranField001 = tranField001; }

    public String getTranField002() { return tranField002; }
    public void setTranField002(String tranField002) { this.tranField002 = tranField002; }

    public Double getTranField003() { return tranField003; }
    public void setTranField003(Double tranField003) { this.tranField003 = tranField003; }

    public Integer getTranField004() { return tranField004; }
    public void setTranField004(Integer tranField004) { this.tranField004 = tranField004; }

    public LocalDate getTranField005() { return tranField005; }
    public void setTranField005(LocalDate tranField005) { this.tranField005 = tranField005; }

    public Integer getTranField006() { return tranField006; }
    public void setTranField006(Integer tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public Boolean getTranField008() { return tranField008; }
    public void setTranField008(Boolean tranField008) { this.tranField008 = tranField008; }

    public Long getTranField009() { return tranField009; }
    public void setTranField009(Long tranField009) { this.tranField009 = tranField009; }

    public String getTranField010() { return tranField010; }
    public void setTranField010(String tranField010) { this.tranField010 = tranField010; }

    public BigDecimal getTranField011() { return tranField011; }
    public void setTranField011(BigDecimal tranField011) { this.tranField011 = tranField011; }

    public Double getTranField012() { return tranField012; }
    public void setTranField012(Double tranField012) { this.tranField012 = tranField012; }

    public Boolean getTranField013() { return tranField013; }
    public void setTranField013(Boolean tranField013) { this.tranField013 = tranField013; }

    public Integer getTranField014() { return tranField014; }
    public void setTranField014(Integer tranField014) { this.tranField014 = tranField014; }

    public Long getTranField015() { return tranField015; }
    public void setTranField015(Long tranField015) { this.tranField015 = tranField015; }

    @Override
    public String toString() {
        return "TransactionDto056{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
