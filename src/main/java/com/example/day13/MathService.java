package com.example.day13;

import org.springframework.stereotype.Component;

import static org.apache.coyote.http11.Constants.a;
@Component
public class MathService {
    MathHelper mathHelper;
    public MathService(MathHelper mathHelper){
        this.mathHelper = mathHelper;
    }

    int add(int a, int b){
        return mathHelper.add(a, b);
    }
    double divide(int a, int b){
        if (b==0){
            throw new ArithmeticException("Division by zero");
        }
        return mathHelper.divide(a,b);
    }
}
