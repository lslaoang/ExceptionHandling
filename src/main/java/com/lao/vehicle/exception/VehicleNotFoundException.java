package com.lao.vehicle.exception;

public class VehicleNotFoundException extends RuntimeException {
    private String message;

    public VehicleNotFoundException(String message) {
        super(message);
        this.message = message;
    }

    public VehicleNotFoundException() {

    }
}
