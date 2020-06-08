package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0Feet0Feet_whenEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0Feet0Feet_whenEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given1Feet12Inches_whenEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,12.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void givenNullValue_whenNull_shouldThrowException() {
        try {
            UnitComparision length1 = new UnitComparision(UnitConversion.FEET,0.0);
            UnitComparision length2 = new UnitComparision(UnitConversion.FEET,null);
            Assert.assertFalse(length1.equals(length2));
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,4.5);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,4.5);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenDifferentFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,5.5);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,3.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenSameFeetValues_whenValuesAreEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,3.3);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,3.3);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenZeroInches_whenEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void givenNullValue_whenEqualedNull_shouldThrowException() {
        try {
            UnitComparision length1 = new UnitComparision(UnitConversion.INCH,0.0);
            UnitComparision length2 = new UnitComparision(UnitConversion.INCH,null);
            Assert.assertEquals(length1, length2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameInchValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.2);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,1.2);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenSameInchValues_whenValuesAreEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,1.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0Feet0Inch_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,0.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet1Inch_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet1Feet_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Inch1Feet_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch1Feet_whenEqualed_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet12Inch_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,12.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch1Feet_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,12.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given0Yard0Yard_whenEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.YARD,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0YardNull_whenNull_shouldThrowException() {
        try {
            UnitComparision length1 = new UnitComparision(UnitConversion.YARD,0.0);
            UnitComparision length2 = new UnitComparision(UnitConversion.YARD,null);
            Assert.assertFalse(length1.equals(length2));
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void given1Yard1Yard_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.YARD,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void given1Yard0Yard_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.YARD,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,0.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void given3Feet1Yard_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,3.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet1Yard_whenCompared_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch1Yard_whenCompared_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard36Inches_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.YARD,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,36.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inches1Yard_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,36.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given35Inches1Yard_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,35.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard3Feet_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.YARD, 1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.FEET, 3.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given0Cm0Cm_whenEqual_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.CENTIMETRE,0.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0CmNull_whenNull_shouldThrowException() {
        try {
            UnitComparision length1 = new UnitComparision(UnitConversion.CENTIMETRE,0.0);
            UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,null);
            Assert.assertFalse(length1.equals(length2));
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void given1Cm1Cm_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        Assert.assertNotSame(length1, length2);
    }

    @Test
    public void given1Cm0Cm_whenReferencesAreNotEqual_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,0.0);
        Assert.assertNotSame(length1, length2);
    }

    @Test
    public void given1Feet1Cm_whenCompared_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch1Cm_whenCompared_shouldReturnFalse() {
        UnitComparision length1 = new UnitComparision(UnitConversion.INCH,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Cm2_54Inches_whenCompared_shouldReturnTrue() {
        UnitComparision length1 = new UnitComparision(UnitConversion.CENTIMETRE,1.0);
        UnitComparision length2 = new UnitComparision(UnitConversion.INCH,0.393701);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given2Inch2Inch_whenAdded_shouldReturn4Inch() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.INCH,2.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.INCH,2.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(4.0,sum,0.0);
    }

    @Test
    public void given1Feet2Inch_whenAdded_shouldReturn14Inch() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.INCH,2.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(14.0,sum,0.0);
    }

    @Test
    public void given1Feet1Inch_whenAdded_shouldReturn14Inch() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FEET,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.FEET,1.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(24.0,sum,0.0);
    }

    @Test
    public void given2Inch2_Cm_whenAdded_shouldReturn14Inch() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.INCH,2.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CENTIMETRE,2.5);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(2.9842525,sum,0.0);
    }

    @Test
    public void given1Gallon3_78Liters_whenEqualed_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.GALLON,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.LITRE,3.78);
        Assert.assertTrue(unitComparision.equals(unitComparision1));
    }

    @Test
    public void given1Liter1000MilliLiters_whenEqualed_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.LITRE,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.MILLILITRE,1000.0);
        Assert.assertTrue(unitComparision.equals(unitComparision1));
    }

    @Test
    public void given1Gallon3_78Liters_whenAdded_shouldReturn7_57Liters() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.GALLON,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.LITRE,3.78);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(7.56,sum,0.0);
    }

    @Test
    public void given1Liter1000MilliLiters_whenAdded_shouldReturn2Liters() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.LITRE,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.MILLILITRE,1000.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(2.0,sum,0.0);
    }

    @Test
    public void given1Kg1000Grams_whenEqualed_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.KG,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.GRAMS,1000.0);
        Assert.assertTrue(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given1Tonne1000Kgs_whenEqualed_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.TONNE,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.KG,1000.0);
        Assert.assertTrue(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given1Tonne1000Grams_whenAdded_shouldReturn1001Kgs() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.TONNE,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.GRAMS,1000.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(1001.0,sum,0.0);
    }

    @Test
    public void given1Inch1Kg_whenEqualed_shouldReturnFalse() {
        try {
            UnitComparision unitComparision = new UnitComparision(UnitConversion.INCH, 1.0);
            UnitComparision unitComparision1 = new UnitComparision(UnitConversion.KG, 1.0);
            unitComparision.compare(unitComparision1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_TYPE,e.type);
        }
    }

    @Test
    public void given1Gallon1Yard_whenEqualed_shouldReturnFalse() {
        try {
            UnitComparision unitComparision = new UnitComparision(UnitConversion.GALLON, 1.0);
            UnitComparision unitComparision1 = new UnitComparision(UnitConversion.YARD, 1.0);
            boolean compare = unitComparision.compare(unitComparision1);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INVALID_TYPE,e.type);
        }
    }

    @Test
    public void given1Fahrenheits1Fahrenheits_whenCompared_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        Assert.assertTrue(unitComparision.equals(unitComparision1));
    }

    @Test
    public void given0FahrenheitsNull_whenCompared_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        try {
            UnitComparision unitComparision1 = new UnitComparision(UnitConversion.FAHRENHEIT,null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void given1Celsius1Celsius_whenCompared_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.CELSIUS,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CELSIUS,1.0);
        Assert.assertTrue(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given33_8Fahrenheits1Celsius_whenCompared_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,33.8);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CELSIUS,1.0);
        Assert.assertTrue(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given212Fahrenheit100Celsius_whenCompared_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,212.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CELSIUS,100.0);
        Assert.assertTrue(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given1Fahrenheit1Celsius_whenCompared_shouldReturnFalse() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CELSIUS,1.0);
        Assert.assertFalse(unitComparision.compare(unitComparision1));
    }

    @Test
    public void given1Fahrenheit2Celsius_whenAdded_shouldReturn36_6Fahrenheit() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.CELSIUS,2.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(36.6,sum,0.0);
    }

    @Test
    public void given1FahrenheitMinus457_87Kelvin_whenAdded_shouldReturnTrue() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,-457.87);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.KELVIN,1.0);
        Boolean compare = unitComparision.compare(unitComparision1);
        Assert.assertTrue(compare);
    }

    @Test
    public void given1Fahrenheit2Kelvin_whenAdded_shouldReturn36_6Fahrenheit() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.FAHRENHEIT,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.KELVIN,2.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(-455.07,sum,0.0);
    }

    @Test
    public void given1Celsius1Kelvin_whenAdded_shouldReturn36_6Fahrenheit() {
        UnitComparision unitComparision = new UnitComparision(UnitConversion.CELSIUS,1.0);
        UnitComparision unitComparision1 = new UnitComparision(UnitConversion.KELVIN,1.0);
        Double sum = unitComparision.addUnites(unitComparision1);
        Assert.assertEquals(-424.07,sum,0.0);
    }
}
