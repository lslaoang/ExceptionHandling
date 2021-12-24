package com.lao.vehicle.service;

import com.lao.vehicle.domain.Vehicle;
import com.lao.vehicle.exception.VehicleAlreadyExistsException;
import com.lao.vehicle.exception.VehicleNotFoundException;

import java.util.List;


public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle) throws VehicleAlreadyExistsException;
    List<Vehicle> getAllVehicles() throws VehicleNotFoundException;
    Vehicle getVehicleById(String id) throws VehicleNotFoundException;
}
