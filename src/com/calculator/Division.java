package com.calculator;

public class Division implements Actionable
{
    private double result;

    public Division() {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void result(double a, double b){
        result = a / b;
        if (b == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}
