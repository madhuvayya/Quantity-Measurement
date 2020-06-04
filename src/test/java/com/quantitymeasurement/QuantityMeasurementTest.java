package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0Feet0Feet_whenEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void givenNullValue_whenNull_shouldThrowException() {
        try {
            Length length1 = new Length(Length.Unit.FEET,0.0);
            Length length2 = new Length(Length.Unit.FEET,null);
            Assert.assertFalse(length1.equals(length2));
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET,4.5);
        Length length2 = new Length(Length.Unit.FEET,4.5);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenDifferentFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET,5.5);
        Length length2 = new Length(Length.Unit.FEET,3.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenSameFeetValues_whenValuesAreEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,3.3);
        Length length2 = new Length(Length.Unit.FEET,3.3);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenZeroInches_whenEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Length length2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void givenNullValue_whenEqualedNull_shouldThrowException() {
        try {
            Length length1 = new Length(Length.Unit.INCH,0.0);
            Length length2 = new Length(Length.Unit.INCH,null);
            Assert.assertEquals(length1, length2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameInchValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.INCH,1.2);
        Length length2 = new Length(Length.Unit.INCH,1.2);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void givenSameInchValues_whenValuesAreEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Length length2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0Feet0Inch_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.INCH,0.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet1Inch_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Length length2 = new Length(Length.Unit.INCH,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet1Feet_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Inch1Feet_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Feet12Inch_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Length length2 = new Length(Length.Unit.INCH,12.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given12Inch1Feet_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,12.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given0Yard0Yard_whenEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.YARD,0.0);
        Length length2 = new Length(Length.Unit.YARD,0.0);
        Assert.assertTrue(length1.equals(length2));
    }

    @Test
    public void given0YardNull_whenNull_shouldThrowException() {
        try {
            Length length1 = new Length(Length.Unit.YARD,0.0);
            Length length2 = new Length(Length.Unit.YARD,null);
            Assert.assertFalse(length1.equals(length2));
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void given1Yard1Yard_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.YARD,1.0);
        Length length2 = new Length(Length.Unit.YARD,1.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void given1Yard0Yard_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.YARD,1.0);
        Length length2 = new Length(Length.Unit.YARD,0.0);
        Assert.assertFalse(length1==length2);
    }

    @Test
    public void given3Feet1Yard_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,3.0);
        Length length2 = new Length(Length.Unit.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Feet1Yard_whenCompared_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET,1.0);
        Length length2 = new Length(Length.Unit.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Inch1Yard_whenCompared_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.INCH,1.0);
        Length length2 = new Length(Length.Unit.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertFalse(result);
    }

    @Test
    public void given1Yard36Inches_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.YARD,1.0);
        Length length2 = new Length(Length.Unit.INCH,36.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given36Inches1Yard_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,36.0);
        Length length2 = new Length(Length.Unit.YARD,1.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }

    @Test
    public void given1Yard3Feet_whenCompared_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.YARD,1.0);
        Length length2 = new Length(Length.Unit.FEET,3.0);
        boolean result = length1.compare(length2);
        Assert.assertTrue(result);
    }
}
