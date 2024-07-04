
package com.telecom.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TelecomUtils {

    public String getRates() {
        // Simulate Null Pointer Dereference
        String rate = null;
        rate.toString();

        return "Call Rate: $0.10/min, SMS Rate: $0.05/msg, Data Rate: $0.02/MB";
    }
}
