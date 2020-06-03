package com.quantitymeasurement;

public class QuantityMeasurement {

    public static double FEET_TO_INCH = 12;
    double value;

    public QuantityMeasurement(Double feet) {
        if(feet == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = feet * FEET_TO_INCH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0;
    }
}
