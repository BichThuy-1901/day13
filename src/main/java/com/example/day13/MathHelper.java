package com.example.day13;

import org.springframework.stereotype.Component;

@Component
public class MathHelper {
    int add(int a, int b){
        return a+b;
    }
    double divide (int a, int b){
        return (double) a/b;
    }
}
