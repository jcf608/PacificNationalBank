package com.pnb.ach;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AchConfig035 — Configuration for ach module.
 */
@ApplicationScoped
public class AchConfig035 {

    @ConfigProperty(name = "pnb.ach.v35.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.ach.v35.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.ach.v35.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.ach.v35.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
