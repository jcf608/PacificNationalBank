package com.pnb.transaction;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * TransactionConfig020 — Configuration for transaction module.
 */
@ApplicationScoped
public class TransactionConfig020 {

    @ConfigProperty(name = "pnb.transaction.v20.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.transaction.v20.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.transaction.v20.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.transaction.v20.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
