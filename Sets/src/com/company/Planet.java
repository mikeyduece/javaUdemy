package com.company;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        return satellite.getKey().getBodyType() == BodyTypes.MOON && super.addSatellite(satellite);
    }
}
