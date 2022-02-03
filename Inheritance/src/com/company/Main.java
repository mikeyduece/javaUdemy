package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(3.75);
        System.out.println("c.radius() = " + c.getRadius());
        System.out.println("c.area() = " + c.getArea());
        Cylinder cy = new Cylinder(5.55, 7.25);
        System.out.println("cy.radius = " + cy.getRadius());
        System.out.println("cy.height = " + cy.getHeight());
        System.out.println("cy.area = " + cy.getArea());
        System.out.println("cy.volume = " + cy.getVolume());
    }
}
