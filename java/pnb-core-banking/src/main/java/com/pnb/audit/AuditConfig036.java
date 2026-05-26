package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AuditConfig036 — Configuration for audit module.
 */
@ApplicationScoped
public class AuditConfig036 {

    @ConfigProperty(name = "pnb.audit.v36.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.audit.v36.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.audit.v36.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.audit.v36.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
