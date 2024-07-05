
package com.telecom.demo.service;

import com.telecom.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class SecurityManagementService {

    public void manageSecurity(User user) {
        // Simulate Hardcoded Credentials
        String username = "admin";
        String password = "password";
        System.out.println("Username: " + username + ", Password: " + password);
    }
}
