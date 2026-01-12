package com.example.myapp;

public class Calculator {
    
    String GITHUB_TOKEN="ghp_1234567890abcdefghijklmnopqrstuvwxyz";
    
    String AWS_ACCESS_KEY_ID="AKIAIOSFODNN7EXAMPLE";

    String token = "ghp_abcdefghijklmnopqrstuvwxyz1234567890";

    String supabase_secret_key = "-----BEGIN PRIVATE KEY-----";

    String subscription_key = "927c4c89ea6e47e2bebf02ba4ed910ab";

    String key = "7voVWXdf67gfdgdfg67667dsfGReT5498fdkl";

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
