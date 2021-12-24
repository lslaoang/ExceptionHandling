package com.lao.vehicle.service;

import com.lao.vehicle.domain.Vehicle;
import com.lao.vehicle.exception.VehicleAlreadyExistsException;
import com.lao.vehicle.exception.VehicleNotFoundException;
import com.lao.vehicle.repository.VehicleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;

    public VehicleServiceImpl(VehicleRepo vehicleRepo) {
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) throws VehicleAlreadyExistsException {
        if (vehicleRepo.existsById(vehicle.getId())) {
            throw new VehicleAlreadyExistsException();
        }
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() throws VehicleNotFoundException {
        return (List<Vehicle>) vehicleRepo.findAll();
    }

    @Override
    public Vehicle getVehicleById(String id) throws VehicleNotFoundException {
        Vehicle vehicle;
        if (vehicleRepo.findById(id).isEmpty()) {
            throw new VehicleNotFoundException();
        } else {
            vehicle = vehicleRepo.findById(id).get();
        }
        return vehicle;
    }
}
