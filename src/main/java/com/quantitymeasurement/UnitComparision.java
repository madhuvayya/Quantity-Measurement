package com.quantitymeasurement;

public class UnitComparision {

    public Double value;
    public UnitConversion unit;

    public UnitComparision(UnitConversion unit, Double value) {
        if(value == null || unit == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = value * unit.getConversionValue();
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitComparision that = (UnitComparision) o;
        return Double.compare(that.value, value) == 0 && unit.type == that.unit.type;
    }

    public boolean compare(UnitComparision that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.value,that.value) == 0;
    }

    public Double addUnites(UnitComparision that) {
        if(this.unit.type == that.unit.type) {
            Double sum = value + that.value ;
            return sum;
        }
        return null;
    }
}
