package com.calculator;

public class Sum implements Actionable {
    private double result;

    public Sum() {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void result(double a, double b) {
        this.result = a + b;
        System.out.println(a + " + " + b + " = " + this.result);
    }
}
