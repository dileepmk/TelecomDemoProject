
package com.telecom.demo.controller;

import com.telecom.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelecomController {

    @Autowired
    private TelecomUtils telecomUtils;

    @Autowired
    private ConnectionService connectionService;

    @Autowired
    private AlarmMonitoringService alarmMonitoringService;

    @Autowired
    private SecurityManagementService securityManagementService;

    @Autowired
    private AdditionalService additionalService;

    @GetMapping("/rate")
    public String getRates() {
        return telecomUtils.getRates();
    }
}
