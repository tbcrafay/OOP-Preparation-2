/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Polymorphism:
Create a Shape class with a method calculateArea(). Create subclasses Circle, Rectangle, and Triangle that inherit from Shape and override the calculateArea() method to 
calculate the specific area for each shape.*/

package Polymorphism;

/**
 *
 * @author Abdul Rafay
 */
// Shape.java (Base class)
 class Shape {
    // Method to calculate the area of the shape
    // Default implementation returns 0
    public double calculateArea() {
        return 0;
    }
}

// Circle.java (Subclass)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        // Calculate and return the area of the circle using the formula πr²
        return Math.PI * radius * radius;
    }
}

// Rectangle.java (Subclass)
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle using the formula width * height
        return width * height;
    }
}

// Triangle.java (Subclass)
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        // Calculate and return the area of the triangle using the formula 0.5 * base * height
        return 0.5 * base * height;
    }
}


public class Area_Of_GeometricalShapes {
    public static void main(String[] args) {
        // Create instances of different shapes
        Circle circle = new Circle(5.0); // Radius = 5.0
        Rectangle rectangle = new Rectangle(4.0, 6.0); // Width = 4.0, Height = 6.0
        Triangle triangle = new Triangle(3.0, 8.0); // Base = 3.0, Height = 8.0

        // Calculate and display areas
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
 
   
}
