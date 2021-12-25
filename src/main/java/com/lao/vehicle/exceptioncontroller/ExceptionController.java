package com.lao.vehicle.exceptioncontroller;

import com.lao.vehicle.exception.VehicleAlreadyExistsException;
import com.lao.vehicle.exception.VehicleNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    final static String ALREADY_EXIST = "Vehicle already exist. ";
    final static String VEHICLE_NOT_FOUND = "Cannot find vehicle in the record. ";

    @ExceptionHandler(value = VehicleAlreadyExistsException.class)
    public ResponseEntity<?> handleVehicleAlreadyExistsException(VehicleAlreadyExistsException vehicleAlreadyExistsException) {
        return new ResponseEntity<>(ALREADY_EXIST + vehicleAlreadyExistsException.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = VehicleNotFoundException.class)
    public ResponseEntity<?> handleVehicleNotFoundException(VehicleNotFoundException vehicleNotFoundException) {
        return new ResponseEntity<>(VEHICLE_NOT_FOUND + vehicleNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }
}
