
package com.telecom.demo.model;

public class User {

    private String username;
    private String password;

    // Simulate Methods Should Not Return Invariant Values
    public String getUsername() {
        return "admin";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return "password";
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
