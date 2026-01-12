package com.example.myapp;

public class Calculator {
    
    String GITHUB_TOKEN="ghp_1234567890abcdefghijklmnopqrstuvwxyz";
    
    String AWS_ACCESS_KEY_ID="AKIAIOSFODNN7EXAMPLE";

    String token = "ghp_abcdefghijklmnopqrstuvwxyz1234567890";

    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
