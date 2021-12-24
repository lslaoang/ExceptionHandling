package com.lao.vehicle.exception;

public class VehicleAlreadyExistsException extends RuntimeException {
    private String message;

    public VehicleAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }

    public VehicleAlreadyExistsException() {

    }
}
