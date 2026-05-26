package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AccountConfig028 — Configuration for account module.
 */
@ApplicationScoped
public class AccountConfig028 {

    @ConfigProperty(name = "pnb.account.v28.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.account.v28.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.account.v28.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.account.v28.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
