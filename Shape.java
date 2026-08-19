import java.io.*;
import java.util.*;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape {
   double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Area: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
class Triangle extends Shape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }

    void calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}
class Main {

    public static void main(String[] args) throws IOException {

        Shape s[] = new Shape[3];

        s[0] = new Circle(5);
        s[1] = new Rectangle(10, 5);
        s[2] = new Triangle(6, 4, 5, 5, 6);


        System.out.println("----- Circle -----");
        s[0].calculateArea();
        s[0].calculatePerimeter();

        System.out.println();


        System.out.println("----- Rectangle -----");
        s[1].calculateArea();
        s[1].calculatePerimeter();

        System.out.println();


        System.out.println("----- Triangle -----");
        s[2].calculateArea();
        s[2].calculatePerimeter();
    }
}