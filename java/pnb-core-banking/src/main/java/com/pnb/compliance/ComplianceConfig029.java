package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * ComplianceConfig029 — Configuration for compliance module.
 */
@ApplicationScoped
public class ComplianceConfig029 {

    @ConfigProperty(name = "pnb.compliance.v29.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.compliance.v29.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.compliance.v29.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.compliance.v29.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
