package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * DepositConfig024 — Configuration for deposit module.
 */
@ApplicationScoped
public class DepositConfig024 {

    @ConfigProperty(name = "pnb.deposit.v24.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.deposit.v24.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.deposit.v24.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.deposit.v24.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
