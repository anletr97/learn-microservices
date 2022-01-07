package com.anlt.ms.limitservice.controllers;

import com.anlt.ms.limitservice.config.Config;
import com.anlt.ms.limitservice.models.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigController {

    @Autowired
    private Config config;

    @GetMapping("/limits")
    public LimitConfig getLimitConfigs() {
        return new LimitConfig(config.getMax(), config.getMin());
    }
}
