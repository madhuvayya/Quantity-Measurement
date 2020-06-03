package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenZeroFeet_whenEqual_shouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenNullValue_whenNull_shouldThrowException() {
        try {
            Feet feet1 = new Feet(0.0);
            Feet feet2 = new Feet(null);
            Assert.assertEquals(feet1, feet2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Feet feet1 = new Feet(4.5);
        Feet feet2 = new Feet(4.5);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenSameFeetValues_whenValuesAreEqual_shouldReturnTrue() {
        Feet feet1 = new Feet(3.3);
        Feet feet2 = new Feet(3.3);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void givenZeroInches_whenEqual_shouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void givenNullValue_whenEqualedNull_shouldThrowException() {
        try {
            Inch inch1 = new Inch(0.0);
            Inch inch2 = new Inch(null);
            Assert.assertEquals(inch1, inch2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameInchValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Inch inch1 = new Inch(1.2);
        Inch inch2 = new Inch(1.2);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenSameInchValues_whenValuesAreEqual_shouldReturnTrue() {
        Inch inch1 = new Inch(6.5);
        Inch inch2 = new Inch(6.5);
        Assert.assertEquals(inch1,inch2);
    }
}
