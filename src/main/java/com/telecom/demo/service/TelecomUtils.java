package com.telecom.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TelecomUtils {

    public String calculateRates() {
        // Simulate calculating rates based on usage and pricing plans
        double usage = 100.0;
        double ratePerMinute = 0.10;
        double totalCost = usage * ratePerMinute;
        return "Total Cost: $" + totalCost;
    }
}
