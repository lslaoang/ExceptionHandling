package com.lao.vehicle.exception;

public class VehicleAlreadyExistsException extends RuntimeException {
    private String message;

    public VehicleAlreadyExistsException(String message) {
        this.message = message;
    }

    public VehicleAlreadyExistsException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public VehicleAlreadyExistsException() {
    }
}
