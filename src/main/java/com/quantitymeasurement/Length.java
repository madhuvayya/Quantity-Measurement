package com.quantitymeasurement;

import java.util.HashMap;
import java.util.Map;

public class Length {

    private final Double value;
    private final Unit unit;

    enum Unit{FEET,INCH,YARD,CM}

    static Map<String,Double> conversionMap = new HashMap<>();

    static{
        conversionMap.put("FEET_TO_INCH",12.0);
        conversionMap.put("INCH_TO_FEET",1/12.0);
        conversionMap.put("FEET_TO_YARD",1/3.0);
        conversionMap.put("YARD_TO_FEET",3.0);
        conversionMap.put("YARD_TO_INCH",36.0);
        conversionMap.put("INCH_TO_YARD",1/36.0);
        conversionMap.put("INCH_TO_CM",1/2.54);
        conversionMap.put("CM_TO_INCH",2.54);
        conversionMap.put("YARD_TO_CM",91.44);
        conversionMap.put("CM_TO_YARD",1/91.44);
        conversionMap.put("FEET_TO_CM",30.48);
        conversionMap.put("CM_TO_FEET",1/30.48);
    }

    public Length(Unit unit, Double value) {
        if(value == null || unit == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL,"entered null value");
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length that = (Length) o;
        return Double.compare(that.value, value) == 0 && this.unit.equals(that.unit);
    }

    public boolean compare(Length that) {
        if (this.unit.equals(that.unit))
            return this.equals(that);
        String variable = this.unit + "_TO_" + that.unit;
        for (Map.Entry<String, Double> entry : conversionMap.entrySet()) {
            if (variable.equals(entry.getKey()))
                return Double.compare(this.value * entry.getValue(), that.value) == 0;
        }
        return false;
    }
}
