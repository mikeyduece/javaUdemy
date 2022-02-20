package com.company;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    // enums better than list of constants as enums will throw an error at compile time, whereas the latter is at runtime
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.getOrbitalPeriod();
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj instanceof HeavenlyBody) {
            HeavenlyBody theObj = (HeavenlyBody) obj;
            return this.key.equals(theObj.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) { return new Key(name, bodyType); }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() { return name; }

        public BodyTypes getBodyType() { return bodyType; }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.getBodyType().hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) return(this.bodyType == key.getBodyType());

            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
