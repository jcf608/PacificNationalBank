package com.pnb.branch;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * BranchConfig035 — Configuration for branch module.
 */
@ApplicationScoped
public class BranchConfig035 {

    @ConfigProperty(name = "pnb.branch.v35.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.branch.v35.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.branch.v35.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.branch.v35.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
