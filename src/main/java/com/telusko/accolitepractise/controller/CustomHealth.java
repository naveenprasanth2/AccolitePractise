package com.telusko.accolitepractise.controller;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {
    @Override
    public @Nullable Health health() {
        return Health.up()
                .withDetail("message", "Custom Health")
                .build();
    }
}
