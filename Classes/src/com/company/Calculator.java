package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double carpetCost = carpet.getCost();
        double area = floor.getArea();

        return area * carpetCost;
    }
}
