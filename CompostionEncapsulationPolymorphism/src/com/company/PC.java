package com.company;

public class PC {
    private Case kase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case kase, Monitor monitor, Motherboard motherboard) {
        this.kase = kase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getKase() {
        return kase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
