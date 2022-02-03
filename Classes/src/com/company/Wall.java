package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.height = height < 0 ? 0 : height;
        this.width = width < 0 ? 0 : width;
    }

    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double number) {
        this.width = number < 0 ? 0 : number;
    }

    public void setHeight(double number) {
        this.height = number < 0 ? 0 : number;
    }

}
