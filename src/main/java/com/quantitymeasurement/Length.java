package com.quantitymeasurement;

public class Length {

    private static final Double FEET_TO_INCH = 12.0;
    private static final Double INCH_TO_FEET = 1/12.0;
    private static final Double FEET_TO_YARD = 1 / 3.0;
    private static final Double YARD_TO_FEET = 3.0;
    private static final Double YARD_TO_INCH = 36.0;
    private static final Double INCH_TO_YARD = 1 / 36.0;
    private final Double value;
    private final Unit unit;

    enum Unit{FEET,INCH,YARD}

    public Length(Unit unit, Double value) {
        if(value == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.value, value) == 0;
    }

    public boolean compare(Length that) {
        if(this.unit.equals(that.unit))
            return this.equals(that);
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * FEET_TO_INCH,that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * INCH_TO_FEET,that.value) == 0;
        if(this.unit.equals(Unit.FEET) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value * FEET_TO_YARD,that.value) == 0;
        if(this.unit.equals(Unit.YARD) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * YARD_TO_INCH,that.value) == 0;
        if(this.unit.equals(Unit.INCH) && that.unit.equals(Unit.YARD))
            return Double.compare(this.value * INCH_TO_YARD,that.value) == 0;
        if(this.unit.equals(Unit.YARD) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * YARD_TO_FEET ,that.value) == 0;
        return false;
    }
}
