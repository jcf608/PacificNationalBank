package com.pnb.collections;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * CollectionsConfig021 — Configuration for collections module.
 */
@ApplicationScoped
public class CollectionsConfig021 {

    @ConfigProperty(name = "pnb.collections.v21.enabled", defaultValue = "true")
    private boolean enabled;

    @ConfigProperty(name = "pnb.collections.v21.max-amount", defaultValue = "999999.99")
    private String maxAmount;

    @ConfigProperty(name = "pnb.collections.v21.timeout-ms", defaultValue = "30000")
    private int timeoutMs;

    @ConfigProperty(name = "pnb.collections.v21.retry-count", defaultValue = "3")
    private int retryCount;

    public boolean isEnabled() { return enabled; }
    public String getMaxAmount() { return maxAmount; }
    public int getTimeoutMs() { return timeoutMs; }
    public int getRetryCount() { return retryCount; }
}
