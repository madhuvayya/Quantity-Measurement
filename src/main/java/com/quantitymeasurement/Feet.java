package com.quantitymeasurement;

public class Feet {

    private final Double feet;

    public Feet(Double feet) {
        this.feet = feet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet that = (Feet) o;
        return Double.compare(that.feet, feet) == 0;
    }
}
