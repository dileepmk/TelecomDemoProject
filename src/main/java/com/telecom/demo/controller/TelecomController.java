package com.telecom.demo.controller;

import com.telecom.demo.model.User;
import com.telecom.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return telecomUtils.calculateRates();
    }

    @GetMapping("/connect")
    public String connect() {
        return connectionService.establishConnection();
    }

    @GetMapping("/monitor")
    public String monitorAlarms() {
        alarmMonitoringService.monitorAlarms();
        return "Monitoring Alarms";
    }

    @PostMapping("/manageSecurity")
    public String manageSecurity(@RequestBody User user) {
        securityManagementService.manageSecurity(user);
        return "Security Management";
    }

    @GetMapping("/additionalFunction")
    public String additionalFunction() {
        additionalService.additionalFunction();
        return "Additional Function Executed";
    }

    @PostMapping("/uploadAlarm")
    public String uploadAlarm(@RequestBody String alarmData) {
        alarmMonitoringService.uploadAlarm(alarmData);
        return "Alarm Uploaded";
    }

    @GetMapping("/retrieveAlarms")
    public String retrieveAlarms() {
        return alarmMonitoringService.retrieveAlarms();
    }

    @GetMapping("/performanceMetrics")
    public String fetchPerformanceMetrics() {
        return alarmMonitoringService.fetchPerformanceMetrics();
    }

    @GetMapping("/processComplexAlarms/{alarmType}")
    public String processComplexAlarms(@PathVariable int alarmType) {
        return alarmMonitoringService.processComplexAlarms(alarmType);
    }

    @GetMapping("/generateReport")
    public String generateReport() {
        // Simulate a potential SQL injection vulnerability
        String reportType = "all";
        String query = "SELECT * FROM reports WHERE type = '" + reportType + "'";
        return query;  // Return the query as a simulated response
    }

    @GetMapping("/searchCustomer/{customerId}")
    public String searchCustomer(@PathVariable String customerId) {
        // Simulate a potential infinite loop
        while (true) {
            // Perform search operation
        }
    }

    @GetMapping("/calculateTotalCost/{quantity}/{price}")
    public double calculateTotalCost(@PathVariable int quantity, @PathVariable double price) {
        // Simulate a potential division by zero error
        double totalCost = quantity / price;
        return totalCost;
    }

}