package com.pnb.hold;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * HoldConfig038 — Configuration for hold module.
 */
@ApplicationScoped
public class HoldConfig038 {

    @ConfigProperty(name = "pnb.hold.v38.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.hold.v38.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.hold.v38.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.hold.v38.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
