package com.pnb.alert;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AlertConfig034 — Configuration for alert module.
 */
@ApplicationScoped
public class AlertConfig034 {

    @ConfigProperty(name = "pnb.alert.v34.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.alert.v34.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.alert.v34.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.alert.v34.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
