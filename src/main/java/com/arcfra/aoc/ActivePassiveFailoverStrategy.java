package com.arcfra.aoc;

/** Controls how {@link ActivePassiveApiClient} discovers and retries endpoints. */
public enum ActivePassiveFailoverStrategy {
    /** Cache the discovered active endpoint and retry once after a 307 switch signal. */
    AUTO_FAILOVER,

    /** Return a failover-required error after a 307 switch signal without rediscovery. */
    MANUAL_FAILOVER,

    /** Probe before every request and return a failover-required error after a fresh 307. */
    ALWAYS_PROBE
}
