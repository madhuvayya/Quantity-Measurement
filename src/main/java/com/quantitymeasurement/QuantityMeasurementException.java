package com.quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException {

    enum ExceptionType{
        NULL,INVALID_TYPE
    }
    ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
