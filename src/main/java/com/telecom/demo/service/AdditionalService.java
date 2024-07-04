
package com.telecom.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionalService {

    public void additionalFunction() {
        // Simulate Duplicated Code
        for (int i = 0; i < 10; i++) {
            System.out.println("This is duplicated code.");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("This is duplicated code.");
        }
    }
}
