
package com.telecom.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SecurityManagementService {

    public void manageSecurity() {
        // Simulate Hardcoded Credentials
        String username = "admin";
        String password = "password";
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
