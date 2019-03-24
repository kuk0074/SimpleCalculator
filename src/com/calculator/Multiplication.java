package com.calculator;

public class Multiplication implements Actionable {
    private double result;

    public Multiplication() {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void result(double a, double b) {
        this.result = a * b;
        System.out.println(a + " * " + b + " = " + this.result);
    }
}
