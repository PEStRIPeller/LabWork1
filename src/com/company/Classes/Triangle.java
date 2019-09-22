package com.company.Classes;
import java.util.Scanner;

public class Triangle {
    private final Scanner in = new Scanner(System.in);
    private double a;
    double getA() {
     return a;
    }
    public void setA() {
        do {
            System.out.println("Please enter a length of side a : ");
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next();
            }
            this.a=(in.nextDouble());
        } while (this.a <=0);
    }
    private double b;
    private double getC() {
        return c;
    }
    private double setP() {

        return this.a+this.b+this.c;
    }

    public void setC() {
        do {
            System.out.println("Please enter a length of side c : ");
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next();
            }
            this.c=(in.nextDouble());
        } while (this.c <= 0 );
    }
    private double c;

     double getB() {
        return b;
    }

    public void setB() {
        do {
            System.out.println("Please enter a length of side b : ");
            while (!in.hasNextDouble()) {
                System.out.println("That not a number!");
                in.next();
            }
            this.b=(in.nextDouble());
        } while (this.b <= 0 );
    }
    public double setS() {

        return Math.sqrt( (this.setP()/2)*( this.setP()/2-this.a)*( this.setP()/2-this.b)*( this.setP()/2-this.c));
    }
    private double SetCornerA(){
         return (180*Math.acos((this.b*this.b+this.c*this.c-this.a*this.a)/(2*this.b*this.c)))/Math.PI;
    }
    private double SetCornerB(){
        return (180*Math.acos((this.a*this.a+this.c*this.c-this.b*this.b)/(2*this.a*this.c)))/Math.PI;
    }
    private double SetCornerC(){
         return 180-(this.SetCornerA()+this.SetCornerB());
    }

    public Triangle() {
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return  a+b>c&&a+c>b&&c+b>a?

                "Side a = " + getA()  +
                "\nSide b = " + getB()  +
                "\nSide c = " + getC() + "\nPerimeter = "+setP()+"\nSquare = "+ setS() +"\nCorner = "+ SetCornerA()+"\nCorner = "+ SetCornerB()+"\nCorner = "+ SetCornerC()
                :"Triangle not exist";
    }
}
