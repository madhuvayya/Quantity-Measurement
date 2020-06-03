package com.quantitymeasurement;

public class Length {

    private final Double value;

    enum Unit{FEET,INCH}

    public Length(Unit unit, Double value) {
        if(value == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.value, value) == 0;
    }
}
