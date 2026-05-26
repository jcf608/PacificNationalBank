package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * DepositConfig037 — Configuration for deposit module.
 */
@ApplicationScoped
public class DepositConfig037 {

    @ConfigProperty(name = "pnb.deposit.v37.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.deposit.v37.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.deposit.v37.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.deposit.v37.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
