package com.pnb.deposit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * DepositConfig035 — Configuration for deposit module.
 */
@ApplicationScoped
public class DepositConfig035 {

    @ConfigProperty(name = "pnb.deposit.v35.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.deposit.v35.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.deposit.v35.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.deposit.v35.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
