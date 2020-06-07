package com.quantitymeasurement;

public enum UnitConversion {

    INCH(1.0, UnitType.LENGTH),
    FEET(12.0,UnitType.LENGTH),
    YARD(36.0,UnitType.LENGTH),
    CENTIMETRE(0.393701,UnitType.LENGTH),
    LITRE(1.0,UnitType.VOLUME),
    MILLILITRE(0.001,UnitType.VOLUME),
    GALLON(3.78,UnitType.VOLUME),
    KG(1.0,UnitType.WEIGHT),
    GRAMS(0.001,UnitType.WEIGHT),
    TONNE(1000.0,UnitType.WEIGHT),
    FAHRENHEIT(1.0,UnitType.TEMPERATURE),
    CELSIUS(-33.0,UnitType.TEMPERATURE);

    public final Double value;
    public final UnitType type;

    UnitConversion(Double value, UnitType type) {
        this.value = value;
        this.type = type;
    }

    public Double getConversionValue(){
        return value;
    }

    public Double getConversionValue(UnitConversion unit,Double value){
        if(unit.equals(UnitConversion.CELSIUS))
            return (value * 9/5) + 32.0;
        return value;
    }

    public enum UnitType {
        LENGTH,
        VOLUME,
        WEIGHT,
        TEMPERATURE;
    }
}
