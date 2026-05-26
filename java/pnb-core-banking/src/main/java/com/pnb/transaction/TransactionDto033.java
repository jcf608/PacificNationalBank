package com.pnb.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/**
 * TransactionDto033 — Data Transfer Object for transaction operations.
 * Variant 33 with domain-specific validation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto033 {

    @Size(max = 40)
    @JsonProperty("tranField000")
    private String tranField000;

    @JsonProperty("tranField001")
    private LocalDate tranField001;

    @JsonProperty("tranField002")
    private Boolean tranField002;

    @JsonProperty("tranField003")
    private Boolean tranField003;

    @JsonProperty("tranField004")
    private LocalDate tranField004;

    @Size(max = 100)
    @JsonProperty("tranField005")
    private String tranField005;

    @Size(max = 100)
    @JsonProperty("tranField006")
    private String tranField006;

    @JsonProperty("tranField007")
    private Boolean tranField007;

    @JsonProperty("tranField008")
    private Long tranField008;

    @JsonProperty("tranField009")
    private LocalDate tranField009;

    @JsonProperty("tranField010")
    private Long tranField010;

    @JsonProperty("tranField011")
    private LocalDate tranField011;

    @JsonProperty("tranField012")
    private Integer tranField012;

    @JsonProperty("tranField013")
    private Boolean tranField013;

    @Size(max = 20)
    @JsonProperty("tranField014")
    private String tranField014;

    @JsonProperty("tranField015")
    private Boolean tranField015;

    @Size(max = 40)
    @JsonProperty("tranField016")
    private String tranField016;

    public TransactionDto033() {}

    public static Builder builder() { return new Builder(); }

    public static class Builder {
        private final TransactionDto033 instance = new TransactionDto033();

        public Builder tranField000(String val) { instance.tranField000 = val; return this; }
        public Builder tranField001(LocalDate val) { instance.tranField001 = val; return this; }
        public Builder tranField002(Boolean val) { instance.tranField002 = val; return this; }
        public Builder tranField003(Boolean val) { instance.tranField003 = val; return this; }
        public Builder tranField004(LocalDate val) { instance.tranField004 = val; return this; }
        public Builder tranField005(String val) { instance.tranField005 = val; return this; }
        public Builder tranField006(String val) { instance.tranField006 = val; return this; }
        public Builder tranField007(Boolean val) { instance.tranField007 = val; return this; }
        public Builder tranField008(Long val) { instance.tranField008 = val; return this; }
        public Builder tranField009(LocalDate val) { instance.tranField009 = val; return this; }
        public Builder tranField010(Long val) { instance.tranField010 = val; return this; }
        public Builder tranField011(LocalDate val) { instance.tranField011 = val; return this; }
        public Builder tranField012(Integer val) { instance.tranField012 = val; return this; }
        public Builder tranField013(Boolean val) { instance.tranField013 = val; return this; }
        public Builder tranField014(String val) { instance.tranField014 = val; return this; }
        public Builder tranField015(Boolean val) { instance.tranField015 = val; return this; }
        public Builder tranField016(String val) { instance.tranField016 = val; return this; }
        public TransactionDto033 build() { return instance; }
    }

    public String getTranField000() { return tranField000; }
    public void setTranField000(String tranField000) { this.tranField000 = tranField000; }

    public LocalDate getTranField001() { return tranField001; }
    public void setTranField001(LocalDate tranField001) { this.tranField001 = tranField001; }

    public Boolean getTranField002() { return tranField002; }
    public void setTranField002(Boolean tranField002) { this.tranField002 = tranField002; }

    public Boolean getTranField003() { return tranField003; }
    public void setTranField003(Boolean tranField003) { this.tranField003 = tranField003; }

    public LocalDate getTranField004() { return tranField004; }
    public void setTranField004(LocalDate tranField004) { this.tranField004 = tranField004; }

    public String getTranField005() { return tranField005; }
    public void setTranField005(String tranField005) { this.tranField005 = tranField005; }

    public String getTranField006() { return tranField006; }
    public void setTranField006(String tranField006) { this.tranField006 = tranField006; }

    public Boolean getTranField007() { return tranField007; }
    public void setTranField007(Boolean tranField007) { this.tranField007 = tranField007; }

    public Long getTranField008() { return tranField008; }
    public void setTranField008(Long tranField008) { this.tranField008 = tranField008; }

    public LocalDate getTranField009() { return tranField009; }
    public void setTranField009(LocalDate tranField009) { this.tranField009 = tranField009; }

    public Long getTranField010() { return tranField010; }
    public void setTranField010(Long tranField010) { this.tranField010 = tranField010; }

    public LocalDate getTranField011() { return tranField011; }
    public void setTranField011(LocalDate tranField011) { this.tranField011 = tranField011; }

    public Integer getTranField012() { return tranField012; }
    public void setTranField012(Integer tranField012) { this.tranField012 = tranField012; }

    public Boolean getTranField013() { return tranField013; }
    public void setTranField013(Boolean tranField013) { this.tranField013 = tranField013; }

    public String getTranField014() { return tranField014; }
    public void setTranField014(String tranField014) { this.tranField014 = tranField014; }

    public Boolean getTranField015() { return tranField015; }
    public void setTranField015(Boolean tranField015) { this.tranField015 = tranField015; }

    public String getTranField016() { return tranField016; }
    public void setTranField016(String tranField016) { this.tranField016 = tranField016; }

    @Override
    public String toString() {
        return "TransactionDto033{" +
            "tranField000=" + tranField000 + ", " +
            "tranField001=" + tranField001 + ", " +
            "tranField002=" + tranField002 + ", " +
            "tranField003=" + tranField003 + ", " +
            "tranField004=" + tranField004 + ", " +
            "}";
    }
}
