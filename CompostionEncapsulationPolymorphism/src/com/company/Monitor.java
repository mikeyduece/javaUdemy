package com.company;

public class Monitor {
    private String model;
    private String manfacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manfacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }
}
