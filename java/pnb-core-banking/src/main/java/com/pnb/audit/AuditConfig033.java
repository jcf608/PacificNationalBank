package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * AuditConfig033 — Configuration for audit module.
 */
@ApplicationScoped
public class AuditConfig033 {

    @ConfigProperty(name = "pnb.audit.v33.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.audit.v33.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.audit.v33.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.audit.v33.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
