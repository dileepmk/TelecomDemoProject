package com.telecom.demo.service;

import org.springframework.stereotype.Service;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class AlarmMonitoringService {

    public void monitorAlarms() {
        // Simulate Infinite Loop
        while (true) {
            // Do something
        }
    }

    public void uploadAlarm(String alarmData) {
        // Simulate Unclosed Resources
        File file = new File("alarm.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(alarmData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String retrieveAlarms() {

        String alarmId = "1 OR 1=1";
        String query = "SELECT * FROM alarms WHERE id = " + alarmId;
        return query;  // Return the query as a simulated response
    }

    public String fetchPerformanceMetrics() {

        int metric = 1;
        if (metric == 1) {
            // do something
        } else if (metric == 2) {
            // do something else
        } else if (metric == 3) {
            // do another thing
        } else if (metric == 4) {
            // do yet another thing
        } else {
            // do something different
        }
        return "Performance Metrics";
    }

    public String processComplexAlarms(int alarmType) {


                String result = "";

        for (int i = 0; i < 10; i++) {
            if (alarmType == 1) {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        result += "Even Alarm Type 1;";
                    } else {
                        result += "Odd Alarm Type 1;";
                    }
                }
            } else if (alarmType == 2) {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        result += "Even Alarm Type 2;";
                    } else {
                        result += "Odd Alarm Type 2;";
                    }
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 0) {
                        result += "Even Alarm Type Other;";
                    } else {
                        result += "Odd Alarm Type Other;";
                    }
                }
            }
        }
        return result;
    }
}
