package com.lao.vehicle.controller;

import com.lao.vehicle.domain.Vehicle;
import com.lao.vehicle.exception.VehicleAlreadyExistsException;
import com.lao.vehicle.exception.VehicleNotFoundException;
import com.lao.vehicle.service.VehicleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class VehicleController {


    private final VehicleService vehicleService;


    public VehicleController(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/vehicle")
    public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle) throws VehicleAlreadyExistsException {
        Vehicle savedVehicle = vehicleService.saveVehicle(vehicle);
        return new ResponseEntity<>(savedVehicle, HttpStatus.CREATED);
    }

    @GetMapping("/vehicles")
    public ResponseEntity<?> getAllVehicles() throws VehicleNotFoundException {
        if(vehicleService.getAllVehicles().isEmpty()){
            throw new VehicleNotFoundException("No vehicles found.");
        }
        return new ResponseEntity<>(vehicleService.getAllVehicles(), HttpStatus.OK);
    }

    @GetMapping("vehicle/{id}")
    public ResponseEntity<?> getVehicleById(@PathVariable("id") String id) throws VehicleNotFoundException {
        return new ResponseEntity<>(vehicleService.getVehicleById(id), HttpStatus.OK);
    }
}
