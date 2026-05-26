package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * DepositConfig025 — Configuration for deposit module.
 */
@ApplicationScoped
public class DepositConfig025 {

    @ConfigProperty(name = "pnb.deposit.v25.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.deposit.v25.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.deposit.v25.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.deposit.v25.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
