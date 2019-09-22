package com.company.Classes;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double a, double b, double c) {
        super(a, b, c);
    }
    @Override
   public double getB() {
        return this.getA();
    }

    @Override
    double getA() {
        return super.getA();
    }

    @Override
    public String toString() {

        return super.toString();
    }
}



