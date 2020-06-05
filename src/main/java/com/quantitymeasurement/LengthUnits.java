package com.quantitymeasurement;

import java.util.HashMap;
import java.util.Map;

public class LengthUnits extends UnitComparision {

    public LengthUnits(Unit unit, Double value) {
        super(unit, value);
    }

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

    public static Double getConversionValue(String string){
        for (Map.Entry<String, Double> entry : conversionMap.entrySet()) {
            if (string.equals(entry.getKey()))
                return entry.getValue();
        }
        return 0.0;
    }
}
