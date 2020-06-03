package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenZeroAsParameter_whenEqual_shouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0);
        Assert.assertEquals(quantityMeasurement1,quantityMeasurement2);
    }

    @Test
    public void givenNull_whenNull_shouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(null);
            Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void givenSameValues_whenReferencesAreNotEqual_shouldReturnFalse() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(4.5);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(4.5);
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenSameValues_whenValuesAreEqual_shouldReturnTrue() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(4.5);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(4.5);
        Assert.assertEquals(quantityMeasurement1.value, quantityMeasurement2.value,0.0);
    }
}
