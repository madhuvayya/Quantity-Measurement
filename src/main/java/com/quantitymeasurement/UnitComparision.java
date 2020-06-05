package com.quantitymeasurement;

public class UnitComparision {

    private final Double value;
    private final Unit unit;

    enum Unit{FEET,INCH,YARD,CM}

    public UnitComparision(Unit unit, Double value) {
        if(value == null || unit == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitComparision that = (UnitComparision) o;
        return Double.compare(that.value, value) == 0 && this.unit.equals(that.unit);
    }

    public boolean compare(UnitComparision that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        String variable = this.unit + "_TO_" + that.unit;
        Double conversionValue = LengthUnits.getConversionValue(variable);
        if(conversionValue != 0.0)
            return Double.compare(this.value * conversionValue,that.value) == 0;
        return false;
    }
}
