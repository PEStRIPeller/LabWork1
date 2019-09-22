package com.company;
import com.company.Classes.IsoscelesTriangle;
import com.company.Classes.Triangle;
//import com.company.Classes.Triangles;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       // Triangles trianles=new Triangles();
        int quantityTriangles;
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
            IsoscelesTriangle itriangle=new IsoscelesTriangle(Math.round(Math.random()*10),Math.round(Math.random()*10),Math.round(Math.random()*10));
            //trianles.triangles.add(new IsoscelesTriangle(2,2,3));
        double result=0;
        do {
            System.out.println("Please enter number of triangles: ");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next();
            }
            quantityTriangles=(sc.nextInt());
        } while (quantityTriangles<=0);
        for(int i=0;i<quantityTriangles;i++) {
            triangle.setA();
            triangle.setB();
            triangle.setC();
            System.out.println("Triangle №"+(i+1)+"\n"+triangle);
            result+=triangle.setS();
        }
        System.out.println("Average square of all triangles = "+result/quantityTriangles);
        do {
            System.out.println("Please enter number of triangles: ");
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next();
            }
            quantityTriangles=(sc.nextInt());
        } while (quantityTriangles<=0);
        for(int i=0;i<quantityTriangles;i++) {
            itriangle.setA();
            itriangle.setB();
            itriangle.setC();
            System.out.println("Triangle №"+(i+1)+"\n"+itriangle);
        //trianles.triangles.add(itriangle);
        //for (int i = 0; i <trianles.triangles.size() ; i++) {
          //  System.out.println(trianles.triangles.get(i));
        //}

    }
}}
