package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenZeroFeet_whenEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenNullValue_whenNull_shouldThrowException() {
        try {
            Length length1 = new Length(Length.Unit.FEET,0.0);
            Length length2 = new Length(Length.Unit.FEET,null);
            Assert.assertEquals(length1, length2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameFeetValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        Length length1 = new Length(Length.Unit.FEET,4.5);
        Length length2 = new Length(Length.Unit.FEET,4.5);
        Assert.assertNotSame(length1, length2);
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
        Assert.assertEquals(length1, length2);
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
        Assert.assertEquals(length1, length2);
    }

    @Test
    public void givenSameInchValues_whenValuesAreEqual_shouldReturnTrue() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Length length2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(length1, length2);
    }
}
