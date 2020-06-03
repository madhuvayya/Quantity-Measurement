package com.quantitymeasurement;

public class Inch {
    private final Double inch;

    public Inch(Double inch) {
        if(inch == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.inch = inch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch that = (Inch) o;
        return Double.compare(that.inch, inch) == 0;
    }
}
