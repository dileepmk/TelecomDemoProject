
package com.telecom.demo.service;

import org.springframework.stereotype.Service;
import java.io.Serializable;

@Service
public class ConnectionService implements Serializable {

    public void connect() {
        // Simulate Non-Serializable Object in Serialization
        Object nonSerializableObject = new Object();
        System.out.println(nonSerializableObject);
    }
}
