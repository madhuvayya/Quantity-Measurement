package com.quantitymeasurement;

public enum UnitConversion {
    INCH(1.0, UnitType.LENGTH),
    FEET(12.0,UnitType.LENGTH),
    YARD(36.0,UnitType.LENGTH),
    CM(0.393701,UnitType.LENGTH),
    LITRE(1.0,UnitType.VOLUME),
    MILLILITRE(0.001,UnitType.VOLUME),
    GALLON(3.78,UnitType.VOLUME);

    public final Double value;
    public final UnitType type;

    UnitConversion(Double value, UnitType type) {
        this.value = value;
        this.type = type;
    }

    public Double getConversionValue(){
        return value;
    }
}
