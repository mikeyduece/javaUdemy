package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = false;
    }

    public void addToner(int toner) {
        tonerLevel += toner;
        if (tonerLevel > 100) tonerLevel = 100;
        System.out.println("Current toner level is " + tonerLevel);
    }

    public void print(int pageCount) {
        tonerLevel -= pageCount;
        if (tonerLevel < pageCount) {
            tonerLevel = 0;
            System.out.println("Not enough toner, please add toner and try again");
        } else {
            pagesPrinted += Math.max(pageCount, 1);
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
